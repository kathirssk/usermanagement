package com.aspire.usermanage.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aspire.usermanage.usermanagement.modal.Group;
import com.aspire.usermanage.usermanagement.repository.GroupRepository;

public class GroupService {
	
	@Autowired
	GroupRepository groupRepository;
	
	
	public List<Group> getAllGroups() {
		
		return groupRepository.findAll();
	}


	public Group addGroup(Group group) {
		
		return groupRepository.save(group);
	}


	public Group getGroup(Long groupId ) {
		// TODO Auto-generated method stub
		return groupRepository.getOne(groupId);
	}


	public Group updateGroup(int groupId, Group group) {
		
		group.setGroupId(groupId);
		return groupRepository.save(group) ;
	}


	public boolean deleteGroup(Long groupId) {
		Group group=groupRepository.getOne(groupId);
		 groupRepository.delete(group);
		return true;
		 
	}

}

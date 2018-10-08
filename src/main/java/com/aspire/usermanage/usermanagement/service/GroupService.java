package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.Group;
import com.aspire.usermanage.usermanagement.repository.GroupRepository;

@Service
public class GroupService {
	
	@Autowired
	GroupRepository groupRepository;
	
	
	public List<Group> getAllGroups() {
		
		return groupRepository.findAll();
	}


	public Group addGroup(Group group) {
		
		return groupRepository.save(group);
	}


	public Optional<Group> getGroup(Long groupId ) {
		// TODO Auto-generated method stub
		//return groupRepository.getOne(groupId);
		return groupRepository.findById(groupId);
	}


	public Group updateGroup(int groupId, Group group) {
		
		group.setGroupId(groupId);
		return groupRepository.save(group) ;
	}


	public boolean deleteGroup(Long groupId) {
		
		 groupRepository.deleteById(groupId);
		return true;
		 
	}

}

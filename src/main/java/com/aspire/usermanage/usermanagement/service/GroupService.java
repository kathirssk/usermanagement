package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.Group;
import com.aspire.usermanage.usermanagement.repository.GroupRepository;
/**
 * 
 * It has all the Business and DAO functionality of Group
 * 
 * @author kathiravan.sethurama
 *
 */
@Service
public class GroupService extends BaseService{
	
	@Autowired
	GroupRepository groupRepository;
	
	/**
	 * this method uses mongorepository to fetch all group detail
	 * @return list of group
	 */
	public List<Group> getAllGroups() {
		
		return groupRepository.findAll();
	}

	/**
	 * method uses mongo repository to save one group object into mongodb
	 * @param group
	 * @return
	 */
	public Group addGroup(Group group) {
		
		return groupRepository.save(group);
	}

	/**
	 * method uses mongorepository fetch one particular group
	 * @param groupId
	 * @return
	 */
	public Optional<Group> getGroup(int groupId ) {
		return groupRepository.findById(groupId);
	}

	/**
	 * to update group
	 * @param groupId
	 * @param group
	 * @return
	 */

	public Group updateGroup(int groupId, Group group) {
		
		group.setGroupId(groupId);
		return groupRepository.save(group) ;
	}

	/**
	 * 
	 * to delete group
	 * @param groupId
	 * @return
	 */
	public boolean deleteGroup(int groupId) {
		
		 groupRepository.deleteById(groupId);
		return true;
		 
	}

}

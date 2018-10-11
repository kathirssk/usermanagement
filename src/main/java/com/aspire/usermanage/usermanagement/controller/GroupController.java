package com.aspire.usermanage.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.usermanage.usermanagement.modal.Group;
import com.aspire.usermanage.usermanagement.service.GroupService;




/**
 * Group Controller class.
 * 
 * It is a controller class for GROUP table
 * 
 * @author kathiravan.sethurama
 *
 */
@RestController
@RequestMapping("/group")
@Component
public class GroupController {
	
	@Autowired
	Group group;

	@Autowired
	GroupService groupService;
	
	/**
	 * used to fetch all groups
	 * @return list of groups
	 */
	@GetMapping("/allGroups")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Group> getAllGroups() {
		return groupService.getAllGroups();
		
	}
	
	/**
	 * used to fetch one group by groupId
	 * @param groupId
	 * @return group
	 */
	@GetMapping("/{groupId}")
	public Optional<Group> getGroup(@PathVariable(value = "groupId") int groupId) {
		return groupService.getGroup(groupId);
		
	}
	
	/**
	 * To save group in db
	 * @param group
	 * @return 
	 */
	@PostMapping("addGroup")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Group addGroup(@RequestBody Group group ) {
		return groupService.addGroup(group);
	}
	
	/**
	 * To update the group by groupId 
	 * @param group
	 * @return
	 */
	@PutMapping("/change/{group}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Group updateGroup(@RequestBody Group group ) {
		int groupId=group.getGroupId();
		return groupService.updateGroup(groupId, group);
		
	}
	/**
	 *To delete the group by groupId
	 * @param groupId
	 * @return
	 */
	@DeleteMapping("/delete/{groupId}")
	public boolean deleteGroup(@PathVariable (value = "groupId") int groupId) {
		return groupService.deleteGroup(groupId);
	}
}

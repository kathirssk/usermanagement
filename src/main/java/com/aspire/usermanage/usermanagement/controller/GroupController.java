package com.aspire.usermanage.usermanagement.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.usermanage.usermanagement.modal.Group;
import com.aspire.usermanage.usermanagement.modal.Rights;
import com.aspire.usermanage.usermanagement.service.GroupService;

@RestController
@RequestMapping("/group")
public class GroupController {
	
	@Autowired
	Group group;
	@Autowired
	Rights rights;
	
	GroupService groupService;
	
	@GetMapping("/allGroups")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Group> getAllGroups() {
		return groupService.getAllGroups();
		
	}
	
	@GetMapping("/{groupId}")
	public Group getGroup(@PathVariable(value = "groupId") Long groupId) {
		return groupService.getGroup(groupId);
		
	}
	@PostMapping("group")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Group addGroup(@RequestBody Group group ) {
		return groupService.addGroup(group);
	}
	
	@PutMapping("/change/{group}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Group updateGroup(@RequestBody Group group ) {
		int groupId=group.getGroupId();
		return groupService.updateGroup(groupId, group);
		
	}
	
	@DeleteMapping("/delete/{groupId}")
	public boolean deleteGroup(@PathVariable (value = "groupId") Long groupId) {
		return groupService.deleteGroup(groupId);
	}
}

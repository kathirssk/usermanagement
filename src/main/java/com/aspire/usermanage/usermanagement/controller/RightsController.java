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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.usermanage.usermanagement.modal.Rights;
import com.aspire.usermanage.usermanagement.service.RightsService;

@RestController
@RequestMapping("/right")
public class RightsController {
	
	@Autowired
	Rights rights;
	
	RightsService rightsService;
	
	@GetMapping("/rightslist")
	public List<Rights> getAllRights(){
		return rightsService.getAllRights();
	}
	
	@GetMapping("/{rightsId}")
	public Rights getRights(@PathVariable (value = "rightsId") Long rightsId) {
		return rightsService.getRights(rightsId);
	}
	
	
	@PostMapping("rights")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@ResponseBody
	public Rights addRights(@RequestBody Rights rights ) {
		return rightsService.addRights(rights);
	}
	
	
	@DeleteMapping("/delete/{rightsId}")
	public boolean deleteRights(@PathVariable (value = "rightsId") Long rightsId) {
		return rightsService.deleteRights(rightsId);
	}
	
	@PutMapping("/change/{rights}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Rights updateRights(@RequestBody Rights rights) {
		int rightsId=rights.getRightsId();
		return rightsService.updateRights(rightsId,rights);
		
	}
	
}

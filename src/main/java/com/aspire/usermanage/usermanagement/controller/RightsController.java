package com.aspire.usermanage.usermanagement.controller;

import java.util.List;
import java.util.Optional;

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


/**
 * Rights Controller 
 * 
 * It is a controller class for RIGHTS table
 * 
 * 
 * @author kathiravan.sethurama
 *
 */
@RestController
@RequestMapping("/right")
public class RightsController {
	
	@Autowired
	Rights rights;
	
	@Autowired
	RightsService rightsService;
	
	/**
	 * To fetch all rights
	 * @return
	 */
	@GetMapping("/allRights")
	public List<Rights> getAllRights(){
		
		return rightsService.getAllRights();
	}
	/**
	 * To fetch one Rights detail by rightsId
	 * @param rightsId
	 * @return
	 */
	@GetMapping("/{rightsId}")
	public Optional<Rights> getRights(@PathVariable (value = "rightsId") int rightsId) {
		return rightsService.getRights(rightsId);
	}
	
	/**
	 * to save one rights to DB
	 * @param rights
	 * @return
	 */
	@PostMapping("addRights")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@ResponseBody
	public Rights addRights(@RequestBody Rights rights ) {
		return rightsService.addRights(rights);
	}
	
	/**
	 * To delete one rights by rightsId
	 * @param rightsId
	 * @return
	 */
	@DeleteMapping("/delete/{rightsId}")
	public boolean deleteRights(@PathVariable (value = "rightsId") int rightsId) {
		return rightsService.deleteRights(rightsId);
	}
	
	/**
	 * To update one rights by rightsID
	 * @param rights
	 * @return
	 */
	@PutMapping("/change/{rights}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Rights updateRights(@RequestBody Rights rights) {
		int rightsId=rights.getRightsId();
		return rightsService.updateRights(rightsId,rights);
		
	}
	
}

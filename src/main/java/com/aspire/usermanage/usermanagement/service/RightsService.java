package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.Rights;
import com.aspire.usermanage.usermanagement.repository.RightsRepository;

/**
 * 
 * 
 * It has all the Business and DAO functionality of User Rights
 * 
 * @author kathiravan.sethurama
 *
 */
@Service
public class RightsService extends BaseService {

	@Autowired
	RightsRepository rightsRepository;

	public List<Rights> getAllRights() {
		LOG.info("entered into get all rights method");
		return rightsRepository.findAll();
	}

	public Rights addRights(Rights rights) {
		return rightsRepository.save(rights);
	}

	public boolean deleteRights(int rightsId) {
		rightsRepository.deleteById(rightsId);
		return true;
	}

	public Rights updateRights(int rightsId, Rights rights) {
		rights.setRightsId(rightsId);
		return rightsRepository.save(rights);
	}

	public Optional<Rights> getRights(int rightsId) {
		return rightsRepository.findById(rightsId);
	}

}

package com.aspire.usermanage.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aspire.usermanage.usermanagement.modal.Rights;
import com.aspire.usermanage.usermanagement.repository.RightsRepository;

public class RightsService {
	@Autowired
	RightsRepository rightsRepository;

	public List<Rights> getAllRights() {

		return rightsRepository.findAll();
	}

	public Rights addRights(Rights rights) {
		return rightsRepository.save(rights);
	}

	public boolean deleteRights(long rightsId) {
		Rights rights = rightsRepository.getOne(rightsId);
		rightsRepository.delete(rights);
		return true;
	}

	public Rights updateRights(int rightsId, Rights rights) {
		rights.setRightsId(rightsId);
		return rightsRepository.save(rights);
	}

	public Rights getRights(Long rightsId) {
		return rightsRepository.getOne(rightsId);
	}

}

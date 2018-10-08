package com.aspire.usermanage.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.usermanage.usermanagement.modal.Rights;
import com.aspire.usermanage.usermanagement.repository.RightsRepository;

@Service
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
		rightsRepository.deleteById(rightsId);
		return true;
	}

	public Rights updateRights(int rightsId, Rights rights) {
		rights.setRightsId(rightsId);
		return rightsRepository.save(rights);
	}

	public Optional<Rights> getRights(Long rightsId) {
		return rightsRepository.findById(rightsId);
	}

}

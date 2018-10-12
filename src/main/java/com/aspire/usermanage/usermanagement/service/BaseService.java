package com.aspire.usermanage.usermanagement.service;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aspire.usermanage.usermanagement.repository.GroupRepository;

/**
 * Used for common properties and methods for the services
 * @author kathiravan.sethurama
 *
 */
@Service
public abstract class BaseService {
	public static final Logger LOG =Logger.getLogger(BaseService.class.getName());
	
	@Autowired
	GroupRepository groupRepository;
	
	@Autowired
	RightsService rightsService;
	
}

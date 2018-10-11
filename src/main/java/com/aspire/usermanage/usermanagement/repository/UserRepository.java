package com.aspire.usermanage.usermanagement.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aspire.usermanage.usermanagement.modal.User;
/**
 * User Repsoitory on mongo template
 * 
 * @author kathiravan.sethurama
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User,Integer>{

	
		
}

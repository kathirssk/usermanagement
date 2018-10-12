package com.aspire.usermanage.usermanagement.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aspire.usermanage.usermanagement.modal.Group;

/**
 * Group Repsoitory on mongo template
 * 
 * @author kathiravan.sethurama
 *
 */
@Repository
public interface GroupRepository extends MongoRepository<Group, Integer>{

}


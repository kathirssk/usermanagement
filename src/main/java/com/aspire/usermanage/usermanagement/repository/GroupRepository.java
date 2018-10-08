package com.aspire.usermanage.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aspire.usermanage.usermanagement.modal.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, Long>{

}


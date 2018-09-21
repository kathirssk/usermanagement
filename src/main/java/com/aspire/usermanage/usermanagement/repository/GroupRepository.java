package com.aspire.usermanage.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspire.usermanage.usermanagement.modal.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{

}

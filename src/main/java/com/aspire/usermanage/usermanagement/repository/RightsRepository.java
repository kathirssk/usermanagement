package com.aspire.usermanage.usermanagement.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aspire.usermanage.usermanagement.modal.Rights;

/**
 * Rights Repsoitory on mongo template
 * @author kathiravan.sethurama
 *
 */
@Repository
public interface RightsRepository extends MongoRepository<Rights, Integer> {

}

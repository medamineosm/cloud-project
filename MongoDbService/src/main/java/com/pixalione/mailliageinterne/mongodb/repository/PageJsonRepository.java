package com.pixalione.mailliageinterne.mongodb.repository;


import com.pixalione.mailliageinterne.mongodb.domain.PageJson;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by OUASMINE Mohammed Amine on 11/05/2016.
 */
@RepositoryRestResource(collectionResourceRel = "PageJson", path = "PageJson")
public interface PageJsonRepository extends MongoRepository<PageJson, String> {
}

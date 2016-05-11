package com.pixalione.mailliageinterne.mongodb.repository;


import com.pixalione.mailliageinterne.mongodb.domain.Link;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by AmYné on 28/04/2016.
 */
@RepositoryRestResource(collectionResourceRel = "Links", path = "Links")
public interface LinkRepository extends MongoRepository<Link, String> {

}

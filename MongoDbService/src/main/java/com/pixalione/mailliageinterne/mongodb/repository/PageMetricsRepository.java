package com.pixalione.mailliageinterne.mongodb.repository;


import com.pixalione.mailliageinterne.mongodb.domain.Metrics.PageMetrics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by AmYné on 02/05/2016.
 */
@RepositoryRestResource(collectionResourceRel = "PageMetrics", path = "PageMetrics")
public interface PageMetricsRepository extends MongoRepository<PageMetrics, String> {

}

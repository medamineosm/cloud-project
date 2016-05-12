package com.pixalione.mailliageinterne.crawlerforkandjoin.web;

import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.PageJson;
import com.pixalione.mailliageinterne.crawlerforkandjoin.web.rest.API.API_MongoDB_API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@RestController
@RequestMapping("api/PageJson")
public class PageJsonController {
    @Autowired
    private API_MongoDB_API api_mongoDB_api;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public PageJson create(@PathVariable PageJson pageJson){
        return api_mongoDB_api.create(pageJson);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public List<PageJson> getPageJson(@RequestBody PageJson pageJson) {
        return api_mongoDB_api.getAllPageJson();
    }
}

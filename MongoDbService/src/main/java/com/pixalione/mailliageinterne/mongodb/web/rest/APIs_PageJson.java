package com.pixalione.mailliageinterne.mongodb.web.rest;

import com.pixalione.mailliageinterne.mongodb.domain.PageJson;
import com.pixalione.mailliageinterne.mongodb.repository.PageJsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@RestController
@RequestMapping("api/pageJson")
public class APIs_PageJson {
    private final static String host = "localhost";
    private final static String port = "8082";
    private PageJsonRepository pageJsonRepository;

    @Autowired
    public APIs_PageJson(PageJsonRepository pageJsonRepository) {
        this.pageJsonRepository = pageJsonRepository;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public PageJson create (@RequestBody PageJson pageJson){
        return this.pageJsonRepository.save(pageJson);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<PageJson> getAllPageJson() {
        return this.pageJsonRepository.findAll();
    }
}

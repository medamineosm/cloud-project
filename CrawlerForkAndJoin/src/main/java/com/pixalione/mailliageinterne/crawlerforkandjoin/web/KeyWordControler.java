package com.pixalione.mailliageinterne.crawlerforkandjoin.web;

import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.KeyWord;
import com.pixalione.mailliageinterne.crawlerforkandjoin.web.rest.API.API_MongoDB_API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@RestController
@RequestMapping("api/keyword")
public class KeyWordControler {

    @Autowired
    private API_MongoDB_API api_mongoDB_api;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public KeyWord getKeyWord(@PathVariable String id){
        return api_mongoDB_api.getKeyWordById(id);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<KeyWord> getAllKeyWord(){
        return api_mongoDB_api.getAllKeyWord();
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public KeyWord createKeyword(@RequestBody KeyWord keyWord) {
        return api_mongoDB_api.createKeyWord(keyWord);
    }
}

package com.pixalione.mailliageinterne.crawlerforkandjoin.web.rest.API;

import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.KeyWord;
import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.PageJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@RestController
@RequestMapping("api")
public class testRest {

    @Autowired
    private API_MongoDB_API api_mongoDB_api;

    @RequestMapping(value = "keyword/test/{id}",method = RequestMethod.GET)
    public KeyWord getKeyWord(@PathVariable String id){
        return api_mongoDB_api.getKeyWordById(id);
    }

    @RequestMapping(value = "keyword/test",method = RequestMethod.GET)
    public List<KeyWord> getAllKeyWord(){
        return api_mongoDB_api.getAllKeyWord();
    }

    @RequestMapping(value = "keyword/test",method = RequestMethod.POST)
    public KeyWord createKeyword(@RequestBody KeyWord keyWord) {
        return api_mongoDB_api.createKeyWord(keyWord);
    }


}

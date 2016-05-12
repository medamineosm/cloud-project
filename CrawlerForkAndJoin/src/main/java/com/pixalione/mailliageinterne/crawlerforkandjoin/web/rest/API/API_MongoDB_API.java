package com.pixalione.mailliageinterne.crawlerforkandjoin.web.rest.API;


import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.KeyWord;
import com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo.PageJson;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@FeignClient("MongoDbService")
public interface API_MongoDB_API{

    @RequestMapping(value = "api/keyword/get/{id}",method = RequestMethod.GET)
    KeyWord getKeyWordById(@PathVariable("id") String id);

    @RequestMapping(value = "api/keyword/",method = RequestMethod.GET)
    List<KeyWord> getAllKeyWord();

    @RequestMapping(value = "api/keyword/create",method = RequestMethod.POST)
    KeyWord createKeyWord(KeyWord keyWord);

    @RequestMapping(value = "api/pageJson/create",method = RequestMethod.POST)
    PageJson create (@RequestBody PageJson pageJson);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    List<PageJson> getAllPageJson();
}

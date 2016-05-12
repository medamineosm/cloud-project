package com.pixalione.mailliageinterne.mongodb.web;

import com.pixalione.mailliageinterne.mongodb.domain.KeyWord;
import com.pixalione.mailliageinterne.mongodb.repository.KeyWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by OUASMINE Mohammed Amine on 12/05/2016.
 */
@RestController
@RequestMapping("api/keyword")
public class APIs_KeyWord {

    private final static String host = "localhost";
    private final static String port = "8082";
    private KeyWordRepository keyWordRepository;

    @Autowired
    public APIs_KeyWord(KeyWordRepository keyWordRepository)
    {
        this.keyWordRepository = keyWordRepository;
    }

    @RequestMapping("/get/{id}")
    public KeyWord getKeyWordById(@PathVariable String id)
    {
        return this.keyWordRepository.findOne(id);
    }

    @RequestMapping("/")
    public List<KeyWord> getAllKeyWord() {return this.keyWordRepository.findAll();};

    @RequestMapping("/create")
    public KeyWord createKeyWord(KeyWord keyWord){
        this.keyWordRepository.save(new KeyWord("amine",1000));
        return this.keyWordRepository.save(keyWord);}

}

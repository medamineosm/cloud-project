package com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by AmYné on 29/04/2016.
 */
public class Scan {

    private String id;
    private Date date;
    private String website;
    private List<Page> pageList;

    public Scan(){}
    public Scan(Date date){
        this.date = new Date();
        this.pageList = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public String getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public void addPageToList(Page page) {
        this.pageList.add(page);
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}

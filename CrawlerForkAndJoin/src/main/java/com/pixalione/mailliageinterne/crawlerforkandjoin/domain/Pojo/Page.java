package com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo;


import java.util.List;

/**
 * Created by AmYné on 29/04/2016.
 */
public class Page {

    private String id;
    private String urlPage;
    private List<Link> list_liens;

    public Page(String urlPage, List<Link> list_liens) {
        this.urlPage = urlPage;
        this.list_liens = list_liens;
    }

    public String getUrlPage() {
        return urlPage;
    }

    public void setUrlPage(String urlPage) {
        urlPage = urlPage;
    }

    public List<Link> getList_liens() {
        return list_liens;
    }

    public void setList_liens(List<Link> list_liens) {
        this.list_liens = list_liens;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id='" + id + '\'' +
                ", UrlPage='" + urlPage + '\'' +
                ", list_liens=" + list_liens +
                '}';
    }
}

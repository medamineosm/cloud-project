package com.pixalione.mailliageinterne.crawlerforkandjoin.domain.Pojo;


/**
 * Created by OUASMINE Mohammed Amine on 10/05/2016.
 */
public class KeyWord {

    private String id;
    private int frequency;

    public KeyWord() {
    }

    public KeyWord(String id, int frequency) {
        this.id = id;
        this.frequency = frequency;
    }

    public String getId() {
        return id;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "KeyWord{" +
                "id='" + id + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

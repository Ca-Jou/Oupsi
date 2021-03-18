package fr.oupsi;

import org.json.JSONObject;

public class Category {
    private String name;


    public Category(JSONObject o){
        name = o.optString("name","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

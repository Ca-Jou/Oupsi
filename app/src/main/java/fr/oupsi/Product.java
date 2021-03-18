package fr.oupsi;

import org.json.JSONObject;

public class Product {
    private String name;
    private String description;
    private String url;

    public Product(JSONObject o){
        name = o.optString("name","");
        description = o.optString("description","");
        url = o.optString("picture_url","");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

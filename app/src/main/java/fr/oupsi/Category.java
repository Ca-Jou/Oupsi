package fr.oupsi;

import org.json.JSONObject;

public class Category {
    private String id;
    private String title;
    private String url;


    public Category(JSONObject o){
        id = o.optString("category_id","");
        title = o.optString("title", "");
        url = o.optString("products_url");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

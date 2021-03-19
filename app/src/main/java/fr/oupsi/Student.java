package fr.oupsi;

import org.json.JSONObject;

public class Student {
    private String lastName;
    private String firstName;
    private String group;
    private String email;
    private String url;
    private String avatar;

    public Student(JSONObject o){
        lastName = o.optString("lastName","");
        firstName = o.optString("firstName","");
        group = o.optString("group","");
        email = o.optString("email","");
        url = o.optString("url","");
        avatar = o.optString("avatar","");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

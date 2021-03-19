package fr.oupsi;

public class Student {

    private String avatar;
    private String lastName;
    private String firstName;
    private String email;
    private String group;
    private String url;

    public Student() {
    }

    public Student(String avatar, String lastName, String firstName, String email, String group, String url) {
        this.setAvatar(avatar);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setEmail(email);
        this.setGroup(group);
        this.setUrl(url);
    }


    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
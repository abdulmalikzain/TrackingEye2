package com.example.lenovo.trackingeye2.Model;

/**
 * Created by Lenovo on 29/10/2017.
 */

public class ModelData {
    String id, username, email, telephone;

    public ModelData(){}

    public ModelData(String id, String username, String email, String telephone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}

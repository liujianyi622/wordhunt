package com.example.coco.wordhunt;

public class User {
    private int user_id;
    private String user_name;
    private String age;
    private String sexe;
    private String password;

    public User(){
        super();
    }

    public User(int user_id, String user_name, String password, String sexe, String age){
        super();
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.sexe = sexe;
        this.age = age;
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

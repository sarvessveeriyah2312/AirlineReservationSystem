/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

import java.util.Random;

/**
 *
 * @author iman
 */
public abstract class User {

    protected String id;
    protected int age;
    protected String name;
    protected String icNo;
    protected String phoneNo;
    protected String email;
    protected GenderEnum gender;

    public User(String id, int age, String name, String icNo, String phoneNo, String email, GenderEnum gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
    }

    public User(int age, String name, String icNo, String phoneNo, String email, GenderEnum gender) {
        this.age = age;
        this.name = name;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String getUserType();

//    To be override by child as the Key Identifier for pilot and passenger is different
    public abstract String generateId();

//    To generate random id
    protected String generateRandomNumber() {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

}

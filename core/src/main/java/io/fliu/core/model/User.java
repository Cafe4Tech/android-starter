package io.fliu.core.model;

import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;

/**
 * Created by liulingfeng on 2017/9/21.
 */

@Entity
public class User extends DbModel{

    String name;
    int age;
    String phone;
    String address;

    String emergentContactName;
    String emergentContactPhone;

    ToOne<Account> account;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergentContactName() {
        return emergentContactName;
    }

    public void setEmergentContactName(String emergentContactName) {
        this.emergentContactName = emergentContactName;
    }

    public String getEmergentContactPhone() {
        return emergentContactPhone;
    }

    public void setEmergentContactPhone(String emergentContactPhone) {
        this.emergentContactPhone = emergentContactPhone;
    }
}

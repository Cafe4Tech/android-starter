package io.fliu.core.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by liulingfeng on 2017/9/21.
 */

@Entity
public class User {
    String name;
    int age;
    String phone;
    @Generated(hash = 1961277400)
    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}

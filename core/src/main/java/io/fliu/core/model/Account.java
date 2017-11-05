package io.fliu.core.model;

import java.util.List;

import io.objectbox.annotation.Entity;

/**
 * Created by liulingfeng on 2017/11/5.
 */

@Entity
public class Account {
    List<String>  banks;
}

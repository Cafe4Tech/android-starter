package io.fliu.core.dao;

import java.util.List;
import java.util.Map;


/**
 * Created by liulingfeng on 2017/9/21.
 */

public interface ItemDao {
    void query(Map<String, String> params) ;
    int update(Object item);
    int delete(Object item);
    int add(Object item);
}

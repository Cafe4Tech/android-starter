package io.fliu.android_starter.dao;

import java.util.List;
import java.util.Map;

import io.fliu.android_starter.model.ItemModel;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public interface ItemDao {
    List<ItemModel> query(Map<String, String> params) ;
    int update(ItemModel item);
    int delete(ItemModel item);
    int add(ItemModel item);
}

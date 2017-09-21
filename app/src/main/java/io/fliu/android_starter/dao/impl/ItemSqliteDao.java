package io.fliu.android_starter.dao.impl;

import java.util.List;
import java.util.Map;

import io.fliu.android_starter.dao.ItemDao;
import io.fliu.android_starter.model.ItemModel;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public class ItemSqliteDao implements ItemDao{
    @Override
    public List<ItemModel> query(Map<String, String> params) {
        return null;
    }

    @Override
    public int update(ItemModel item) {
        return 0;
    }

    @Override
    public int delete(ItemModel item) {
        return 0;
    }

    @Override
    public int add(ItemModel item) {
        return 0;
    }
}

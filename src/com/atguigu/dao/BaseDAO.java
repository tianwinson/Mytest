package com.atguigu.dao;

import java.util.List;

/**
 * Created by Tian on 2017/8/23.
 */
public interface BaseDAO {

    boolean add(Object o);

    boolean delete(Object o);

    boolean update(Object o);

    List find(Object o);




}

package com.atguigu.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Tian on 2017/8/23.
 */
public class BaseDAOImpl implements  BaseDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public boolean add(Object o) {
        try {
            this.getHibernateTemplate().save(o);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Object o) {
        try {
            this.getHibernateTemplate().delete(o);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Object o) {
        try {
            this.getHibernateTemplate().update(o);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List find(Object o) {
        return this.getHibernateTemplate().findByExample(o);

    }
}

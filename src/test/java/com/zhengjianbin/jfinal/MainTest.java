package com.zhengjianbin.jfinal;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.zhengjianbin.model.JfinalTest;
import com.zhengjianbin.model._MappingKit;

/**
 * Created by zhengjianbin on 2019/11/18.
 */
public class MainTest {

    public static void main(String[] args){
        DruidPlugin druidPlugin = new DruidPlugin("jdbc:mysql://localhost:3306/local_test?allowMultiQueries=true&useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC", "root", "123456789");
        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
        _MappingKit.mapping(activeRecordPlugin);
        druidPlugin.start();
        activeRecordPlugin.start();
        new JfinalTest().setId(1).setName("testName").save();
    }

}

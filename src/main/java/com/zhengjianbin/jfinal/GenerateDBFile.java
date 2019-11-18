package com.zhengjianbin.jfinal;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.druid.DruidPlugin;

import javax.sql.DataSource;

/**
 * Created by zhengjianbin on 2019/11/18.
 */
public class GenerateDBFile {

    public static void main(String[] args){
        String baseModelPkg = "com.zhengjianbin.model.base";
        //base model 文件保存路径
        String baseModelDir = "/Users/zhengjianbin/IdeaProjects/kaikeba/jfinal-test/src/main/java/com/zhengjianbin/model/base";

        // model 所使用的包名
        String modelPkg = "com.zhengjianbin.model";
        // model 文件保存路径
        String modelDir = "/Users/zhengjianbin/IdeaProjects/kaikeba/jfinal-test/src/main/java/com/zhengjianbin/model";

//        Generator
        Generator generator = new Generator(getSource(), baseModelPkg, baseModelDir, modelPkg, modelDir);

        generator.setGenerateChainSetter(true);
        // 设置是否在 Model 中生成 dao 对象
        generator.setGenerateDaoInModel(true);
        // 设置是否生成字典文件
        generator.setGenerateDataDictionary(false);

        generator.generate();
        System.out.println("测试成功");
    }

    private static DataSource getSource(){
        String sqlUrl = "jdbc:mysql://localhost:3306/local_test?allowMultiQueries=true&useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pwd= "123456789";
        DruidPlugin druidPlugin = new DruidPlugin(sqlUrl, user, pwd);
        druidPlugin.start();
        return druidPlugin.getDataSource();
    }

}

# JFinal-Test
JFinal 操作MySQL

## 项目
* ### ☘️介绍
     * 借助JFinal 提供的ORM 工具，实现操作数据库
     
* ### ☘️目标
     * 完成JFinal 使用ORM 工具时所需配置
     * 创建一个表，使用JFinal 提供的形式写入到数据库
     
* ### ☘️目录介绍
```
.
├── main
│   ├── java
│   │   └── com
│   │       └── zhengjianbin
│   │           ├── JfinalTestApplication.java
│   │           ├── jfinal
│   │           │   └── GenerateDBFile.java-------- 生成Model、Mapping 类
│   │           └── model
│   │               ├── JfinalTest.javaGenerateDBFile.java-------- 生成的JinalTest model 类
│   │               ├── _MappingKit.java
│   │               └── base-------- 生成的JinalTest model 的基类所在包
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── zhengjianbin
                ├── JfinalTestApplicationTests.java
                └── jfinal
                    └── MainTest.java-------- 项目测试类，包含JFinal 的相关插件配置

```
 
package com.huangchuan.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Iterator;
import java.util.Map;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-17:56
 */
//创建一个condition实现类
public class ClassCondition implements Condition {
    /**
     *
     * @param conditionContext 上下文对象，用于获取环境，IOC容器，classLoader对象
     * @param annotatedTypeMetadata  注解的元对象，可以用于获取注解定义的属性值
     * @return
     */
    /*@Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //1.导入jedis坐标后，才使得条件成立
        boolean flag = true;
        try {
            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag=false;
        }
        return flag; //这个返回值控制condition的条件是否成立，所以我们可以在这里自定义条件
    }*/

//升级版
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //1.导入jedis坐标后，才使得条件成立坐标后创建bean
        //需求，导入通过注解属性值value指定

        //获取注解属性值
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] value = (String[]) attributes.get("value");
        boolean flag = true;
        try {
            for (String className : value) {
                Class<?> aClass = Class.forName(className);
                System.out.println(aClass);
            }
        } catch (ClassNotFoundException e) {
            flag=false;
        }
        return flag; //这个返回值控制condition的条件是否成立，所以我们可以在这里自定义条件
    }
}

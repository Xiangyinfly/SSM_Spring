package com.ioc.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {

    @Override
    public JavaBean getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}

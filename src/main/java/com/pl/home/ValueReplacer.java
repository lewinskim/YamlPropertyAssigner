package com.pl.home;

import java.lang.reflect.Field;
import java.util.Properties;

public class ValueReplacer {

    Properties properties;

    public ValueReplacer() {
        YamlPropertiesLoader loader = new YamlPropertiesLoader();
        properties = loader.getProperties();
    }

    public void replaceValue(Object object) throws IllegalAccessException {
        Class<?> aClass = object.getClass();
        for (Field field : aClass.getDeclaredFields()){
            field.setAccessible(true);
            if(field.isAnnotationPresent(AssignValue.class)){
                String key = field.getAnnotation(AssignValue.class).key();
                String value = (String) properties.get(key);
                field.set(object,value);
            }
        }
    }
}

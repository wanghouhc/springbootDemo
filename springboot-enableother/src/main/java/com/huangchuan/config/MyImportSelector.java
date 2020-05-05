package com.huangchuan.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-23:22
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.huangchuan.pojo.User","com.huangchuan.pojo.Role"};
    }
}

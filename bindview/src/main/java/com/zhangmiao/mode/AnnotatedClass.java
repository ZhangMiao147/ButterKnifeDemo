package com.zhangmiao.mode;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * Author: zhangmiao
 * Date: 2017/6/6
 */
public class AnnotatedClass {
    public TypeElement mClassElement;//类名
    public List<BindViewField> mFields;//成员变量
    public List<OnClickMethod> mMethods;//方法
    private BindLayoutClass bindLayoutClass;
    public Elements mElementUtils;

    public AnnotatedClass(TypeElement classElement, Elements elementUtils) {
        this.mClassElement = classElement;
        this.mElementUtils = elementUtils;
        mMethods = new ArrayList<>();
        mFields = new ArrayList<>();
    }

    public String getFullClassName() {
        return mClassElement.getQualifiedName().toString();
    }

    public void addField(BindViewField field) {
        mFields.add(field);
    }

    public void addMethod(OnClickMethod method) {
        mMethods.add(method);
    }

    public void setContentLayoutId(BindLayoutClass bindLayoutClass) {
        this.bindLayoutClass = bindLayoutClass;
    }

    public JavaFile generateFinder() {
        MethodSpec.Builder injectMethodBuilder = MethodSpec.methodBuilder("inject")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(Override.class)
                .addParameter(TypeName.get(mClassElement.asType()), "host", Modifier.FINAL)
                .addParameter(TypeName.OBJECT, "source");
                //.addParameter(TypeUtil.FINDED, "finder");
        return null;
    }


}

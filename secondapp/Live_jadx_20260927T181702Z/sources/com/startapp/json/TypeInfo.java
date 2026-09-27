package com.startapp.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeInfo {
    boolean complex() default false;

    Class<?> innerValue() default String.class;

    Class<?> key() default String.class;

    String name() default "";

    Class<? extends TypeParser> parser() default TypeParser.class;

    Class<?> type() default Object.class;

    Class<?> value() default String.class;
}

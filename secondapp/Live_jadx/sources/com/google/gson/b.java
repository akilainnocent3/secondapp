package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f52381a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f52381a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f52381a.getAnnotation(cls);
    }

    public Collection<Annotation> b() {
        return Arrays.asList(this.f52381a.getAnnotations());
    }

    public Class<?> c() {
        return this.f52381a.getType();
    }

    public Type d() {
        return this.f52381a.getGenericType();
    }

    public Class<?> e() {
        return this.f52381a.getDeclaringClass();
    }

    public String f() {
        return this.f52381a.getName();
    }

    public boolean g(int i10) {
        return (i10 & this.f52381a.getModifiers()) != 0;
    }

    public String toString() {
        return this.f52381a.toString();
    }
}

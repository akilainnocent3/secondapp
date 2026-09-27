package rq;

import cv.p0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m0;
import oy.l;
import qq.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b {
    @l
    public static final <T> h<T> a(@l Class<T> componentClass) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        m0.p(componentClass, "componentClass");
        try {
            Object objInvoke = a.c(componentClass).getDeclaredMethod("autoBuilder", null).invoke(null, null);
            m0.n(objInvoke, "null cannot be cast to non-null type com.yandex.yatagan.AutoBuilder<T of com.yandex.yatagan.common.Loader__LoadImplementationKt.loadAutoBuilderImplementationByComponentClass>");
            return (h) objInvoke;
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("Auto-builder can't be used for " + componentClass + ", because it declares an explicit builder. Please use `Yatagan.builder()` instead");
        }
    }

    @l
    public static final <T> T b(@l Class<T> builderClass) throws ClassNotFoundException {
        m0.p(builderClass, "builderClass");
        if (!builderClass.isAnnotationPresent(qq.l.a.class)) {
            throw new IllegalArgumentException((builderClass + " is not a builder for a Yatagan component").toString());
        }
        String name = builderClass.getName();
        m0.o(name, "builderClass.name");
        String strY5 = p0.Y5(name, "$", null, 2, null);
        if (m0.g(strY5, builderClass.getName())) {
            throw new IllegalArgumentException(("No enclosing component class found for " + builderClass).toString());
        }
        Class<?> componentClass = builderClass.getClassLoader().loadClass(strY5);
        m0.o(componentClass, "componentClass");
        T tCast = builderClass.cast(a.c(componentClass).getDeclaredMethod("builder", null).invoke(null, null));
        m0.o(tCast, "builderClass.cast(yataga…(\"builder\").invoke(null))");
        return tCast;
    }
}

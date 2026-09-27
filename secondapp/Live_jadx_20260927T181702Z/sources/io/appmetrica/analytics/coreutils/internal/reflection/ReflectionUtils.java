package io.appmetrica.analytics.coreutils.internal.reflection;

import cs.o;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ReflectionUtils {

    @l
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    @o
    public static final boolean detectClassExists(@l String str) {
        return findClass(str) != null;
    }

    @o
    @m
    public static final Class<?> findClass(@l String str) {
        try {
            return Class.forName(str, false, ReflectionUtils.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    public static final boolean isArgumentsOfClasses(@l Object[] objArr, @l Class<?>... clsArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            int i12 = i11 + 1;
            if (obj == null || !clsArr[i11].isAssignableFrom(obj.getClass())) {
                return false;
            }
            i10++;
            i11 = i12;
        }
        return true;
    }

    @o
    @m
    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(@l String str, @l Class<T> cls) {
        Constructor<T> constructor;
        try {
            Class clsLoadClass = loadClass(str, cls);
            if (clsLoadClass != null && (constructor = clsLoadClass.getConstructor(null)) != null) {
                return constructor.newInstance(null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @o
    @m
    public static final <T> Class<T> loadClass(@l String str, @l Class<T> cls) {
        try {
            Class<T> cls2 = (Class<T>) Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    public static final /* synthetic */ <T> T loadAndInstantiateClassWithDefaultConstructor(String str) {
        m0.y(4, "T");
        return (T) loadAndInstantiateClassWithDefaultConstructor(str, Object.class);
    }
}

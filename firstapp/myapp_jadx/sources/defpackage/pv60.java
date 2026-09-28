package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class pv60 {
    public static final List<Class<?>> a = b.k(Application.class, vu60.class);
    public static final List<Class<?>> b = a.c(vu60.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        list.getClass();
        hx0 hx0VarA = ix0.a(cls.getConstructors());
        while (hx0VarA.hasNext()) {
            Constructor<T> constructor = (Constructor) hx0VarA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listS = ay0.S(parameterTypes);
            if (list.equals(listS)) {
                return constructor;
            }
            if (list.size() == listS.size() && listS.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends j8i0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            eyo.a("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            jk40.a("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}

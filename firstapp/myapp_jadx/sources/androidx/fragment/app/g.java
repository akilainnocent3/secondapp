package androidx.fragment.app;

import defpackage.nj90;
import defpackage.tug;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final nj90<ClassLoader, nj90<String, Class<?>>> a = new nj90<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        nj90<ClassLoader, nj90<String, Class<?>>> nj90Var = a;
        nj90<String, Class<?>> nj90Var2 = nj90Var.get(classLoader);
        if (nj90Var2 == null) {
            nj90Var2 = new nj90<>();
            nj90Var.put(classLoader, nj90Var2);
        }
        Class<?> cls = nj90Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nj90Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.l(tug.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.l(tug.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}

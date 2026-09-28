package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2i0 {
    public final ox0<String, Method> a;
    public final ox0<String, Method> b;
    public final ox0<String, Class> c;

    public n2i0(ox0<String, Method> ox0Var, ox0<String, Method> ox0Var2, ox0<String, Class> ox0Var3) {
        this.a = ox0Var;
        this.b = ox0Var2;
        this.c = ox0Var3;
    }

    public abstract o2i0 a();

    public final Class b(Class<? extends p2i0> cls) throws ClassNotFoundException {
        String name = cls.getName();
        ox0<String, Class> ox0Var = this.c;
        Class cls2 = ox0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(v70.b(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        ox0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        ox0<String, Method> ox0Var = this.a;
        Method method = ox0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, n2i0.class.getClassLoader()).getDeclaredMethod("read", n2i0.class);
        ox0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ox0<String, Method> ox0Var = this.b;
        Method method = ox0Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, n2i0.class);
        ox0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends p2i0> T l() {
        String strK = k();
        if (strK == null) {
            return null;
        }
        try {
            return (T) c(strK).invoke(null, a());
        } catch (ClassNotFoundException e) {
            jk40.a("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            jk40.a("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            jk40.a("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            jk40.a("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void m(int i);

    public abstract void n(boolean z);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(p2i0 p2i0Var) {
        if (p2i0Var == null) {
            s(null);
            return;
        }
        try {
            s(b(p2i0Var.getClass()).getName());
            o2i0 o2i0VarA = a();
            try {
                d(p2i0Var.getClass()).invoke(null, p2i0Var, o2i0VarA);
                o2i0VarA.u();
            } catch (ClassNotFoundException e) {
                jk40.a("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                jk40.a("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                jk40.a("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                jk40.a("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            jk40.a(p2i0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}

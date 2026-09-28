package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class r8i0 {
    public static final f b = new f();
    public final s8i0 a;

    public static class a extends d {
        public static a c;
        public static final C1042a d = new C1042a();
        public final Application b;

        /* JADX INFO: renamed from: r8i0$a$a, reason: collision with other inner class name */
        public static final class C1042a implements cyb.b<Application> {
        }

        public a(Application application) {
            this.b = application;
        }

        @Override // r8i0.d, r8i0.c
        public final j8i0 a(Class cls, dsw dswVar) {
            if (this.b != null) {
                return c(cls);
            }
            Application application = (Application) dswVar.a.get(d);
            if (application != null) {
                return d(cls, application);
            }
            if (!nd0.class.isAssignableFrom(cls)) {
                return xr1.b(cls);
            }
            hb5.a("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        @Override // r8i0.d, r8i0.c
        public final <T extends j8i0> T c(Class<T> cls) {
            Application application = this.b;
            if (application != null) {
                return (T) d(cls, application);
            }
            zkh.a("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }

        public final <T extends j8i0> T d(Class<T> cls, Application application) {
            if (!nd0.class.isAssignableFrom(cls)) {
                return (T) xr1.b(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                eyo.a("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                eyo.a("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                eyo.a("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                eyo.a("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
    }

    public static final class b {
        public static r8i0 a(w8i0 w8i0Var, c cVar, int i) {
            if ((i & 2) != 0) {
                w8i0Var.getClass();
                cVar = w8i0Var instanceof iel ? ((iel) w8i0Var).getDefaultViewModelProviderFactory() : fjd.a;
            }
            w8i0Var.getClass();
            cyb defaultViewModelCreationExtras = w8i0Var instanceof iel ? ((iel) w8i0Var).getDefaultViewModelCreationExtras() : cyb.a.b;
            w8i0Var.getClass();
            cVar.getClass();
            defaultViewModelCreationExtras.getClass();
            return new r8i0(w8i0Var.getViewModelStore(), cVar, defaultViewModelCreationExtras);
        }
    }

    public interface c {
        default j8i0 a(Class cls, dsw dswVar) {
            return c(cls);
        }

        default j8i0 b(dq7 dq7Var, dsw dswVar) {
            return a(tgp.b(dq7Var), dswVar);
        }

        default <T extends j8i0> T c(Class<T> cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    public static class d implements c {
        public static d a;

        @Override // r8i0.c
        public j8i0 a(Class cls, dsw dswVar) {
            return c(cls);
        }

        @Override // r8i0.c
        public final j8i0 b(dq7 dq7Var, dsw dswVar) {
            return a(tgp.b(dq7Var), dswVar);
        }

        @Override // r8i0.c
        public <T extends j8i0> T c(Class<T> cls) {
            return (T) xr1.b(cls);
        }
    }

    public static final class f implements cyb.b<String> {
    }

    public r8i0(v8i0 v8i0Var, c cVar, cyb cybVar) {
        v8i0Var.getClass();
        cVar.getClass();
        cybVar.getClass();
        this.a = new s8i0(v8i0Var, cVar, cybVar);
    }

    public final j8i0 a(dq7 dq7Var) {
        String strI = dq7Var.i();
        if (strI != null) {
            return this.a.a(dq7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static class e {
        public void d(j8i0 j8i0Var) {
        }
    }
}

package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ov60 extends r8i0.e implements r8i0.c {
    public final Application a;
    public final r8i0.a b;
    public final Bundle c;
    public final s9s d;
    public final jv60 e;

    public ov60(Application application, nv60 nv60Var, Bundle bundle) {
        r8i0.a aVar;
        this.e = nv60Var.getSavedStateRegistry();
        this.d = nv60Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            aVar = r8i0.a.c;
            if (aVar == null) {
                aVar = new r8i0.a(application);
                r8i0.a.c = aVar;
            }
        } else {
            aVar = new r8i0.a(null);
        }
        this.b = aVar;
    }

    @Override // r8i0.c
    public final j8i0 a(Class cls, dsw dswVar) {
        LinkedHashMap linkedHashMap = dswVar.a;
        String str = (String) linkedHashMap.get(r8i0.b);
        if (str == null) {
            ib5.a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(dv60.a) == null || linkedHashMap.get(dv60.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            ib5.a("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(r8i0.a.d);
        boolean zIsAssignableFrom = nd0.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? pv60.a(cls, pv60.b) : pv60.a(cls, pv60.a);
        if (constructorA == null) {
            return this.b.a(cls, dswVar);
        }
        return (!zIsAssignableFrom || application == null) ? pv60.b(cls, constructorA, dv60.a(dswVar)) : pv60.b(cls, constructorA, application, dv60.a(dswVar));
    }

    @Override // r8i0.c
    public final j8i0 b(dq7 dq7Var, dsw dswVar) {
        return a(tgp.b(dq7Var), dswVar);
    }

    @Override // r8i0.c
    public final <T extends j8i0> T c(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(cls, canonicalName);
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // r8i0.e
    public final void d(j8i0 j8i0Var) {
        s9s s9sVar = this.d;
        if (s9sVar != null) {
            jv60 jv60Var = this.e;
            jv60Var.getClass();
            c6s.a(j8i0Var, jv60Var, s9sVar);
        }
    }

    public final j8i0 e(Class cls, String str) {
        vu60 vu60Var;
        s9s s9sVar = this.d;
        if (s9sVar == null) {
            zkh.a("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = nd0.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? pv60.a(cls, pv60.b) : pv60.a(cls, pv60.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.c(cls);
            }
            r8i0.d dVar = r8i0.d.a;
            if (dVar == null) {
                dVar = new r8i0.d();
                r8i0.d.a = dVar;
            }
            return dVar.c(cls);
        }
        jv60 jv60Var = this.e;
        jv60Var.getClass();
        Bundle bundleA = jv60Var.a(str);
        if (bundleA == null) {
            bundleA = this.c;
        }
        if (bundleA == null) {
            vu60Var = new vu60();
        } else {
            ClassLoader classLoader = vu60.class.getClassLoader();
            classLoader.getClass();
            bundleA.setClassLoader(classLoader);
            xnu xnuVar = new xnu(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                str2.getClass();
                xnuVar.put(str2, bundleA.get(str2));
            }
            vu60Var = new vu60(xnuVar.c());
        }
        yu60 yu60Var = new yu60(str, vu60Var);
        yu60Var.d(s9sVar, jv60Var);
        s9s.b bVarB = s9sVar.b();
        if (bVarB == s9s.b.b || bVarB.compareTo(s9s.b.d) >= 0) {
            jv60Var.d();
        } else {
            s9sVar.a(new d6s(s9sVar, jv60Var));
        }
        j8i0 j8i0VarB = (!zIsAssignableFrom || application == null) ? pv60.b(cls, constructorA, vu60Var) : pv60.b(cls, constructorA, application, vu60Var);
        j8i0VarB.addCloseable("androidx.lifecycle.savedstate.vm.tag", yu60Var);
        return j8i0VarB;
    }

    public ov60() {
        this.b = new r8i0.a(null);
    }
}

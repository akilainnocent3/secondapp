package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ifx implements ibs, w8i0, iel, nv60 {
    public final ufx a;
    public ygx b;
    public final Bundle c;
    public s9s.b d;
    public final jgx e;
    public final String f;
    public final Bundle i;
    public final lfx v = new lfx(this);
    public final mpe0 w = hwr.b(new hco(this, 1));

    public static final class a {
        public static ifx a(ufx ufxVar, ygx ygxVar, Bundle bundle, s9s.b bVar, jgx jgxVar) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            ygxVar.getClass();
            bVar.getClass();
            return new ifx(ufxVar, ygxVar, bundle, bVar, jgxVar, string, null);
        }
    }

    public ifx(ufx ufxVar, ygx ygxVar, Bundle bundle, s9s.b bVar, jgx jgxVar, String str, Bundle bundle2) {
        this.a = ufxVar;
        this.b = ygxVar;
        this.c = bundle;
        this.d = bVar;
        this.e = jgxVar;
        this.f = str;
        this.i = bundle2;
    }

    public final vu60 a() {
        return (vu60) this.w.getValue();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof ifx)) {
            ifx ifxVar = (ifx) obj;
            Bundle bundle = ifxVar.c;
            if (!this.f.equals(ifxVar.f) || !Intrinsics.g(this.b, ifxVar.b) || this.v.j != ifxVar.v.j || getSavedStateRegistry() != ifxVar.getSavedStateRegistry()) {
                return false;
            }
            Bundle bundle2 = this.c;
            if (Intrinsics.g(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!Intrinsics.g(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // defpackage.iel
    public final cyb getDefaultViewModelCreationExtras() {
        Application application;
        lfx lfxVar = this.v;
        lfxVar.getClass();
        dsw dswVar = new dsw((Object) null);
        ifx ifxVar = lfxVar.a;
        LinkedHashMap linkedHashMap = dswVar.a;
        linkedHashMap.put(dv60.a, ifxVar);
        linkedHashMap.put(dv60.b, ifxVar);
        Bundle bundleA = lfxVar.a();
        if (bundleA != null) {
            linkedHashMap.put(dv60.c, bundleA);
        }
        ufx ufxVar = this.a;
        if (ufxVar == null) {
            application = null;
        } else {
            Context context = ufxVar.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(r8i0.a.d, application2);
        }
        return dswVar;
    }

    @Override // defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        return this.v.l;
    }

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        return this.v.j;
    }

    @Override // defpackage.nv60
    public final jv60 getSavedStateRegistry() {
        return this.v.h.b;
    }

    @Override // defpackage.w8i0
    public final v8i0 getViewModelStore() {
        lfx lfxVar = this.v;
        if (!lfxVar.i) {
            ib5.a("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (lfxVar.j.d == s9s.b.a) {
            ib5.a("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        jgx jgxVar = lfxVar.e;
        if (jgxVar == null) {
            ib5.a("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = lfxVar.f;
        LinkedHashMap linkedHashMap = jgxVar.a;
        v8i0 v8i0Var = (v8i0) linkedHashMap.get(str);
        if (v8i0Var != null) {
            return v8i0Var;
        }
        v8i0 v8i0Var2 = new v8i0();
        linkedHashMap.put(str, v8i0Var2);
        return v8i0Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.v.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.v.toString();
    }
}

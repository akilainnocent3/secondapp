package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.cyb;
import defpackage.dsw;
import defpackage.dv60;
import defpackage.iel;
import defpackage.jv60;
import defpackage.kbs;
import defpackage.kv60;
import defpackage.mv60;
import defpackage.nv60;
import defpackage.ov60;
import defpackage.qui;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.xk20;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements iel, nv60, w8i0 {
    public final Fragment a;
    public final v8i0 b;
    public final qui c;
    public r8i0.c d;
    public kbs e = null;
    public kv60 f = null;

    public o(Fragment fragment, v8i0 v8i0Var, qui quiVar) {
        this.a = fragment;
        this.b = v8i0Var;
        this.c = quiVar;
    }

    public final void a(s9s.a aVar) {
        this.e.g(aVar);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new kbs(this, true);
            mv60 mv60Var = new mv60(this, new xk20(this, 1));
            this.f = new kv60(mv60Var);
            mv60Var.a();
            this.c.run();
        }
    }

    @Override // defpackage.iel
    public final cyb getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        dsw dswVar = new dsw((Object) null);
        LinkedHashMap linkedHashMap = dswVar.a;
        if (application != null) {
            linkedHashMap.put(r8i0.a.d, application);
        }
        linkedHashMap.put(dv60.a, fragment);
        linkedHashMap.put(dv60.b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(dv60.c, fragment.getArguments());
        }
        return dswVar;
    }

    @Override // defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        r8i0.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        r8i0.c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        for (Context applicationContext = fragment.requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                ov60 ov60Var = new ov60(application, fragment, fragment.getArguments());
                this.d = ov60Var;
                return ov60Var;
            }
        }
        application = null;
        ov60 ov60Var2 = new ov60(application, fragment, fragment.getArguments());
        this.d = ov60Var2;
        return ov60Var2;
    }

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.nv60
    public final jv60 getSavedStateRegistry() {
        b();
        return this.f.b;
    }

    @Override // defpackage.w8i0
    public final v8i0 getViewModelStore() {
        b();
        return this.b;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class kv60 {
    public final mv60 a;
    public final jv60 b;

    public kv60(mv60 mv60Var) {
        this.a = mv60Var;
        this.b = new jv60(mv60Var);
    }

    public final void a(Bundle bundle) {
        mv60 mv60Var = this.a;
        nv60 nv60Var = mv60Var.a;
        if (!mv60Var.e) {
            mv60Var.a();
        }
        if (nv60Var.getLifecycle().b().compareTo(s9s.b.d) >= 0) {
            dmy.a(nv60Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (mv60Var.g) {
            ib5.a("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                s5b.a("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        mv60Var.f = bundle2;
        mv60Var.g = true;
    }

    public final void b(Bundle bundle) {
        bundle.getClass();
        mv60 mv60Var = this.a;
        o2g.a.getClass();
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = mv60Var.f;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (mv60Var.c) {
            try {
                for (Map.Entry entry : mv60Var.d.entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleA2 = ((jv60.b) entry.getValue()).a();
                    str.getClass();
                    bundleA2.getClass();
                    bundleA.putBundle(str, bundleA2);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}

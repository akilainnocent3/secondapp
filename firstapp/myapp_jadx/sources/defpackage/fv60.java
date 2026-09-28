package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fv60 implements jv60.b {
    public final jv60 a;
    public boolean b;
    public Bundle c;
    public final mpe0 d;

    public fv60(jv60 jv60Var, final w8i0 w8i0Var) {
        jv60Var.getClass();
        this.a = jv60Var;
        this.d = hwr.b(new Function0() { // from class: ev60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dv60.c(w8i0Var);
            }
        });
    }

    @Override // jv60.b
    public final Bundle a() {
        o2g.a.getClass();
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : ((gv60) this.d.getValue()).a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((vu60) entry.getValue()).b.e.a();
            if (!bundleA2.isEmpty()) {
                str.getClass();
                bundleA.putBundle(str, bundleA2);
            }
        }
        this.b = false;
        return bundleA;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        o2g.a.getClass();
        Bundle bundleA2 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.c = bundleA2;
        this.b = true;
    }
}

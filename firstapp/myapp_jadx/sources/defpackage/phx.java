package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class phx extends yfx {
    public final void q(ibs ibsVar) {
        s9s lifecycle;
        ibsVar.getClass();
        igx igxVar = this.b;
        bgx bgxVar = igxVar.s;
        if (ibsVar.equals(igxVar.o)) {
            return;
        }
        ibs ibsVar2 = igxVar.o;
        if (ibsVar2 != null && (lifecycle = ibsVar2.getLifecycle()) != null) {
            lifecycle.d(bgxVar);
        }
        igxVar.o = ibsVar;
        ibsVar.getLifecycle().a(bgxVar);
    }

    public final void r(v8i0 v8i0Var) {
        v8i0Var.getClass();
        igx igxVar = this.b;
        igxVar.getClass();
        jgx jgxVar = igxVar.p;
        bin binVar = lgx.a;
        cyb.a aVar = cyb.a.b;
        binVar.getClass();
        aVar.getClass();
        s8i0 s8i0Var = new s8i0(v8i0Var, binVar, aVar);
        dq7 dq7VarA = jq40.a(jgx.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        if (Intrinsics.g(jgxVar, (jgx) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI)))) {
            return;
        }
        if (!igxVar.f.isEmpty()) {
            ib5.a("ViewModelStore should be set before setGraph call");
            return;
        }
        s8i0 s8i0Var2 = new s8i0(v8i0Var, binVar, aVar);
        dq7 dq7VarA2 = jq40.a(jgx.class);
        String strI2 = dq7VarA2.i();
        if (strI2 != null) {
            igxVar.p = (jgx) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }
}

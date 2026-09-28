package defpackage;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public final class eqm<REQUEST, RESPONSE> implements lra0<REQUEST, RESPONSE> {
    @Override // defpackage.lra0
    public final void a(kra0 kra0Var, Interceptor.Chain chain, Object obj, Throwable th) {
        oqa0 oqa0Var = kra0Var.a;
        if (obj != null) {
            if (fqm.a.a(amy.a.h(chain, obj).intValue())) {
                oqa0Var.k();
                return;
            }
        }
        if (th != null) {
            oqa0Var.k();
        }
    }
}

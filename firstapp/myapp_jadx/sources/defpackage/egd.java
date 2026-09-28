package defpackage;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public final class egd<REQUEST, RESPONSE> implements lra0<REQUEST, RESPONSE> {
    public static final egd a = new egd();

    @Override // defpackage.lra0
    public final void a(kra0 kra0Var, Interceptor.Chain chain, Object obj, Throwable th) {
        if (th != null) {
            kra0Var.a.k();
        }
    }
}

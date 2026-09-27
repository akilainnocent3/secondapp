package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f74805a;

    public fd(ld ldVar) {
        this.f74805a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f74805a;
        if (ldVar.f75135o || ldVar.f75127g) {
            return;
        }
        try {
            ldVar.f75127g = true;
            g0.d(ldVar.f75121a);
            if (ldVar.f75131k && MetaData.E().i0()) {
                g0.a(ldVar.f75121a, ldVar.f75125e);
            } else {
                g0.b(ldVar.f75121a, ldVar.f75125e);
            }
            Runnable runnable = ldVar.f75134n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}

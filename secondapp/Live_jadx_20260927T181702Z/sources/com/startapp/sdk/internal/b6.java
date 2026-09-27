package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b6 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f74584a;

    public b6(Map factories) {
        kotlin.jvm.internal.m0.p(factories, "factories");
        this.f74584a = factories;
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a() {
        Iterator it = this.f74584a.values().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).a();
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void b(AdUnitConfig config, ds.l listener) {
        kotlin.jvm.internal.m0.p(config, "config");
        kotlin.jvm.internal.m0.p(listener, "listener");
        j0 j0Var = (j0) this.f74584a.get(config.getNetwork());
        if (j0Var != null) {
            j0Var.b(config, listener);
        } else {
            listener.invoke(null);
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a(AdUnitConfig config, ds.l listener) {
        kotlin.jvm.internal.m0.p(config, "config");
        kotlin.jvm.internal.m0.p(listener, "listener");
        j0 j0Var = (j0) this.f74584a.get(config.getNetwork());
        if (j0Var != null) {
            j0Var.a(config, listener);
        } else {
            listener.invoke(null);
        }
    }
}

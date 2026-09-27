package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4905a2 implements AppSetIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4931b2 f96907a;

    public C4905a2(C4931b2 c4931b2) {
        this.f96907a = c4931b2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @k.j0
    public final void onAppSetIdRetrieved(@oy.m String str, @oy.l AppSetIdScope appSetIdScope) {
        this.f96907a.f96992c = new AppSetId(str, appSetIdScope);
        this.f96907a.f96993d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @k.j0
    public final void onFailure(@oy.m Throwable th2) {
        this.f96907a.f96993d.countDown();
    }
}

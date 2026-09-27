package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Pj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f96335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96336b;

    public Pj(String str, String str2) {
        this.f96335a = str;
        this.f96336b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportEvent(this.f96335a, this.f96336b);
    }
}

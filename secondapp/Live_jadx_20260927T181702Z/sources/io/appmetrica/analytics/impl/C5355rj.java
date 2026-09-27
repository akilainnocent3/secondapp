package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5355rj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f98241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f98242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f98243c;

    public C5355rj(String str, String str2, Throwable th2) {
        this.f98241a = str;
        this.f98242b = str2;
        this.f98243c = th2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportError(this.f98241a, this.f98242b, this.f98243c);
    }
}

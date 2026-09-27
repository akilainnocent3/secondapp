package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Lj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f96117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96118b;

    public Lj(String str, String str2) {
        this.f96117a = str;
        this.f96118b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.putAppEnvironmentValue(this.f96117a, this.f96118b);
    }
}

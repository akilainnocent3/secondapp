package com.fyber.inneractive.sdk.mraid;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45246b;

    public a0(int i10, int i11) {
        this.f45245a = i10;
        this.f45246b = i11;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "maxSize: { width: " + this.f45245a + ", height: " + this.f45246b + " }";
    }
}

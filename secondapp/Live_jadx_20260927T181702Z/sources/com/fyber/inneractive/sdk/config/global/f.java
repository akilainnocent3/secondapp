package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44372b;

    public f(boolean z10, String str) {
        this.f44371a = str;
        this.f44372b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f44371a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f44372b : this.f44372b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f44371a + " include: " + this.f44372b;
    }
}

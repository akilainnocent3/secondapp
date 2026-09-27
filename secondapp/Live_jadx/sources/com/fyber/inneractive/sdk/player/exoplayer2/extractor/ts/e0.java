package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46450e;

    public e0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + to.c.userBaseDel;
        } else {
            str = "";
        }
        this.f46446a = str;
        this.f46447b = i11;
        this.f46448c = i12;
        this.f46449d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i10 = this.f46449d;
        this.f46449d = i10 == Integer.MIN_VALUE ? this.f46447b : i10 + this.f46448c;
        this.f46450e = this.f46446a + this.f46449d;
    }

    public final void b() {
        if (this.f46449d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}

package com.bytedance.sdk.openadsdk.component.ok;

import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hww {
    private float hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f35633sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f35634tq;
    private long vy;

    public void hww(boolean z10) {
        this.f35633sd = z10;
    }

    public long sd() {
        return this.f35634tq;
    }

    public float tq() {
        return this.hww;
    }

    public long hww() {
        return this.vy;
    }

    public void tq(long j10) {
        this.f35634tq = j10;
    }

    public void hww(long j10) {
        this.vy = j10;
    }

    public void hww(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append(C4235d4.j.f61462e);
        this.hww = f10;
    }
}

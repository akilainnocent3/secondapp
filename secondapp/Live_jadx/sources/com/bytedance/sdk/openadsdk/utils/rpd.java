package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rpd {
    public long hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37681tq;

    private rpd(boolean z10) {
        if (z10) {
            hv();
        }
    }

    public static rpd sd() {
        return new rpd(false);
    }

    public static rpd tq() {
        return new rpd(true);
    }

    public boolean hu() {
        return this.f37681tq > 0;
    }

    public void hv() {
        this.hww = System.currentTimeMillis();
        this.f37681tq = SystemClock.elapsedRealtime();
    }

    public long hww() {
        return this.f37681tq;
    }

    public String toString() {
        return String.valueOf(this.hww);
    }

    public long vy() {
        return SystemClock.elapsedRealtime() - this.f37681tq;
    }

    public long hww(rpd rpdVar) {
        return Math.abs(rpdVar.f37681tq - this.f37681tq);
    }
}

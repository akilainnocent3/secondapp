package com.bytedance.sdk.component.hu.hww.vy.tq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34650tq;

    public hww(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.hww = i10;
        this.f34650tq = i11;
    }

    public static hww hv() {
        return new hww(3, 100, 172800000L);
    }

    public static hww sd() {
        return new hww(1, 100, 172800000L);
    }

    public static hww vy() {
        return new hww(1, 100, -1L);
    }

    public int hww() {
        return this.hww;
    }

    public int tq() {
        return this.f34650tq;
    }
}

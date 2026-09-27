package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f47109b = new long[32];

    public final void a(long j10) {
        int i10 = this.f47108a;
        long[] jArr = this.f47109b;
        if (i10 == jArr.length) {
            this.f47109b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f47109b;
        int i11 = this.f47108a;
        this.f47108a = i11 + 1;
        jArr2[i11] = j10;
    }
}

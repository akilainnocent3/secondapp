package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f45731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f45732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45733c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f45731a = jArr;
        this.f45732b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f45733c = 0L;
        } else {
            int i10 = length - 1;
            this.f45733c = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f45733c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f45731a[z.a(this.f45732b, j10, true)];
    }
}

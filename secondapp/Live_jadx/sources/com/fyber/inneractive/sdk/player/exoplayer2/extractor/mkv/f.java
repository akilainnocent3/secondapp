package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f46055a = new n(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46056b;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i10 = 0;
        bVar.a(this.f46055a.f47130a, 0, 1, false);
        int i11 = this.f46055a.f47130a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        bVar.a(this.f46055a.f47130a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f46055a.f47130a[i10] & 255) + (i14 << 8);
        }
        this.f46056b = i13 + 1 + this.f46056b;
        return i14;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f46057d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46058a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46060c;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10, boolean z11, int i10) throws InterruptedException, EOFException {
        int i11;
        if (this.f46059b == 0) {
            if (!bVar.b(this.f46058a, 0, 1, z10)) {
                return -1L;
            }
            int i12 = this.f46058a[0] & 255;
            int i13 = 0;
            while (true) {
                long[] jArr = f46057d;
                if (i13 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((((long) i12) & jArr[i13]) != 0) {
                    i11 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f46060c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f46059b = 1;
        }
        int i14 = this.f46060c;
        if (i14 > i10) {
            this.f46059b = 0;
            return -2L;
        }
        if (i14 != 1) {
            bVar.b(this.f46058a, 1, i14 - 1, false);
        }
        this.f46059b = 0;
        return a(this.f46058a, this.f46060c, z11);
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f46057d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }
}

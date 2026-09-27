package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46333h = z.a("OggS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f46339f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46340g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f46340g;
        nVar.f47131b = 0;
        nVar.f47132c = 0;
        this.f46334a = 0;
        this.f46335b = 0L;
        this.f46336c = 0;
        this.f46337d = 0;
        this.f46338e = 0;
        long j10 = bVar.f45736b;
        if ((j10 != -1 && j10 - (bVar.f45737c + ((long) bVar.f45739e)) < 27) || !bVar.a(nVar.f47130a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f46340g.k() != f46333h) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f46340g.j() != 0) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f46334a = this.f46340g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f46340g;
        byte[] bArr = nVar2.f47130a;
        int i10 = nVar2.f47131b;
        int i11 = i10 + 1;
        nVar2.f47131b = i11;
        long j11 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        nVar2.f47131b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        nVar2.f47131b = i13;
        long j13 = j12 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        nVar2.f47131b = i14;
        long j14 = j13 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        nVar2.f47131b = i15;
        long j15 = j14 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        nVar2.f47131b = i16;
        long j16 = j15 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        nVar2.f47131b = i17;
        long j17 = j16 | ((((long) bArr[i16]) & 255) << 48);
        nVar2.f47131b = i10 + 8;
        this.f46335b = j17 | ((255 & ((long) bArr[i17])) << 56);
        nVar2.e();
        this.f46340g.e();
        this.f46340g.e();
        int iJ = this.f46340g.j();
        this.f46336c = iJ;
        this.f46337d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f46340g;
        nVar3.f47131b = 0;
        nVar3.f47132c = 0;
        bVar.a(nVar3.f47130a, 0, iJ, false);
        for (int i18 = 0; i18 < this.f46336c; i18++) {
            this.f46339f[i18] = this.f46340g.j();
            this.f46338e += this.f46339f[i18];
        }
        return true;
    }
}

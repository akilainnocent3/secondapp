package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f46423r = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46424a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f46429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f46430g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f46436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f46438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f46439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f46440q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f46425b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46426c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f46423r, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46431h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46432i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46433j = 256;

    public d(boolean z10, String str) {
        this.f46424a = z10;
        this.f46427d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f47132c;
            int i11 = nVar.f47131b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f46431h;
            if (i13 == 0) {
                byte[] bArr = nVar.f47130a;
                while (true) {
                    if (i11 >= i10) {
                        nVar.e(i11);
                        break;
                    }
                    int i14 = i11 + 1;
                    byte b10 = bArr[i11];
                    int i15 = b10 & 255;
                    int i16 = this.f46433j;
                    if (i16 == 512 && i15 >= 240 && i15 != 255) {
                        this.f46434k = (b10 & 1) == 0;
                        this.f46431h = 2;
                        this.f46432i = 0;
                        nVar.e(i14);
                        break;
                    }
                    int i17 = i16 | i15;
                    if (i17 == 329) {
                        this.f46433j = 768;
                    } else if (i17 == 511) {
                        this.f46433j = 512;
                    } else if (i17 == 836) {
                        this.f46433j = 1024;
                    } else {
                        if (i17 == 1075) {
                            this.f46431h = 1;
                            this.f46432i = 3;
                            this.f46437n = 0;
                            this.f46426c.e(0);
                            nVar.e(i14);
                            break;
                        }
                        if (i16 != 256) {
                            this.f46433j = 256;
                        }
                    }
                    i11 = i14;
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f46426c.f47130a;
                int iMin = Math.min(i12, 10 - this.f46432i);
                nVar.a(bArr2, this.f46432i, iMin);
                int i18 = this.f46432i + iMin;
                this.f46432i = i18;
                if (i18 == 10) {
                    this.f46430g.a(10, this.f46426c);
                    this.f46426c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f46430g;
                    int i19 = this.f46426c.i() + 10;
                    this.f46431h = 3;
                    this.f46432i = 10;
                    this.f46439p = rVar;
                    this.f46440q = 0L;
                    this.f46437n = i19;
                }
            } else if (i13 == 2) {
                int i20 = this.f46434k ? 7 : 5;
                byte[] bArr3 = this.f46425b.f47126a;
                int iMin2 = Math.min(i12, i20 - this.f46432i);
                nVar.a(bArr3, this.f46432i, iMin2);
                int i21 = this.f46432i + iMin2;
                this.f46432i = i21;
                if (i21 == i20) {
                    this.f46425b.b(0);
                    if (this.f46435l) {
                        this.f46425b.c(10);
                    } else {
                        int iA = this.f46425b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f46425b.a(4);
                        this.f46425b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & 7)), (byte) (((iA2 << 7) & 128) | ((this.f46425b.a(3) << 3) & 120))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f46428e, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f46427d);
                        this.f46436m = 1024000000 / ((long) oVarA.f46802s);
                        this.f46429f.a(oVarA);
                        this.f46435l = true;
                    }
                    this.f46425b.c(4);
                    int iA3 = this.f46425b.a(13);
                    int i22 = iA3 - 7;
                    if (this.f46434k) {
                        i22 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f46429f;
                    long j10 = this.f46436m;
                    this.f46431h = 3;
                    this.f46432i = 0;
                    this.f46439p = rVar2;
                    this.f46440q = j10;
                    this.f46437n = i22;
                }
            } else if (i13 == 3) {
                int iMin3 = Math.min(i12, this.f46437n - this.f46432i);
                this.f46439p.a(iMin3, nVar);
                int i23 = this.f46432i + iMin3;
                this.f46432i = i23;
                int i24 = this.f46437n;
                if (i23 == i24) {
                    this.f46439p.a(this.f46438o, 1, i24, 0, null);
                    this.f46438o += this.f46440q;
                    this.f46431h = 0;
                    this.f46432i = 0;
                    this.f46433j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f46428e = e0Var.f46450e;
        e0Var.b();
        this.f46429f = jVar.a(e0Var.f46449d, 1);
        if (this.f46424a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f46449d, 4);
            this.f46430g = gVarA;
            e0Var.b();
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f46450e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.f46430g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f46438o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f46431h = 0;
        this.f46432i = 0;
        this.f46433j = 256;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f46584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f46585b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f46588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f46595l;

    public s(h hVar) {
        this.f46584a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f46588e = vVar;
        this.f46584a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f46586c = 0;
        this.f46587d = 0;
        this.f46591h = false;
        this.f46584a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int i10;
        if (z10) {
            int i11 = this.f46586c;
            if (i11 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i11 == 3) {
                if (this.f46593j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f46593j + " more bytes");
                }
                this.f46584a.b();
            }
            this.f46586c = 1;
            this.f46587d = 0;
        }
        while (true) {
            int i12 = nVar.f47132c;
            int i13 = nVar.f47131b;
            int i14 = i12 - i13;
            if (i14 <= 0) {
                return;
            }
            int i15 = this.f46586c;
            if (i15 == 0) {
                nVar.e(i14 + i13);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (a(nVar, this.f46585b.f47126a, Math.min(10, this.f46592i)) && a(nVar, (byte[]) null, this.f46592i)) {
                        this.f46585b.b(0);
                        this.f46595l = -9223372036854775807L;
                        if (this.f46589f) {
                            this.f46585b.c(4);
                            long jA = ((long) this.f46585b.a(3)) << 30;
                            this.f46585b.c(1);
                            long jA2 = jA | ((long) (this.f46585b.a(15) << 15));
                            this.f46585b.c(1);
                            long jA3 = jA2 | ((long) this.f46585b.a(15));
                            this.f46585b.c(1);
                            if (!this.f46591h && this.f46590g) {
                                this.f46585b.c(4);
                                long jA4 = ((long) this.f46585b.a(3)) << 30;
                                this.f46585b.c(1);
                                long jA5 = jA4 | ((long) (this.f46585b.a(15) << 15));
                                this.f46585b.c(1);
                                long jA6 = jA5 | ((long) this.f46585b.a(15));
                                this.f46585b.c(1);
                                this.f46588e.b(jA6);
                                this.f46591h = true;
                            }
                            this.f46595l = this.f46588e.b(jA3);
                        }
                        this.f46584a.a(this.f46594k, this.f46595l);
                        this.f46586c = 3;
                        this.f46587d = 0;
                    }
                } else if (i15 == 3) {
                    int i16 = this.f46593j;
                    int i17 = i16 == -1 ? 0 : i14 - i16;
                    if (i17 > 0) {
                        i14 -= i17;
                        nVar.d(i13 + i14);
                    }
                    this.f46584a.a(nVar);
                    int i18 = this.f46593j;
                    if (i18 != -1) {
                        int i19 = i18 - i14;
                        this.f46593j = i19;
                        if (i19 == 0) {
                            this.f46584a.b();
                            this.f46586c = 1;
                            this.f46587d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f46585b.f47126a, 9)) {
                this.f46585b.b(0);
                int iA = this.f46585b.a(24);
                if (iA != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iA);
                    this.f46593j = -1;
                    i10 = 0;
                } else {
                    this.f46585b.c(8);
                    int iA2 = this.f46585b.a(16);
                    this.f46585b.c(5);
                    this.f46594k = this.f46585b.b();
                    this.f46585b.c(2);
                    this.f46589f = this.f46585b.b();
                    this.f46590g = this.f46585b.b();
                    this.f46585b.c(6);
                    int iA3 = this.f46585b.a(8);
                    this.f46592i = iA3;
                    if (iA2 == 0) {
                        this.f46593j = -1;
                    } else {
                        this.f46593j = (iA2 - 3) - iA3;
                    }
                    i10 = 2;
                }
                this.f46586c = i10;
                this.f46587d = 0;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i10) {
        int iMin = Math.min(nVar.f47132c - nVar.f47131b, i10 - this.f46587d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f47131b + iMin);
        } else {
            nVar.a(bArr, this.f46587d, iMin);
        }
        int i11 = this.f46587d + iMin;
        this.f46587d = i11;
        return i11 == i10;
    }
}

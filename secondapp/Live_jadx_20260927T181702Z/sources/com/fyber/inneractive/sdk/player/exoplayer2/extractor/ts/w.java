package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f46610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46611b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46615f;

    public w(v vVar) {
        this.f46610a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f46610a.a(vVar, jVar, e0Var);
        this.f46615f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f46615f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int iJ = z10 ? nVar.f47131b + nVar.j() : -1;
        if (this.f46615f) {
            if (!z10) {
                return;
            }
            this.f46615f = false;
            nVar.e(iJ);
            this.f46613d = 0;
        }
        while (true) {
            int i10 = nVar.f47132c - nVar.f47131b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f46613d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f47131b - 1);
                    if (iJ2 == 255) {
                        this.f46615f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f47132c - nVar.f47131b, 3 - this.f46613d);
                nVar.a(this.f46611b.f47130a, this.f46613d, iMin);
                int i12 = this.f46613d + iMin;
                this.f46613d = i12;
                if (i12 == 3) {
                    this.f46611b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f46611b;
                    nVar2.e(nVar2.f47131b + 1);
                    int iJ3 = this.f46611b.j();
                    int iJ4 = this.f46611b.j();
                    this.f46614e = (iJ3 & 128) != 0;
                    this.f46612c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f46611b.a();
                    int i13 = this.f46612c;
                    if (iA < i13) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f46611b;
                        byte[] bArr = nVar3.f47130a;
                        nVar3.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f46611b.f47130a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f46612c - i11);
                nVar.a(this.f46611b.f47130a, this.f46613d, iMin2);
                int i14 = this.f46613d + iMin2;
                this.f46613d = i14;
                int i15 = this.f46612c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f46614e) {
                        byte[] bArr2 = this.f46611b.f47130a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47165h[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
                        if (i16 != 0) {
                            this.f46615f = true;
                            return;
                        }
                        this.f46611b.c(this.f46612c - 4);
                    } else {
                        this.f46611b.c(i15);
                    }
                    this.f46610a.a(this.f46611b);
                    this.f46613d = 0;
                }
            }
        }
    }
}

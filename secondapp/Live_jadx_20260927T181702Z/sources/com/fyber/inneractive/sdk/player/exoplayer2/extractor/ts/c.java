package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46416e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46418b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f46419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46420d;

    public c(long j10) {
        this.f46417a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f47130a);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f47130a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f46416e) {
                break;
            }
            nVar.e(nVar.f47131b + 3);
            int i11 = nVar.i();
            i10 += i11 + 10;
            bVar.a(i11, false);
        }
        bVar.f45739e = 0;
        bVar.a(i10, false);
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            bVar.a(nVar.f47130a, 0, 2, false);
            nVar.e(0);
            if ((nVar.o() & 65526) != 65520) {
                bVar.f45739e = 0;
                i14++;
                if (i14 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i14, false);
                i12 = 0;
                i13 = 0;
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                bVar.a(nVar.f47130a, 0, 4, false);
                mVar.b(14);
                int iA = mVar.a(13);
                if (iA <= 6) {
                    return false;
                }
                bVar.a(iA - 6, false);
                i13 += iA;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        d dVar = new d(true, null);
        this.f46419c = dVar;
        dVar.a(jVar, new e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f46420d = false;
        d dVar = this.f46419c;
        dVar.f46431h = 0;
        dVar.f46432i = 0;
        dVar.f46433j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f46418b.f47130a;
        int i10 = bVar.f45740f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 200);
            System.arraycopy(bVar.f45738d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 200, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f45737c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f46418b.e(0);
        this.f46418b.d(iMin);
        if (!this.f46420d) {
            this.f46419c.f46438o = this.f46417a;
            this.f46420d = true;
        }
        this.f46419c.a(this.f46418b);
        return 0;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f f46325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f46326o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f46325n = null;
            this.f46326o = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        int i11;
        int i12;
        byte[] bArr = nVar.f47130a;
        int i13 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i14 = (bArr[2] & 255) >> 4;
        switch (i14) {
            case 1:
                i13 = 192;
                return i13;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i14 - 2;
                i11 = 576;
                i13 = i11 << i10;
                return i13;
            case 6:
            case 7:
                nVar.e(nVar.f47131b + 4);
                long j10 = nVar.f47130a[nVar.f47131b];
                int i15 = 7;
                while (true) {
                    if (i15 >= 0) {
                        int i16 = 1 << i15;
                        if ((((long) i16) & j10) != 0) {
                            i15--;
                        } else if (i15 < 6) {
                            j10 &= (long) (i16 - 1);
                            i12 = 7 - i15;
                        } else if (i15 == 7) {
                            i12 = 1;
                        }
                    }
                    i12 = 0;
                }
                if (i12 != 0) {
                    for (int i17 = 1; i17 < i12; i17++) {
                        byte b10 = nVar.f47130a[nVar.f47131b + i17];
                        if ((b10 & l3.a.f103436o7) != 128) {
                            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                        }
                        j10 = (j10 << 6) | ((long) (b10 & 63));
                    }
                    nVar.f47131b += i12;
                    int iJ = i14 == 6 ? nVar.j() : nVar.o();
                    nVar.e(0);
                    i13 = iJ + 1;
                    return i13;
                }
                throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i14 - 8;
                i11 = 256;
                i13 = i11 << i10;
                return i13;
            default:
                return i13;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        byte[] bArr = nVar.f47130a;
        if (this.f46325n == null) {
            this.f46325n = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, nVar.f47132c);
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f46325n;
            int i10 = fVar.f47106c;
            int i11 = fVar.f47104a;
            jVar.f46344a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/flac", -1, i10 * i11, fVar.f47105b, i11, listSingletonList, null, null);
        } else {
            byte b10 = bArr[0];
            if ((b10 & 127) == 3) {
                c cVar = new c(this);
                this.f46326o = cVar;
                nVar.e(nVar.f47131b + 1);
                int iL = nVar.l() / 18;
                cVar.f46320a = new long[iL];
                cVar.f46321b = new long[iL];
                for (int i12 = 0; i12 < iL; i12++) {
                    cVar.f46320a[i12] = nVar.g();
                    cVar.f46321b[i12] = nVar.g();
                    nVar.e(nVar.f47131b + 2);
                }
            } else if (b10 == -1) {
                c cVar2 = this.f46326o;
                if (cVar2 != null) {
                    cVar2.f46322c = j10;
                    jVar.f46345b = cVar2;
                }
                return false;
            }
        }
        return true;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.text.cea;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static void a(long j10, n nVar, r[] rVarArr) {
        int i10;
        int iJ;
        while (nVar.f47132c - nVar.f47131b > 1) {
            int i11 = 0;
            while (true) {
                if (nVar.f47132c - nVar.f47131b == 0) {
                    i10 = -1;
                    break;
                }
                int iJ2 = nVar.j();
                i11 += iJ2;
                if (iJ2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (nVar.f47132c - nVar.f47131b == 0) {
                    i12 = -1;
                    break;
                } else {
                    iJ = nVar.j();
                    i12 += iJ;
                }
            } while (iJ == 255);
            if (i12 != -1) {
                int i13 = nVar.f47132c;
                int i14 = nVar.f47131b;
                if (i12 <= i13 - i14) {
                    if (i10 == 4 && i12 >= 8) {
                        int iJ3 = nVar.j();
                        int iO = nVar.o();
                        int iB = nVar.b();
                        int iJ4 = nVar.j();
                        nVar.e(i14);
                        if (iJ3 == 181 && iO == 49 && iB == 1195456820 && iJ4 == 3) {
                            nVar.e(nVar.f47131b + 8);
                            int iJ5 = nVar.j() & 31;
                            nVar.e(nVar.f47131b + 1);
                            int i15 = iJ5 * 3;
                            int i16 = nVar.f47131b;
                            for (r rVar : rVarArr) {
                                nVar.e(i16);
                                rVar.a(i15, nVar);
                                rVar.a(j10, 1, i15, 0, null);
                            }
                            nVar.e(nVar.f47131b + (i12 - (i15 + 10)));
                        }
                    }
                    nVar.e(nVar.f47131b + i12);
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            nVar.e(nVar.f47132c);
        }
    }
}

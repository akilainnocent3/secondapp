package defpackage;

import androidx.compose.foundation.h;
import androidx.compose.foundation.lazy.layout.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class jzr {
    /* JADX WARN: Code duplicated, block: B:153:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:173:0x026f  */
    /* JADX WARN: Code duplicated, block: B:176:0x027f  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:247:0x039d  */
    /* JADX WARN: Code duplicated, block: B:252:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:267:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:269:0x0413  */
    public static final void a(d dVar, final zzr zzrVar, final tmz tmzVar, final boolean z, final boolean z2, final svh svhVar, final boolean z3, final sfz sfzVar, ht.b bVar, kw0.l lVar, ht.c cVar, kw0.e eVar, final Function1 function1, a aVar, final int i, final int i2, final int i3) {
        int i4;
        ht.b bVar2;
        int i5;
        int i6;
        d dVar2;
        zzr zzrVar2;
        b bVar3;
        final kw0.l lVar2;
        final ht.c cVar2;
        final ht.b bVar4;
        final kw0.e eVar2;
        kw0.l lVar3;
        ht.c cVar3;
        int i7;
        kw0.e eVar3;
        int i8;
        ytw ytwVarC;
        boolean z4;
        Object objY;
        a.C0041a.C0042a c0042a;
        lhp lhpVar;
        boolean z5;
        Object objY2;
        Object objY3;
        v5b v5bVar;
        t6l t6lVar;
        l0e0.a.C0800a c0800a;
        boolean zD;
        Object objY4;
        ht.b bVar5;
        int i9;
        kw0.e eVar4;
        zzr zzrVar3;
        lhp lhpVar2;
        i3z i3zVar;
        i3z i3zVar2;
        d dVarA;
        boolean zD2;
        Object objY5;
        b bVarI = aVar.i(924924659);
        if ((i & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.M(zzrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.M(tmzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= bVarI.M(svhVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bVarI.b(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bVarI.M(sfzVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i & 805306368) == 0) {
                i4 |= bVarI.M(bVar2) ? 536870912 : 268435456;
            }
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.M(lVar) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= bVarI.M(cVar) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i3 & 4096;
        if (i14 != 0) {
            i6 = i13 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i13 | (bVarI.M(eVar) ? 256 : 128);
        } else {
            i6 = i13;
        }
        if ((i2 & 3072) == 0) {
            i6 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i15 = i6;
        boolean z6 = true;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                int i16 = i4 & (-234881025);
                if (i10 != 0) {
                    bVar2 = null;
                }
                lVar3 = i11 != 0 ? null : lVar;
                cVar3 = i12 != 0 ? null : cVar;
                i7 = i16;
                if (i14 != 0) {
                    eVar3 = null;
                }
                bVarI.Y();
                i8 = i7 >> 3;
                int i17 = i8 & 14;
                int i18 = ((i15 >> 6) & 112) | i17;
                ytwVarC = m.c(function1, bVarI);
                int i19 = i7;
                z4 = (((i18 & 14) ^ 6) <= 4 && bVarI.M(zzrVar)) || (i18 & 6) == 4;
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (z4 || objY == c0042a) {
                    final androidx.compose.foundation.lazy.a aVar2 = new androidx.compose.foundation.lazy.a();
                    aVar2.a = k.a(Reader.READ_DONE);
                    aVar2.b = k.a(Reader.READ_DONE);
                    dzr dzrVar = new dzr(ytwVarC, 0);
                    t6a0<qwo> t6a0Var = a6a0.a;
                    gq40 gq40Var = gq40.b;
                    final mae maeVar = new mae(dzrVar, gq40Var);
                    objY = new fzr(new mae(new Function0() { // from class: ezr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            xyr xyrVar = (xyr) maeVar.getValue();
                            zzr zzrVar4 = zzrVar;
                            return new czr(zzrVar4, xyrVar, aVar2, new g((IntRange) zzrVar4.e.e.getValue(), xyrVar));
                        }
                    }, gq40Var), twd0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    bVarI.r(objY);
                }
                lhpVar = (lhp) objY;
                int i20 = i19 >> 9;
                int i21 = i17 | (i20 & 112);
                z5 = ((((i21 & 112) ^ 48) <= 32 && bVarI.b(z2)) || (i21 & 48) == 32) | ((((i21 & 14) ^ 6) <= 4 && bVarI.M(zzrVar)) || (i21 & 6) == 4);
                objY2 = bVarI.y();
                if (z5 || objY2 == c0042a) {
                    objY2 = new pyr(zzrVar, z2);
                    bVarI.r(objY2);
                }
                nyr nyrVar = (nyr) objY2;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = xvf.i(e.a, bVarI);
                    bVarI.r(objY3);
                }
                v5bVar = (v5b) objY3;
                t6lVar = (t6l) bVarI.O(kna.g);
                c0800a = ((Boolean) bVarI.O(kna.v)).booleanValue() ? null : l0e0.a.a;
                int i22 = i15 << 18;
                int i23 = (i19 & 65520) | (i20 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i15 << 27) & 1879048192);
                zD = ((((i23 & 896) ^ 384) <= 256 && bVarI.M(tmzVar)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) <= 32 && bVarI.M(zzrVar)) || (i23 & 48) == 32) | ((((i23 & 7168) ^ 3072) <= 2048 && bVarI.b(z)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) <= 16384 && bVarI.b(z2)) || (i23 & 24576) == 16384) | bVarI.d(0) | ((((i23 & 3670016) ^ 1572864) <= 1048576 && bVarI.M(bVar2)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) <= 8388608 && bVarI.M(cVar3)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) <= 67108864 && bVarI.M(eVar3)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) <= 536870912 && bVarI.M(lVar3)) || (i23 & 805306368) == 536870912) | bVarI.M(t6lVar) | bVarI.M(c0800a);
                objY4 = bVarI.y();
                if (!zD || objY4 == c0042a) {
                    kw0.e eVar5 = eVar3;
                    bVar5 = bVar2;
                    i9 = 4;
                    bVar3 = bVarI;
                    izr izrVar = new izr(zzrVar, z2, tmzVar, z, lhpVar, lVar3, eVar5, v5bVar, t6lVar, c0800a, bVar5, cVar3);
                    eVar4 = eVar5;
                    zzrVar3 = zzrVar;
                    lhpVar2 = lhpVar;
                    bVar3.r(izrVar);
                    objY4 = izrVar;
                } else {
                    lhpVar2 = lhpVar;
                    eVar4 = eVar3;
                    bVar3 = bVarI;
                    bVar5 = bVar2;
                    i9 = 4;
                    zzrVar3 = zzrVar;
                }
                nxr nxrVar = (nxr) objY4;
                if (z2) {
                    i3zVar = i3z.a;
                } else {
                    i3zVar = i3z.b;
                }
                i3zVar2 = i3zVar;
                if (z3) {
                    bVar3.N(-2077085864);
                    if ((((i8 & 14) ^ 6) > i9 || !bVar3.M(zzrVar3)) && (i8 & 6) != i9) {
                    }
                    zD2 = z6 | bVar3.d(0);
                    objY5 = bVar3.y();
                    if (zD2 || objY5 == c0042a) {
                        objY5 = new vyr(zzrVar3);
                        bVar3.r(objY5);
                    }
                    dVarA = androidx.compose.foundation.lazy.layout.a.a((vyr) objY5, zzrVar3.o, z, i3zVar2);
                    bVar3.X(false);
                } else {
                    bVar3.N(-2076657041);
                    bVar3.X(false);
                    dVarA = d.a.b;
                }
                dVar2 = dVar;
                lhp lhpVar3 = lhpVar2;
                d dVarN = androidx.compose.foundation.lazy.layout.e.a(dVar2.n(zzrVar3.l).n(zzrVar3.m), lhpVar2, nyrVar, i3zVar2, z3, z).n(dVarA).n(zzrVar3.n.k);
                zzr zzrVar4 = zzrVar3;
                zzrVar2 = zzrVar4;
                mxr.a(lhpVar3, h.a(dVarN, zzrVar4, i3zVar2, z3, z, svhVar, zzrVar4.g, false, sfzVar, null), zzrVar2.p, nxrVar, bVar3, 0);
                lVar2 = lVar3;
                bVar4 = bVar5;
                cVar2 = cVar3;
                eVar2 = eVar4;
            } else {
                bVarI.G();
                lVar3 = lVar;
                cVar3 = cVar;
                i7 = i4 & (-234881025);
            }
            eVar3 = eVar;
            bVarI.Y();
            i8 = i7 >> 3;
            int i110 = i8 & 14;
            int i111 = ((i15 >> 6) & 112) | i110;
            ytwVarC = m.c(function1, bVarI);
            int i112 = i7;
            if (((i111 & 14) ^ 6) <= 4) {
            }
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (z4) {
                final androidx.compose.foundation.lazy.a aVar3 = new androidx.compose.foundation.lazy.a();
                aVar3.a = k.a(Reader.READ_DONE);
                aVar3.b = k.a(Reader.READ_DONE);
                dzr dzrVar2 = new dzr(ytwVarC, 0);
                t6a0<qwo> t6a0Var2 = a6a0.a;
                gq40 gq40Var2 = gq40.b;
                final mae maeVar2 = new mae(dzrVar2, gq40Var2);
                objY = new fzr(new mae(new Function0() { // from class: ezr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        xyr xyrVar = (xyr) maeVar2.getValue();
                        zzr zzrVar5 = zzrVar;
                        return new czr(zzrVar5, xyrVar, aVar3, new g((IntRange) zzrVar5.e.e.getValue(), xyrVar));
                    }
                }, gq40Var2), twd0.class, "value", "getValue()Ljava/lang/Object;", 0);
                bVarI.r(objY);
            } else {
                final androidx.compose.foundation.lazy.a aVar4 = new androidx.compose.foundation.lazy.a();
                aVar4.a = k.a(Reader.READ_DONE);
                aVar4.b = k.a(Reader.READ_DONE);
                dzr dzrVar3 = new dzr(ytwVarC, 0);
                t6a0<qwo> t6a0Var3 = a6a0.a;
                gq40 gq40Var3 = gq40.b;
                final mae maeVar3 = new mae(dzrVar3, gq40Var3);
                objY = new fzr(new mae(new Function0() { // from class: ezr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        xyr xyrVar = (xyr) maeVar3.getValue();
                        zzr zzrVar5 = zzrVar;
                        return new czr(zzrVar5, xyrVar, aVar4, new g((IntRange) zzrVar5.e.e.getValue(), xyrVar));
                    }
                }, gq40Var3), twd0.class, "value", "getValue()Ljava/lang/Object;", 0);
                bVarI.r(objY);
            }
            lhpVar = (lhp) objY;
            int i24 = i112 >> 9;
            int i25 = i110 | (i24 & 112);
            z5 = ((((i25 & 112) ^ 48) <= 32 && bVarI.b(z2)) || (i25 & 48) == 32) | ((((i25 & 14) ^ 6) <= 4 && bVarI.M(zzrVar)) || (i25 & 6) == 4);
            objY2 = bVarI.y();
            if (z5) {
                objY2 = new pyr(zzrVar, z2);
                bVarI.r(objY2);
            } else {
                objY2 = new pyr(zzrVar, z2);
                bVarI.r(objY2);
            }
            nyr nyrVar2 = (nyr) objY2;
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = xvf.i(e.a, bVarI);
                bVarI.r(objY3);
            }
            v5bVar = (v5b) objY3;
            t6lVar = (t6l) bVarI.O(kna.g);
            c0800a = ((Boolean) bVarI.O(kna.v)).booleanValue() ? null : l0e0.a.a;
            int i26 = i15 << 18;
            int i27 = (i112 & 65520) | (i24 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | ((i15 << 27) & 1879048192);
            if (((i27 & 112) ^ 48) <= 32) {
            }
            zD = ((((i27 & 896) ^ 384) <= 256 && bVarI.M(tmzVar)) || (i27 & 384) == 256) | ((((i27 & 112) ^ 48) <= 32 && bVarI.M(zzrVar)) || (i27 & 48) == 32) | ((((i27 & 7168) ^ 3072) <= 2048 && bVarI.b(z)) || (i27 & 3072) == 2048) | ((((57344 & i27) ^ 24576) <= 16384 && bVarI.b(z2)) || (i27 & 24576) == 16384) | bVarI.d(0) | ((((i27 & 3670016) ^ 1572864) <= 1048576 && bVarI.M(bVar2)) || (i27 & 1572864) == 1048576) | ((((i27 & 29360128) ^ 12582912) <= 8388608 && bVarI.M(cVar3)) || (i27 & 12582912) == 8388608) | ((((i27 & 234881024) ^ 100663296) <= 67108864 && bVarI.M(eVar3)) || (i27 & 100663296) == 67108864) | ((((i27 & 1879048192) ^ 805306368) <= 536870912 && bVarI.M(lVar3)) || (i27 & 805306368) == 536870912) | bVarI.M(t6lVar) | bVarI.M(c0800a);
            objY4 = bVarI.y();
            if (zD) {
                kw0.e eVar6 = eVar3;
                bVar5 = bVar2;
                i9 = 4;
                bVar3 = bVarI;
                izr izrVar2 = new izr(zzrVar, z2, tmzVar, z, lhpVar, lVar3, eVar6, v5bVar, t6lVar, c0800a, bVar5, cVar3);
                eVar4 = eVar6;
                zzrVar3 = zzrVar;
                lhpVar2 = lhpVar;
                bVar3.r(izrVar2);
                objY4 = izrVar2;
            } else {
                kw0.e eVar7 = eVar3;
                bVar5 = bVar2;
                i9 = 4;
                bVar3 = bVarI;
                izr izrVar3 = new izr(zzrVar, z2, tmzVar, z, lhpVar, lVar3, eVar7, v5bVar, t6lVar, c0800a, bVar5, cVar3);
                eVar4 = eVar7;
                zzrVar3 = zzrVar;
                lhpVar2 = lhpVar;
                bVar3.r(izrVar3);
                objY4 = izrVar3;
            }
            nxr nxrVar2 = (nxr) objY4;
            if (z2) {
                i3zVar = i3z.a;
            } else {
                i3zVar = i3z.b;
            }
            i3zVar2 = i3zVar;
            if (z3) {
                bVar3.N(-2077085864);
                z6 = ((i8 & 14) ^ 6) > i9 ? false : false;
                zD2 = z6 | bVar3.d(0);
                objY5 = bVar3.y();
                if (zD2) {
                    objY5 = new vyr(zzrVar3);
                    bVar3.r(objY5);
                } else {
                    objY5 = new vyr(zzrVar3);
                    bVar3.r(objY5);
                }
                dVarA = androidx.compose.foundation.lazy.layout.a.a((vyr) objY5, zzrVar3.o, z, i3zVar2);
                bVar3.X(false);
            } else {
                bVar3.N(-2076657041);
                bVar3.X(false);
                dVarA = d.a.b;
            }
            dVar2 = dVar;
            lhp lhpVar4 = lhpVar2;
            d dVarN2 = androidx.compose.foundation.lazy.layout.e.a(dVar2.n(zzrVar3.l).n(zzrVar3.m), lhpVar2, nyrVar2, i3zVar2, z3, z).n(dVarA).n(zzrVar3.n.k);
            zzr zzrVar5 = zzrVar3;
            zzrVar2 = zzrVar5;
            mxr.a(lhpVar4, h.a(dVarN2, zzrVar5, i3zVar2, z3, z, svhVar, zzrVar5.g, false, sfzVar, null), zzrVar2.p, nxrVar2, bVar3, 0);
            lVar2 = lVar3;
            bVar4 = bVar5;
            cVar2 = cVar3;
            eVar2 = eVar4;
        } else {
            dVar2 = dVar;
            zzrVar2 = zzrVar;
            bVar3 = bVarI;
            bVar3.G();
            lVar2 = lVar;
            cVar2 = cVar;
            bVar4 = bVar2;
            eVar2 = eVar;
        }
        androidx.compose.runtime.e eVarZ = bVar3.Z();
        if (eVarZ != null) {
            final zzr zzrVar6 = zzrVar2;
            final d dVar3 = dVar2;
            eVarZ.d = new Function2() { // from class: gzr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    jzr.a(dVar3, zzrVar6, tmzVar, z, z2, svhVar, z3, sfzVar, bVar4, lVar2, cVar2, eVar2, function1, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}

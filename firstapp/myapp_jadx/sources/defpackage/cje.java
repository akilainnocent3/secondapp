package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class cje {
    /* JADX WARN: Code duplicated, block: B:100:0x0213  */
    /* JADX WARN: Code duplicated, block: B:101:0x0217  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:108:0x0263  */
    /* JADX WARN: Code duplicated, block: B:111:0x026d  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:78:0x0159  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    public static final void a(final float f, final float f2, float f3, final Function0 function0, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        float f4;
        boolean z;
        final float f5;
        e eVarZ;
        float f6;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int iHashCode2;
        float f7;
        int iHashCode3;
        float f8;
        int iHashCode4;
        int i4;
        int i5;
        function0.getClass();
        b bVarI = aVar.i(361056071);
        if ((i & 6) == 0) {
            i3 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.c(f2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                f4 = f3;
                i3 |= bVarI.c(f4) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if (bVarI.A(function0)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (bVarI.A(op8Var)) {
                    i4 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i6 != 0) {
                    f6 = 0.85f;
                } else {
                    f6 = f4;
                }
                d.a aVar3 = d.a.b;
                d dVarE = j.e(aVar3, 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                float f9 = f6;
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarE);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                int i7 = i3;
                d dVarH = h.h(j.c(j.g(aVar3, 1.0f), f9), 16.0f, 0.0f, 2);
                i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarH);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                if (f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                } else {
                    f7 = f;
                }
                d dVarF = h.f(new LayoutWeightElement(f7, true), 8.0f);
                aiv aivVarC2 = g75.c(ht.a.b, false);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarF);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                w1i.a((i7 >> 12) & 14, op8Var, bVarI, true);
                ty0.a(bVarI, j.i(aVar3, 8.0f));
                d dVarD = j.D(androidx.compose.foundation.a.b(h.j(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), j58.l, zk40.a), null, 3);
                if (f2 <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (f2 > Float.MAX_VALUE) {
                    f8 = Float.MAX_VALUE;
                } else {
                    f8 = f2;
                }
                d dVarN = dVarD.n(new LayoutWeightElement(f8, true));
                aiv aivVarC3 = g75.c(ht.a.h, false);
                iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarN);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                c6n.b(function0, androidx.compose.foundation.layout.c.a(j.c(androidx.compose.foundation.a.b(aVar3, j58.f, j060.a), 1.0f), 1.0f), false, null, yy8.a, bVarI, ((i7 >> 9) & 14) | 196608, 28);
                f30.a(bVarI, true, true, true);
                f5 = f9;
            } else {
                bVarI.G();
                f5 = f4;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: bje
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        cje.a(f, f2, f5, function0, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        f4 = f3;
        if ((i & 3072) != 0) {
            if (bVarI.A(function0)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if (bVarI.A(op8Var)) {
                i4 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i6 != 0) {
                f6 = 0.85f;
            } else {
                f6 = f4;
            }
            d.a aVar4 = d.a.b;
            d dVarE2 = j.e(aVar4, 1.0f);
            aiv aivVarC4 = g75.c(ht.a.e, false);
            float f10 = f6;
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarE2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC4, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS5, dVar2);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC5, cVar2);
            int i8 = i3;
            d dVarH2 = h.h(j.c(j.g(aVar4, 1.0f), f10), 16.0f, 0.0f, 2);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.n, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar2);
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (f > Float.MAX_VALUE) {
                f7 = Float.MAX_VALUE;
            } else {
                f7 = f;
            }
            d dVarF2 = h.f(new LayoutWeightElement(f7, true), 8.0f);
            aiv aivVarC5 = g75.c(ht.a.b, false);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = c.c(bVarI, dVarF2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS7, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC7, cVar2);
            w1i.a((i8 >> 12) & 14, op8Var, bVarI, true);
            ty0.a(bVarI, j.i(aVar4, 8.0f));
            d dVarD2 = j.D(androidx.compose.foundation.a.b(h.j(aVar4, 0.0f, 8.0f, 0.0f, 0.0f, 13), j58.l, zk40.a), null, 3);
            if (f2 <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (f2 > Float.MAX_VALUE) {
                f8 = Float.MAX_VALUE;
            } else {
                f8 = f2;
            }
            d dVarN2 = dVarD2.n(new LayoutWeightElement(f8, true));
            aiv aivVarC6 = g75.c(ht.a.h, false);
            iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarN2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC6, bVar2);
            hlh0.a(bVarI, ne00VarS8, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC8, cVar2);
            c6n.b(function0, androidx.compose.foundation.layout.c.a(j.c(androidx.compose.foundation.a.b(aVar4, j58.f, j060.a), 1.0f), 1.0f), false, null, yy8.a, bVarI, ((i8 >> 9) & 14) | 196608, 28);
            f30.a(bVarI, true, true, true);
            f5 = f10;
        } else {
            bVarI.G();
            f5 = f4;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bje
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cje.a(f, f2, f5, function0, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}

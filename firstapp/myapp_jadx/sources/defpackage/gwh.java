package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gwh {
    public static final hfs a = ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.1f), new j58(r58.d(4294964599L))), new Pair(Float.valueOf(0.95f), new j58(r58.d(4294947584L)))}, 14);
    public static final hfs b = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(j58.c(0.0f, r58.d(4292451841L))), new j58(r58.d(4294688027L)), new j58(j58.c(0.0f, r58.d(4292451841L)))));
    public static final hfs c = ya5.a.d(kotlin.collections.b.k(new j58(j58.c(0.0f, r58.d(4281875273L))), new j58(j58.c(1.0f, r58.d(4281875273L))), new j58(j58.c(0.0f, r58.d(4281875273L)))), 0, 0, 14);
    public static final b d = new b();
    public static final a e = new a();

    public static final class a implements qx80 {
        @Override // defpackage.qx80
        public final b9z a(long j, asr asrVar, mmd mmdVar) {
            asrVar.getClass();
            mmdVar.getClass();
            int i = (int) (4294967295L & j);
            return new b9z.b(new lk40(0.0f, Float.intBitsToFloat(i) / 2.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i)));
        }
    }

    public static final class b implements qx80 {
        @Override // defpackage.qx80
        public final b9z a(long j, asr asrVar, mmd mmdVar) {
            asrVar.getClass();
            mmdVar.getClass();
            return new b9z.b(new lk40(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(char c2, final imf0 imf0Var, final boolean z, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final char c3;
        int i3;
        imf0 imf0Var2;
        float f2;
        boolean z2;
        androidx.compose.runtime.b bVar;
        final float f3;
        e eVarZ;
        final float f4;
        boolean z3;
        Object objY;
        qx80 qx80Var;
        androidx.compose.runtime.b bVarI = aVar.i(-615463935);
        if ((i & 6) == 0) {
            c3 = c2;
            i3 = (bVarI.Q(c3) ? 4 : 2) | i;
        } else {
            c3 = c2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            imf0Var2 = imf0Var;
            i3 |= bVarI.M(imf0Var2) ? 32 : 16;
        } else {
            imf0Var2 = imf0Var;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= bVarI.c(f2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                if (i4 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                String strValueOf = String.valueOf(c3);
                z3 = (i3 & 7168) == 2048;
                objY = bVarI.y();
                if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: ewh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.q(f4);
                            a7lVar.p(a7lVar.getDensity() * 12.0f);
                            a7lVar.z0(n09.a(0.5f, 0.5f));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarA = androidx.compose.ui.graphics.a.a(d.a.b, (Function1) objY);
                if (z) {
                    qx80Var = d;
                } else {
                    qx80Var = e;
                }
                bVar = bVarI;
                lkf0.b(strValueOf, ls7.a(dVarA, qx80Var), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar, 0, (i3 << 15) & 3670016, 65532);
                f3 = f4;
            } else {
                bVar = bVarI;
                bVar.G();
                f3 = f2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fwh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gwh.a(c3, imf0Var, z, f3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        f2 = f;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i3 & 1, z2)) {
            if (i4 != 0) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            String strValueOf2 = String.valueOf(c3);
            if ((i3 & 7168) == 2048) {
            }
            objY = bVarI.y();
            if (z3) {
                objY = new Function1() { // from class: ewh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.q(f4);
                        a7lVar.p(a7lVar.getDensity() * 12.0f);
                        a7lVar.z0(n09.a(0.5f, 0.5f));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function1() { // from class: ewh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.q(f4);
                        a7lVar.p(a7lVar.getDensity() * 12.0f);
                        a7lVar.z0(n09.a(0.5f, 0.5f));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA2 = androidx.compose.ui.graphics.a.a(d.a.b, (Function1) objY);
            if (z) {
                qx80Var = d;
            } else {
                qx80Var = e;
            }
            bVar = bVarI;
            lkf0.b(strValueOf2, ls7.a(dVarA2, qx80Var), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar, 0, (i3 << 15) & 3670016, 65532);
            f3 = f4;
        } else {
            bVar = bVarI;
            bVar.G();
            f3 = f2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fwh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gwh.a(c3, imf0Var, z, f3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, imf0 imf0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        String str2 = str;
        final imf0 imf0Var2 = imf0Var;
        androidx.compose.runtime.b bVarI = aVar.i(-737867434);
        int i3 = i | (bVarI.M(str2) ? 4 : 2) | (bVarI.M(imf0Var2) ? 32 : 16);
        boolean z2 = false;
        boolean z3 = true;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(1485062650);
            int i4 = 0;
            int i5 = 0;
            while (i4 < str2.length()) {
                char cCharAt = str2.charAt(i4);
                int i6 = i5 + 1;
                bVarI.C(1338823523, Integer.valueOf(i5));
                if (Character.isDigit(cCharAt)) {
                    bVarI.N(-1446099973);
                    c(cCharAt, imf0Var2, null, bVarI, i3 & 112);
                    bVarI.X(z2);
                    i2 = i4;
                    z = z2;
                } else {
                    bVarI.N(-1446008678);
                    androidx.compose.runtime.b bVar = bVarI;
                    i2 = i4;
                    z = z2;
                    lkf0.b(String.valueOf(cCharAt), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVar, 0, (i3 << 15) & 3670016, 65534);
                    imf0Var2 = imf0Var;
                    bVarI = bVar;
                    bVarI.X(z);
                }
                bVarI.X(z);
                i4 = i2 + 1;
                z3 = true;
                z2 = z;
                i5 = i6;
                str2 = str;
            }
            bVarI.X(z2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, imf0Var2, i) { // from class: cwh
                public final /* synthetic */ String a;
                public final /* synthetic */ imf0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gwh.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(char c2, imf0 imf0Var, d dVar, androidx.compose.runtime.a aVar, final int i) {
        final imf0 imf0Var2;
        androidx.compose.runtime.b bVar;
        final d dVar2;
        Object hwhVar;
        wd0 wd0Var;
        ytw ytwVar;
        final char c3 = c2;
        androidx.compose.runtime.b bVarI = aVar.i(2073888690);
        int i2 = (bVarI.Q(c3) ? 4 : 2) | i | (bVarI.M(imf0Var) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Character.valueOf(c3));
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Character.valueOf(c3));
                bVarI.r(objY2);
            }
            ytw ytwVar3 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var2 = (wd0) objY3;
            Character chValueOf = Character.valueOf(c3);
            boolean zA = ((i2 & 14) == 4) | bVarI.A(wd0Var2);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                wd0Var = wd0Var2;
                hwhVar = new hwh(c3, wd0Var, ytwVar3, ytwVar2, null);
                ytwVar = ytwVar3;
                bVarI.r(hwhVar);
            } else {
                ytwVar = ytwVar3;
                wd0Var = wd0Var2;
                hwhVar = objY4;
            }
            xvf.e(bVarI, chValueOf, (Function2) hwhVar);
            float fFloatValue = ((Number) wd0Var.d()).floatValue();
            boolean z = fFloatValue > 0.0f && fFloatValue < 1.0f;
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i3 = (i2 & 112) | 384;
            bVar = bVarI;
            dVar2 = aVar2;
            a(((Character) ytwVar.getValue()).charValue(), imf0Var, true, 0.0f, bVar, i3, 8);
            a((!z || fFloatValue > 0.5f) ? ((Character) ytwVar.getValue()).charValue() : ((Character) ytwVar2.getValue()).charValue(), imf0Var, false, 0.0f, bVar, i3, 8);
            if (z) {
                bVar.N(-902650117);
                if (fFloatValue <= 0.5f) {
                    bVar.N(-902627022);
                    imf0Var2 = imf0Var;
                    a(((Character) ytwVar2.getValue()).charValue(), imf0Var2, true, fFloatValue * 2.0f * 90.0f, bVar, i3, 0);
                    bVar.X(false);
                } else {
                    bVar.N(-902267949);
                    imf0Var2 = imf0Var;
                    a(((Character) ytwVar.getValue()).charValue(), imf0Var2, false, -((1.0f - fFloatValue) * 2.0f * 90.0f), bVar, i3, 0);
                    bVar.X(false);
                }
            } else {
                imf0Var2 = imf0Var;
                bVar.N(-909917354);
            }
            bVar.X(false);
            bVar.X(true);
        } else {
            c3 = c3;
            imf0Var2 = imf0Var;
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(c3, imf0Var2, dVar2, i) { // from class: dwh
                public final /* synthetic */ char a;
                public final /* synthetic */ imf0 b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gwh.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final String str, final double d2, final float f, final float f2, d dVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        d dVar2;
        yka.a.C1350a c1350a;
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1596084765);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.f(d2) ? 32 : 16) | (bVarI.c(f) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = d6f.a(d2);
                bVarI.r(objY);
            }
            String str2 = (String) objY;
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            long jB = i7f.b(24.0f, bVarI);
            t9i t9iVar = t9i.E;
            imf0 imf0Var = new imf0(a, jB, t9iVar, mxsVarA, null, null, 0L, 33554354);
            long jB2 = i7f.b(24.0f, bVarI);
            long j = j58.f;
            imf0 imf0Var2 = new imf0(j, jB2, t9iVar, null, mxsVarA, 0L, null, null, 0, 0L, null, null, 16777176);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 0.6f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA = androidx.compose.foundation.a.a(j.g(aVar2, 1.0f), c, null, 0.0f, 6);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            dVar2 = aVar2;
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.d0, new String[0], bVarI), h.h(j.g(aVar2, 1.0f), 0.0f, 8.0f, 1), 0L, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(j, i7f.b(14.0f, bVarI), t9i.e, null, mxsVarA, 0L, null, null, 0, 0L, null, null, 16777176), bVarI, 48, 0, 65020);
            bVarI.X(true);
            d dVarA2 = androidx.compose.foundation.a.a(j.g(dVar2, 1.0f), b, null, 0.0f, 6);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarH = h.h(dVar2, 0.0f, 0.0125f * f2, 1);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            lkf0.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVarI, i2 & 14, 0, 65534);
            bVar = bVarI;
            ty0.a(bVar, j.w(dVar2, 0.022f * f));
            b(str2, imf0Var, bVar, 0);
            f30.a(bVar, true, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final d dVar4 = dVar2;
            eVarZ.d = new Function2(str, d2, f, f2, dVar4, i) { // from class: bwh
                public final /* synthetic */ String a;
                public final /* synthetic */ double b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gwh.d(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

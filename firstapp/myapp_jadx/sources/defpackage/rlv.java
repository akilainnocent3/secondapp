package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rlv {
    /* JADX WARN: Code duplicated, block: B:103:0x0410  */
    /* JADX WARN: Code duplicated, block: B:104:0x0414  */
    /* JADX WARN: Code duplicated, block: B:109:0x042f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x021a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0220  */
    /* JADX WARN: Code duplicated, block: B:60:0x023e  */
    /* JADX WARN: Code duplicated, block: B:68:0x029f  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0310  */
    /* JADX WARN: Code duplicated, block: B:83:0x0391  */
    /* JADX WARN: Code duplicated, block: B:86:0x039a  */
    /* JADX WARN: Code duplicated, block: B:88:0x039e  */
    /* JADX WARN: Code duplicated, block: B:91:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03e0  */
    public static final void a(d dVar, slv slvVar, a aVar, final int i) {
        b bVar;
        final d dVar2;
        int i2;
        float f;
        int iHashCode;
        int iHashCode2;
        final int i3;
        int iHashCode3;
        yka.a.C1350a c1350a;
        final long j;
        yka.a.C1350a c1350a2;
        boolean zD;
        final long j2;
        Object obj;
        int i4;
        int iHashCode4;
        float f2;
        int iHashCode5;
        yka.a.C1350a c1350a3;
        int iHashCode6;
        final slv slvVar2 = slvVar;
        b bVarI = aVar.i(-1426786526);
        int i5 = i | 6 | (bVarI.M(slvVar2) ? 32 : 16);
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            final long jA = c68.a(R.color.bg_brand_sub_primary_d_lightest, bVarI);
            long jA2 = c68.a(R.color.bg_brand_main_primary, bVarI);
            final int i6 = slvVar2.b;
            final int i7 = slvVar2.d;
            int i8 = slvVar2.e;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode7 = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a4 = yka.a.g;
            if (bVarI.S) {
                i2 = i8;
            } else {
                i2 = i8;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                aiv aivVarC = g75.c(ht.a.f, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, layoutWeightElement);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a4);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                kw0.k kVar = kw0.c;
                n54.a aVar4 = ht.a.n;
                i78 i78VarA = g78.a(kVar, aVar4, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                String strA = tug.a(slvVar2.a, " ", cb40.a(R.string.page_instant_virtual__stats_popup_win, new Object[0], bVarI));
                qyd0 qyd0Var = kjb0.a;
                i3 = i2;
                lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).i, bVarI, 0, 0, 131066);
                lkf0.d(String.valueOf(i6), null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).c, bVarI, 0, 0, 131066);
                bVarI.X(true);
                bVarI.X(true);
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar3);
                if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    c1350a = c1350a4;
                } else {
                    c1350a = c1350a4;
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                j = ((lib0) bVarI.O(oib0.a)).b;
                d dVarR = j.r(h.f(aVar2, 4.0f), 90.0f);
                c1350a2 = c1350a;
                zD = bVarI.d(i6) | bVarI.d(i7) | bVarI.d(i3) | bVarI.e(jA2) | bVarI.e(j) | bVarI.e(jA);
                Object objY = bVarI.y();
                if (!zD || objY == a.C0041a.a) {
                    j2 = jA2;
                    obj = new Function1() { // from class: plv
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            tcf tcfVar = (tcf) obj2;
                            tcfVar.getClass();
                            int i9 = i6;
                            int i10 = i7;
                            int i11 = i3;
                            float f3 = i9 + i10 + i11;
                            float f4 = -90.0f;
                            for (bxg0 bxg0Var : kotlin.collections.b.k(new bxg0(Float.valueOf(i10 / f3), new j58(j2), 8), new bxg0(Float.valueOf(i11 / f3), new j58(j), 2), new bxg0(Float.valueOf(i9 / f3), new j58(jA), 8))) {
                                float fFloatValue = 360.0f * ((Number) bxg0Var.a).floatValue();
                                tcf.I(tcfVar, ((j58) bxg0Var.b).a, f4, fFloatValue, false, 0L, 0L, 0.0f, new yae0(tcfVar.C1(((Number) bxg0Var.c).intValue()), 0.0f, 0, 0, null, 30), 880);
                                f4 += fFloatValue;
                            }
                            return Unit.a;
                        }
                    };
                    i4 = i3;
                    bVarI.r(obj);
                } else {
                    j2 = jA2;
                    i4 = i3;
                    obj = objY;
                }
                rxo.b(dVarR, (Function1) obj, bVarI, 6);
                i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 48);
                iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, r39);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, r11);
                hlh0.a(bVarI, ne00VarS5, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_draw, new Object[0], bVarI), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(r2)).n, bVarI, 0, 0, 131066);
                lkf0.d(String.valueOf(i4), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).g, bVarI, 0, 0, 131066);
                bVarI.X(true);
                bVarI.X(true);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f2, true);
                aiv aivVarC3 = g75.c(ht.a.a, false);
                iHashCode5 = Long.hashCode(bVarI.T);
                ne00 ne00VarS6 = bVarI.S();
                d dVarC6 = c.c(bVarI, layoutWeightElement2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, r11);
                hlh0.a(bVarI, ne00VarS6, dVar3);
                if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    c1350a3 = c1350a2;
                } else {
                    c1350a3 = c1350a2;
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                i78 i78VarA3 = g78.a(kVar, aVar4, bVarI, 48);
                iHashCode6 = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                d dVarC7 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA3, bVar2);
                hlh0.a(bVarI, ne00VarS7, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
                }
                hlh0.a(bVarI, dVarC7, cVar);
                slvVar2 = slvVar;
                long j3 = j2;
                lkf0.d(tug.a(slvVar2.c, " ", cb40.a(R.string.page_instant_virtual__stats_popup_win, new Object[0], bVarI)), null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).i, bVarI, 0, 0, 131066);
                lkf0.d(String.valueOf(i7), null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).c, bVarI, 0, 0, 131066);
                bVar = bVarI;
                f30.a(bVar, true, true, true);
                dVar2 = aVar2;
            }
            n30.a(iHashCode7, bVarI, iHashCode7, c1350a4);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f, true);
            aiv aivVarC4 = g75.c(ht.a.f, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = c.c(bVarI, layoutWeightElement3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS8, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a4);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a4);
            }
            hlh0.a(bVarI, dVarC8, cVar2);
            kw0.k kVar2 = kw0.c;
            n54.a aVar5 = ht.a.n;
            i78 i78VarA4 = g78.a(kVar2, aVar5, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS9 = bVarI.S();
            d dVarC9 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS9, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
            }
            hlh0.a(bVarI, dVarC9, cVar2);
            String strA2 = tug.a(slvVar2.a, " ", cb40.a(R.string.page_instant_virtual__stats_popup_win, new Object[0], bVarI));
            qyd0 qyd0Var2 = kjb0.a;
            i3 = i2;
            lkf0.d(strA2, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, 0, 0, 131066);
            lkf0.d(String.valueOf(i6), null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).c, bVarI, 0, 0, 131066);
            bVarI.X(true);
            bVarI.X(true);
            aiv aivVarC5 = g75.c(ht.a.e, false);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS10 = bVarI.S();
            d dVarC10 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS10, dVar3);
            if (bVarI.S) {
                c1350a = c1350a4;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a4;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC10, cVar2);
            j = ((lib0) bVarI.O(oib0.a)).b;
            d dVarR2 = j.r(h.f(aVar2, 4.0f), 90.0f);
            c1350a2 = c1350a;
            zD = bVarI.d(i6) | bVarI.d(i7) | bVarI.d(i3) | bVarI.e(jA2) | bVarI.e(j) | bVarI.e(jA);
            Object objY2 = bVarI.y();
            if (zD) {
                j2 = jA2;
                obj = new Function1() { // from class: plv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        int i9 = i6;
                        int i10 = i7;
                        int i11 = i3;
                        float f3 = i9 + i10 + i11;
                        float f4 = -90.0f;
                        for (bxg0 bxg0Var : kotlin.collections.b.k(new bxg0(Float.valueOf(i10 / f3), new j58(j2), 8), new bxg0(Float.valueOf(i11 / f3), new j58(j), 2), new bxg0(Float.valueOf(i9 / f3), new j58(jA), 8))) {
                            float fFloatValue = 360.0f * ((Number) bxg0Var.a).floatValue();
                            tcf.I(tcfVar, ((j58) bxg0Var.b).a, f4, fFloatValue, false, 0L, 0L, 0.0f, new yae0(tcfVar.C1(((Number) bxg0Var.c).intValue()), 0.0f, 0, 0, null, 30), 880);
                            f4 += fFloatValue;
                        }
                        return Unit.a;
                    }
                };
                i4 = i3;
                bVarI.r(obj);
            } else {
                j2 = jA2;
                obj = new Function1() { // from class: plv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        int i9 = i6;
                        int i10 = i7;
                        int i11 = i3;
                        float f3 = i9 + i10 + i11;
                        float f4 = -90.0f;
                        for (bxg0 bxg0Var : kotlin.collections.b.k(new bxg0(Float.valueOf(i10 / f3), new j58(j2), 8), new bxg0(Float.valueOf(i11 / f3), new j58(j), 2), new bxg0(Float.valueOf(i9 / f3), new j58(jA), 8))) {
                            float fFloatValue = 360.0f * ((Number) bxg0Var.a).floatValue();
                            tcf.I(tcfVar, ((j58) bxg0Var.b).a, f4, fFloatValue, false, 0L, 0L, 0.0f, new yae0(tcfVar.C1(((Number) bxg0Var.c).intValue()), 0.0f, 0, 0, null, 30), 880);
                            f4 += fFloatValue;
                        }
                        return Unit.a;
                    }
                };
                i4 = i3;
                bVarI.r(obj);
            }
            rxo.b(dVarR2, (Function1) obj, bVarI, 6);
            i78 i78VarA5 = g78.a(kVar2, aVar5, bVarI, 48);
            iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS11 = bVarI.S();
            d dVarC11 = c.c(bVarI, r39);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA5, r11);
            hlh0.a(bVarI, ne00VarS11, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            }
            hlh0.a(bVarI, dVarC11, cVar2);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_draw, new Object[0], bVarI), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(r2)).n, bVarI, 0, 0, 131066);
            lkf0.d(String.valueOf(i4), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).g, bVarI, 0, 0, 131066);
            bVarI.X(true);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f2, true);
            aiv aivVarC6 = g75.c(ht.a.a, false);
            iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS12 = bVarI.S();
            d dVarC12 = c.c(bVarI, layoutWeightElement4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC6, r11);
            hlh0.a(bVarI, ne00VarS12, dVar3);
            if (bVarI.S) {
                c1350a3 = c1350a2;
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            } else {
                c1350a3 = c1350a2;
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            }
            hlh0.a(bVarI, dVarC12, cVar2);
            i78 i78VarA6 = g78.a(kVar2, aVar5, bVarI, 48);
            iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS13 = bVarI.S();
            d dVarC13 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA6, bVar2);
            hlh0.a(bVarI, ne00VarS13, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
            } else {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
            }
            hlh0.a(bVarI, dVarC13, cVar2);
            slvVar2 = slvVar;
            long j4 = j2;
            lkf0.d(tug.a(slvVar2.c, " ", cb40.a(R.string.page_instant_virtual__stats_popup_win, new Object[0], bVarI)), null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, 0, 0, 131066);
            lkf0.d(String.valueOf(i7), null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).c, bVarI, 0, 0, 131066);
            bVar = bVarI;
            f30.a(bVar, true, true, true);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(slvVar2, i) { // from class: qlv
                public final /* synthetic */ slv b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    rlv.a(this.a, this.b, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}

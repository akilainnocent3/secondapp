package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hf60 {
    public static final void a(final LayoutWeightElement layoutWeightElement, final se60.b bVar, final Function1 function1, a aVar, final int i) {
        b bVarI = aVar.i(242780214);
        int i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i | (bVarI.M(bVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            q75.a(j.g(layoutWeightElement, 1.0f), ht.a.e, false, pp8.b(-573590132, new gaj() { // from class: cf60
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fE;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fE2 = r75Var.e() / r75Var.d();
                        aq40 aq40Var = new aq40();
                        aq40Var.a = 1.0f;
                        if (fE2 > 1.2920635f) {
                            fE = (r75Var.e() * 360.0f) / r75Var.d();
                            aq40Var.a = r75Var.d() / 360.0f;
                        } else {
                            fE = 465.14285f;
                            aq40Var.a = r75Var.e() / 465.14285f;
                        }
                        pzo pzoVar = pzo.a;
                        d.a aVar3 = d.a.b;
                        d dVarL = j.l(j.q(androidx.compose.ui.graphics.a.a(f.a(aVar3, pzoVar), new qd6(aq40Var, 2)), 360.0f), fE);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarL);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        l78 l78Var = l78.a;
                        ty0.a(aVar2, l78Var.a(1.0f, aVar3, true));
                        d dVarJ = h.j(h.h(aVar3, 36.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        se60.b bVar2 = bVar;
                        hf60.g(dVarJ, bVar2.e, aVar2, 6);
                        ty0.a(aVar2, l78Var.a(1.0f, aVar3, true));
                        wb60 wb60Var = bVar2.b;
                        Function1 function2 = function1;
                        eb60.f(null, 0, wb60Var, function2, aVar2, 48, 1);
                        eb60.f(h.j(aVar3, 0.0f, 8.0f, 0.0f, 12.0f, 5), 1, bVar2.c, function2, aVar2, 54, 0);
                        ty0.a(aVar2, l78Var.a(1.0f, aVar3, true));
                        cw1.b(bVar2.d, function2, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3120, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar, function1, i) { // from class: df60
                public final /* synthetic */ se60.b b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hf60.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final se60.b bVar, final Function1<? super vc60, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-1928459674);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(bVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarE = j.e(dVar, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            a(yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), bVar, function1, bVarI, i2 & 1008);
            az2.d(null, bVar.f, function1, bVarI, i2 & 896);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar, function1, i) { // from class: ze60
                public final /* synthetic */ se60.b b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hf60.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final sd60 sd60Var, a aVar, final int i) {
        b bVarI = aVar.i(906905741);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(sd60Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = h.h(dVar, 16.0f, 0.0f, 2);
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            f160 f160Var = f160.a;
            d.a aVar3 = d.a.b;
            d dVarA = f160Var.a(1.0f, aVar3, true);
            ma60 ma60Var = ma60.B0;
            d(0, 8, bVarI, dVarA, com.sportygames.newcms.c.c(ma60Var.j, new String[0], bVarI), sd60Var.a, false);
            d(0, 0, bVarI, f160Var.a(1.0f, aVar3, true), com.sportygames.newcms.c.c(ma60Var.h, new String[0], bVarI), sd60Var.b, sd60Var.d);
            d(0, 0, bVarI, f160Var.a(1.0f, aVar3, true), com.sportygames.newcms.c.c(ma60Var.i, new String[0], bVarI), sd60Var.c, sd60Var.e);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(sd60Var, i) { // from class: ye60
                public final /* synthetic */ sd60 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hf60.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final int i2, a aVar, final d dVar, final String str, final String str2, boolean z) {
        boolean z2;
        int i3;
        final boolean z3;
        boolean z4;
        b bVarI = aVar.i(2111023187);
        int i4 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (bVarI.b(z2) ? 2048 : 1024);
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z5 = i5 != 0 ? false : z2;
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            qyd0 qyd0Var = vob0.a;
            imf0 imf0Var = ((xob0) bVarI.O(qyd0Var)).a;
            t9i t9iVar = t9i.e;
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.b;
            int i6 = i3;
            boolean z6 = z5;
            lkf0.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var, j, jB, t9iVar, null, null, 0L, null, null, null, 0, jB2, null, null, 16646136), bVarI, (i3 >> 3) & 14, 0, 65534);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) bVarI.O(qyd0Var)).a, j, i7f.b(12.0f, bVarI), t9i.v, null, null, 0L, null, null, null, 0, i7f.b(16.0f, bVarI), null, null, 16646136), bVarI, (i6 >> 6) & 14, 0, 65534);
            bVarI = bVarI;
            if (z6) {
                bVarI.N(1528556423);
                z4 = false;
                h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "gift", j.r(h.j(aVar3, 1.75f, 0.0f, 0.0f, 0.0f, 14), 10.5f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z4 = false;
                bVarI.N(1518850261);
            }
            bVarI.X(z4);
            bVarI.X(true);
            bVarI.X(true);
            z3 = z6;
        } else {
            bVarI.G();
            z3 = z2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar, str, str2, z3) { // from class: te60
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ int e;

                {
                    this.a = dVar;
                    this.b = str;
                    this.c = str2;
                    this.d = z3;
                    this.e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hf60.d(qj40.a(1), this.e, (a) obj, this.a, this.b, this.c, this.d);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(d dVar, final se60.b bVar, final Function1 function1, a aVar, final int i) {
        int i2;
        final d dVar2;
        int i3;
        function1.getClass();
        b bVarI = aVar.i(2024395795);
        if ((i & 48) == 0) {
            i2 = (bVarI.M(bVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 145) != 144)) {
            if (bVar.i) {
                bVarI.N(-1155483113);
                com.sportygames.newcms.c.b(ma60.B0.k0, bVarI, 0);
            } else {
                bVarI.N(-1158017425);
            }
            bVarI.X(false);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            dVar2 = aVar2;
            d dVarE2 = j.e(h.j(aVar2, 0.0f, 0.0f, 0.0f, fA, 7), 1.0f);
            List listK = kotlin.collections.b.k(new j58(r58.d(4281232127L)), new j58(r58.d(4280627330L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i4 = (14 & 8) != 0 ? 0 : 2;
            g75.a(androidx.compose.foundation.a.a(dVarE2, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), i4), null, 0.0f, 6), bVarI, 0);
            int i5 = i2 & 896;
            f(null, bVar, function1, bVarI, i2 & 1008);
            c(j.i(h.j(androidx.compose.foundation.a.b(j.g(androidx.compose.foundation.layout.d.a.b(dVar2, ht.a.h), 1.0f), r58.d(4288198143L), zk40.a), 0.0f, 0.0f, 0.0f, fA, 7), 36.0f), bVar.h, bVarI, 0);
            i4h i4hVar = bVar.g;
            boolean z = i5 == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                i3 = 0;
                objY = new ff60(0, function1);
                bVarI.r(objY);
            } else {
                i3 = 0;
            }
            jd60.c(i4hVar, (Function0) objY, bVarI, i3);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gf60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    hf60.e(dVar2, bVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, final se60.b bVar, final Function1 function1, a aVar, final int i) {
        b bVar2;
        final d dVar2;
        b bVarI = aVar.i(-1536495168);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ue60();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarB = xa80.b(aVar2, false, (Function1) objY);
            long j = j58.l;
            op8 op8VarB = pp8.b(-2046276988, new Function2() { // from class: ve60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j58.l;
                        final Function1 function2 = function1;
                        boolean zM = aVar3.M(function2);
                        Object objY2 = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: af60
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(new vc60.g(true));
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY2);
                        }
                        Function0 function0 = (Function0) objY2;
                        boolean zM2 = aVar3.M(function2);
                        Object objY3 = aVar3.y();
                        if (zM2 || objY3 == c0042a) {
                            objY3 = new bf60(function2, 0);
                            aVar3.r(objY3);
                        }
                        mh60.b(null, j2, vm9.a, function0, (Function0) objY3, aVar3, 432);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB2 = pp8.b(-1791482801, new gaj() { // from class: we60
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        hf60.b(h.j(h.e(d.a.b, tmzVar), 0.0f, 0.0f, 0.0f, 36.0f, 7), bVar, function1, aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            bVar2 = bVarI;
            dVar2 = aVar2;
            hy60.a(dVarB, op8VarB, null, null, null, 0, j, 0L, null, op8VarB2, bVar2, 806879280, 444);
        } else {
            bVar2 = bVarI;
            bVar2.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xe60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    hf60.f(dVar2, bVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final d dVar, final do70 do70Var, a aVar, final int i) {
        b bVarI = aVar.i(1771214202);
        int i2 = (bVarI.M(do70Var) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            bVarI.N(-2118994300);
            Iterator<eo70> it = do70Var.a.iterator();
            while (it.hasNext()) {
                ug60.f(it.next(), bVarI, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(do70Var, i) { // from class: ef60
                public final /* synthetic */ do70 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    hf60.g(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

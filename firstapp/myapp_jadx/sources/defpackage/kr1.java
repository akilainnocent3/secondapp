package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kr1 {
    public static final void a(final Function0 function0, final Function0 function1, final Function1 function2, final er1 er1Var, a aVar, final int i) {
        Function0 function3;
        er1Var.getClass();
        b bVarI = aVar.i(1338649469);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.M(er1Var) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            function3 = function0;
            ac8.h(0.0f, null, function3, pp8.b(920791619, new Function2() { // from class: fr1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long jA = c68.a(R.color.background_general_primary, aVar2);
                        zk40.a aVar3 = zk40.a;
                        d.a aVar4 = d.a.b;
                        d dVarE = j.e(androidx.compose.foundation.a.b(aVar4, jA, aVar3), 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarE);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = h.g(j.g(j.i(aVar4, 48.0f), 1.0f), 16.0f, 12.0f);
                        d160 d160VarA = b160.a(kw0.g, ht.a.k, aVar2, 54);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(cb40.a(R.string.page_payment__bvn_verification, new Object[0], aVar2), null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 0, 0, 131066);
                        d dVarR = j.r(aVar4, 20.0f);
                        er1 er1Var2 = er1Var;
                        uxs uxsVar = er1Var2.b;
                        uxs uxsVar2 = uxs.LOADING;
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, 0, aVar2), null, g3w.f(g3w.k(dVarR, uxsVar != uxsVar2), er1Var2.b != uxsVar2, function0), c68.a(R.color.text_type1_secondary, aVar2), aVar2, 48, 0);
                        aVar2.s();
                        ute.b(null, 1.0f, c68.a(R.color.line_type1_primary, aVar2), aVar2, 48, 1);
                        if (er1Var2.c) {
                            aVar2.N(-297445735);
                            kr1.c(0, aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(-297387238);
                            kr1.b(function1, function2, er1Var2, aVar2, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 6) & 896) | 3072, 3);
        } else {
            function3 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0 function4 = function3;
            eVarZ.d = new Function2(function1, function2, er1Var, i) { // from class: gr1
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ er1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kr1.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Function0 function0, final Function1 function1, er1 er1Var, a aVar, final int i) {
        final Function0 function2;
        final er1 er1Var2;
        er1Var.getClass();
        b bVarI = aVar.i(1020166815);
        int i2 = i | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.M(er1Var) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = h.g(aVar2, 16.0f, 20.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH = h.h(aVar2, 0.0f, 6.0f, 1);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.page_payment__enter_your_11_digit_bvn, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131066);
            szg.a(bVarI, true, aVar2, 4.0f, bVarI);
            d dVarH2 = g3w.h(j.i(j.g(aVar2, 1.0f), 48.0f), "bvn_verification_input");
            gop gopVar = new gop(8, 0, 123);
            String strA = cb40.a(R.string.page_payment__your_bvn, new Object[0], bVarI);
            qwz.b(dVarH2, er1Var.a, false, null, er1Var.b != uxs.LOADING, null, strA, gopVar, null, null, null, function1, null, bVarI, 12582918, (i2 << 3) & 896, 12076);
            bVarI = bVarI;
            d dVarH3 = g3w.h(hib0.a(aVar2, 16.0f, bVarI, aVar2, 1.0f), "positive_button");
            String strA2 = cb40.a(R.string.common_functions__verify, new Object[0], bVarI);
            er1Var2 = er1Var;
            uxs uxsVar = er1Var2.b;
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new ir1(function0, 0);
                bVarI.r(objY);
            }
            Function0 function3 = (Function0) objY;
            function2 = function0;
            aza.a(dVarH3, strA2, uxsVar, null, null, null, null, null, function3, null, bVarI, 6, 760);
            bVarI.X(true);
        } else {
            function2 = function0;
            er1Var2 = er1Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, er1Var2, i) { // from class: jr1
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ er1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kr1.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVarI = aVar.i(-1052640944);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarG = h.g(j.e(aVar2, 1.0f), 16.0f, 20.0f);
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            h9n.a(erz.a(R.drawable.ic_icon_successful, 0, bVarI), "pic", j.r(aVar2, 48.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.d(tug.a(cb40.a(R.string.page_payment__identity_verified, new Object[0], bVarI), "\n", cb40.a(R.string.page_payment__your_banks_are_being_added_now, new Object[0], bVarI)), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new hr1();
        }
    }
}

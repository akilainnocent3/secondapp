package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mhm {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(2137087682);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 0, 0, 131066);
            vuc0.b(j.i(h.j(aVar2, 16.0f, 0.0f, 0.0f, 0.0f, 14), 28.0f), false, null, g9z.d, null, cb40.a(R.string.common_functions__retry, new Object[0], bVarI), null, null, null, null, function0, bVarI, 6, i2 & 14, 982);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: chm
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mhm.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(nhm nhmVar, final xbm xbmVar, final iaj iajVar, a aVar, int i) {
        nhmVar.getClass();
        iajVar.getClass();
        b bVarI = aVar.i(-1736067237);
        int i2 = (bVarI.M(nhmVar) ? 4 : 2) | i | (bVarI.A(xbmVar) ? 32 : 16) | (bVarI.A(iajVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            dtg0 dtg0VarF = vtg0.f(nhmVar, "GeneralShortcut", bVarI, (i2 & 14) | 48, 0);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new jjc(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(d.a.b, false, (Function1) objY);
            gzg0 gzg0VarE = yi0.e(300, 0, null, 6);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new ehm();
                bVarI.r(objY2);
            }
            q3c.a(dtg0VarF, dVarB, gzg0VarE, (Function1) objY2, pp8.b(672171359, new gaj() { // from class: fhm
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    nhm nhmVar2 = (nhm) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    nhmVar2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(nhmVar2) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        boolean zEquals = nhmVar2.equals(nhm.a.a);
                        xbm xbmVar2 = xbmVar;
                        if (zEquals) {
                            aVar2.N(1711584498);
                            boolean zM = aVar2.M(xbmVar2);
                            Object objY3 = aVar2.y();
                            if (zM || objY3 == a.C0041a.a) {
                                objY3 = new hhm(xbmVar2, 0);
                                aVar2.r(objY3);
                            }
                            mhm.a((Function0) objY3, aVar2, 0);
                            aVar2.H();
                        } else if (nhmVar2.equals(nhm.b.a)) {
                            aVar2.N(1711591432);
                            mhm.d(0, aVar2);
                            aVar2.H();
                        } else {
                            if (!(nhmVar2 instanceof nhm.c)) {
                                throw rg.a(1711583058, aVar2);
                            }
                            aVar2.N(1519789834);
                            nhm.c cVar = (nhm.c) nhmVar2;
                            if (cVar.a.isEmpty()) {
                                aVar2.N(1520076739);
                                aVar2.H();
                            } else {
                                aVar2.N(1519848021);
                                mhm.b(cVar, xbmVar2, iajVar, aVar2, iIntValue & 14);
                                aVar2.H();
                            }
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 28032, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ghm(i, 0, iajVar, nhmVar, xbmVar);
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(1794101357);
        if (bVarI.q(i & 1, i != 0)) {
            d dVarG = j.g(d.a.b, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
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
            bVarI.N(1093860301);
            for (int i2 = 0; i2 < 6; i2++) {
                e(0, bVarI);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ihm();
        }
    }

    public static final void e(int i, a aVar) {
        b bVarI = aVar.i(-923433254);
        if (bVarI.q(i & 1, i != 0)) {
            w690[] w690VarArr = w690.a;
            d.a aVar2 = d.a.b;
            d dVarR = j.r(aVar2, 60.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
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
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.r(h.j(aVar2, 0.0f, 6.0f, 0.0f, 0.0f, 13), 20.0f), j060.c(2.0f)), p590.a(null, null, 0, 0L, null, bVarI, 48, 125), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.t(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), 28.0f, 8.0f), j060.c(2.0f)), p590.a(null, null, 0, 0L, null, bVarI, 48, 125), null, 0.0f, 6), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dhm();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final nhm.c cVar, final xbm xbmVar, final iaj iajVar, a aVar, final int i) {
        boolean z;
        iajVar.getClass();
        b bVarI = aVar.i(852177521);
        int i2 = (i & 6) == 0 ? (bVarI.M(cVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(xbmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(iajVar) ? 256 : 128;
        }
        boolean z2 = false;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = cVar.b;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z3) {
                bVarI.N(-330944426);
                uf00<x690> uf00Var = cVar.a;
                boolean z4 = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z4 || objY == c0042a) {
                    objY = new Function0() { // from class: jhm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            xbmVar.invoke(new zgm.e(false));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                eg90.a(uf00Var, (Function0) objY, iajVar, bVarI, i2 & 896);
                bVarI.X(false);
            } else {
                bVarI.N(-330703215);
                bVarI.X(false);
            }
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 60.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            bVarI.N(-1662515175);
            final int i3 = 0;
            for (x690 x690Var : cVar.c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                final x690 x690Var2 = x690Var;
                v590.b bVar = new v590.b(c.a(x690Var2, bVarI));
                i790 i790Var = x690Var2.f;
                String str = x690Var2.d;
                String strB = x690Var2.b();
                String str2 = x690Var2.e;
                wae.a aVar4 = wae.b;
                d dVarC2 = StringsKt.M(str2, "daily_streak", z2) ? c9j.c(aVar2, LxHElgWAiSeM.mZudVUSAblJYJQ, "bettingstreak__icon") : aVar2;
                boolean zA = ((i2 & 112) == 32) | bVarI.A(x690Var2) | ((i2 & 896) == 256) | bVarI.d(i3);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: khm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            x690 x690Var3 = x690Var2;
                            xbmVar.invoke(new zgm.a(x690Var3));
                            iajVar.d(x690Var3.e, x690Var3.d, Integer.valueOf(i3), x690Var3.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                f690.b(dVarC2, bVar, str, i790Var, strB, (Function0) objY2, bVarI, 0, 0);
                z2 = false;
                c0042a = c0042a;
                aVar2 = aVar2;
                i3 = i4;
                i2 = i2;
            }
            int i5 = i2;
            a.C0041a.C0042a c0042a2 = c0042a;
            int i6 = z2;
            bVarI.X(i6);
            v590.a aVar5 = new v590.a();
            i790 i790Var2 = i790.c;
            String strA = cb40.a(R.string.component_sporty_banner__icon_text_more, new Object[i6], bVarI);
            int i7 = i6;
            if ((i5 & 112) == 32) {
                i7 = 1;
            }
            Object objY3 = bVarI.y();
            if (i7 != 0 || objY3 == c0042a2) {
                z = true;
                objY3 = new lfh(xbmVar, 1);
                bVarI.r(objY3);
            } else {
                z = true;
            }
            f690.b(null, aVar5, strA, i790Var2, "more", (Function0) objY3, bVarI, 27648, 1);
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lhm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    mhm.b(cVar, xbmVar, iajVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

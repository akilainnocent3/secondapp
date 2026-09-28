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
public final class quq {
    public static final void a(final d dVar, final ruq ruqVar, final Function1<? super buq, Unit> function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1040268870);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(ruqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            l0u.c(null, null, null, false, pp8.b(1804584978, new Function2() { // from class: huq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        l0u.a(null, true, pp8.b(205732859, new b7c(ruqVar, dVar, function1, i3), aVar2), aVar2, 432, 1);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24576, 15);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iuq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    quq.a(dVar, ruqVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(121936751);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.page_lucky_numbers__no_mission_yet, new Object[0], bVarI);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).d;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__no_mission_yet_message, new Object[0], bVarI), j.w(h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13), 240.0f), ((lib0) bVarI.O(qyd0Var2)).q, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new kuq();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(d dVar, final boolean z, final Function1 function1, final Function0 function0, final Function1 function2, a aVar, final int i) {
        d dVar2;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(-130056301);
        int i2 = i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function2) ? 16384 : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = p8i0.a(jq40.a(tuq.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            bVarI = bVarI;
            final tuq tuqVar = (tuq) j8i0VarA;
            ytw ytwVarC = wyh.c(tuqVar.D, bVarI, 0, 7);
            ku90<duq> ku90Var = tuqVar.C;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new luq(function1, function0, null);
                bVarI.r(objY);
            }
            abs.b(ku90Var, null, null, (gaj) objY, bVarI, 0);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 112;
            boolean zA = (i3 == 32) | bVarI.A(tuqVar);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: euq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        tuq tuqVar2 = tuqVar;
                        wwd0 wwd0Var = tuqVar2.B;
                        if (z) {
                            Boolean bool = Boolean.TRUE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool);
                            tuqVar2.x1();
                        } else {
                            Boolean bool2 = Boolean.FALSE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool2);
                        }
                        return new ouq();
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(boolValueOf, (Function1) objY2, bVarI);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zA2 = (i3 == 32) | bVarI.A(tuqVar);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: fuq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((obs) obj).getClass();
                        if (z) {
                            tuq tuqVar2 = tuqVar;
                            wwd0 wwd0Var = tuqVar2.B;
                            Boolean bool = Boolean.TRUE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool);
                            tuqVar2.x1();
                        }
                        return new puq();
                    }
                };
                bVarI.r(objY3);
            }
            zas.a(tuqVar, boolValueOf2, null, (Function1) objY3, bVarI, 8 | i3);
            Boolean boolValueOf3 = Boolean.valueOf(z);
            Boolean boolValueOf4 = Boolean.valueOf(((ruq) ytwVarC.getValue()).b);
            boolean zM = (i3 == 32) | ((i2 & 57344) == 16384) | bVarI.M(ytwVarC);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new muq(null, ytwVarC, function2, z);
                bVarI.r(objY4);
            }
            xvf.g(boolValueOf3, boolValueOf4, (Function2) objY4, bVarI);
            ruq ruqVar = (ruq) ytwVarC.getValue();
            boolean zA3 = bVarI.A(tuqVar);
            Object objY5 = bVarI.y();
            if (zA3 || objY5 == c0042a) {
                objY5 = new nuq(1, tuqVar, tuq.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/rewardcenter/mission/presentation/LNMissionTabAction;)V", 0);
                bVarI.r(objY5);
            }
            dVar2 = dVar;
            a(dVar2, ruqVar, (Function1) ((chp) objY5), bVarI, 6);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(z, function1, function0, function2, i) { // from class: guq
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    quq.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

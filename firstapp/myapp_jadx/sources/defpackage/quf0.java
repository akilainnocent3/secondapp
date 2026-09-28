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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class quf0 {
    public static final void a(final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(508261948);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_time_alerts__time_alert_description, new Object[]{str}, bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVarI), bVar, 0, 0, 131070);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: iuf0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    quf0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(-234816884);
        if (bVarI.q(i & 1, i != 0)) {
            h9n.a(erz.a(R.drawable.image_time, 0, bVarI), null, j.i(j.w(d.a.b, 120.0f), 110.0f), null, d0b.a.b, 0.0f, null, bVarI, 25008, 104);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new kuf0();
        }
    }

    public static final void c(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(892176047);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.common_functions__you_have_reached_your_limits, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVar, 0, 0, 130042);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new juf0();
        }
    }

    public static final void d(final int i, a aVar, final String str, final Function0 function0, final Function0 function1) {
        b bVarI = aVar.i(-1867648866);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i78 i78VarA = g78.a(new kw0.i(20.0f, true, new hw0()), ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            b(0, bVarI);
            c(0, bVarI);
            a(str == null ? "" : str, bVarI, 0);
            xya.b(j.g(aVar2, 1.0f), false, null, null, null, 0.0f, null, function0, uw9.a, bVarI, ((i2 << 18) & 29360128) | 100663302, WebSocketProtocol.PAYLOAD_SHORT);
            e((i2 & 896) | 6, bVarI, j.g(aVar2, 1.0f), cb40.a(R.string.page_time_alerts__adjust_alerts, new Object[0], bVarI), function1);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, function1) { // from class: huf0
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = function0;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    quf0.d(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i, a aVar, final d dVar, final String str, final Function0 function0) {
        int i2;
        b bVarI = aVar.i(885245067);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            vuc0.a(dVar, false, null, null, function0, null, null, null, null, pp8.b(1465151202, new gaj() { // from class: luf0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 24960, 110590);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 805306368 | ((i2 << 6) & 57344), 494);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: muf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    quf0.e(qj40.a(i | 1), (a) obj, dVar, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(wuf0 wuf0Var, final Function0 function0, final Function0 function1, a aVar, final int i) {
        final wuf0 wuf0Var2;
        int i2;
        b bVarI = aVar.i(-899283859);
        int i3 = i | 2 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    wuf0Var2 = (wuf0) p8i0.a(jq40.a(wuf0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-15);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-15);
                wuf0Var2 = wuf0Var;
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(wuf0Var2.b, bVarI, 0, 7);
            d.a aVar2 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a), 20.0f, 32.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            suf0 suf0Var = (suf0) ytwVarC.getValue();
            boolean zG = Intrinsics.g(suf0Var, suf0.a.a);
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zG) {
                bVarI.N(1271986676);
                k0k.a(0, 2, bVarI, androidx.compose.foundation.layout.d.a.f(aVar2), null);
                bVarI.X(false);
            } else {
                if (!(suf0Var instanceof suf0.b)) {
                    throw igf0.a(bVarI, 1980692457, false);
                }
                bVarI.N(1272131291);
                String str = ((suf0.b) suf0Var).a;
                boolean zA = bVarI.A(wuf0Var2);
                Object objY = bVarI.y();
                if (zA || objY == c0042a) {
                    nuf0 nuf0Var = new nuf0(0, wuf0Var2, wuf0.class, "onOkButtonClicked", "onOkButtonClicked()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(nuf0Var);
                    objY = nuf0Var;
                }
                Function0 function2 = (Function0) objY;
                boolean zA2 = bVarI.A(wuf0Var2);
                Object objY2 = bVarI.y();
                if (zA2 || objY2 == c0042a) {
                    ouf0 ouf0Var = new ouf0(0, wuf0Var2, wuf0.class, "onAdjustSettingsClicked", "onAdjustSettingsClicked()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(ouf0Var);
                    objY2 = ouf0Var;
                }
                d(0, bVarI, str, function2, (Function0) objY2);
                bVarI.X(false);
            }
            bVarI.X(true);
            Unit unit = Unit.a;
            boolean zA3 = bVarI.A(wuf0Var2) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY3 = bVarI.y();
            if (zA3 || objY3 == c0042a) {
                objY3 = new puf0(wuf0Var2, function0, function1, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, unit, (Function2) objY3);
        } else {
            bVarI.G();
            wuf0Var2 = wuf0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: guf0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    quf0.f(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

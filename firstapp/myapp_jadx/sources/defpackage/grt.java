package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class grt {
    public static final long a = r58.d(4285489919L);

    public static final void a(final UiText uiText, final long j, final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-567698620);
        int i2 = i | (bVarI.M(uiText) ? 4 : 2) | (bVarI.e(j) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            uiText.getClass();
            bVar = bVarI;
            lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), h.f(androidx.compose.foundation.a.b(g3w.h(d.a.b, str), j, j060.c(((zib0) bVarI.O(ajb0.a)).d)), ((cjb0) bVarI.O(ejb0.a)).c), ((lib0) bVarI.O(oib0.a)).o, null, mla.m(8.0f, bVarI), null, t9i.f, null, 0L, null, null, mla.m(8.0f, bVarI), 0, false, 0, 0, null, null, bVar, 1572864, 0, 260008);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, str, i) { // from class: ert
                public final /* synthetic */ long b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    grt.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final lst lstVar, final Function0<Unit> function0, a aVar, final int i) {
        UiText uiText;
        UiText uiText2;
        lstVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1504581790);
        int i2 = (bVarI.M(lstVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), j58.m, j060.c(((zib0) bVarI.O(ajb0.a)).d));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d(0, bVarI);
            d dVarF = androidx.compose.foundation.layout.d.a.f(j.g(aVar2, 1.0f));
            qyd0 qyd0Var = ejb0.a;
            d dVarG = h.g(dVarF, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).b);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
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
            boolean z = lstVar instanceof lst.c;
            UiText uiText3 = null;
            if (z) {
                uiText = ((lst.c) lstVar).a;
            } else if (lstVar instanceof lst.b) {
                uiText = ((lst.b) lstVar).b;
            } else if (lstVar instanceof lst.a) {
                uiText = ((lst.a) lstVar).c;
            } else {
                if (!lstVar.equals(lst.d.a)) {
                    uhc.a();
                    return;
                }
                uiText = null;
            }
            if (z) {
                uiText2 = ((lst.c) lstVar).b;
            } else if (lstVar instanceof lst.b) {
                uiText2 = ((lst.b) lstVar).c;
            } else if (lstVar instanceof lst.a) {
                uiText2 = ((lst.a) lstVar).d;
            } else {
                if (!lstVar.equals(lst.d.a)) {
                    uhc.a();
                    return;
                }
                uiText2 = null;
            }
            if (z) {
                uiText3 = ((lst.c) lstVar).c;
            } else if (lstVar instanceof lst.b) {
                uiText3 = ((lst.b) lstVar).d;
            } else if (lstVar instanceof lst.a) {
                uiText3 = ((lst.a) lstVar).e;
            } else if (!lstVar.equals(lst.d.a)) {
                uhc.a();
                return;
            }
            g(uiText, uiText2, uiText3, bVarI, 0);
            d040.a(1.0f, true, bVarI);
            if (z) {
                bVarI.N(1511402520);
                e(function0, bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            } else if (lstVar instanceof lst.b) {
                bVarI.N(1511554017);
                f(R.string.page_loyalty__earn_reward, i2 & 112, bVarI, function0);
                bVarI.X(false);
            } else if (lstVar.equals(lst.d.a)) {
                bVarI.N(1511819966);
                f(R.string.page_loyalty__log_in_to_join, i2 & 112, bVarI, function0);
                bVarI.X(false);
            } else {
                if (!(lstVar instanceof lst.a)) {
                    throw igf0.a(bVarI, -2029456627, false);
                }
                bVarI.N(1512084892);
                c(i2 & 112, bVarI, ((lst.a) lstVar).b, function0);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: frt
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    grt.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, String str, final Function0 function0) {
        final String str2 = str;
        b bVarI = aVar.i(-1270080150);
        int i2 = i | (bVarI.M(str2) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qyd0 qyd0Var = ejb0.a;
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(qyd0Var)).e, true, new hw0());
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(androidx.compose.foundation.d.d(aVar2, false, null, null, function0, 15), "loyalty_entrance");
            d160 d160VarA = b160.a(iVar, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).b, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strA = cb40.a(R.string.page_loyalty__total_potential_rewards, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).q;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var3)).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            str2 = str;
            lkf0.d(str2, null, ((lib0) bVarI.O(qyd0Var3)).G0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).m, bVarI, i2 & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), "Go to Loyalty Page", j.r(aVar2, 16.0f), ((lib0) bVarI.O(qyd0Var3)).b0, bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str2, function0) { // from class: brt
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str2;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    grt.c(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(-1187551525);
        if (bVarI.q(i & 1, i != 0)) {
            mw90.b("https://s.sporty.net/cms/me_page_banner_entrance_d5775859e3.png", "", j.i(j.g(d.a.b, 1.0f), 48.0f), pib0.a(R.drawable.img__me_page_banner_entrance, 0, bVarI), null, pib0.a(R.drawable.img__me_page_banner_entrance, 0, bVarI), null, null, d0b.a.a, 0.0f, null, bVarI, 438, 6, 31696);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new zqt();
        }
    }

    public static final void f(final int i, final int i2, a aVar, final Function0 function0) {
        b bVarI = aVar.i(-1564479969);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(ejb0.a)).d, true, new hw0());
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(androidx.compose.foundation.d.d(aVar2, false, null, null, function0, 15), "loyalty_entrance");
            d160 d160VarA = b160.a(iVar, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            String strA = cb40.a(i, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).m;
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var)).G0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), "Go to Loyalty Page", j.r(aVar2, 16.0f), ((lib0) bVarI.O(qyd0Var)).b0, bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, function0) { // from class: art
                public final /* synthetic */ int a;
                public final /* synthetic */ Function0 b;

                {
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    grt.f(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final UiText uiText, final UiText uiText2, final UiText uiText3, a aVar, final int i) {
        hrt hrtVar;
        hrt hrtVar2;
        b bVarI = aVar.i(-374983014);
        int i2 = i | (bVarI.M(uiText) ? 4 : 2) | (bVarI.M(uiText2) ? 32 : 16) | (bVarI.M(uiText3) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            if (uiText == null) {
                bVarI.N(91374256);
                bVarI.X(false);
                hrtVar = null;
            } else {
                bVarI.N(91374257);
                hrtVar = new hrt(uiText, ((lib0) bVarI.O(oib0.a)).H0, "loyalty_banner_rewards_badge");
                bVarI.X(false);
            }
            if (uiText2 == null) {
                bVarI.N(91483407);
                bVarI.X(false);
                hrtVar2 = null;
            } else {
                bVarI.N(91483408);
                hrtVar2 = new hrt(uiText2, ((lib0) bVarI.O(oib0.a)).H0, "loyalty_banner_missions_badge");
                bVarI.X(false);
            }
            ArrayList arrayListV = ay0.v(new hrt[]{hrtVar, hrtVar2, uiText3 != null ? new hrt(uiText3, a, "loyalty_banner_challenges_badge") : null});
            n54.a aVar2 = arrayListV.size() < 2 ? ht.a.m : ht.a.n;
            qyd0 qyd0Var = ejb0.a;
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).c, true, new hw0()), aVar2, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC = c.c(bVarI, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            lkf0.d(cb40.a(R.string.common_functions__sporty_loyalty, new Object[0], bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(((lib0) bVarI.O(oib0.a)).o, mla.m(16.0f, bVarI), t9i.w, new n9i(1), null, 0L, null, new ix80(0L, 1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L), mla.b(4.0f, bVarI)), 5, 0L, null, null, 16736240), bVarI, 0, 0, 131070);
            bVarI = bVarI;
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).b, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(-1596356135);
            int size = arrayListV.size();
            for (int i3 = 0; i3 < size; i3++) {
                hrt hrtVar3 = (hrt) arrayListV.get(i3);
                a(hrtVar3.a, hrtVar3.b, hrtVar3.c, bVarI, 0);
            }
            f30.a(bVarI, false, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText2, uiText3, i) { // from class: drt
                public final /* synthetic */ UiText b;
                public final /* synthetic */ UiText c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    grt.g(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(742708761);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0());
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(androidx.compose.foundation.d.d(aVar2, false, null, null, function0, 15), "loyalty_entrance");
            d160 d160VarA = b160.a(iVar, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            crz crzVarA = pib0.a(R.drawable.ic__lock__fill, 0, bVarI);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, rarBonoqWB.ArFlRr, j.r(aVar2, 16.0f), ((lib0) bVarI.O(qyd0Var)).G0, bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_loyalty__deposit_to_unlock_short, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).G0, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).m, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: crt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    grt.e(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

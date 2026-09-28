package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                hm hmVar = (hm) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Float fValueOf = Float.valueOf(0.0f);
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (aVar.q(iIntValue & 1, z)) {
                    hmVar.b.d(fValueOf, fValueOf, aVar, 54);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((js40) obj2).getClass();
                ((Function1) obj3).invoke(bool);
                return Unit.a;
            default:
                w550 w550Var = (w550) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d.a aVar3 = d.a.b;
                    d dVarG = h.g(aVar3, 16.0f, 10.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarG);
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
                    d dVarG2 = j.g(aVar3, 1.0f);
                    kw0.j jVar = kw0.a;
                    n54.b bVar2 = ht.a.j;
                    d160 d160VarA = b160.a(jVar, bVar2, aVar2, 0);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarG2);
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
                    hlh0.a(aVar2, d160VarA, bVar);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    mw90.a(w550Var.a, null, j.r(aVar3, 16.0f), null, null, d0b.a.b, new gf4(c68.a(R.color.text_primary, aVar2), 5), aVar2, 1573296, 1720);
                    String str = w550Var.b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = w550Var.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    lkf0.d(tug.a(str, " | ", str2), g3w.h(h.h(new LayoutWeightElement(1.0f, true), 8.0f, 0.0f, 2), "remix_bet_market_name"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 24960, 110584);
                    String str3 = w550Var.g;
                    lkf0.d(str3 == null ? "" : str3, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar2), aVar2, 0, 0, 131066);
                    aVar2.s();
                    ty0.a(aVar2, j.i(aVar3, 6.0f));
                    d160 d160VarA2 = b160.a(jVar, bVar2, aVar2, 0);
                    int iHashCode3 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO3 = aVar2.o();
                    d dVarC3 = c.c(aVar2, aVar3);
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
                    hlh0.a(aVar2, d160VarA2, bVar);
                    hlh0.a(aVar2, ne00VarO3, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                        j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                    }
                    hlh0.a(aVar2, dVarC3, cVar);
                    String str4 = w550Var.d;
                    if (str4 == null) {
                        str4 = "";
                    }
                    lkf0.d(str4, g3w.h(aVar3, "remix_bet_home_team"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar2), aVar2, 48, 0, 131064);
                    lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], aVar2), h.h(aVar3, 6.0f, 0.0f, 2), c68.a(R.color.text_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar2), aVar2, 48, 0, 131064);
                    String str5 = w550Var.e;
                    lkf0.d(str5 == null ? "" : str5, g3w.h(aVar3, "remix_bet_away_team"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar2), aVar2, 48, 0, 131064);
                    aVar2.s();
                    ty0.a(aVar2, j.i(aVar3, 6.0f));
                    String str6 = w550Var.f;
                    lkf0.d(str6 == null ? "" : str6, null, c68.a(R.color.text_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar2), aVar2, 0, 0, 131066);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}

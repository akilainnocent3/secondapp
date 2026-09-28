package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gne implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ gne(wr50.b bVar, Function0 function0, Function0 function1) {
        this.c = bVar;
        this.b = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final Function0 function0 = this.b;
        haj hajVar = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final wr50.b bVar = (wr50.b) obj3;
                final Function0 function1 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rg6.a(h.h(h.j(d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f, 0.0f, 2), j060.c(8.0f), gg6.b(((ast) aVar.O(cst.e)).i, 0L, aVar, 24576, 14), null, m35.a(1.0f, r58.b(872415231)), pp8.b(-569477411, new gaj() { // from class: ine
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            yka.a.C1350a c1350a;
                            a aVar2;
                            a aVar3 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((j78) obj4).getClass();
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                d.a aVar4 = d.a.b;
                                d dVarJ = h.j(h.h(aVar4, 24.0f, 0.0f, 2), 0.0f, 14.0f, 0.0f, 20.0f, 5);
                                i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.m, aVar3, 6);
                                int iHashCode = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC = c.c(aVar3, dVarJ);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar3, i78VarA, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar3, ne00VarO, dVar);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a2);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar3, dVarC, cVar);
                                wr50.b bVar3 = bVar;
                                lkf0.d(cb40.a(R.string.page_loyalty__vdate_closed_event, new Object[]{bVar3.a}, aVar3), null, c68.a(R.color.brand_tertiary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, aVar3), aVar3, 0, 0, 131066);
                                d dVarG = j.g(aVar4, 1.0f);
                                d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar3, 48);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO2 = aVar3.o();
                                d dVarC2 = c.c(aVar3, dVarG);
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA, bVar2);
                                hlh0.a(aVar3, ne00VarO2, dVar);
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    c1350a = c1350a2;
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                } else {
                                    c1350a = c1350a2;
                                }
                                hlh0.a(aVar3, dVarC2, cVar);
                                yka.a.C1350a c1350a3 = c1350a;
                                mw90.a("https://s.sporty.net/cms/Frame_1000005707_ecbc36a63e.png", AnalyticsParam.HOME_NAV_ICON, j.r(aVar4, 40.0f), null, null, null, null, aVar3, 438, 2040);
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.o, aVar3, 54);
                                int iHashCode3 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO3 = aVar3.o();
                                d dVarC3 = c.c(aVar3, layoutWeightElement);
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, i78VarA2, bVar2);
                                hlh0.a(aVar3, ne00VarO3, dVar);
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar3, iHashCode3, c1350a3);
                                }
                                hlh0.a(aVar3, dVarC3, cVar);
                                lkf0.d(cb40.a(R.string.page_loyalty__potential_rewards, new Object[0], aVar3), null, c68.a(R.color.brand_tertiary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar3), aVar3, 0, 0, 131066);
                                d160 d160VarA2 = b160.a(new kw0.i(((cjb0) aVar3.O(ejb0.a)).c, true, new hw0()), ht.a.l, aVar3, 48);
                                int iHashCode4 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO4 = aVar3.o();
                                d dVarC4 = c.c(aVar3, aVar4);
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA2, bVar2);
                                hlh0.a(aVar3, ne00VarO4, dVar);
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode4))) {
                                    j3c.a(iHashCode4, aVar3, iHashCode4, c1350a3);
                                }
                                hlh0.a(aVar3, dVarC4, cVar);
                                lkf0.d(bVar3.b, new WithAlignmentLineElement(mt.a), j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(16.0f, aVar3), new t9i(900), null, f8i.b, 0L, null, null, 0, mla.m(18.4f, aVar3), null, null, 16646105), aVar3, 384, 0, 131064);
                                a aVar6 = aVar3;
                                if (bVar3.e != null) {
                                    aVar6.N(1270948318);
                                    lkf0.d(bVar3.e, new WithAlignmentLineElement(mt.a), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((z0u) aVar6.O(b1u.a)).a, ((ast) aVar6.O(cst.e)).b, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar6, 0, 0, 131068);
                                    aVar6 = aVar6;
                                    aVar6.H();
                                } else {
                                    aVar6.N(1271284761);
                                    aVar6.H();
                                }
                                aVar6.s();
                                aVar6.s();
                                aVar6.s();
                                if (bVar3.d) {
                                    aVar6.N(-2085891993);
                                    uy20.a(function0, aVar6, 0);
                                    aVar6.H();
                                    aVar2 = aVar6;
                                } else {
                                    int i2 = 0;
                                    aVar6.N(-2085772209);
                                    d dVarI = j.i(j.g(aVar4, 1.0f), 28.0f);
                                    alb0 alb0Var = sya.a;
                                    a aVar7 = aVar6;
                                    ak5 ak5VarA = sya.a(r58.d(4285783781L), r58.d(4281678405L), 0L, 0L, aVar7, 24630, 12);
                                    String strA = inm.a("claim_reward_button_batchId_", bVar3.c);
                                    Function0 function2 = function1;
                                    boolean zM = aVar7.M(function2);
                                    Object objY = aVar7.y();
                                    if (zM || objY == a.C0041a.a) {
                                        objY = new jne(function2, i2);
                                        aVar7.r(objY);
                                    }
                                    aVar2 = aVar7;
                                    xya.b(dVarI, false, ak5VarA, null, null, 0.0f, strA, (Function0) objY, dz8.a, aVar2, 100663302, 58);
                                    aVar2.H();
                                }
                                aVar2.s();
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 221190, 8);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g4e0.b((UiText) obj3, (Function1) hajVar, function0, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gne(UiText uiText, Function1 function1, Function0 function0, int i) {
        this.c = uiText;
        this.d = function1;
        this.b = function0;
    }
}

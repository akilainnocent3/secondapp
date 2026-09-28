package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class utc implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                oyc oycVar = (oyc) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarF = h.f(j.g(aVar2, 1.0f), 12.0f);
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarF);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, d160VarA, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    kw0.k kVar = kw0.c;
                    n54.a aVar4 = ht.a.m;
                    i78 i78VarA = g78.a(kVar, aVar4, aVar, 0);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, layoutWeightElement);
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    String strA = cb40.a(R.string.common_dates__from, new Object[0], aVar);
                    qyd0 qyd0Var = gah0.a;
                    lkf0.d(strA, null, c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).m, aVar, 0, 0, 131066);
                    d dVarF2 = h.f(d35.a(wtc.b(aVar2, 4.0f, aVar, aVar2, 1.0f), 1.0f, c68.a(R.color.background_type1_tertiary, aVar), j060.c(2.0f)), 16.0f);
                    Long lF = oycVar.f();
                    String strO = lF != null ? bwf0.o((6 & 4) != 0 ? 0 : 1, lF.longValue(), false) : null;
                    if (strO == null) {
                        strO = "";
                    }
                    lkf0.d(strO, dVarF2, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).j, aVar, 0, 0, 130044);
                    aVar.s();
                    ty0.a(aVar, j.w(aVar2, 8.0f));
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    i78 i78VarA2 = g78.a(kVar, aVar4, aVar, 0);
                    int iHashCode3 = Long.hashCode(aVar.m());
                    ne00 ne00VarO3 = aVar.o();
                    d dVarC3 = c.c(aVar, layoutWeightElement2);
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA2, bVar);
                    hlh0.a(aVar, ne00VarO3, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode3))) {
                        j3c.a(iHashCode3, aVar, iHashCode3, c1350a);
                    }
                    hlh0.a(aVar, dVarC3, cVar);
                    lkf0.d(cb40.a(R.string.common_dates__to, new Object[0], aVar), null, c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).m, aVar, 0, 0, 131066);
                    d dVarF3 = h.f(d35.a(wtc.b(aVar2, 4.0f, aVar, aVar2, 1.0f), 1.0f, c68.a(R.color.background_type1_tertiary, aVar), j060.c(2.0f)), 16.0f);
                    Long lE = oycVar.e();
                    String strO2 = lE != null ? bwf0.o((6 & 4) != 0 ? 0 : 1, lE.longValue(), false) : null;
                    lkf0.d(strO2 != null ? strO2 : "", dVarF3, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).j, aVar, 0, 0, 130044);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                e2w.a(qj40.a(7), (op8) obj3, (a) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ utc(oyc oycVar) {
        this.b = oycVar;
    }
}

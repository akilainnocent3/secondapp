package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class awp implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ awp(f8r f8rVar, String str, Function0 function0, int i) {
        this.c = f8rVar;
        this.d = str;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        d dVar;
        int i2;
        int i3 = this.a;
        Function0 function0 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                kwp.b((f8r) obj4, (String) obj3, function0, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                fpg0 fpg0Var = (fpg0) obj4;
                List<String> list = (List) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qyd0 qyd0Var = bij0.a;
                    float fE = ((yhj0) aVar.O(qyd0Var)).a.e();
                    float fC = ((yhj0) aVar.O(qyd0Var)).a.c();
                    d.a aVar2 = d.a.b;
                    d dVarG = h.g(aVar2, fE, fC);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarG);
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
                    hlh0.a(aVar, i78VarA, bVar);
                    yka.a.d dVar2 = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar2);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    d dVarG2 = j.g(aVar2, 1.0f);
                    kw0.g gVar = kw0.g;
                    n54.b bVar2 = ht.a.k;
                    d160 d160VarA = b160.a(gVar, bVar2, aVar, 54);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, dVarG2);
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
                    hlh0.a(aVar, d160VarA, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar2);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    qyd0 qyd0Var2 = bij0.b;
                    lkf0.d(cb40.a(R.string.common_functions__balance_label, new Object[]{aVar.O(qyd0Var2)}, aVar), null, c68.a(R.color.text_secondary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 0, 0, 131066);
                    BigDecimal bigDecimal = fpg0Var.a;
                    WithDrawInfo withDrawInfo = fpg0Var.b;
                    lkf0.d(n4d.a(bigDecimal), null, c68.a(R.color.text_secondary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 0, 0, 131066);
                    a aVar4 = aVar;
                    aVar4.s();
                    ty0.a(aVar4, j.i(aVar2, 6.0f));
                    if (withDrawInfo.hasInfo) {
                        aVar4.N(-1769997267);
                        d dVarG3 = j.g(aVar2, 1.0f);
                        d160 d160VarA2 = b160.a(gVar, bVar2, aVar4, 54);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO3 = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarG3);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar3);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, d160VarA2, bVar);
                        hlh0.a(aVar4, ne00VarO3, dVar2);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar4, dVarC3, cVar);
                        String strA = cb40.a(R.string.common_functions__withdrawable_balance_label, new Object[]{aVar4.O(qyd0Var2)}, aVar4);
                        imf0 imf0VarL = mla.l(R.style.B1_R, aVar4);
                        i2 = R.color.text_secondary;
                        lkf0.d(strA, null, c68.a(R.color.text_secondary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar4, 0, 0, 131066);
                        ty0.a(aVar4, new LayoutWeightElement(1.0f, true));
                        h6n.b(erz.a(R.drawable.ic_help_outline_black_19dp, 0, aVar4), null, g3w.f(j.r(aVar2, 16.0f), true, function0), c68.a(R.color.text_brand_sub_secondary, aVar4), aVar4, 48, 0);
                        ty0.a(aVar4, j.w(aVar2, ((yhj0) aVar4.O(qyd0Var)).a.c()));
                        i = 0;
                        lkf0.d(n4d.a(xzf.b(withDrawInfo)), null, c68.a(R.color.text_brand_sub_secondary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar4), aVar4, 0, 0, 131066);
                        aVar4 = aVar4;
                        aVar4.s();
                        ty0.a(aVar4, j.i(aVar2, 6.0f));
                        aVar4.H();
                        dVar = null;
                    } else {
                        i = 0;
                        dVar = null;
                        i2 = R.color.text_secondary;
                        aVar4.N(-1768397202);
                        aVar4.H();
                    }
                    if (list.isEmpty()) {
                        aVar4.N(-1767925010);
                        aVar4.H();
                    } else {
                        aVar4.N(-1768333435);
                        ac8.f(i, 1, aVar4, dVar);
                        for (String str : list) {
                            ty0.a(aVar4, j.i(aVar2, 4.0f));
                            a aVar5 = aVar4;
                            lkf0.d(str, null, c68.a(i2, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar4), aVar5, 0, 0, 131066);
                            aVar4 = aVar5;
                        }
                        aVar4.H();
                    }
                    aVar4.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ awp(fpg0 fpg0Var, List list, Function0 function0) {
        this.c = fpg0Var;
        this.d = list;
        this.b = function0;
    }
}

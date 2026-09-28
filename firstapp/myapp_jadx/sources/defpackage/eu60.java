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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eu60 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ eu60(hfs hfsVar, int i) {
        this.b = hfsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strA;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                aoe0.b bVar = (aoe0.b) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qyd0 qyd0Var = bij0.a;
                    float fC = ((yhj0) aVar.O(qyd0Var)).a.c();
                    float fE = ((yhj0) aVar.O(qyd0Var)).a.e();
                    d.a aVar2 = d.a.b;
                    d dVarG = h.g(aVar2, fE, fC);
                    d160 d160VarA = b160.a(new kw0.i(((yhj0) aVar.O(qyd0Var)).a.c(), true, new hw0()), ht.a.k, aVar, 48);
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
                    hlh0.a(aVar, d160VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    lkf0.d(cb40.a(R.string.page_payment__selected_account, new Object[0], aVar), null, c68.a(R.color.text_secondary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 0, 0, 131066);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    String str = bVar.b;
                    String str2 = bVar.d;
                    if (str2 == null || (strA = fu5.a("\\d(?=\\d{4})", str2, "*")) == null) {
                        strA = "--";
                    }
                    lkf0.d(oxc.a(str, " ", strA), layoutWeightElement, c68.a(R.color.text_primary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 0, 0, 130040);
                    ((yhj0) aVar.O(qyd0Var)).getClass();
                    mw90.a(bVar.c, null, j.r(aVar2, 24.0f), null, null, null, null, aVar, 48, 2040);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                bdj0.b((hfs) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }
}

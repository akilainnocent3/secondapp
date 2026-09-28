package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class px6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ px6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                uz6 uz6Var = (uz6) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar.O(ejb0.a)).c, true, new hw0()), ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, d.a.b);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    aVar.N(-1184859382);
                    Iterator<a27> it = uz6Var.c.iterator();
                    while (it.hasNext()) {
                        ay6.d(it.next(), null, aVar, 0);
                    }
                    aVar.H();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                yhf yhfVar = (yhf) obj3;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ytw ytwVarC = wyh.c(yhfVar.P0().A0, aVar3, 0, 7);
                    if (((Boolean) wyh.c(yhfVar.P0().Z0, aVar3, 0, 7).getValue()).booleanValue()) {
                        aVar3.N(1597371410);
                        boolean z2 = !((jo50) wyh.c(yhfVar.P0().b1, aVar3, 0, 7).getValue()).a;
                        aVar3.H();
                        z = z2;
                    } else {
                        aVar3.N(-2021092605);
                        aVar3.H();
                        z = false;
                    }
                    String strA = cb40.a(R.string.page_withdraw__select_bank_account_type, new Object[0], aVar3);
                    qcn qcnVarB = a4h.b(((gw1) ytwVarC.getValue()).c);
                    String str = ((gw1) ytwVarC.getValue()).a;
                    boolean zA = aVar3.A(yhfVar);
                    Object objY = aVar3.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new fu1(yhfVar, 1);
                        aVar3.r(objY);
                    }
                    rff.a(null, z, strA, qcnVarB, str, (Function1) objY, aVar3, 0);
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}

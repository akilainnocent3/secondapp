package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qx implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final yx yxVar = (yx) obj4;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d dVarG = j.g(aVar, 1.0f);
                    d160 d160VarA = b160.a(kw0.g, ht.a.k, aVar2, 54);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarG);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar3);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, d160VarA, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    lkf0.d("A/N Test Campaign Tester", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar2.O(gah0.a)).g, aVar2, 6, 0, 131070);
                    boolean zA = aVar2.A(yxVar);
                    Object objY = aVar2.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: gx
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                yxVar.v.setValue(m2g.a);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY);
                    }
                    nk5.c((Function0) objY, null, false, null, null, null, null, null, pq8.a, aVar2, 805306368, 510);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                Function0 function0 = (Function0) obj4;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c6n.a(function0, g3w.h(aVar, "home_button"), false, null, null, lu9.c, aVar4, 1572912, 60);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}

package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class egl implements Function2 {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ egl(lyh lyhVar, Function1 function1) {
        this.a = lyhVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final lyh lyhVar = this.a;
            final Function1 function1 = this.b;
            o0z.a(null, null, null, null, null, pp8.b(2067023734, new Function2() { // from class: fgl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    a aVar2 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    int i = 0;
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        ytw ytwVarB = wyh.b(lyhVar, pgl.b.a, aVar2, 48, 14);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = l.a(0L);
                            aVar2.r(objY);
                        }
                        xsw xswVar = (xsw) objY;
                        pgl pglVar = (pgl) ytwVarB.getValue();
                        if (pglVar instanceof pgl.a) {
                            aVar2.N(1758337147);
                            xswVar.K(System.currentTimeMillis() / 1000);
                            pgl.a aVar3 = (pgl.a) pglVar;
                            String str = aVar3.a;
                            String str2 = aVar3.b;
                            Function1 function2 = function1;
                            boolean zM = aVar2.M(function2);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new ggl(i, function2, xswVar);
                                aVar2.r(objY2);
                            }
                            ogl.b(str, str2, (Function0) objY2, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!(pglVar instanceof pgl.b)) {
                                throw rg.a(2134927848, aVar2);
                            }
                            aVar2.N(1758915545);
                            aVar2.H();
                            xswVar.K(0L);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, aVar), aVar, 196608);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}

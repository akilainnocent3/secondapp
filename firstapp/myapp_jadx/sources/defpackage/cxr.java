package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cxr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ dxr a;
    public final /* synthetic */ dxr.a b;

    public cxr(dxr dxrVar, dxr.a aVar) {
        this.a = dxrVar;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        int i = 0;
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            dxr dxrVar = this.a;
            c cVar = (c) dxrVar.b.invoke();
            dxr.a aVar3 = this.b;
            int iC = aVar3.c;
            Object obj = aVar3.a;
            if ((iC >= cVar.a() || !cVar.g(iC).equals(obj)) && (iC = cVar.c(obj)) != -1) {
                aVar3.c = iC;
            }
            if (iC != -1) {
                aVar2.N(-1664741271);
                fxr.a(cVar, dxrVar.a, iC, aVar3.a, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.N(-1664505826);
                aVar2.H();
            }
            boolean zA = aVar2.A(aVar3);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                objY = new axr(aVar3, i);
                aVar2.r(objY);
            }
            xvf.c(obj, (Function1) objY, aVar2);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

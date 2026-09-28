package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pgi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pgi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wgi.a(function0, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                mjh0 mjh0Var = (mjh0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = l.a(0L);
                        aVar2.r(objY);
                    }
                    xsw xswVar = (xsw) objY;
                    boolean zA = aVar2.A(mjh0Var);
                    Object objY2 = aVar2.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new h410(1, xswVar, mjh0Var);
                        aVar2.r(objY2);
                    }
                    ljh0.a((Function0) objY2, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}

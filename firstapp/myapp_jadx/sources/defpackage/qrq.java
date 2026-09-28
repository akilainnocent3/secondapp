package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qrq implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qrq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Unit unit = Unit.a;
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new zrq.c(function1, null);
                        aVar.r(objY);
                    }
                    xvf.e(aVar, unit, (Function2) objY);
                    gmq.a(null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                List list = (List) obj;
                ((Integer) obj3).getClass();
                list.getClass();
                i2f0.a.c(j.i(i2f0.d((z1f0) list.get(((osw) obj4).D())), 1.5f), 0.0f, a6g0.a, (a) obj2, 384, 2);
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c3w implements gaj {
    public final /* synthetic */ Function1 a;

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        dVar.getClass();
        aVar.N(-593975016);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = a6a0.b(new o2w(0));
            aVar.r(objY);
        }
        twd0 twd0Var = (twd0) objY;
        T value = ((ytw) twd0Var.getValue()).getValue();
        Function1 function1 = this.a;
        boolean zM = aVar.M(function1);
        Object objY2 = aVar.y();
        if (zM || objY2 == c0042a) {
            objY2 = new f3w(function1, twd0Var, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, value, (Function2) objY2);
        Object objY3 = aVar.y();
        if (objY3 == c0042a) {
            objY3 = new p2w(twd0Var, 0);
            aVar.r(objY3);
        }
        d dVarA = v.a(dVar, (Function1) objY3);
        aVar.H();
        return dVarA;
    }
}

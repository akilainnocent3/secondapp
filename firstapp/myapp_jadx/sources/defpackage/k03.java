package defpackage;

import android.view.Window;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k03 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k03(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                t03 t03Var = (t03) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    CMSRes cMSRes = t03Var.g;
                    if (cMSRes == null) {
                        aVar.N(306257721);
                    } else {
                        aVar.N(306257722);
                        mw90.a(c.c(cMSRes, new String[0], aVar), "chip", j.r(d.a.b, 30.0f), null, null, null, null, aVar, 432, 2040);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                break;
            default:
                Function0 function0 = (Function0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    Window windowA = tke.a(aVar2);
                    boolean zA = aVar2.A(windowA);
                    Object objY = aVar2.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new hjg(windowA, 2);
                        aVar2.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar2.t((Function0) objY);
                    lkz.k(function0, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}

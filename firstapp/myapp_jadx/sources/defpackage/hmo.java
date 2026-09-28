package defpackage;

import android.view.Window;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hmo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hmo(Function0 function0) {
        this.a = 1;
        this.b = function0;
    }

    public /* synthetic */ hmo(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                imo.a((jmo) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final Window windowA = tke.a(aVar);
                    boolean zA = aVar.A(windowA);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: rmx
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Window window = windowA;
                                if (window != null) {
                                    window.setGravity(17);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar.t((Function0) objY);
                    lu00 lu00Var = lu00.b2;
                    smx.b(c.d(lu00Var.u, "Something went wrong!", aVar), c.d(lu00Var.v, oAudzpbdOhCI.wTigza, aVar), function0, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fji0.a((String) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}

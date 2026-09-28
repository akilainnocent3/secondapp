package defpackage;

import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sfj implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ sfj(tgj tgjVar, int i) {
        this.b = tgjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((tgj) fragment).t3(qj40.a(1), (a) obj);
                break;
            default:
                asx asxVar = (asx) fragment;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                asx.a aVar2 = asx.b;
                int i2 = 0;
                int i3 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(asxVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new tfj(asxVar, i3);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(asxVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new yrx(asxVar, i2);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(asxVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new g56(asxVar, i3);
                        aVar.r(objY3);
                    }
                    ubx.a(function0, function1, (Function0) objY3, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sfj(asx asxVar) {
        this.b = asxVar;
    }
}

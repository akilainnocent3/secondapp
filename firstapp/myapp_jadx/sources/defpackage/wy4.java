package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wy4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                fz4 fz4Var = ((yy4) obj3).b;
                if (fz4Var != null) {
                    fz4Var.a(new ez4.d(str, str2));
                }
                break;
            default:
                final fc50 fc50Var = (fc50) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-1337137646, new Function2() { // from class: cc50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i2 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fc50 fc50Var2 = fc50Var;
                                boolean zA = aVar2.A(fc50Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new bz4(fc50Var2, i2);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(fc50Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new cz4(fc50Var2, i2);
                                    aVar2.r(objY2);
                                }
                                xc50.b(function0, (Function0) objY2, null, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}

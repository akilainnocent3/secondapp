package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gmb implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ gmb(int i, Function0 function0) {
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((x5a0) enbVar.p0().e).getValue()).booleanValue();
                    if (((Boolean) ((x5a0) enbVar.p0().H).getValue()).booleanValue()) {
                        aVar.N(-1292871831);
                        boolean zA = aVar.A(enbVar);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new vm2(enbVar, i2);
                            aVar.r(objY);
                        }
                        enbVar.m0(0, aVar, null, (Function0) objY, zBooleanValue);
                    } else {
                        aVar.N(-1311034514);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                z2k0.b((Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gmb(enb enbVar) {
        this.b = enbVar;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ngj implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ngj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                mmd mmdVar = (mmd) obj5;
                tgj tgjVar = (tgj) obj4;
                r75 r75Var = (r75) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                r75Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(r75Var) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    long jC1 = (((long) ((int) mmdVar.C1(r75Var.e()))) & 4294967295L) | (((long) ((int) mmdVar.C1(r75Var.d()))) << 32);
                    tgj.a aVar2 = tgj.a.a;
                    tgjVar.q3(jC1, aVar, 48);
                } else {
                    aVar.G();
                }
                break;
            default:
                u8x.a aVar3 = (u8x.a) obj5;
                r8x.a aVar4 = (r8x.a) obj4;
                a aVar5 = (a) obj2;
                ((Integer) obj3).getClass();
                ((jh0) obj).getClass();
                Object objY = aVar5.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(new r8x.a.b("", yax.b.a));
                    aVar5.r(objY);
                }
                ytw ytwVar = (ytw) objY;
                boolean zM = aVar5.M(aVar4);
                Object objY2 = aVar5.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new ktx.b(aVar4, ytwVar, null);
                    aVar5.r(objY2);
                }
                xvf.e(aVar5, aVar3, (Function2) objY2);
                dy2.a((r8x.a) ytwVar.getValue(), aVar5, 6);
                break;
        }
        return Unit.a;
    }
}

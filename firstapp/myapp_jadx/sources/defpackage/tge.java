package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tge implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tge(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                cie cieVar = (cie) obj4;
                k1f0 k1f0Var = (k1f0) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                k1f0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? aVar.M(k1f0Var) : aVar.A(k1f0Var) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    i2f0.a.c(k1f0Var.a(cieVar.ordinal(), false), 4.0f, ((lib0) aVar.O(oib0.a)).y0, aVar, 3120, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                String str = (String) obj4;
                d dVarN = (d) obj;
                a aVar2 = (a) obj2;
                ((Integer) obj3).getClass();
                dVarN.getClass();
                aVar2.N(-121982575);
                m9j m9jVarB = c9j.b(aVar2);
                if (m9jVarB != null) {
                    boolean zM = aVar2.M(m9jVarB) | aVar2.M(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP) | aVar2.M(str);
                    Object objY = aVar2.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = m9jVarB.Q(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str);
                        aVar2.r(objY);
                    }
                    dVarN = dVarN.n((d) objY);
                }
                aVar2.H();
                return dVarN;
        }
    }
}

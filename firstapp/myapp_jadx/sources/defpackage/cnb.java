package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cnb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cnb(enb enbVar) {
        this.a = 0;
        this.b = enbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj3;
                ytw<Boolean> ytwVar = enbVar.u0;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((Boolean) ((x5a0) ytwVar).getValue()).booleanValue()) {
                        aVar.N(1979980348);
                        op5 op5Var = op5.a;
                        String string = enbVar.getString(R.string.fbg_auto_bet_warning2_cms);
                        string.getClass();
                        String string2 = enbVar.getString(R.string.fbg_applied_auto_bet);
                        string2.getClass();
                        String strC = op5.c(op5Var, string, string2);
                        long j = enbVar.t0().r0;
                        long j2 = j58.f;
                        boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        boolean zA = aVar.A(enbVar);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new wm2(enbVar, i2);
                            aVar.r(objY);
                        }
                        jaa.a(strC, j, j2, zBooleanValue, (Function0) objY, aVar, 199728);
                    } else {
                        aVar.N(1960385744);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4l.a((ou6) obj3, (a) obj, qj40.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                wc30.b((x280) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                o3k0.b((hfs) obj3, (a) obj, qj40.a(7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cnb(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hhe implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        imf0 imf0Var;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                cie cieVar = (cie) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    String strA = cb40.a(R.string.device_management__previous_devices_label, new Object[0], aVar);
                    if (cieVar == cie.b) {
                        aVar.N(267489028);
                        imf0Var = ((ijb0) aVar.O(kjb0.a)).i;
                        aVar.H();
                    } else {
                        aVar.N(267572356);
                        imf0Var = ((ijb0) aVar.O(kjb0.a)).j;
                        aVar.H();
                    }
                    lkf0.d(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar, 0, 0, 131070);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nzd0.a((s7j0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}

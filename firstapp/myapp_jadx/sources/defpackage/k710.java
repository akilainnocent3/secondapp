package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k710 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ k710(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                ((PixBtgDepositFragment) obj3).D1(qj40.a(7), (op8) hajVar, (a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                gr90.a((hr90) obj3, (sf3) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import com.sportybet.android.globalpay.mobileMoney.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rxv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rxv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                c cVarE1 = ((MobileMoneyDepositFragment) obj).E1();
                cVarE1.P = null;
                cVarE1.D.setValue(null);
                return Unit.a;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                return Float.valueOf(((fmt) obj).getValue().floatValue());
        }
    }
}

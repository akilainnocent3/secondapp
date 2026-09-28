package defpackage;

import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import com.sportybet.android.globalpay.mobileMoney.c;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mhh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mhh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new dhh.f(chh.a.a));
                return Unit.a;
            case 1:
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                c cVarE1 = ((MobileMoneyDepositFragment) obj).E1();
                mox moxVar = cVarE1.P;
                if (moxVar != null) {
                    cVarE1.G1(moxVar);
                }
                cVarE1.P = null;
                cVarE1.D.setValue(null);
                return Unit.a;
            default:
                ye yeVar = ((TradingActivity) obj).d;
                if (yeVar != null) {
                    yeVar.z.setVisibility(8);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
        }
    }
}

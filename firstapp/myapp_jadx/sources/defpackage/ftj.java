package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositRouter$JumpBankScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ftj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ftj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fuj) obj2).b.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                yfx.h((hjx) obj2, new NuveiDepositRouter$JumpBankScreen(str), null, 6);
                break;
        }
        return Unit.a;
    }
}

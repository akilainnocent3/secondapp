package defpackage;

import com.sportybet.android.globalpay.stp.spei.withdraw.pending.WithdrawalPendingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class af2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ af2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(yw2.l.a);
                break;
            default:
                WithdrawalPendingActivity withdrawalPendingActivity = (WithdrawalPendingActivity) obj;
                int i2 = WithdrawalPendingActivity.c;
                ((vsj0) withdrawalPendingActivity.b.getValue()).b.e(o7d.a(wae.HOME));
                withdrawalPendingActivity.finish();
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.sportybet.feature.notificationcenter.NotificationCenterActivity;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l51 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ l51(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                int i2 = AutoBetActivity.f;
                ((AutoBetActivity) py1Var).finish();
                return Unit.a;
            default:
                NotificationCenterActivity notificationCenterActivity = (NotificationCenterActivity) py1Var;
                int i3 = NotificationCenterActivity.e;
                azm azmVar = notificationCenterActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                notificationCenterActivity.finish();
                return Unit.a;
        }
    }
}

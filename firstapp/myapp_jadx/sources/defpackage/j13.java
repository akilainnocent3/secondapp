package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j13 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetSlipFooter.j0;
                ((BetSlipFooter) obj).k();
                return Unit.a;
            case 1:
                return Float.valueOf(((qmt) obj).getValue().floatValue());
            case 2:
                ((kjq) obj).x1(xgq.g.a);
                return Unit.a;
            default:
                int i3 = MatchEventActivity.a0;
                ((MatchEventActivity) obj).I1().r(1);
                return Unit.a;
        }
    }
}

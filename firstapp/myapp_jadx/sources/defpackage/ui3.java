package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ui3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.P1().c(false);
                betslipActivity.w4(true, true);
                break;
            default:
                rhv rhvVar = (rhv) obj;
                rhvVar.B.a(s2k0.k.a, k00.d);
                rhvVar.M.a(iev.c0.a);
                break;
        }
        return Unit.a;
    }
}

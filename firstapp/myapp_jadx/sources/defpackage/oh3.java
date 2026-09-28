package defpackage;

import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oh3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oh3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj2;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.P2();
                so3 so3Var = betslipActivity.p1;
                if (so3Var != null) {
                    so3Var.a.setInputMinStakeHint();
                }
                betslipActivity.Q1().P0.a(a53.b.a);
                break;
            default:
                Boolean bool = (Boolean) obj;
                fme fmeVar = ((zk8) obj2).w;
                fmeVar.getClass();
                ProgressButton progressButton = fmeVar.e;
                bool.getClass();
                progressButton.setLoading(bool.booleanValue());
                break;
        }
        return Unit.a;
    }
}

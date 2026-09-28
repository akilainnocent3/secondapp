package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                Set<g08> set = BetslipActivity.X2;
                str.getClass();
                kta0 kta0Var = ((BetslipActivity) obj2).Q1().k0;
                kta0Var.e.a(str);
                y8j y8jVar = kta0Var.d;
                rdd0 rdd0Var = kta0Var.c;
                zta0.b.a.getClass();
                if (str.equals("skip")) {
                    rdd0Var.a(new hj90(0), k00.d);
                    y8j.a(y8jVar, AnalyticsEvent.SIM_SIMULATION_SPEED_SKIP_BTN);
                } else {
                    zta0.a.C1422a.a.getClass();
                    if (str.equals("1")) {
                        rdd0Var.a(new fj90(0), k00.d);
                        y8j.a(y8jVar, AnalyticsEvent.SIM_SIMULATION_SPEED_1X_BTN);
                    } else {
                        zta0.a.b.a.getClass();
                        if (str.equals("2")) {
                            rdd0Var.a(new gj90(0), k00.d);
                            y8j.a(y8jVar, AnalyticsEvent.SIM_SIMULATION_SPEED_2X_BTN);
                        }
                    }
                }
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    q1c0Var.G2(iIntValue, w3c0Var.d, w3c0Var.e);
                }
                break;
        }
        return Unit.a;
    }
}

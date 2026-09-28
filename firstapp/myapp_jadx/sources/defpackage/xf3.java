package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf3(Object obj, int i) {
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
                y43 y43Var = (y43) obj;
                Set<g08> set = BetslipActivity.X2;
                y43Var.getClass();
                q73 q73VarQ1 = betslipActivity.Q1();
                List<T> list = betslipActivity.o1.a.f;
                list.getClass();
                q73VarQ1.A1(new aq3.a(list, y43Var));
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (q1c0Var.y1 && !q1c0Var.x1) {
                    if (q1c0Var.I1() || q1c0Var.O0 != null) {
                        q1c0Var.x1 = false;
                        op5 op5Var = op5.a;
                        String string = q1c0Var.getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
                        string.getClass();
                        String string2 = q1c0Var.getString(R.string.one_gift_allowed);
                        string2.getClass();
                        op5Var.getClass();
                        String strB = op5.b(string, string2, null);
                        w3c0 w3c0Var = (w3c0) q1c0Var.b;
                        if (w3c0Var != null) {
                            w3c0Var.w0.k(ebs.a(q1c0Var.getLifecycle()), strB, 1800L);
                        }
                    } else if (zBooleanValue) {
                        q1c0Var.x1 = true;
                        q1c0Var.Z1(-1);
                    }
                }
                break;
        }
        return Unit.a;
    }
}

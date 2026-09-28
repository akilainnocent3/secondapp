package defpackage;

import android.content.SharedPreferences;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tg3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w3c0 w3c0Var;
        w3c0 w3c0Var2;
        w3c0 w3c0Var3;
        qq80 binding;
        CharSequence text;
        String string;
        qq80 binding2;
        qq80 binding3;
        w3c0 w3c0Var4;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj2;
                q43 q43Var = (q43) obj;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.S1().E.setBetSlipHeaderState(q43Var);
                boolean z = q43Var == q43.c;
                betslipActivity.Y2();
                so3 so3Var = betslipActivity.p1;
                if (so3Var != null) {
                    so3Var.d(vuo.d(betslipActivity.J2, betslipActivity.O1()), vuo.f(betslipActivity.T1(), betslipActivity.m1, betslipActivity.O1()), vuo.a(betslipActivity.K2, betslipActivity.L2, betslipActivity.R1()), vuo.c(betslipActivity.M2, betslipActivity.N1()), betslipActivity.x2().d(), z);
                }
                betslipActivity.G4();
                betslipActivity.F4();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ytw) obj2).setValue(bool);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                String str = (String) obj;
                str.getClass();
                if (q1c0Var.P && (w3c0Var4 = (w3c0) q1c0Var.b) != null) {
                    w3c0Var4.d.setCashOutAmount();
                }
                SharedPreferences sharedPreferences = q1c0Var.j0;
                if (sharedPreferences == null || sharedPreferences.getBoolean("SPORTY_HERO_ONE_TAP", false)) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && !w3c0Var5.d.getBetPlaced() && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.d.getBetInProgress()) {
                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                        if (w3c0Var6 != null && (binding3 = w3c0Var6.d.getBinding()) != null) {
                            binding3.v.setClickable(false);
                        }
                        w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                        if (w3c0Var7 != null && (binding2 = w3c0Var7.d.getBinding()) != null) {
                            binding2.v.setAlpha(0.65f);
                        }
                        Double dValueOf = null;
                        if (q1c0Var.P && (w3c0Var3 = (w3c0) q1c0Var.b) != null && (binding = w3c0Var3.d.getBinding()) != null && (text = binding.G.getText()) != null && (string = text.toString()) != null) {
                            dValueOf = Double.valueOf(Double.parseDouble(string));
                        }
                        if (!q1c0Var.G.isEmpty() && (w3c0Var2 = (w3c0) q1c0Var.b) != null) {
                            q1c0Var.u2(0, str, dValueOf, w3c0Var2.d);
                        }
                        q1c0Var.X0();
                        q1c0Var.E2(0, str);
                    }
                } else {
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null) {
                        q1c0.t1(w3c0Var8.d);
                    }
                    q1c0Var.b0 = true;
                }
                q1c0Var.n2();
                q1c0Var.C1();
                break;
        }
        return Unit.a;
    }
}

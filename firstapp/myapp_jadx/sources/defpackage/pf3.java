package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tu80 binding;
        w3c0 w3c0Var;
        tu80 binding2;
        tu80 binding3;
        tu80 binding4;
        tu80 binding5;
        w3c0 w3c0Var2;
        tu80 binding6;
        ru80 binding7;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                Set<g08> set = BetslipActivity.X2;
                str.getClass();
                ((BetslipActivity) obj2).Q1().m0.h1(new ss90.a(str));
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (!q1c0Var.z1 || iIntValue != 0 || (w3c0Var2 = (w3c0) q1c0Var.b) == null || (binding6 = w3c0Var2.a0.getBinding()) == null || (binding7 = binding6.b.getBinding()) == null || binding7.A0.getVisibility() != 0) {
                    w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                    if (w3c0Var3 != null && (binding = w3c0Var3.a0.getBinding()) != null && binding.b.getFbgRoundId() == 0 && ((w3c0Var = (w3c0) q1c0Var.b) == null || (binding5 = w3c0Var.a0.getBinding()) == null || !binding5.b.getBetPlaced())) {
                        w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                        if (w3c0Var4 != null && (binding4 = w3c0Var4.a0.getBinding()) != null) {
                            binding4.b.j();
                        }
                        w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                        if (w3c0Var5 != null && (binding3 = w3c0Var5.a0.getBinding()) != null) {
                            binding3.c.j();
                        }
                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                        if (w3c0Var6 != null && (binding2 = w3c0Var6.a0.getBinding()) != null) {
                            binding2.b.p(iIntValue);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.pocketrocket.model.request.CashoutLayoutForChat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hu10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hu10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lu10 lu10Var = (lu10) obj2;
                CashoutLayoutForChat cashoutLayoutForChat = (CashoutLayoutForChat) obj;
                lu10Var.v = cashoutLayoutForChat.getRedBetPlaced();
                lu10Var.w = cashoutLayoutForChat.getPurpleBetPlaced();
                lu10Var.y = cashoutLayoutForChat.getBlueBetPlaced();
                if (cashoutLayoutForChat.getCashOutRedRocketVisibility() && lu10Var.v) {
                    s820 s820Var = (s820) lu10Var.b;
                    if (s820Var != null) {
                        s820Var.c.setVisibility(0);
                    }
                    s820 s820Var2 = (s820) lu10Var.b;
                    if (s820Var2 != null) {
                        s820Var2.c.setClickable(true);
                    }
                    s820 s820Var3 = (s820) lu10Var.b;
                    if (s820Var3 != null) {
                        s820Var3.c.setAlpha(1.0f);
                    }
                    s820 s820Var4 = (s820) lu10Var.b;
                    if (s820Var4 != null) {
                        s820Var4.i.setText(cashoutLayoutForChat.getCashOutAmountRed());
                    }
                } else {
                    s820 s820Var5 = (s820) lu10Var.b;
                    if (s820Var5 != null) {
                        s820Var5.c.setClickable(false);
                    }
                    s820 s820Var6 = (s820) lu10Var.b;
                    if (s820Var6 != null) {
                        s820Var6.c.setAlpha(0.5f);
                    }
                    s820 s820Var7 = (s820) lu10Var.b;
                    if (s820Var7 != null) {
                        s820Var7.c.setVisibility(8);
                    }
                }
                if (cashoutLayoutForChat.getCashOutBlueRocketVisibility() && lu10Var.y) {
                    s820 s820Var8 = (s820) lu10Var.b;
                    if (s820Var8 != null) {
                        s820Var8.e.setVisibility(0);
                    }
                    s820 s820Var9 = (s820) lu10Var.b;
                    if (s820Var9 != null) {
                        s820Var9.e.setClickable(true);
                    }
                    s820 s820Var10 = (s820) lu10Var.b;
                    if (s820Var10 != null) {
                        s820Var10.e.setAlpha(1.0f);
                    }
                    s820 s820Var11 = (s820) lu10Var.b;
                    if (s820Var11 != null) {
                        s820Var11.w.setText(cashoutLayoutForChat.getCashOutAmountBlue());
                    }
                } else {
                    s820 s820Var12 = (s820) lu10Var.b;
                    if (s820Var12 != null) {
                        s820Var12.e.setClickable(false);
                    }
                    s820 s820Var13 = (s820) lu10Var.b;
                    if (s820Var13 != null) {
                        s820Var13.e.setAlpha(0.5f);
                    }
                    s820 s820Var14 = (s820) lu10Var.b;
                    if (s820Var14 != null) {
                        s820Var14.e.setVisibility(8);
                    }
                }
                if (cashoutLayoutForChat.getCashOutPurpleRocketVisibility() && lu10Var.w) {
                    s820 s820Var15 = (s820) lu10Var.b;
                    if (s820Var15 != null) {
                        s820Var15.d.setVisibility(0);
                    }
                    s820 s820Var16 = (s820) lu10Var.b;
                    if (s820Var16 != null) {
                        s820Var16.d.setClickable(true);
                    }
                    s820 s820Var17 = (s820) lu10Var.b;
                    if (s820Var17 != null) {
                        s820Var17.d.setAlpha(1.0f);
                    }
                    s820 s820Var18 = (s820) lu10Var.b;
                    if (s820Var18 != null) {
                        s820Var18.v.setText(cashoutLayoutForChat.getCashOutAmountPurple());
                    }
                } else {
                    s820 s820Var19 = (s820) lu10Var.b;
                    if (s820Var19 != null) {
                        s820Var19.d.setClickable(false);
                    }
                    s820 s820Var20 = (s820) lu10Var.b;
                    if (s820Var20 != null) {
                        s820Var20.d.setAlpha(0.5f);
                    }
                    s820 s820Var21 = (s820) lu10Var.b;
                    if (s820Var21 != null) {
                        s820Var21.d.setVisibility(8);
                    }
                }
                if (cashoutLayoutForChat.getCashOutRedRocketVisibility() || cashoutLayoutForChat.getCashOutBlueRocketVisibility() || cashoutLayoutForChat.getCashOutPurpleRocketVisibility()) {
                    lu10Var.i = true;
                } else {
                    s820 s820Var22 = (s820) lu10Var.b;
                    if (s820Var22 != null) {
                        s820Var22.y.setVisibility(8);
                    }
                    lu10Var.i = false;
                }
                break;
            case 1:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, ((xvz) obj2).b ? "matched" : "not matched");
                break;
            default:
                goa0 goa0Var = (goa0) obj2;
                goa0Var.z1();
                goa0Var.c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qt6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e activity;
        Double d;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                gey geyVar = (gey) obj2;
                ((Context) obj).getClass();
                return geyVar;
            case 1:
                oxj oxjVar = (oxj) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED") && (activity = oxjVar.getActivity()) != null) {
                    String str = ((db6) oxjVar.I.getValue()).c;
                    if (str == null) {
                        str = "Ongoing";
                    }
                    new z66(activity, str).a();
                }
                return Unit.a;
            case 2:
                b8b0 b8b0Var = (b8b0) obj2;
                Double d2 = (Double) obj;
                double dDoubleValue = d2.doubleValue();
                if (b8b0Var.y0) {
                    return Unit.a;
                }
                ypa0 ypa0Var = b8b0Var.J;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = b8b0Var.getString(R.string.click_chip);
                string.getClass();
                ypa0Var.A1(0L, string);
                b8b0Var.L = 1;
                dcb0 dcb0Var = (dcb0) b8b0Var.b;
                if (dcb0Var != null) {
                    dcb0Var.i.setBetAmount(dDoubleValue, b8b0Var.Y);
                }
                dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                if (dcb0Var2 != null) {
                    dcb0Var2.c.setBetAmount(d2, b8b0Var.Y);
                }
                fm1 fm1Var = (fm1) b8b0Var.a;
                if (fm1Var != null) {
                    ssw<Double> sswVar = fm1Var.b;
                    Double d3 = sswVar.d();
                    sswVar.m(d3 != null ? Double.valueOf(d3.doubleValue() + dDoubleValue) : null);
                }
                fm1 fm1Var2 = (fm1) b8b0Var.a;
                double dDoubleValue2 = (fm1Var2 == null || (d = fm1Var2.b.d()) == null) ? 0.0d : d.doubleValue();
                Double d4 = b8b0Var.I;
                double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
                B b = b8b0Var.b;
                if (dDoubleValue2 > dDoubleValue3) {
                    dcb0 dcb0Var3 = (dcb0) b;
                    if (dcb0Var3 != null) {
                        dcb0Var3.A.setVisibility(0);
                    }
                    dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                    if (dcb0Var4 != null) {
                        dcb0Var4.c.setErrorBetAmount();
                    }
                } else {
                    dcb0 dcb0Var5 = (dcb0) b;
                    if (dcb0Var5 != null) {
                        dcb0Var5.A.setVisibility(4);
                    }
                    dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                    if (dcb0Var6 != null) {
                        dcb0Var6.c.setErrorBetAmountLayout();
                    }
                }
                return Unit.a;
            default:
                ((Function1) obj2).invoke(new bri0.v(((Integer) obj).intValue()));
                return Unit.a;
        }
    }
}

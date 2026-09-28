package defpackage;

import android.animation.Animator;
import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class kp80 implements Animator.AnimatorListener {
    public final /* synthetic */ np80 a;
    public final /* synthetic */ RushPlaceBetResponse b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public kp80(np80 np80Var, RushPlaceBetResponse rushPlaceBetResponse, double d, double d2) {
        this.a = np80Var;
        this.b = rushPlaceBetResponse;
        this.c = d;
        this.d = d2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Double userCoefficient;
        Double payoutAmount;
        Double userCoefficient2;
        Double houseCoefficient;
        np80 np80Var = this.a;
        Context context = np80Var.getContext();
        if (context != null) {
            double d = this.c;
            double d2 = this.d;
            B b = np80Var.b;
            if (d < d2) {
                qp80 qp80Var = (qp80) b;
                if (qp80Var != null) {
                    qp80Var.v.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_red));
                }
                qp80 qp80Var2 = (qp80) np80Var.b;
                if (qp80Var2 != null) {
                    qp80Var2.v.setTextColor(context.getColor(R.color.sg_rush_house_coeff_red));
                }
            } else {
                qp80 qp80Var3 = (qp80) b;
                if (qp80Var3 != null) {
                    qp80Var3.v.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_green));
                }
                qp80 qp80Var4 = (qp80) np80Var.b;
                if (qp80Var4 != null) {
                    qp80Var4.v.setTextColor(context.getColor(R.color.sg_rush_house_coeff_green));
                }
            }
        }
        ej5.c(ebs.a(np80Var.getLifecycle()), null, null, new op80(np80Var, 1200L, null), 3);
        double dDoubleValue = 0.0d;
        RushPlaceBetResponse rushPlaceBetResponse = this.b;
        if (((rushPlaceBetResponse == null || (houseCoefficient = rushPlaceBetResponse.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient.doubleValue()) >= ((rushPlaceBetResponse == null || (userCoefficient2 = rushPlaceBetResponse.getUserCoefficient()) == null) ? 0.0d : userCoefficient2.doubleValue())) {
            Context context2 = np80Var.getContext();
            if (context2 != null) {
                if (rushPlaceBetResponse != null && (payoutAmount = rushPlaceBetResponse.getPayoutAmount()) != null) {
                    dDoubleValue = payoutAmount.doubleValue();
                }
                op5 op5Var = op5.a;
                String string = np80Var.getString(R.string.win_message_you_won_android);
                string.getClass();
                op5Var.getClass();
                String strConcat = op5.b(string, "You won", null).concat(" ");
                String str = np80Var.c;
                TreeMap treeMap = pw.a;
                String strA = oxc.a(str, " ", pw.a(krh0.l(dDoubleValue)));
                String string2 = np80Var.getString(R.string.win_message_at_android);
                string2.getClass();
                ToastCommonModel toastCommonModel = new ToastCommonModel(strConcat, strA, tug.a(" ", op5.b(string2, "at", null), " "), yk10.a((rushPlaceBetResponse == null || (userCoefficient = rushPlaceBetResponse.getUserCoefficient()) == null) ? null : krh0.l(userCoefficient.doubleValue()), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X), context2.getColor(R.color.sg_rush_toast_color), null, null, 0.0d, 224, null);
                qp80 qp80Var5 = (qp80) np80Var.b;
                if (qp80Var5 != null) {
                    qp80Var5.f.setText(toastCommonModel.getText());
                }
                qp80 qp80Var6 = (qp80) np80Var.b;
                if (qp80Var6 != null) {
                    qp80Var6.e.setText(toastCommonModel.getCurrency());
                }
                qp80 qp80Var7 = (qp80) np80Var.b;
                if (qp80Var7 != null) {
                    qp80Var7.d.setText(toastCommonModel.getCoeff());
                }
                qp80 qp80Var8 = (qp80) np80Var.b;
                if (qp80Var8 != null) {
                    qp80Var8.i.setVisibility(0);
                }
            }
            ej5.c(ebs.a(np80Var.getLifecycle()), null, null, new pp80(np80Var, null), 3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

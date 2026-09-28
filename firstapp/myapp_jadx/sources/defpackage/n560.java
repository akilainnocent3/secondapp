package defpackage;

import android.animation.Animator;
import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import com.sportygames.rush.model.response.WalletInfoResponse;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n560 implements Animator.AnimatorListener {
    public final /* synthetic */ l560 a;
    public final /* synthetic */ RushPlaceBetResponse b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public n560(l560 l560Var, RushPlaceBetResponse rushPlaceBetResponse, double d, double d2) {
        this.a = l560Var;
        this.b = rushPlaceBetResponse;
        this.c = d;
        this.d = d2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Double payoutAmount;
        ln80 binding;
        ln80 binding2;
        ln80 binding3;
        ln80 binding4;
        ln80 binding5;
        ln80 binding6;
        ln80 binding7;
        Double userCoefficient;
        ln80 binding8;
        Double payoutAmount2;
        Double giftAmount;
        Double userCoefficient2;
        Double houseCoefficient;
        l560 l560Var = this.a;
        Context context = l560Var.getContext();
        if (context != null) {
            double d = this.c;
            double d2 = this.d;
            eo80 eo80Var = l560Var.l0;
            if (d < d2) {
                if (eo80Var != null) {
                    eo80Var.v0.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_red));
                }
                eo80 eo80Var2 = l560Var.l0;
                if (eo80Var2 != null) {
                    eo80Var2.v0.setTextColor(context.getColor(R.color.sg_rush_house_coeff_red));
                }
            } else {
                if (eo80Var != null) {
                    eo80Var.v0.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_green));
                }
                eo80 eo80Var3 = l560Var.l0;
                if (eo80Var3 != null) {
                    eo80Var3.v0.setTextColor(context.getColor(R.color.sg_rush_house_coeff_green));
                }
            }
        }
        double dDoubleValue = 0.0d;
        RushPlaceBetResponse rushPlaceBetResponse = this.b;
        if (((rushPlaceBetResponse == null || (houseCoefficient = rushPlaceBetResponse.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient.doubleValue()) >= ((rushPlaceBetResponse == null || (userCoefficient2 = rushPlaceBetResponse.getUserCoefficient()) == null) ? 0.0d : userCoefficient2.doubleValue()) && Intrinsics.g(l560Var.E.d(), Boolean.FALSE)) {
            Context context2 = l560Var.getContext();
            if (context2 != null) {
                double dDoubleValue2 = (rushPlaceBetResponse == null || (giftAmount = rushPlaceBetResponse.getGiftAmount()) == null) ? 0.0d : giftAmount.doubleValue();
                if (dDoubleValue2 > 0.0d) {
                    if (rushPlaceBetResponse != null && (payoutAmount2 = rushPlaceBetResponse.getPayoutAmount()) != null) {
                        dDoubleValue = payoutAmount2.doubleValue();
                    }
                    dDoubleValue -= dDoubleValue2;
                } else if (rushPlaceBetResponse != null && (payoutAmount = rushPlaceBetResponse.getPayoutAmount()) != null) {
                    dDoubleValue = payoutAmount.doubleValue();
                }
                double d3 = dDoubleValue + dDoubleValue2;
                eo80 eo80Var4 = l560Var.l0;
                if (eo80Var4 != null && (binding8 = eo80Var4.L0.getBinding()) != null) {
                    binding8.v.setVisibility(dDoubleValue2 > 0.0d ? 0 : 8);
                }
                op5 op5Var = op5.a;
                String string = l560Var.getString(R.string.win_message_you_won_android);
                string.getClass();
                op5Var.getClass();
                String strConcat = op5.b(string, "You won", null).concat(" ");
                WalletInfoResponse walletInfoResponse = l560Var.U;
                String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                if (currency == null) {
                    currency = "";
                }
                String strI = op5.i(currency);
                TreeMap treeMap = pw.a;
                String strA = tug.a(strI, " ", pw.a(krh0.l(dDoubleValue)));
                String string2 = l560Var.getString(R.string.win_message_at_android);
                string2.getClass();
                String strA2 = tug.a(" ", op5.b(string2, "at", null), " ");
                String strA3 = yk10.a((rushPlaceBetResponse == null || (userCoefficient = rushPlaceBetResponse.getUserCoefficient()) == null) ? null : krh0.l(userCoefficient.doubleValue()), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                int color = context2.getColor(R.color.sg_rush_toast_color);
                WalletInfoResponse walletInfoResponse2 = l560Var.U;
                String currency2 = walletInfoResponse2 != null ? walletInfoResponse2.getCurrency() : null;
                if (currency2 == null) {
                    currency2 = "";
                }
                String strA4 = tug.a(op5.i(currency2), " ", pw.a(krh0.l(dDoubleValue2)));
                WalletInfoResponse walletInfoResponse3 = l560Var.U;
                String currency3 = walletInfoResponse3 != null ? walletInfoResponse3.getCurrency() : null;
                ToastCommonModel toastCommonModel = new ToastCommonModel(strConcat, strA, strA2, strA3, color, strA4, tug.a(op5.i(currency3 != null ? currency3 : ""), " ", pw.a(krh0.l(d3))), 0.0d, 128, null);
                eo80 eo80Var5 = l560Var.l0;
                if (eo80Var5 != null && (binding7 = eo80Var5.L0.getBinding()) != null) {
                    binding7.d.setBackgroundColor(toastCommonModel.getBgColor());
                }
                eo80 eo80Var6 = l560Var.l0;
                if (eo80Var6 != null && (binding6 = eo80Var6.L0.getBinding()) != null) {
                    binding6.w.setText(toastCommonModel.getText());
                }
                eo80 eo80Var7 = l560Var.l0;
                if (eo80Var7 != null && (binding5 = eo80Var7.L0.getBinding()) != null) {
                    binding5.f.setText(toastCommonModel.getCurrency());
                }
                eo80 eo80Var8 = l560Var.l0;
                if (eo80Var8 != null && (binding4 = eo80Var8.L0.getBinding()) != null) {
                    binding4.c.setText(toastCommonModel.getAt());
                }
                eo80 eo80Var9 = l560Var.l0;
                if (eo80Var9 != null && (binding3 = eo80Var9.L0.getBinding()) != null) {
                    binding3.e.setText(toastCommonModel.getCoeff());
                }
                eo80 eo80Var10 = l560Var.l0;
                if (eo80Var10 != null && (binding2 = eo80Var10.L0.getBinding()) != null) {
                    binding2.b.setText(toastCommonModel.getActualUsedAmount());
                }
                eo80 eo80Var11 = l560Var.l0;
                if (eo80Var11 != null && (binding = eo80Var11.L0.getBinding()) != null) {
                    binding.i.setText(toastCommonModel.getGiftAmount());
                }
                eo80 eo80Var12 = l560Var.l0;
                if (eo80Var12 != null) {
                    eo80Var12.L0.setVisibility(0);
                }
            }
            ej5.c(ebs.a(l560Var.getLifecycle()), null, null, new h660(l560Var, null), 3);
        }
        c760 c760VarF0 = l560Var.F0();
        ej5.c(o8i0.d(c760VarF0), null, null, new e760(c760VarF0, null), 3);
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

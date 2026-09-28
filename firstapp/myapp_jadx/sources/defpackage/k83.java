package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.sportyherov2.components.ShBetContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class k83 {
    public static final /* synthetic */ int a = 0;

    public static final void a(Context context, l1z l1zVar, MultiplierResponse multiplierResponse, ShBetContainer shBetContainer, ShBetContainer shBetContainer2, DetailResponse detailResponse, boolean z, boolean z2, boolean z3, boolean z4, yj2 yj2Var, String str, boolean z5) {
        z83 z83Var;
        z83 z83Var2;
        boolean z6;
        String str2;
        boolean zA;
        l1zVar.getClass();
        detailResponse.getClass();
        yj2Var.getClass();
        long roundId = shBetContainer.getRoundId();
        com.sportygames.crash.remote.models.MultiplierResponse multiplierResponse2 = new com.sportygames.crash.remote.models.MultiplierResponse(multiplierResponse.getRoundId(), multiplierResponse.getCurrentMultiplier(), multiplierResponse.getHasEnded(), multiplierResponse.getMillisLeft(), multiplierResponse.getTotalMillis(), multiplierResponse.getMessageType(), multiplierResponse.getTimeStamp());
        boolean betPlaced = shBetContainer.getBetPlaced();
        boolean betInProgress = shBetContainer.getBetInProgress();
        boolean cashoutDone = shBetContainer.getCashoutDone();
        boolean cashoutInProgress = shBetContainer.getCashoutInProgress();
        qq80 binding = shBetContainer.getBinding();
        if (binding.I.getVisibility() == 0) {
            z83Var = z83.b;
        } else {
            z83Var = binding.t0.getVisibility() == 0 ? z83.c : z83.a;
        }
        z83 z83Var3 = z83Var;
        boolean z7 = shBetContainer.getGiftItem() != null;
        boolean z8 = shBetContainer2.getGiftItem() != null;
        boolean z9 = shBetContainer.getFbgAvailable() && shBetContainer.getBinding().O.getVisibility() == 0 && shBetContainer.getBinding().O.getAlpha() < 0.99f;
        boolean z10 = shBetContainer.getFbgAvailable() && shBetContainer.getBinding().O.getVisibility() == 0;
        CharSequence text = shBetContainer.getBinding().b.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        Double dH = b.h(string);
        double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
        CharSequence text2 = shBetContainer.getBinding().G.getText();
        String string2 = text2 != null ? text2.toString() : null;
        String str3 = string2 == null ? "" : string2;
        boolean z11 = dDoubleValue > detailResponse.getMinAmount();
        boolean z12 = dDoubleValue < detailResponse.getMaxAmount();
        qq80 binding2 = shBetContainer.getBinding();
        ConstraintLayout constraintLayout = binding2.v;
        TextView textView = binding2.I;
        ConstraintLayout constraintLayout2 = binding2.h0;
        boolean z13 = (constraintLayout.getVisibility() == 0 && uj2.g(constraintLayout)) || (constraintLayout2.getVisibility() == 0 && uj2.g(constraintLayout2));
        boolean zA2 = uj2.a(constraintLayout, constraintLayout2, binding2.t0);
        boolean zB = b(shBetContainer);
        double maxAmount = detailResponse.getMaxAmount();
        if (betPlaced) {
            str2 = str3;
            z83Var2 = z83Var3;
            zA = false;
            z6 = betInProgress;
        } else {
            String str4 = str3;
            z83Var2 = z83Var3;
            z6 = betInProgress;
            str2 = str4;
            zA = dr20.a(z83Var2, z7, zB, betInProgress, str4, dDoubleValue, maxAmount);
        }
        boolean z14 = textView.getVisibility() == 0;
        boolean zG = uj2.g(textView);
        boolean zD = uj2.d(z7, z11, z6, betPlaced, z);
        boolean zE = uj2.e(z7, z12, z6, betPlaced, z);
        boolean z15 = (z6 || betPlaced || z7 || z) ? false : true;
        boolean z16 = z11;
        boolean z17 = z12;
        String str5 = str2;
        boolean z18 = z10;
        String str6 = string;
        boolean z19 = z6;
        boolean z20 = z7;
        boolean zB2 = uj2.b(z20, z19, betPlaced, z, str6, str5, z18, b(shBetContainer), z83Var2);
        boolean z21 = z9;
        boolean zC = uj2.c(z18, z20, z21, z4, str6, str5, betPlaced, z19);
        boolean z22 = !z20;
        boolean z23 = (z || betPlaced || z19 || z20) ? false : true;
        z83 z83Var4 = z83Var2;
        boolean z24 = z8;
        String str7 = str2;
        yj2Var.c(context, l1zVar, roundId, multiplierResponse2, betPlaced, z19, cashoutDone, cashoutInProgress, z83Var4, z20, z24, z, z2, z3, zA2, zA, z14, zG, z13, str7, dDoubleValue, detailResponse.getMaxAmount(), str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z5));
        yj2Var.d(context, l1zVar, roundId, multiplierResponse2, roundId, z19, betPlaced, cashoutDone, z20, z, z24, z21, z18, z16, z17, z4, str6, str7, zD, zE, z15, zB2, zC, z83Var4, b(shBetContainer), str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z5));
        yj2Var.b(context, l1zVar, roundId, multiplierResponse2, betPlaced, z19, z20, z, z22, z23, str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z5));
    }

    public static final boolean b(ShBetContainer shBetContainer) {
        qq80 binding = shBetContainer.getBinding();
        ConstraintLayout constraintLayout = binding.v;
        ConstraintLayout constraintLayout2 = binding.h0;
        return (constraintLayout.getVisibility() == 0 && constraintLayout.isClickable() && (constraintLayout.getAlpha() > 0.99f ? 1 : (constraintLayout.getAlpha() == 0.99f ? 0 : -1)) >= 0) || (constraintLayout2.getVisibility() == 0 && constraintLayout2.isClickable() && (constraintLayout2.getAlpha() > 0.99f ? 1 : (constraintLayout2.getAlpha() == 0.99f ? 0 : -1)) >= 0);
    }
}

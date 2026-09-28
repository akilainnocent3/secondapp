package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.pingpong.components.ShBetContainer;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class vc9 {
    public static final op8 a = new op8(-1423062166, new sc9(0), false);
    public static final op8 b = new op8(-112288621, new tc9(), false);
    public static final op8 c = new op8(21298290, new uc9(), false);
    public static final /* synthetic */ int d = 0;

    public static void a(Context context, l1z l1zVar, MultiplierResponse multiplierResponse, ShBetContainer shBetContainer, ShBetContainer shBetContainer2, DetailResponse detailResponse, boolean z, boolean z2, yj2 yj2Var, String str, boolean z3, boolean z4) {
        z83 z83Var;
        String str2;
        boolean z5;
        l1zVar.getClass();
        detailResponse.getClass();
        yj2Var.getClass();
        long roundId = shBetContainer.getRoundId();
        long roundId2 = multiplierResponse.getRoundId();
        String multiplier = multiplierResponse.getMultiplier();
        Boolean hasEnded = multiplierResponse.getHasEnded();
        boolean zBooleanValue = hasEnded != null ? hasEnded.booleanValue() : false;
        Integer millisLeft = multiplierResponse.getMillisLeft();
        int iIntValue = millisLeft != null ? millisLeft.intValue() : 0;
        Integer totalMillis = multiplierResponse.getTotalMillis();
        int iIntValue2 = totalMillis != null ? totalMillis.intValue() : 0;
        String messageType = multiplierResponse.getMessageType();
        String str3 = messageType == null ? "" : messageType;
        Long timeStamp = multiplierResponse.getTimeStamp();
        com.sportygames.crash.remote.models.MultiplierResponse multiplierResponse2 = new com.sportygames.crash.remote.models.MultiplierResponse(roundId2, multiplier, zBooleanValue, iIntValue, iIntValue2, str3, timeStamp != null ? timeStamp.longValue() : 0L);
        boolean betPlaced = shBetContainer.getBetPlaced();
        boolean betInProgress = shBetContainer.getBetInProgress();
        boolean cashoutDone = shBetContainer.getCashoutDone();
        boolean cashoutInProgress = shBetContainer.getCashoutInProgress();
        v720 binding = shBetContainer.getBinding();
        if (binding.B.getVisibility() == 0) {
            z83Var = z83.b;
        } else {
            z83Var = binding.q0.getVisibility() == 0 ? z83.c : z83.a;
        }
        z83 z83Var2 = z83Var;
        boolean z6 = shBetContainer.getGiftItem() != null;
        boolean z7 = shBetContainer2.getGiftItem() != null;
        boolean z8 = shBetContainer.getFbgAvailable() && shBetContainer.getBinding().G.getVisibility() == 0 && shBetContainer.getBinding().G.getAlpha() < 0.99f;
        boolean z9 = shBetContainer.getFbgAvailable() && shBetContainer.getBinding().G.getVisibility() == 0;
        CharSequence text = shBetContainer.getBinding().b.getText();
        String string = text != null ? text.toString() : null;
        String str4 = string == null ? "" : string;
        Double dH = b.h(str4);
        double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
        CharSequence text2 = shBetContainer.getBinding().z.getText();
        String string2 = text2 != null ? text2.toString() : null;
        String str5 = string2 == null ? "" : string2;
        boolean z10 = dDoubleValue > detailResponse.getMinAmount();
        boolean z11 = dDoubleValue < detailResponse.getMaxAmount();
        v720 binding2 = shBetContainer.getBinding();
        ConstraintLayout constraintLayout = binding2.v;
        TextView textView = binding2.B;
        ConstraintLayout constraintLayout2 = binding2.Y;
        boolean z12 = (constraintLayout.getVisibility() == 0 && uj2.g(constraintLayout)) || (constraintLayout2.getVisibility() == 0 && uj2.g(constraintLayout2));
        boolean zA = uj2.a(constraintLayout, constraintLayout2, binding2.q0);
        boolean zB = b(shBetContainer);
        String str6 = str5;
        double maxAmount = detailResponse.getMaxAmount();
        if (betPlaced) {
            str2 = str6;
            z5 = false;
        } else {
            boolean zA2 = dr20.a(z83Var2, z6, zB, betInProgress, str6, dDoubleValue, maxAmount);
            str2 = str6;
            z5 = zA2;
        }
        boolean z13 = textView.getVisibility() == 0;
        boolean zG = uj2.g(textView);
        boolean zD = uj2.d(z6, z10, betInProgress, betPlaced, z);
        boolean zE = uj2.e(z6, z11, betInProgress, betPlaced, z);
        boolean z14 = (betInProgress || betPlaced || z6 || z) ? false : true;
        boolean z15 = z9;
        boolean z16 = z10;
        boolean z17 = z11;
        boolean z18 = z6;
        String str7 = str2;
        boolean zB2 = uj2.b(z18, betInProgress, betPlaced, z, str4, str7, z15, b(shBetContainer), z83Var2);
        String str8 = str4;
        boolean z19 = z8;
        boolean zC = uj2.c(z15, z18, z19, z2, str8, str7, betPlaced, betInProgress);
        boolean z20 = !z18;
        boolean z21 = (z || betPlaced || betInProgress || z18) ? false : true;
        yj2Var.c(context, l1zVar, roundId, multiplierResponse2, betPlaced, betInProgress, cashoutDone, cashoutInProgress, z83Var2, z18, z7, z, z, z3, zA, z5, z13, zG, z12, str7, dDoubleValue, detailResponse.getMaxAmount(), str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z4));
        yj2Var.d(context, l1zVar, roundId, multiplierResponse2, roundId, betInProgress, betPlaced, cashoutDone, z18, z, z7, z19, z15, z16, z17, z2, str8, str7, zD, zE, z14, zB2, zC, z83Var2, b(shBetContainer), str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z4));
        yj2Var.b(context, l1zVar, roundId, multiplierResponse2, betPlaced, betInProgress, z18, z, z20, z21, str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z4));
    }

    public static final boolean b(ShBetContainer shBetContainer) {
        v720 binding = shBetContainer.getBinding();
        ConstraintLayout constraintLayout = binding.v;
        ConstraintLayout constraintLayout2 = binding.Y;
        return (constraintLayout.getVisibility() == 0 && constraintLayout.isClickable() && (constraintLayout.getAlpha() > 0.99f ? 1 : (constraintLayout.getAlpha() == 0.99f ? 0 : -1)) >= 0) || (constraintLayout2.getVisibility() == 0 && constraintLayout2.isClickable() && (constraintLayout2.getAlpha() > 0.99f ? 1 : (constraintLayout2.getAlpha() == 0.99f ? 0 : -1)) >= 0);
    }
}

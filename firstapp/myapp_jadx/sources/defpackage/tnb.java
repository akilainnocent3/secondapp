package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.crash.models.header.CrashHeaderState;
import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$sendCashoutNotificationForToast$1", f = "CrashInitiatedFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tnb extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ zqy a;
    public final /* synthetic */ CrashInitiatedPlaceBetResponse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnb(v1b v1bVar, zqy zqyVar, CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse) {
        super(1, v1bVar);
        this.a = zqyVar;
        this.b = crashInitiatedPlaceBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new tnb(v1bVar, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((tnb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0176  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context applicationContext;
        double dDoubleValue;
        Double payoutAmount;
        String currencyCode;
        String str;
        String currencyCode2;
        String strL;
        String strL2;
        Double userCoefficient;
        Double userCoefficient2;
        Double payoutAmount2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zqy zqyVar = this.a;
        if (zqyVar.isAdded() && (context = zqyVar.getContext()) != null && (applicationContext = context.getApplicationContext()) != null) {
            double dDoubleValue2 = 0.0d;
            CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse = this.b;
            if (crashInitiatedPlaceBetResponse != null) {
                try {
                    Double giftAmount = crashInitiatedPlaceBetResponse.getGiftAmount();
                    if (giftAmount != null) {
                        dDoubleValue = giftAmount.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue > 0.0d) {
                        if (crashInitiatedPlaceBetResponse != null && (payoutAmount2 = crashInitiatedPlaceBetResponse.getPayoutAmount()) != null) {
                            dDoubleValue2 = payoutAmount2.doubleValue();
                        }
                        dDoubleValue2 -= dDoubleValue;
                    } else if (crashInitiatedPlaceBetResponse != null && (payoutAmount = crashInitiatedPlaceBetResponse.getPayoutAmount()) != null) {
                        dDoubleValue2 = payoutAmount.doubleValue();
                    }
                    double d = dDoubleValue2 + dDoubleValue;
                    op5 op5Var = op5.a;
                    currencyCode = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
                    str = "";
                    if (currencyCode == null) {
                        currencyCode = "";
                    }
                    op5Var.getClass();
                    String strI = op5.i(currencyCode);
                    ytw<ToastCommonModel> ytwVar = zqyVar.u0().U;
                    String string = zqyVar.getString(R.string.win_message_you_won_android);
                    string.getClass();
                    String strConcat = op5.b(string, "You won", null).concat(" ");
                    currencyCode2 = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
                    if (currencyCode2 == null) {
                        str = currencyCode2;
                    }
                    String strI2 = op5.i(str);
                    TreeMap treeMap = pw.a;
                    String str2 = strI2 + " " + pw.a(krh0.l(dDoubleValue2));
                    String string2 = zqyVar.getString(R.string.win_message_at_android);
                    string2.getClass();
                    String str3 = " " + op5.b(string2, "at", null) + " ";
                    if (crashInitiatedPlaceBetResponse != null || (userCoefficient2 = crashInitiatedPlaceBetResponse.getUserCoefficient()) == null) {
                        strL = null;
                    } else {
                        strL = krh0.l(userCoefficient2.doubleValue());
                    }
                    ((x5a0) ytwVar).setValue(new ToastCommonModel(strConcat, str2, str3, strL + "x", applicationContext.getColor(R.color.sg_rush_toast_color), strI + " " + pw.a(krh0.l(dDoubleValue)), strI + " " + pw.a(krh0.l(d)), dDoubleValue));
                    Intent intent = new Intent("custom-event-name");
                    intent.putExtra("currency", strI);
                    if (crashInitiatedPlaceBetResponse != null || (userCoefficient = crashInitiatedPlaceBetResponse.getUserCoefficient()) == null) {
                        strL2 = null;
                    } else {
                        strL2 = krh0.l(userCoefficient.doubleValue());
                    }
                    intent.putExtra("cashoutCoeff", strL2);
                    intent.putExtra("payoutAmount", krh0.l(dDoubleValue2));
                    intent.putExtra("giftAmount", krh0.l(dDoubleValue));
                    intent.putExtra("calledFrom", (String) ((x5a0) zqyVar.u0().a).getValue());
                    intent.putExtra("massageType", "ONE_PUNCH_RECORD");
                    fdt.a(applicationContext).c(intent);
                } catch (Exception unused) {
                }
            } else {
                dDoubleValue = 0.0d;
                if (dDoubleValue > 0.0d) {
                    if (crashInitiatedPlaceBetResponse != null) {
                        dDoubleValue2 = payoutAmount2.doubleValue();
                    }
                    dDoubleValue2 -= dDoubleValue;
                } else if (crashInitiatedPlaceBetResponse != null) {
                    dDoubleValue2 = payoutAmount.doubleValue();
                }
                double d2 = dDoubleValue2 + dDoubleValue;
                op5 op5Var2 = op5.a;
                currencyCode = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
                str = "";
                if (currencyCode == null) {
                    currencyCode = "";
                }
                op5Var2.getClass();
                String strI3 = op5.i(currencyCode);
                ytw<ToastCommonModel> ytwVar2 = zqyVar.u0().U;
                String string3 = zqyVar.getString(R.string.win_message_you_won_android);
                string3.getClass();
                String strConcat2 = op5.b(string3, "You won", null).concat(" ");
                currencyCode2 = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
                if (currencyCode2 == null) {
                    str = currencyCode2;
                }
                String strI4 = op5.i(str);
                TreeMap treeMap2 = pw.a;
                String str4 = strI4 + " " + pw.a(krh0.l(dDoubleValue2));
                String string4 = zqyVar.getString(R.string.win_message_at_android);
                string4.getClass();
                String str5 = " " + op5.b(string4, "at", null) + " ";
                if (crashInitiatedPlaceBetResponse != null) {
                    strL = null;
                } else {
                    strL = null;
                }
                ((x5a0) ytwVar2).setValue(new ToastCommonModel(strConcat2, str4, str5, strL + "x", applicationContext.getColor(R.color.sg_rush_toast_color), strI3 + " " + pw.a(krh0.l(dDoubleValue)), strI3 + " " + pw.a(krh0.l(d2)), dDoubleValue));
                Intent intent2 = new Intent("custom-event-name");
                intent2.putExtra("currency", strI3);
                if (crashInitiatedPlaceBetResponse != null) {
                    strL2 = null;
                } else {
                    strL2 = null;
                }
                intent2.putExtra("cashoutCoeff", strL2);
                intent2.putExtra("payoutAmount", krh0.l(dDoubleValue2));
                intent2.putExtra("giftAmount", krh0.l(dDoubleValue));
                intent2.putExtra("calledFrom", (String) ((x5a0) zqyVar.u0().a).getValue());
                intent2.putExtra("massageType", "ONE_PUNCH_RECORD");
                fdt.a(applicationContext).c(intent2);
            }
        }
        return Unit.a;
    }
}

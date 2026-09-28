package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$sendCashoutNotificationForToast$2", f = "PocketRocketFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tz10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zy10 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ double c;
    public final /* synthetic */ RoundBetResponse d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz10(double d, int i, v1b v1bVar, zy10 zy10Var, RoundBetResponse roundBetResponse) {
        super(2, v1bVar);
        this.a = zy10Var;
        this.b = i;
        this.c = d;
        this.d = roundBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tz10(this.c, this.b, v1bVar, this.a, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tz10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Context context;
        Double giftAmount;
        Double giftAmount2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zy10 zy10Var = this.a;
        if (zy10Var.isAdded() && (context = zy10Var.getContext()) != null) {
            SharedPreferences sharedPreferences = zy10Var.w;
            if (sharedPreferences != null && sharedPreferences.getBoolean("ROCKET_SOUND", true)) {
                ypa0 ypa0VarA1 = zy10Var.a1();
                String string = zy10Var.getString(R.string.cashout);
                string.getClass();
                ypa0VarA1.A1(0L, string);
            }
            op5 op5Var = op5.a;
            List<DetailResponse> list = zy10Var.M;
            String strM = null;
            if (list == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            int i = this.b;
            String currency = list.get(i).getCurrency();
            if (currency == null) {
                currency = "";
            }
            op5Var.getClass();
            String strI = op5.i(currency);
            TreeMap treeMap = pw.a;
            double d = this.c;
            String strA = lx5.a(" ", strI, " ", pw.m(d));
            RoundBetResponse roundBetResponse = this.d;
            BetDetails bet = roundBetResponse.getBet();
            String strValueOf = String.valueOf(bet != null ? new Double(bet.getCashoutCoefficient()) : null);
            if (zy10Var.d0) {
                Intent intent = new Intent("custom-event-name");
                intent.putExtra("cashoutAmount", strA);
                intent.putExtra("cashoutCoeff", strValueOf);
                intent.putExtra("betIndex", i);
                intent.putExtra("massageType", "PR_BET_RECORD");
                BetDetails bet2 = roundBetResponse.getBet();
                intent.putExtra("rocketType", bet2 != null ? bet2.getRocketType() : null);
                BetDetails bet3 = roundBetResponse.getBet();
                if (((bet3 == null || (giftAmount2 = bet3.getGiftAmount()) == null) ? 0.0d : giftAmount2.doubleValue()) > 0.0d) {
                    List<DetailResponse> list2 = zy10Var.M;
                    if (list2 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    String currency2 = list2.get(i).getCurrency();
                    if (currency2 == null) {
                        currency2 = "";
                    }
                    String strI2 = op5.i(currency2);
                    BetDetails bet4 = roundBetResponse.getBet();
                    String string2 = zy10Var.getString(R.string.currency, strI2, bet4 != null ? pw.d(bet4.getPayoutAmount() - bet4.getStakeAmount()) : null);
                    string2.getClass();
                    intent.putExtra("winAmount", string2);
                    List<DetailResponse> list3 = zy10Var.M;
                    if (list3 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    String currency3 = list3.get(i).getCurrency();
                    if (currency3 == null) {
                        currency3 = "";
                    }
                    String string3 = zy10Var.getString(R.string.currency, op5.i(currency3), pw.m(d));
                    string3.getClass();
                    intent.putExtra("totalAmount", string3);
                    List<DetailResponse> list4 = zy10Var.M;
                    if (list4 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    String currency4 = list4.get(i).getCurrency();
                    String strI3 = op5.i(currency4 != null ? currency4 : "");
                    BetDetails bet5 = roundBetResponse.getBet();
                    if (bet5 != null && (giftAmount = bet5.getGiftAmount()) != null) {
                        strM = pw.m(giftAmount.doubleValue());
                    }
                    String string4 = zy10Var.getString(R.string.currency, strI3, strM);
                    string4.getClass();
                    intent.putExtra("giftAmount", string4);
                }
                fdt.a(context).c(intent);
            }
        }
        return Unit.a;
    }
}

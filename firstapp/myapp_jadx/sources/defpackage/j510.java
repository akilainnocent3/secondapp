package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.UserInfoResponseSocket;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$sendCashoutNotificationForToast$2", f = "PingPongFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class j510 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ m410 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ double c;
    public final /* synthetic */ UserInfoResponseSocket d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j510(double d, int i, v1b v1bVar, m410 m410Var, UserInfoResponseSocket userInfoResponseSocket) {
        super(2, v1bVar);
        this.a = m410Var;
        this.b = i;
        this.c = d;
        this.d = userInfoResponseSocket;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j510(this.c, this.b, v1bVar, this.a, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j510) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Context context;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        List<DetailResponse> gameDetailsResponseList2;
        DetailResponse detailResponse2;
        List<DetailResponse> gameDetailsResponseList3;
        DetailResponse detailResponse3;
        List<DetailResponse> gameDetailsResponseList4;
        DetailResponse detailResponse4;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        m410 m410Var = this.a;
        if (m410Var.isAdded() && (context = m410Var.getContext()) != null) {
            DetailResponseData detailResponseData = m410Var.w;
            int i = this.b;
            String currency = (detailResponseData == null || (gameDetailsResponseList4 = detailResponseData.getGameDetailsResponseList()) == null || (detailResponse4 = gameDetailsResponseList4.get(i)) == null) ? null : detailResponse4.getCurrency();
            if (currency == null) {
                currency = "";
            }
            TreeMap treeMap = pw.a;
            double d = this.c;
            String strA = lx5.a(" ", currency, " ", pw.m(d));
            UserInfoResponseSocket userInfoResponseSocket = this.d;
            String cashoutCoefficient = userInfoResponseSocket.getCashoutCoefficient();
            if (m410Var.h0) {
                Intent intent = new Intent("custom-event-name");
                intent.putExtra("cashoutAmount", strA);
                intent.putExtra("cashoutCoeff", cashoutCoefficient);
                intent.putExtra("betIndex", i);
                intent.putExtra("massageType", "BET_RECORD");
                Double giftAmount = userInfoResponseSocket.getGiftAmount();
                if ((giftAmount != null ? giftAmount.doubleValue() : 0.0d) > 0.0d) {
                    DetailResponseData detailResponseData2 = m410Var.w;
                    String currency2 = (detailResponseData2 == null || (gameDetailsResponseList3 = detailResponseData2.getGameDetailsResponseList()) == null || (detailResponse3 = gameDetailsResponseList3.get(i)) == null) ? null : detailResponse3.getCurrency();
                    if (currency2 == null) {
                        currency2 = "";
                    }
                    String string = m410Var.getString(R.string.currency, currency2, pw.d(userInfoResponseSocket.getPayoutAmount() - userInfoResponseSocket.getStakeAmount()));
                    string.getClass();
                    intent.putExtra("winAmount", string);
                    DetailResponseData detailResponseData3 = m410Var.w;
                    String currency3 = (detailResponseData3 == null || (gameDetailsResponseList2 = detailResponseData3.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList2.get(i)) == null) ? null : detailResponse2.getCurrency();
                    if (currency3 == null) {
                        currency3 = "";
                    }
                    String string2 = m410Var.getString(R.string.currency, currency3, pw.m(d));
                    string2.getClass();
                    intent.putExtra("totalAmount", string2);
                    DetailResponseData detailResponseData4 = m410Var.w;
                    String currency4 = (detailResponseData4 == null || (gameDetailsResponseList = detailResponseData4.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList.get(i)) == null) ? null : detailResponse.getCurrency();
                    String str = currency4 != null ? currency4 : "";
                    Double giftAmount2 = userInfoResponseSocket.getGiftAmount();
                    String string3 = m410Var.getString(R.string.currency, str, giftAmount2 != null ? pw.m(giftAmount2.doubleValue()) : null);
                    string3.getClass();
                    intent.putExtra("giftAmount", string3);
                }
                fdt.a(context).c(intent);
            }
        }
        return Unit.a;
    }
}

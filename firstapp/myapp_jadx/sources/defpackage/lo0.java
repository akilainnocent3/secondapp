package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.jackpot.data.AdsData;
import com.sportybet.plugin.jackpot.data.JackpotBet;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.SportBet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface lo0 {
    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<AdsData>> a(@jh4 String str);

    @flz("common/config/v2/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> b(@jh4 String str);

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> c(@jh4 String str);

    @flz("orders/order/deleteOrder/{orderId}")
    su5<BaseResponse> d(@dxz("orderId") String str);

    @flz("orders/order")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Order>> e(@jh4 String str);

    @sbj("jackpot/bet")
    su5<BaseResponse<JackpotBet>> f(@db30(AnalyticsParam.EVENT_PARAM_ID) String str);

    @sbj("orders/order/v2/jackpotlist")
    su5<BaseResponse<SportBet>> g(@db30("isSettled") int i, @db30("lastId") String str, @db30("pageSize") int i2);
}

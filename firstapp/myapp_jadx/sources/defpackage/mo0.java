package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sporty.android.core.model.patron.MyFavoriteOddRange;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.MySelectedMarket;
import com.sportybet.plugin.realsports.data.MySelectedTeam;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface mo0 {
    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<RealSportsAdsData>> a(@jh4 String str);

    @sbj("orders/share/{shareCode}")
    su5<BaseResponse<BookingData>> b(@dxz("shareCode") String str);

    @gmz("patron/preferences/selectedMarkets")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> c(@jh4 List<MySelectedMarket> list);

    @flz("orders/order/deleteOrder/{orderId}")
    su5<BaseResponse> d(@dxz("orderId") String str);

    @gmz("realSportsGame/recommender/preference")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> e(@jh4 String str);

    @gmz("patron/preferences/selectedTeams")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> f(@jh4 List<MySelectedTeam> list);

    @gmz("patron/preferences/selectedLeagues")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> g(@jh4 List<String> list);

    @gmz("patron/preferences/selectedSports")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> h(@jh4 List<String> list);

    @gmz("patron/preferences/oddsRange")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> i(@jh4 MyFavoriteOddRange myFavoriteOddRange);

    @gmz("patron/preferences/defaultStake")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse> j(@jh4 MyFavoriteStake myFavoriteStake);
}

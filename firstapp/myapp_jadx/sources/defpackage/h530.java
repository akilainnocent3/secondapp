package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.AdsData;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sporty.android.core.model.gift.BonusResponse;
import com.sporty.android.core.model.gift.GiftCountBody;
import com.sporty.android.core.model.gift.GiftCountResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.loyalty.FootballClaim;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.RewardShowOffConfig;
import com.sporty.android.core.model.loyalty.RewardShowOffUploadResult;
import com.sporty.android.core.model.loyalty.UserTier;
import com.sporty.android.core.model.luckywheel.LuckyWheelResponse;
import com.sporty.android.core.model.luckywheel.LuckyWheelSpinResponse;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sporty.android.core.model.social.ShareUrl;
import java.util.List;
import kotlin.Unit;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes4.dex */
public interface h530 {
    su5<BaseResponse<AdsData>> a(String str);

    su5<BaseResponse<BonusResponse>> b();

    ct90<BaseResponse<AdsData>> c(String str);

    lyh<BaseResponse<LuckyWheelSpinResponse>> d(int i, int i2);

    lyh<BaseResponse<LoyaltyTierConfig>> e();

    Object f(String str, String str2, rq00 rq00Var);

    Object g(int i, x1b x1bVar, String str);

    lyh<BaseResponse<List<TicketInfo>>> h(int i);

    lyh<BaseResponse<RealSportsAdsData>> i(String str);

    lyh<BaseResponse<ShareUrl>> j(String str);

    lyh<BaseResponse<UserTier>> k();

    lyh<BaseResponse<List<LoyaltyActivityData>>> l();

    lyh m(int i, Integer num);

    lyh<BaseResponse<Boolean>> n();

    lyh<BaseResponse<RewardShowOffUploadResult>> o(String str, String str2, MultipartBody.Part part);

    lyh<RewardShowOffConfig> p();

    lyh<BaseResponse<Boolean>> q(String str);

    lyh<BaseResponse<List<GiftGroup>>> r(String str);

    lyh<BaseResponse<FootballClaim>> s(String str);

    lyh<BaseResponse<LuckyWheelResponse>> t(int i);

    Object u(x1b x1bVar);

    lyh<BaseResponse<TicketInfo>> v(int i);

    lyh<BaseResponse<BonusResponse>> w();

    lyh<BaseResponse<GiftCountResponse>> x(GiftCountBody giftCountBody);

    lyh<BaseResponse<Unit>> y(String str);

    lyh z();
}

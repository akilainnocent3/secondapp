package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.AdsData;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sporty.android.core.model.dateofbirth.BirthdayGiftHintResponse;
import com.sporty.android.core.model.gift.BonusResponse;
import com.sporty.android.core.model.gift.GiftCountBody;
import com.sporty.android.core.model.gift.GiftCountResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.loyalty.CancelMissionRequest;
import com.sporty.android.core.model.loyalty.FootballClaim;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.MissionData;
import com.sporty.android.core.model.loyalty.MissionV2Data;
import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import com.sporty.android.core.model.loyalty.RewardShowOffConfigResponse;
import com.sporty.android.core.model.loyalty.RewardShowOffUploadResult;
import com.sporty.android.core.model.loyalty.UserTier;
import com.sporty.android.core.model.loyalty.streak.BettingStreakAchievementDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakApplyToolDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakCalendarDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakHistoryDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakMetricDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakStatusDto;
import com.sporty.android.core.model.luckywheel.DrawByIdBody;
import com.sporty.android.core.model.luckywheel.LuckyWheelResponse;
import com.sporty.android.core.model.luckywheel.LuckyWheelSpinResponse;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sporty.android.core.model.promotion.PromotionInfo;
import com.sporty.android.core.model.realsports.FeatureLaunchRate;
import com.sporty.android.core.model.social.ShareUrl;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00192\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u001c2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\"\u0010#J.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b'\u0010(J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b,\u0010-JF\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00100\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00100\u001a\u00020\u0002H§@¢\u0006\u0004\b2\u00103J(\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00100\u00042\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b5\u0010\u0016J\u001b\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\u0019H'¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002060\u0004H§@¢\u0006\u0004\b9\u0010:J\u001c\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00100\u0004H§@¢\u0006\u0004\b<\u0010:J\"\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b?\u0010\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0004H§@¢\u0006\u0004\bA\u0010:J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0004H§@¢\u0006\u0004\bC\u0010:J\u001c\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00100\u0004H§@¢\u0006\u0004\bE\u0010:J \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0001\u0010F\u001a\u00020\u0012H§@¢\u0006\u0004\bH\u0010\u0016J \u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00042\b\b\u0001\u0010F\u001a\u00020\u0012H§@¢\u0006\u0004\bJ\u0010\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u0004H§@¢\u0006\u0004\bK\u0010:J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u0004H§@¢\u0006\u0004\bM\u0010:J4\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00042\b\b\u0001\u0010N\u001a\u00020\u00122\b\b\u0001\u0010F\u001a\u00020\u00122\b\b\u0001\u0010P\u001a\u00020OH§@¢\u0006\u0004\bR\u0010SJ \u0010T\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010F\u001a\u00020\u0012H§@¢\u0006\u0004\bT\u0010\u0016J(\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00100\u00042\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bW\u0010XJ\u001c\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00100\u0004H§@¢\u0006\u0004\bY\u0010:J(\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00100\u00042\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b[\u0010XJ \u0010^\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010]\u001a\u00020\\H§@¢\u0006\u0004\b^\u0010_J \u0010a\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010]\u001a\u00020`H§@¢\u0006\u0004\ba\u0010bJ\u001c\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00100\u0004H§@¢\u0006\u0004\bc\u0010:J\u0016\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u0004H§@¢\u0006\u0004\be\u0010:J\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u0004H§@¢\u0006\u0004\bg\u0010:J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u0004H§@¢\u0006\u0004\bi\u0010:J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u0004H§@¢\u0006\u0004\bk\u0010:J\u0016\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u0004H§@¢\u0006\u0004\bm\u0010:J\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u0004H§@¢\u0006\u0004\bo\u0010:J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u0004H§@¢\u0006\u0004\bq\u0010:J \u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u00042\b\b\u0001\u0010r\u001a\u00020GH§@¢\u0006\u0004\bt\u0010u¨\u0006vÀ\u0006\u0003"}, d2 = {"Lx430;", "", "", "type", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelResponse;", "q", "(ILv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/luckywheel/DrawByIdBody;", "drawByIdBody", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelSpinResponse;", "n", "(Lcom/sporty/android/core/model/luckywheel/DrawByIdBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/luckywheel/TicketInfo;", "k", AnalyticsParam.EVENT_STATUS, "", "E", "", "jsonStr", "Lcom/sporty/android/core/model/ads/AdsData;", "D", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/ads/RealSportsAdsData;", "s", "Lsu5;", "a", "(Ljava/lang/String;)Lsu5;", "Lct90;", "c", "(Ljava/lang/String;)Lct90;", "classify", "platform", "Lcom/sporty/android/core/model/promotion/PromotionInfo;", "F", "(ILjava/lang/String;Lv1b;)Ljava/lang/Object;", EventKeys.TIMESTAMP, "dailyRewardTimestamp", "", "h", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/gift/GiftCountBody;", "body", "Lcom/sporty/android/core/model/gift/GiftCountResponse;", "H", "(Lcom/sporty/android/core/model/gift/GiftCountBody;Lv1b;)Ljava/lang/Object;", "bizType", "betType", "deviceCh", "Lcom/sporty/android/core/model/gift/GiftGroup;", "g", "(IILjava/lang/Integer;ILv1b;)Ljava/lang/Object;", "giftId", "C", "Lcom/sporty/android/core/model/gift/BonusResponse;", "b", "()Lsu5;", "A", "(Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/realsports/FeatureLaunchRate;", "w", "orderId", "Lcom/sporty/android/core/model/social/ShareUrl;", "u", "Lcom/sporty/android/core/model/loyalty/LoyaltyTierConfig;", "L", "Lcom/sporty/android/core/model/loyalty/UserTier;", "v", "Lcom/sporty/android/core/model/loyalty/LoyaltyActivityData;", "x", "batchId", "", "I", "Lcom/sporty/android/core/model/loyalty/FootballClaim;", "M", "K", "Lcom/sporty/android/core/model/loyalty/RewardShowOffConfigResponse;", "f", "uid", "Lokhttp3/MultipartBody$Part;", "file", "Lcom/sporty/android/core/model/loyalty/RewardShowOffUploadResult;", "o", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lv1b;)Ljava/lang/Object;", "J", "missionId", "Lcom/sporty/android/core/model/loyalty/MissionData;", "z", "(Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "m", "Lcom/sporty/android/core/model/loyalty/MissionV2Data;", "p", "Lcom/sporty/android/core/model/loyalty/ParticipateMissionRequest;", "request", "G", "(Lcom/sporty/android/core/model/loyalty/ParticipateMissionRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/loyalty/CancelMissionRequest;", "j", "(Lcom/sporty/android/core/model/loyalty/CancelMissionRequest;Lv1b;)Ljava/lang/Object;", "B", "Lcom/sporty/android/core/model/loyalty/LoyaltyAggregateHintData;", "d", "Lcom/sporty/android/core/model/dateofbirth/BirthdayGiftHintResponse;", "y", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakStatusDto;", "N", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakMetricDto;", "i", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakCalendarDto;", "l", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakAchievementDto;", "e", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakHistoryDto;", "r", "dryRun", "Lcom/sporty/android/core/model/loyalty/streak/BettingStreakApplyToolDto;", "t", "(ZLv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface x430 {
    @sbj("promotion/v2/bonus/plans/valid")
    Object A(v1b<? super BaseResponse<BonusResponse>> v1bVar);

    @sbj("promotion/v2/loyalty/mission/processing")
    Object B(v1b<? super BaseResponse<List<MissionV2Data>>> v1bVar);

    @flz("promotion/v1/groupGift/{giftId}")
    Object C(@dxz("giftId") String str, v1b<? super BaseResponse<List<GiftGroup>>> v1bVar);

    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    Object D(@jh4 String str, v1b<? super BaseResponse<AdsData>> v1bVar);

    @sbj("promotion/luckyWheel/allTicketInfo")
    Object E(@db30(AnalyticsParam.EVENT_STATUS) int i, v1b<? super BaseResponse<List<TicketInfo>>> v1bVar);

    @sbj("promotion/v1/activities")
    Object F(@db30("classify") int i, @rhl("platform") String str, v1b<? super BaseResponse<PromotionInfo>> v1bVar);

    @flz("promotion/v1/loyalty/mission/participate")
    Object G(@jh4 ParticipateMissionRequest participateMissionRequest, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("promotion/v1/gifts/count")
    @gil({"Content-Type: application/json"})
    Object H(@jh4 GiftCountBody giftCountBody, v1b<? super BaseResponse<GiftCountResponse>> v1bVar);

    @sbj("promotion/v1/loyalty/program/preClaim")
    Object I(@db30("batchId") String str, v1b<? super BaseResponse<Boolean>> v1bVar);

    @gmz("promotion/v1/loyalty/program/batch/daily/claim")
    Object J(@db30("batchId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("promotion/v1/loyalty/program/qualify")
    Object K(v1b<? super BaseResponse<Boolean>> v1bVar);

    @sbj("promotion/v1/loyalty/tier/config")
    Object L(v1b<? super BaseResponse<LoyaltyTierConfig>> v1bVar);

    @gmz("promotion/v1/loyalty/program/claim")
    Object M(@db30("batchId") String str, v1b<? super BaseResponse<FootballClaim>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak/status")
    Object N(v1b<? super BaseResponse<BettingStreakStatusDto>> v1bVar);

    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<AdsData>> a(@jh4 String jsonStr);

    @sbj("promotion/v2/bonus/plans/valid")
    su5<BaseResponse<BonusResponse>> b();

    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    ct90<BaseResponse<AdsData>> c(@jh4 String jsonStr);

    @sbj("promotion/v1/loyalty/aggregate/hint")
    Object d(v1b<? super BaseResponse<LoyaltyAggregateHintData>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak/achievement")
    Object e(v1b<? super BaseResponse<BettingStreakAchievementDto>> v1bVar);

    @sbj("promotion/v1/loyalty/program/config")
    Object f(v1b<? super BaseResponse<RewardShowOffConfigResponse>> v1bVar);

    @sbj("promotion/v1/gifts/groupQuery")
    @gil({"Content-Type: application/json"})
    Object g(@db30("classify") int i, @db30("bizType") int i2, @db30("betType") Integer num, @db30("deviceCh") int i3, v1b<? super BaseResponse<List<GiftGroup>>> v1bVar);

    @sbj("promotion/v1/message/subscribe")
    Object h(@db30("lastSubscribeTime") String str, @db30("dailyRewardLastSubscribe") String str2, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak/metrics")
    Object i(v1b<? super BaseResponse<BettingStreakMetricDto>> v1bVar);

    @flz("promotion/v1/loyalty/mission/cancel")
    Object j(@jh4 CancelMissionRequest cancelMissionRequest, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("promotion/luckyWheel/ticketInfo")
    Object k(@db30("type") int i, v1b<? super BaseResponse<TicketInfo>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak/calendar")
    Object l(v1b<? super BaseResponse<BettingStreakCalendarDto>> v1bVar);

    @sbj("promotion/v1/loyalty/mission/applicable/virtual")
    Object m(v1b<? super BaseResponse<List<MissionData>>> v1bVar);

    @flz("promotion/luckyWheel/drawById")
    @gil({"Content-Type: application/json"})
    Object n(@jh4 DrawByIdBody drawByIdBody, v1b<? super BaseResponse<LuckyWheelSpinResponse>> v1bVar);

    @flz("promotion/v1/loyalty/program/reward/show-off/upload")
    @jmw
    Object o(@rhl("uid") String str, @usz("batchId") String str2, @usz MultipartBody.Part part, v1b<? super BaseResponse<RewardShowOffUploadResult>> v1bVar);

    @sbj("promotion/v2/loyalty/mission/applicable")
    Object p(@db30("missionId") Integer num, v1b<? super BaseResponse<List<MissionV2Data>>> v1bVar);

    @sbj("promotion/luckyWheel")
    Object q(@db30("type") int i, v1b<? super BaseResponse<LuckyWheelResponse>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak/history")
    Object r(v1b<? super BaseResponse<BettingStreakHistoryDto>> v1bVar);

    @flz("promotion/v1/ads/query")
    @gil({"Content-Type: application/json"})
    Object s(@jh4 String str, v1b<? super BaseResponse<RealSportsAdsData>> v1bVar);

    @flz("promotion/v1/loyalty/betting/streak/tools:apply")
    Object t(@db30("dryRun") boolean z, v1b<? super BaseResponse<BettingStreakApplyToolDto>> v1bVar);

    @flz("promotion/v1/groupGift/share/{orderId}")
    Object u(@dxz("orderId") String str, v1b<? super BaseResponse<ShareUrl>> v1bVar);

    @sbj("promotion/v1/loyalty/program/userTier")
    Object v(v1b<? super BaseResponse<UserTier>> v1bVar);

    @sbj("promotion/v1/launchRate")
    Object w(v1b<? super BaseResponse<List<FeatureLaunchRate>>> v1bVar);

    @sbj("promotion/v1/loyalty/program/applicable")
    Object x(v1b<? super BaseResponse<List<LoyaltyActivityData>>> v1bVar);

    @sbj("promotion/v1/dob/birthdayGift/hint")
    Object y(v1b<? super BaseResponse<BirthdayGiftHintResponse>> v1bVar);

    @sbj("promotion/v1/loyalty/mission/applicable")
    Object z(@db30("missionId") Integer num, v1b<? super BaseResponse<List<MissionData>>> v1bVar);
}

package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.autobet.AutoBetListData;
import com.sporty.android.core.model.autobet.AutoBetResponse;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeTournamentFilterDto;
import com.sporty.android.core.model.bookingcode.RecommendBookingCodesResponseDto;
import com.sporty.android.core.model.bookingcode.SmartRemixEligibilityResponse;
import com.sporty.android.core.model.bookingcode.TournamentBookingCodeFilterDto;
import com.sporty.android.core.model.joker.JokerConfigApiModel;
import com.sporty.android.core.model.orders.BetHistoryOrderList;
import com.sporty.android.core.model.orders.BetTicketDetail;
import com.sporty.android.core.model.orders.DeleteRealBetHistoryOrdersRequest;
import com.sporty.android.core.model.orders.SOrder;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckResponseDto;
import com.sporty.android.core.model.recentcode.RecentCodeConfigData;
import com.sporty.android.core.model.recentcode.RecentShareCode;
import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sporty.android.core.model.remixbet.RemixBetResponse;
import com.sporty.android.core.model.sharewin.ShareWinData;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u00192\b\b\u0001\u0010\u0018\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J0\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u00192\b\b\u0001\u0010%\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020$H§@¢\u0006\u0004\b'\u0010(J4\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020$2\b\b\u0001\u0010+\u001a\u00020$H§@¢\u0006\u0004\b-\u0010.J \u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010/\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u00101J\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b4\u00105J\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b6\u00105J \u00109\u001a\b\u0012\u0004\u0012\u0002080\u00072\b\b\u0001\u00103\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0007H§@¢\u0006\u0004\b<\u0010\u0016Jd\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00072\n\b\u0001\u0010=\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010B\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010AH§@¢\u0006\u0004\bD\u0010EJ,\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u00072\b\b\u0001\u0010&\u001a\u00020$2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bF\u0010GJ \u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bI\u00101J \u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00072\b\b\u0001\u00103\u001a\u00020JH§@¢\u0006\u0004\bL\u0010MJ \u0010O\u001a\b\u0012\u0004\u0012\u00020K0\u00072\b\b\u0001\u00103\u001a\u00020NH§@¢\u0006\u0004\bO\u0010PJ \u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00072\b\b\u0001\u0010Q\u001a\u00020\u0002H§@¢\u0006\u0004\bS\u00101J \u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00072\b\b\u0001\u0010T\u001a\u00020\u0002H§@¢\u0006\u0004\bV\u00101J$\u0010Z\u001a\u00020Y2\b\b\u0001\u0010W\u001a\u00020\u00022\b\b\u0001\u0010X\u001a\u00020\u0002H§@¢\u0006\u0004\bZ\u0010[J \u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00072\b\b\u0001\u0010\\\u001a\u00020\u0002H§@¢\u0006\u0004\b^\u00101J4\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u00072\b\b\u0001\u0010_\u001a\u00020$2\b\b\u0001\u0010`\u001a\u00020$2\b\b\u0001\u0010a\u001a\u00020$H§@¢\u0006\u0004\bc\u0010dJ \u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u00072\b\b\u0001\u0010e\u001a\u00020\u0002H§@¢\u0006\u0004\bg\u00101¨\u0006hÀ\u0006\u0003"}, d2 = {"Lg3z;", "", "", "orderId", "", "usingVerifyCode", "Lct90;", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/sharewin/ShareWinData;", "n", "(Ljava/lang/String;Z)Lct90;", "Lokhttp3/MultipartBody$Part;", "file", "o", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Z)Lct90;", "", "codeList", "Lcom/sporty/android/core/model/recentcode/RecentShareCode;", "q", "(Ljava/util/List;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/recentcode/RecentCodeConfigData;", "h", "(Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto;", "filterVO", "Lzi50;", "Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoDto;", "g", "(Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/bookingcode/TournamentBookingCodeFilterDto;", "filterDto", "j", "(Lcom/sporty/android/core/model/bookingcode/TournamentBookingCodeFilterDto;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/bookingcode/BookingCodeTournamentFilterDto;", "f", "(Lcom/sporty/android/core/model/bookingcode/BookingCodeTournamentFilterDto;Lv1b;)Ljava/lang/Object;", "", "pageNum", "pageSize", "u", "(IILv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "requestSource", "index", "Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodesResponseDto;", "r", "(Ljava/lang/String;IILv1b;)Ljava/lang/Object;", "bookingCode", "l", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/orders/DeleteRealBetHistoryOrdersRequest;", "request", "p", "(Lcom/sporty/android/core/model/orders/DeleteRealBetHistoryOrdersRequest;Lv1b;)Ljava/lang/Object;", "k", "Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckRequestDto;", "Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckResponseDto;", "e", "(Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckRequestDto;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/orders/SOrder;", "s", "isSettled", "lastId", "startTime", "endTime", "", "winningStatus", "Lcom/sporty/android/core/model/orders/BetHistoryOrderList;", "c", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lv1b;)Ljava/lang/Object;", "y", "(ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/orders/BetTicketDetail;", "b", "Lcom/sporty/android/core/model/remixbet/RemixBetRequest;", "Lcom/sporty/android/core/model/remixbet/RemixBetResponse;", "v", "(Lcom/sporty/android/core/model/remixbet/RemixBetRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/remixbet/RemixBetOrderRequest;", "i", "(Lcom/sporty/android/core/model/remixbet/RemixBetOrderRequest;Lv1b;)Ljava/lang/Object;", "originalBookingCode", "Lcom/sporty/android/core/model/bookingcode/SmartRemixEligibilityResponse;", "t", "sportId", "Lcom/sporty/android/core/model/joker/JokerConfigApiModel;", "w", "shareCode", "timezone", "Lokhttp3/ResponseBody;", "d", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "autoBetJson", "Lcom/sporty/android/core/model/autobet/AutoBetResponse;", "z", AnalyticsParam.MINI_GAMES_PAGE, "size", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/autobet/AutoBetListData;", "x", "(IIILv1b;)Ljava/lang/Object;", "settingId", "", "m", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface g3z {
    @sbj("orders/order/realsports/ticketDetail")
    Object b(@db30("orderId") String str, v1b<? super BaseResponse<BetTicketDetail>> v1bVar);

    @sbj("orders/order/v3/realbetlist")
    Object c(@db30("isSettled") Integer num, @db30("pageSize") Integer num2, @db30("lastId") String str, @db30("startTime") String str2, @db30("endTime") String str3, @db30("winningStatus") Set<Integer> set, v1b<? super BaseResponse<BetHistoryOrderList>> v1bVar);

    @s8e0
    @sbj("orders/share/{shareCode}/image/html?template=MX_PARLAY")
    Object d(@dxz("shareCode") String str, @rhl("X-Timezone") String str2, v1b<? super ResponseBody> v1bVar);

    @flz("orders/liability/quick/check")
    @gil({"Content-Type: application/json"})
    Object e(@jh4 QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto, v1b<? super BaseResponse<QuickLiabilityCheckResponseDto>> v1bVar);

    @flz("orders/bookingCode/tournament/filter")
    Object f(@jh4 BookingCodeTournamentFilterDto bookingCodeTournamentFilterDto, v1b<? super zi50<? extends List<BookingCodeInfoDto>>> v1bVar);

    @flz("orders/bookingCode/filter")
    Object g(@jh4 BookingCodeFilterDto bookingCodeFilterDto, v1b<? super zi50<? extends List<BookingCodeInfoDto>>> v1bVar);

    @sbj("orders/config/recentCodes")
    Object h(v1b<? super BaseResponse<RecentCodeConfigData>> v1bVar);

    @flz("orders/bookingCode/remix/order")
    Object i(@jh4 RemixBetOrderRequest remixBetOrderRequest, v1b<? super BaseResponse<RemixBetResponse>> v1bVar);

    @flz("orders/bookingCode/tournament/filter")
    Object j(@jh4 TournamentBookingCodeFilterDto tournamentBookingCodeFilterDto, v1b<? super zi50<? extends List<BookingCodeInfoDto>>> v1bVar);

    @flz("orders/order/deleteOrder/bulk/undo")
    @gil({"Content-Type: application/json"})
    Object k(@jh4 DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest, v1b<? super BaseResponse<Object>> v1bVar);

    @sbj("orders/socialpage/my/sharecode/exist/{bookingCode}")
    @gil({"Content-Type: application/json"})
    Object l(@dxz("bookingCode") String str, v1b<? super BaseResponse<Boolean>> v1bVar);

    @amc("orders/auto-bet/{settingId}")
    @gil({"Content-Type: application/json"})
    Object m(@dxz("settingId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("orders/share/getSharePics")
    ct90<BaseResponse<ShareWinData>> n(@db30("orderId") String orderId, @db30("usingVerifyCode") boolean usingVerifyCode);

    @flz("orders/share/uploadSharePics/{orderId}")
    @jmw
    ct90<BaseResponse<ShareWinData>> o(@dxz("orderId") String orderId, @usz MultipartBody.Part file, @usz("usingVerifyCode") boolean usingVerifyCode);

    @flz("orders/order/deleteOrder/bulk")
    @gil({"Content-Type: application/json"})
    Object p(@jh4 DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest, v1b<? super BaseResponse<Object>> v1bVar);

    @flz("orders/bookingCode/recentCodes")
    Object q(@jh4 List<String> list, v1b<? super BaseResponse<RecentShareCode>> v1bVar);

    @sbj("orders/bookingCode/recommend")
    @gil({"Content-Type: application/json"})
    Object r(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, @db30("requestSource") int i, @db30("index") int i2, v1b<? super BaseResponse<RecommendBookingCodesResponseDto>> v1bVar);

    @sbj("orders/order/sportybetlist")
    Object s(v1b<? super BaseResponse<SOrder>> v1bVar);

    @sbj("orders/bookingCode/smartRemix")
    Object t(@db30("originalBookingCode") String str, v1b<? super BaseResponse<SmartRemixEligibilityResponse>> v1bVar);

    @sbj("orders/bookingCode/featured")
    Object u(@db30("pageNum") int i, @db30("pageSize") int i2, v1b<? super zi50<? extends List<BookingCodeInfoDto>>> v1bVar);

    @flz("orders/bookingCode/remix")
    Object v(@jh4 RemixBetRequest remixBetRequest, v1b<? super BaseResponse<RemixBetResponse>> v1bVar);

    @sbj("orders/joker/config")
    Object w(@db30("sportId") String str, v1b<? super BaseResponse<JokerConfigApiModel>> v1bVar);

    @sbj("orders/auto-bet")
    Object x(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, @db30(AnalyticsParam.EVENT_STATUS) int i3, v1b<? super BaseResponse<AutoBetListData>> v1bVar);

    @sbj("orders/share/shareableorders")
    Object y(@db30("pageSize") int i, @db30("lastId") String str, v1b<? super BaseResponse<BetHistoryOrderList>> v1bVar);

    @flz("orders/auto-bet")
    @gil({"Content-Type: application/json"})
    Object z(@jh4 String str, v1b<? super BaseResponse<AutoBetResponse>> v1bVar);
}

package defpackage;

import com.sporty.android.book.data.entity.BetBuilderRequest;
import com.sporty.android.book.data.entity.CreateNoteOnBetRequest;
import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.data.entity.UserPref;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.Event;
import com.sporty.android.book.domain.entity.FeaturedBetBuilderMarket;
import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.SportEventCount;
import com.sporty.android.book.domain.entity.SportLists;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.BetTypeConfigResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\b2\b\b\u0001\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0019\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0019\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001d\u0010\u001cJ&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\b2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b2\b\b\u0001\u0010\u001f\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00110\bH§@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u001f\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,J \u0010.\u001a\b\u0012\u0004\u0012\u00020*0\b2\b\b\u0001\u0010-\u001a\u00020\u0016H§@¢\u0006\u0004\b.\u0010\u001cJ\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0\bH§@¢\u0006\u0004\b0\u0010)J4\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u001f\u001a\u0002012\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u0016H§@¢\u0006\u0004\b4\u00105J4\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u001f\u001a\u0002012\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u0016H§@¢\u0006\u0004\b6\u00105J*\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u0016H§@¢\u0006\u0004\b7\u00108J&\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00110\b2\b\b\u0001\u00109\u001a\u00020\u0016H§@¢\u0006\u0004\b;\u0010\u001c¨\u0006<À\u0006\u0003"}, d2 = {"Ljkb0;", "", "", "productId", "", "startTime", "endTime", "timeline", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/book/domain/entity/SportLists;", "b", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lv1b;)Ljava/lang/Object;", "todayStartTime", "todayEndTime", "", "outright", "live", "", "Lcom/sporty/android/book/domain/entity/SportEventCount;", "o", "(JJZZLv1b;)Ljava/lang/Object;", "orderByTime", "", "k", "(ZLv1b;)Ljava/lang/Object;", "tournamentId", "", "j", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "e", "Lcom/sporty/android/book/data/entity/RelatedBetRequest;", "data", "Lcom/sporty/android/book/domain/entity/Event;", "h", "(Lcom/sporty/android/book/data/entity/RelatedBetRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/book/data/entity/BetBuilderRequest;", "Lcom/sporty/android/book/domain/entity/BetBuilderData;", "a", "(Lcom/sporty/android/book/data/entity/BetBuilderRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/book/domain/entity/PopoverCategory;", "n", "(Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/book/data/entity/UserPref;", "f", "(Lcom/sporty/android/book/data/entity/UserPref;Lv1b;)Ljava/lang/Object;", "key", "i", "Lcom/sporty/android/core/model/realsports/BetTypeConfigResponse;", "d", "Lcom/sporty/android/book/data/entity/CreateNoteOnBetRequest;", "noteType", "typeId", "g", "(Lcom/sporty/android/book/data/entity/CreateNoteOnBetRequest;ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "c", "m", "(ILjava/lang/String;Lv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lcom/sporty/android/book/domain/entity/FeaturedBetBuilderMarket;", "l", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface jkb0 {
    @flz("factsCenter/betBuilder/odds")
    Object a(@jh4 BetBuilderRequest betBuilderRequest, v1b<? super BaseResponse<BetBuilderData>> v1bVar);

    @sbj("factsCenter/wapPopularAndSportOption/v2")
    Object b(@db30("productId") int i, @db30("startTime") Long l, @db30("endTime") Long l2, @db30("timeline") Long l3, v1b<? super BaseResponse<SportLists>> v1bVar);

    @gmz("orders/notes")
    Object c(@jh4 CreateNoteOnBetRequest createNoteOnBetRequest, @db30("noteType") int i, @db30("typeId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("factsCenter/betType/config")
    Object d(v1b<? super BaseResponse<BetTypeConfigResponse>> v1bVar);

    @amc("patron/preferences/selectedLeagues/{id}")
    Object e(@dxz(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @gmz("patron/preferences")
    Object f(@jh4 UserPref userPref, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("orders/notes")
    Object g(@jh4 CreateNoteOnBetRequest createNoteOnBetRequest, @db30("noteType") int i, @db30("typeId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("factsCenter/v2/relatedBets")
    Object h(@jh4 RelatedBetRequest relatedBetRequest, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @sbj("patron/preferences")
    Object i(@db30("userPrefKey") String str, v1b<? super BaseResponse<UserPref>> v1bVar);

    @gmz("patron/preferences/selectedLeagues/{id}")
    Object j(@dxz(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/preferences/selectedLeagues")
    Object k(@db30("orderByTime") boolean z, v1b<? super BaseResponse<List<String>>> v1bVar);

    @sbj("factsCenter/pcbb/featured")
    Object l(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, v1b<? super BaseResponse<List<FeaturedBetBuilderMarket>>> v1bVar);

    @amc("orders/notes")
    Object m(@db30("noteType") int i, @db30("typeId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/preferences/popover/categories")
    Object n(v1b<? super BaseResponse<List<PopoverCategory>>> v1bVar);

    @sbj("factsCenter/sports/eventSize/v2")
    Object o(@db30("todayStartTime") long j, @db30("todayEndTime") long j2, @db30("outright") boolean z, @db30("live") boolean z2, v1b<? super BaseResponse<List<SportEventCount>>> v1bVar);
}

package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.data.remote.entity.SocShareCode;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import com.sportybet.android.social.data.remote.entity.SocialMetaData;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedCodes;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0015\u0010\u0012J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0017\u0010\nJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0019\u0010\nJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\b\b\u0003\u0010\u001a\u001a\u00020\f2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b \u0010!J,\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010#\u001a\u00020\u0018H§@¢\u0006\u0004\b%\u0010&J<\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0003\u0010'\u001a\u00020\f2\b\b\u0003\u0010\u001a\u001a\u00020\f2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b)\u0010*J<\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0003\u0010'\u001a\u00020\f2\b\b\u0003\u0010\u001a\u001a\u00020\f2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b+\u0010*J:\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0003\u0010'\u001a\u00020\f2\b\b\u0003\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b,\u0010*J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b.\u0010\n¨\u0006/À\u0006\u0003"}, d2 = {"Lx7a0;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/social/data/remote/entity/SocialMetaData;", "f", "(Lv1b;)Ljava/lang/Object;", "", "nickname", "Ljava/lang/Void;", "k", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "h", "", "offset", "pageSize", "", "Lcom/sportybet/android/social/data/remote/entity/SocialFollowData;", "e", "(IILv1b;)Ljava/lang/Object;", "m", "Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "c", "shareCode", "b", "", "a", "size", "cursor", "Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodes;", "i", "(ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "noteOrderId", "j", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "betSlipJson", "throwInvalidEvent", "Lcom/sportybet/android/bookingcode/data/dto/BookingData;", "g", "(Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", AnalyticsParam.MINI_GAMES_PAGE, "nickName", "o", "(IILjava/lang/String;Lv1b;)Ljava/lang/Object;", "d", "l", "bio", "n", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface x7a0 {
    @amc("orders/socialpage/my/sharecode/{shareCode}")
    Object a(@dxz("shareCode") String str, v1b<? super BaseResponse<Boolean>> v1bVar);

    @sbj("orders/socialpage/my/sharecode/{shareCode}")
    Object b(@dxz("shareCode") String str, v1b<? super BaseResponse<SocShareCode>> v1bVar);

    @sbj("orders/socialpage/my/sharecode")
    Object c(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocShareCode>>> v1bVar);

    @sbj("patron/socialpage/leaderboard/winners")
    Object d(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, @db30("nickname") String str, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @sbj("patron/socialpage/my/followers")
    Object e(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @sbj("patron/socialpage/my")
    Object f(v1b<? super BaseResponse<SocialMetaData>> v1bVar);

    @flz("orders/share")
    @gil({"Content-Type: application/json"})
    Object g(@jh4 String str, @db30("throwInvalidEvent") boolean z, v1b<? super BaseResponse<BookingData>> v1bVar);

    @amc("patron/socialpage/my/followings/{nickname}")
    Object h(@dxz("nickname") String str, v1b<? super BaseResponse<Void>> v1bVar);

    @sbj("orders/socialpage/my/suggested")
    Object i(@db30("size") int i, @db30("cursor") String str, v1b<? super BaseResponse<SocialSuggestedCodes>> v1bVar);

    @flz("orders/socialpage/my/sharecode/{shareCode}")
    @gil({"Content-Type: application/json"})
    Object j(@dxz("shareCode") String str, @db30("noteOrderId") String str2, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("patron/socialpage/my/followings/{nickname}")
    Object k(@dxz("nickname") String str, v1b<? super BaseResponse<Void>> v1bVar);

    @sbj("patron/socialpage/nickname/filter")
    Object l(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, @db30("nickname") String str, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @sbj("patron/socialpage/my/followings")
    Object m(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @gmz("patron/account/info/bio")
    @gil({"Content-Type: application/json"})
    Object n(@db30("bio") String str, v1b<? super BaseResponse<Void>> v1bVar);

    @sbj("patron/socialpage/leaderboard/most-active")
    Object o(@db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, @db30("nickname") String str, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);
}

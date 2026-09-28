package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.data.remote.entity.SocShareCode;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import com.sportybet.android.social.data.remote.entity.SocialMetaData;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u000eJ:\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u0011\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0007¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lgbd0;", "", "", "nickname", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/social/data/remote/entity/SocialMetaData;", "c", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "offset", "pageSize", "", "Lcom/sportybet/android/social/data/remote/entity/SocialFollowData;", "e", "(Ljava/lang/String;IILv1b;)Ljava/lang/Object;", "d", "Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "b", "shareCode", "a", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/bookingcode/data/dto/BookingData;", "f", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gbd0 {
    @sbj("orders/socialpage/user/{nickname}/sharecode/{shareCode}")
    Object a(@dxz("nickname") String str, @dxz("shareCode") String str2, v1b<? super BaseResponse<SocShareCode>> v1bVar);

    @sbj("orders/socialpage/user/{nickname}/sharecode")
    Object b(@dxz("nickname") String str, @db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocShareCode>>> v1bVar);

    @sbj("patron/socialpage/user/{nickname}")
    Object c(@dxz("nickname") String str, v1b<? super BaseResponse<SocialMetaData>> v1bVar);

    @sbj("patron/socialpage/user/{nickname}/followings")
    Object d(@dxz("nickname") String str, @db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @sbj("patron/socialpage/user/{nickname}/followers")
    Object e(@dxz("nickname") String str, @db30(AnalyticsParam.MINI_GAMES_PAGE) int i, @db30("size") int i2, v1b<? super BaseResponse<List<SocialFollowData>>> v1bVar);

    @sbj("orders/share/{shareCode}")
    Object f(@dxz("shareCode") String str, v1b<? super BaseResponse<BookingData>> v1bVar);
}

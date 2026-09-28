package defpackage;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.data.NCCategoryStatus;
import com.sportybet.android.data.NCReadMessage;
import com.sportybet.android.data.NCResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JP\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\r\u0010\fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\tH§@¢\u0006\u0004\b\u0013\u0010\u0011J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lren;", "", "", Category.CATEGORY_ID, "first", "", "after", "last", "before", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/data/NCResponse;", "b", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "d", "", "Lcom/sportybet/android/data/NCCategoryStatus;", "f", "(Lv1b;)Ljava/lang/Object;", "", "e", "Lcom/sportybet/android/data/NCReadMessage;", "body", "", "c", "(Lcom/sportybet/android/data/NCReadMessage;Lv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_ID, "a", "(ILv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ren {
    @amc("inbox/v1/message/direct/delete")
    Object a(@db30(AnalyticsParam.EVENT_PARAM_ID) int i, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("inbox/v1/message/broadcast/list")
    @gil({"Content-Type: application/json"})
    Object b(@db30(Category.CATEGORY_ID) int i, @db30("first") Integer num, @db30("after") String str, @db30("last") Integer num2, @db30("before") String str2, v1b<? super BaseResponse<NCResponse>> v1bVar);

    @gmz("inbox/v1/markAllAsRead")
    @gil({"Content-Type: application/json"})
    Object c(@jh4 NCReadMessage nCReadMessage, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("inbox/v1/message/direct/list")
    @gil({"Content-Type: application/json"})
    Object d(@db30(Category.CATEGORY_ID) int i, @db30("first") Integer num, @db30("after") String str, @db30("last") Integer num2, @db30("before") String str2, v1b<? super BaseResponse<NCResponse>> v1bVar);

    @sbj("inbox/v1/hasAnyUnreadMessages")
    @gil({"Content-Type: application/json"})
    Object e(v1b<? super BaseResponse<Boolean>> v1bVar);

    @sbj("inbox/v1/userInfos")
    @gil({"Content-Type: application/json"})
    Object f(v1b<? super BaseResponse<List<NCCategoryStatus>>> v1bVar);
}

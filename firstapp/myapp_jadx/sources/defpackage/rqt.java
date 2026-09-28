package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0005J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lrqt;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Ly15;", "d", "(Lv1b;)Ljava/lang/Object;", "", "country", "Lxxt;", "f", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "owned", "Lzy3;", "a", "(ZLv1b;)Ljava/lang/Object;", "Lkw3;", "b", "", "themeId", "Lzw3;", "c", "(JLv1b;)Ljava/lang/Object;", "e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface rqt {
    @sbj("promotion/v1/loyalty/betslip/themes")
    Object a(@db30("owned") boolean z, v1b<? super BaseResponse<zy3>> v1bVar);

    @sbj("promotion/v1/loyalty/betslip/themes:available")
    Object b(v1b<? super BaseResponse<kw3>> v1bVar);

    @flz("promotion/v1/loyalty/betslip/themes:apply")
    Object c(@db30("themeId") long j, v1b<? super BaseResponse<zw3>> v1bVar);

    @sbj("promotion/v1/boost/gift/effective-scope")
    Object d(v1b<? super BaseResponse<y15>> v1bVar);

    @flz("promotion/v1/loyalty/betslip/themes:unlock")
    Object e(@db30("themeId") long j, v1b<? super BaseResponse<zw3>> v1bVar);

    @sbj("promotion/v2/loyalty/aggregate/public/overview")
    Object f(@db30("country") String str, v1b<? super BaseResponse<xxt>> v1bVar);
}

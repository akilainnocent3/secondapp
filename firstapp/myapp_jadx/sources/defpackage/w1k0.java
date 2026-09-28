package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.loyalty.MissionData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lw1k0;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/loyalty/MissionData;", "b", "(Lv1b;)Ljava/lang/Object;", "Lftz;", "request", "", "c", "(Lftz;Lv1b;)Ljava/lang/Object;", "Lt590;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface w1k0 {
    @flz("patron/auth/token:issueShort")
    Object a(v1b<? super BaseResponse<t590>> v1bVar);

    @sbj("promotion/v1/world-cup-pass/info")
    Object b(v1b<? super BaseResponse<MissionData>> v1bVar);

    @flz("promotion/v1/world-cup-pass/participate")
    Object c(@jh4 ftz ftzVar, v1b<? super BaseResponse<Unit>> v1bVar);
}

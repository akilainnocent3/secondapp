package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.ReachedLimit;
import com.sportybet.repository.limits.model.AppUsageRequest;
import com.sportybet.repository.limits.model.ConsumedLimitsResponse;
import com.sportybet.repository.limits.model.LimitResponse;
import com.sportybet.repository.limits.model.SaveLimitsRequest;
import com.sportybet.repository.limits.model.SaveLimitsResponse;
import com.twilio.voice.Constants;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Ldds;", "", "Lcom/sportybet/repository/limits/model/SaveLimitsRequest;", "request", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/repository/limits/model/SaveLimitsResponse;", "d", "(Lcom/sportybet/repository/limits/model/SaveLimitsRequest;Lv1b;)Ljava/lang/Object;", "", "limitTypeId", "gameTypeIdList", "", "Lcom/sportybet/repository/limits/model/LimitResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/repository/limits/model/AppUsageRequest;", "Lcom/sportybet/repository/limits/model/ConsumedLimitsResponse;", "e", "(Lcom/sportybet/repository/limits/model/AppUsageRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/patron/ReachedLimit;", "a", "(Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface dds {
    @sbj("patron/selfBettingLimit/reachedLimits")
    Object a(v1b<? super BaseResponse<List<ReachedLimit>>> v1bVar);

    @sbj("patron/selfBettingLimit/{limitType}")
    Object b(@dxz("limitType") String str, @db30(encoded = Constants.dev, value = "gameType") String str2, v1b<? super BaseResponse<List<LimitResponse>>> v1bVar);

    @sbj("patron/selfBettingLimit/{limitType}")
    Object c(@dxz("limitType") String str, v1b<? super BaseResponse<List<LimitResponse>>> v1bVar);

    @flz("patron/selfBettingLimit")
    Object d(@jh4 SaveLimitsRequest saveLimitsRequest, v1b<? super BaseResponse<SaveLimitsResponse>> v1bVar);

    @flz("patron/activity")
    Object e(@jh4 AppUsageRequest appUsageRequest, v1b<? super BaseResponse<ConsumedLimitsResponse>> v1bVar);
}

package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.liveoddsboost.OddsBoostLfbConfig;
import com.sportybet.feature.liveoddsboost.OddsBoostRtpRatioResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lbsu;", "", "Lsu5;", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lbcp;", "d", "()Lsu5;", "Lcom/sportybet/plugin/realsports/data/BoostInfo;", "b", "Lcom/sportybet/feature/liveoddsboost/OddsBoostRtpRatioResponse;", "a", "(Lv1b;)Ljava/lang/Object;", "c", "Lcom/sportybet/feature/liveoddsboost/OddsBoostLfbConfig;", "e", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public interface bsu {
    @sbj("marketing/v1/activities/oddsBoost/getOddsBoostLobRtpRatio")
    Object a(v1b<? super BaseResponse<OddsBoostRtpRatioResponse>> v1bVar);

    @sbj("marketing/v1/activities/oddsBoost")
    su5<BaseResponse<BoostInfo>> b();

    @sbj("marketing/v1/activities/oddsBoost/lfb/rtpRatio")
    Object c(v1b<? super BaseResponse<OddsBoostRtpRatioResponse>> v1bVar);

    @sbj("marketing/v1/activities/oddsBoost/getQualify")
    su5<BaseResponse<bcp>> d();

    @sbj("marketing/v1/activities/oddsBoost/lfb/config")
    Object e(v1b<? super BaseResponse<OddsBoostLfbConfig>> v1bVar);
}

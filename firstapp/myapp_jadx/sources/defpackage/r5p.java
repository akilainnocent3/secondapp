package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.PeriodNumber;
import com.sportybet.plugin.realsports.data.BannerElement;
import com.sportybet.plugin.realsports.data.JackpotBet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0006J3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00030\u0002H'¢\u0006\u0004\b\u000f\u0010\u0006J'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000e0\u00030\u0002H'¢\u0006\u0004\b\u001b\u0010\u0006¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lr5p;", "", "Lsu5;", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/data/BannerElement;", "d", "()Lsu5;", "Lcom/sportybet/plugin/jackpot/data/JackpotData;", "a", "", "periodNumber", "periodId", "b", "(Ljava/lang/String;Ljava/lang/String;)Lsu5;", "", "e", AnalyticsParam.EVENT_PARAM_ID, "Lcom/sportybet/plugin/realsports/data/JackpotBet;", "f", "(Ljava/lang/String;)Lsu5;", "", "appJackpotPlugin", "Lcom/sportybet/plugin/jackpot/data/BannerElement;", "g", "(I)Lsu5;", "c", "Lcom/sportybet/plugin/jackpot/data/PeriodNumber;", "h", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface r5p {
    @sbj("jackpot/period")
    su5<BaseResponse<JackpotData>> a();

    @sbj("jackpot/previous")
    su5<BaseResponse<JackpotData>> b(@db30("periodNumber") String periodNumber, @db30("periodId") String periodId);

    @sbj("jackpot/period")
    su5<BaseResponse<JackpotData>> c(@db30("appJackpotPlugin") int appJackpotPlugin);

    @sbj("jackpot/banner")
    su5<BaseResponse<BannerElement>> d();

    @sbj("jackpot/periodNumbers")
    su5<BaseResponse<List<String>>> e();

    @sbj("jackpot/bet")
    su5<BaseResponse<JackpotBet>> f(@db30(AnalyticsParam.EVENT_PARAM_ID) String id);

    @sbj("jackpot/banner")
    su5<BaseResponse<com.sportybet.plugin.jackpot.data.BannerElement>> g(@db30("appJackpotPlugin") int appJackpotPlugin);

    @sbj("jackpot/periodOptions")
    su5<BaseResponse<List<PeriodNumber>>> h();
}

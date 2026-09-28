package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportytv.data.MyProgram;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.data.TvConfig;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004j\u0002`\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\bJ$\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00100\u0004j\u0002`\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\bJ<\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004j\u0004\u0018\u0001`\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lvdd0;", "", "", "timeZone", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/sportytv/data/TvConfig;", "Lcom/sporty/android/sportytv/api/ConfigResult;", "b", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "date", "", "Lcom/sporty/android/sportytv/data/Program;", "Lcom/sporty/android/sportytv/api/ProgramListResult;", "e", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_ID, "Lxdp;", "Lcom/sporty/android/sportytv/api/ModifyNotificationResult;", "a", "d", "flag", "", "size", "Lcom/sporty/android/sportytv/data/MyProgram;", "Lcom/sporty/android/sportytv/api/MyProgramListResult;", "c", "(Ljava/lang/String;Ljava/lang/String;ILv1b;)Ljava/lang/Object;", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface vdd0 {
    @flz("factsCenter/sporty-tv/userFavorite")
    @tti
    Object a(@gjh(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super BaseResponse<xdp>> v1bVar);

    @sbj("factsCenter/sporty-tv/getConfig")
    Object b(@db30("userTimeZone") String str, v1b<? super BaseResponse<TvConfig>> v1bVar);

    @sbj("factsCenter/sporty-tv/userFavorite")
    Object c(@db30("userTimeZone") String str, @db30("flag") String str2, @db30("size") int i, v1b<? super BaseResponse<MyProgram>> v1bVar);

    @amc("factsCenter/sporty-tv/userFavorite")
    Object d(@db30(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super BaseResponse<xdp>> v1bVar);

    @sbj("factsCenter/sporty-tv/getProgramList")
    Object e(@db30("userTimeZone") String str, @db30("date") String str2, v1b<? super BaseResponse<List<Program>>> v1bVar);
}

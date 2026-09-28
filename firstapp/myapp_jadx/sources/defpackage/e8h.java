package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BetBuilderMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface e8h {
    lyh<PopularAndSportData> a();

    lyh<String> b(String str);

    lyh<List<Event>> c(String str);

    lyh d(String str);

    lyh<List<Event>> e(String str, boolean z, boolean z2, List<String> list);

    or60 f(int i, int i2, String str);

    lyh<BaseResponse<List<BetBuilderMarket>>> g(String str);

    lyh h(String str, String str2);

    Object i(String str, x1b x1bVar);

    default d8h j(String str) {
        str.getClass();
        return new d8h(k(str));
    }

    lyh<qus> k(String str);

    Object l(jqa0 jqa0Var, String str, x1b x1bVar);

    lyh m();

    lyh<List<Sport>> n();

    lyh<SportGroup> o(String str);

    lyh<BaseResponse<Event>> p(String str);
}

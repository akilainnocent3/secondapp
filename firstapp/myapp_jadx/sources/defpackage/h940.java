package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.oddsboost.OddsBoostRtpRatioResponse;
import com.sporty.android.core.model.realsports.FeatureLaunchRate;
import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerOddsFilterDto;
import com.sportybet.android.verifybet.apidata.VerifyBetData;
import com.sportybet.plugin.realsports.data.FirstSearchResult;
import com.sportybet.plugin.realsports.data.HotKeywordData;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.data.OutrightEvent;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.SearchData;
import com.sportybet.plugin.realsports.data.SearchRequestData;
import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface h940 {
    lyh<BaseResponse<PreMatchSportsData>> A(String str);

    Object B(x1b x1bVar);

    lyh<BaseResponse<List<HotKeywordData>>> C();

    lyh<BaseResponse<List<FeatureLaunchRate>>> D();

    lyh<BaseResponse<VerifyBetData>> E(String str);

    o940 F();

    Serializable G(int i, ArrayList arrayList, List list, List list2, Long l, Long l2, List list3, List list4, MultiMakerOddsFilterDto multiMakerOddsFilterDto, x1b x1bVar);

    lyh<BaseResponse<TimeFilterEventCountData>> H(String str);

    lyh<BaseResponse<OrderWithFailUpdate>> I(String str);

    Object J(ArrayList arrayList, Collection collection, x1b x1bVar);

    ct90<BaseResponse<OrderWithFailUpdate>> a(String str);

    @fae
    yzh b();

    lyh<BaseResponse<OddsFilterEventCountData>> c(String str);

    ct90<BaseResponse<List<BroadcastConfig>>> d();

    lyh e(QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto);

    lyh<BaseResponse<List<MarketGroupData>>> f(String str, String str2);

    lyh<BaseResponse<SearchData>> g(SearchRequestData searchRequestData);

    lyh<BaseResponse<List<nof>>> h(String str);

    ca40 i(String str);

    ea40 j();

    lyh k(Integer num, String str);

    lyh l(String str, String str2, String str3, String str4);

    r940 m(String str);

    yzh n(int i, String str);

    lyh<BaseResponse<OddsBoostRtpRatioResponse>> o();

    lyh<BaseResponse<FirstSearchResult>> p(String str);

    lyh<RTicket> q(String str);

    ga40 r(String str);

    i940 s(String str, String str2);

    lyh<BaseResponse<List<OutrightEvent>>> t(String str, String str2);

    lyh<lk50<List<String>>> u();

    Object v(QuickMarketSpotEnum quickMarketSpotEnum, String str, ajw ajwVar);

    Object w(String str, int i, Long l, Long l2, x1b x1bVar);

    void x();

    RTicket y();

    aa40 z(String str);
}

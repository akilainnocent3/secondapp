package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilter;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilterRequest;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import com.sportybet.plugin.realsports.data.SwipeBetPreference;
import com.sportybet.plugin.realsports.data.SwipeBetPreferenceRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gtj implements pya {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gtj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pya
    public final void accept(Object obj) {
        String json;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ftj) obj2).invoke(obj);
                break;
            default:
                hle0 hle0Var = (hle0) obj2;
                SwipeBetPreference swipeBetPreference = (SwipeBetPreference) ((BaseResponse) obj).data;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                SwipeBetOddsFilter swipeBetOddsFilter = swipeBetPreference.oddsFilter;
                for (SwipeBetOptions swipeBetOptions : swipeBetPreference.leagueOptions) {
                    if (swipeBetOptions.isPreferred) {
                        arrayList.add(swipeBetOptions.id);
                    }
                }
                for (SwipeBetOptions swipeBetOptions2 : swipeBetPreference.marketOptions) {
                    if (swipeBetOptions2.isPreferred) {
                        arrayList2.add(swipeBetOptions2.id);
                    }
                }
                if (arrayList.isEmpty() && arrayList2.isEmpty() && swipeBetOddsFilter == null) {
                    json = "";
                } else {
                    SwipeBetOddsFilterRequest swipeBetOddsFilterRequestBuild = swipeBetOddsFilter != null ? new SwipeBetOddsFilterRequest.Builder().setMin(swipeBetOddsFilter.minOdds).setMax(swipeBetOddsFilter.maxOdds).setIsMax(swipeBetOddsFilter.isMax).build() : null;
                    SwipeBetPreferenceRequest.Builder markets = new SwipeBetPreferenceRequest.Builder().setLeagues(arrayList).setMarkets(arrayList2);
                    if (swipeBetOddsFilterRequestBuild != null) {
                        markets.setOddsFilter(swipeBetOddsFilterRequestBuild);
                    }
                    json = hle0Var.e.toJson(markets.build());
                }
                if (hle0Var.d.isLogin()) {
                    hle0Var.d(json);
                }
                break;
        }
    }
}

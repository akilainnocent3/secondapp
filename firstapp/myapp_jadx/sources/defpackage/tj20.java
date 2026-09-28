package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class tj20 {
    public final h940 a;
    public final nkb0 b;
    public final uqm c;
    public final mpe0 d;
    public jvd0 e;
    public jvd0 f;
    public jvd0 g;
    public jvd0 h;
    public final LinkedHashMap i;
    public jvd0 j;

    public tj20(h940 h940Var, nkb0 nkb0Var, uqm uqmVar) {
        h940Var.getClass();
        nkb0Var.getClass();
        uqmVar.getClass();
        this.a = h940Var;
        this.b = nkb0Var;
        this.c = uqmVar;
        this.d = hwr.b(new i07(1));
        this.i = new LinkedHashMap();
    }

    public final JsonSerializeService a() {
        return (JsonSerializeService) this.d.getValue();
    }

    public final lyh<BaseResponse<PreMatchSportsData>> b(boolean z, PreMatchEventsRequestBody preMatchEventsRequestBody) {
        PreMatchEventsRequestBody.OddsFilter oddsFilter = preMatchEventsRequestBody.getOddsFilter();
        BigDecimal bigDecimal = oddsFilter != null ? new BigDecimal(oddsFilter.getMin()) : BigDecimal.ZERO;
        PreMatchEventsRequestBody.OddsFilter oddsFilter2 = preMatchEventsRequestBody.getOddsFilter();
        BigDecimal bigDecimal2 = oddsFilter2 != null ? new BigDecimal(oddsFilter2.getMax()) : BigDecimal.ZERO;
        h940 h940Var = this.a;
        if (!z) {
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal3) > 0 && bigDecimal2.compareTo(bigDecimal3) > 0) {
                String json = a().toJson(preMatchEventsRequestBody);
                json.getClass();
                return h940Var.A(json);
            }
        }
        String json2 = a().toJson(preMatchEventsRequestBody);
        json2.getClass();
        return h940Var.n(3, json2);
    }
}

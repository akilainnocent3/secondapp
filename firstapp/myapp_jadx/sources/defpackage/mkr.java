package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mkr {
    public final JsonSerializeService a;

    public mkr(JsonSerializeService jsonSerializeService) {
        jsonSerializeService.getClass();
        this.a = jsonSerializeService;
    }

    public final lkr a(String str) {
        Object bVar;
        JsonSerializeService jsonSerializeService = this.a;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            ikr ikrVar = (ikr) jsonSerializeService.fromJson(new JSONObject(str).getString("data"), ikr.class);
            Object objFromJson = jsonSerializeService.fromJson(ikrVar.getWinningInfo(), (Class<Object>) nkr.class);
            objFromJson.getClass();
            nkr nkrVar = (nkr) objFromJson;
            String orderId = ikrVar.getOrderId();
            String shortId = ikrVar.getShortId();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(ikrVar.getLongTotalWinnings());
            bigDecimalValueOf.getClass();
            rkd0.a aVar2 = rkd0.Companion;
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
            bigDecimalValueOf2.getClass();
            MathContext mathContext = MathContext.DECIMAL64;
            mathContext.getClass();
            BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, mathContext);
            bigDecimalDivide.getClass();
            String currency = ikrVar.getCurrency();
            boolean pushEnable = nkrVar.getPushEnable();
            boolean showOffEnable = nkrVar.getShowOffEnable();
            List<bjr> listC = nkrVar.c();
            ArrayList arrayList = new ArrayList(l48.r(listC, 10));
            for (bjr bjrVar : listC) {
                arrayList.add(new dlr(bjrVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String(), bjrVar.getName()));
            }
            bVar = new lkr(orderId, bigDecimalDivide, shortId, currency, pushEnable, showOffEnable, a4h.f(arrayList));
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar4 = zi50.b;
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (lkr) bVar;
    }
}

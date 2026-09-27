package ep;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b extends c {
    public b(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }

    public static c.a c(JSONObject adRevenueJson) {
        c.a aVar = new c.a(a.IMPRESSION_LEVEL_AD_REVENUE.toString());
        aVar.d("ad_revenue", adRevenueJson);
        return aVar;
    }

    public static c.a d(JSONObject adRevenueJson, String eventId) {
        c.a aVar = new c.a(a.IMPRESSION_LEVEL_AD_REVENUE.toString(), eventId);
        aVar.d("ad_revenue", adRevenueJson);
        return aVar;
    }
}

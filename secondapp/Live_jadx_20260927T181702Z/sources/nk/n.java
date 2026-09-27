package nk;

import fk.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class n implements j {
    public static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean(h.f117426j, true), jSONObject.optBoolean(h.f117427k, false), jSONObject.optBoolean(h.f117428l, false));
    }

    public static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt(h.f117433q, 8), 4);
    }

    public static long d(h0 h0Var, long j10, JSONObject jSONObject) {
        return jSONObject.has(h.f117417a) ? jSONObject.optLong(h.f117417a) : h0Var.a() + (j10 * 1000);
    }

    @Override // nk.j
    public d a(h0 h0Var, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(h.f117419c, 0);
        int iOptInt2 = jSONObject.optInt(h.f117421e, 3600);
        return new d(d(h0Var, iOptInt2, jSONObject), jSONObject.has(h.f117418b) ? c(jSONObject.getJSONObject(h.f117418b)) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble(h.f117422f, 10.0d), jSONObject.optDouble(h.f117423g, 1.2d), jSONObject.optInt(h.f117424h, 60));
    }
}

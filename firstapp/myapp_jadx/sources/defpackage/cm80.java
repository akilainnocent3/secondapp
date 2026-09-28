package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPlugSeon;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cm80 implements xl80 {
    @Override // defpackage.xl80
    public final aj80 a(ls6 ls6Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        aj80.b bVar = jSONObject.has(JsPlugSeon.KEY_SESSION) ? new aj80.b(jSONObject.getJSONObject(JsPlugSeon.KEY_SESSION).optInt("max_custom_exception_events", 8)) : new aj80.b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        aj80.a aVar = new aj80.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new aj80(jCurrentTimeMillis, bVar, aVar, dOptDouble, dOptDouble2, iOptInt2);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo f98688a;

    public yo(Xe xe2, Co co2, String str) {
        this.f98688a = new zo(xe2, co2, new Ao() { // from class: io.appmetrica.analytics.impl.cr
            @Override // io.appmetrica.analytics.impl.Ao
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return yo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC5095hb.a(jSONObject2, "report_request_id", AbstractC5095hb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC5095hb.a(jSONObject2, "open_id", AbstractC5095hb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC5095hb.a(jSONObject2, "attribution_id", AbstractC5095hb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC5095hb.a(jSONObject2, "last_migration_api_level", AbstractC5095hb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j10) {
        zo zoVar = this.f98688a;
        zoVar.a(zoVar.a().put("session_id", j10));
    }

    public final synchronized boolean c() {
        return this.f98688a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f98688a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f98688a.a().optInt("open_id", 1);
    }

    public final synchronized void c(int i10) {
        zo zoVar = this.f98688a;
        zoVar.a(zoVar.a().put("open_id", i10));
    }

    public final synchronized void b(int i10) {
        zo zoVar = this.f98688a;
        zoVar.a(zoVar.a().put("last_migration_api_level", i10));
    }

    public final synchronized int a() {
        return this.f98688a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i10) {
        zo zoVar = this.f98688a;
        zoVar.a(zoVar.a().put("attribution_id", i10));
    }

    public final synchronized void a(long j10) {
        zo zoVar = this.f98688a;
        zoVar.a(zoVar.a().put("external_attribution_window_start", j10));
    }
}

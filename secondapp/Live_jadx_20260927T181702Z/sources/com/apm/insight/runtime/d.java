package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f26229a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f26230b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f26231c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26232d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26233e;

    private d(JSONObject jSONObject, String str) {
        this.f26233e = str;
        a(jSONObject);
        f26229a.put(this.f26233e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f26230b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f26232d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = f26229a.get(str);
        if (dVar != null) {
            return dVar.f26230b;
        }
        return null;
    }

    public static d c(String str) {
        return f26229a.get(str);
    }

    public static long d(String str) {
        d dVar = f26229a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f26230b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f26229a.get(str);
        return (dVar == null || (jSONObject = dVar.f26230b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f26229a.get(str);
        return (dVar == null || (jSONObject = dVar.f26230b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f26229a.get(str);
        return (dVar == null || (jSONObject = dVar.f26230b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f26230b == null) {
            return false;
        }
        return this.f26232d;
    }

    public static boolean a(String str) {
        return f26229a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f26229a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}

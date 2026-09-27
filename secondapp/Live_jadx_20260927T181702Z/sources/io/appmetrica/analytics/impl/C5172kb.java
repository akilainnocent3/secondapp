package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5172kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f97711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f97714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f97716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f97718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f97719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f97720j;

    public C5172kb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f97711a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f97712b = jSONObject2.getString("name");
        this.f97713c = jSONObject2.getInt("bytes_truncated");
        this.f97720j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f97714d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC5095hb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f97714d.put(M3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f97715e = jSONObject3.getString("package_name");
        this.f97716f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f97717g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f97718h = jSONObject4.getString("api_key");
        this.f97719i = a(jSONObject4);
    }

    public final String a() {
        return this.f97718h;
    }

    public final int b() {
        return this.f97713c;
    }

    public final byte[] c() {
        return this.f97711a;
    }

    @Nullable
    public final String d() {
        return this.f97720j;
    }

    public final String e() {
        return this.f97712b;
    }

    public final String f() {
        return this.f97715e;
    }

    public final Integer g() {
        return this.f97716f;
    }

    public final String h() {
        return this.f97717g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f97719i;
    }

    @NonNull
    public final HashMap<M3, Integer> j() {
        return this.f97714d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f97714d.entrySet()) {
            map.put(((M3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f97716f).put("psid", this.f97717g).put("package_name", this.f97715e)).put("reporter_configuration", new JSONObject().put("api_key", this.f97718h).put("reporter_type", this.f97719i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f97711a, 0)).put("name", this.f97712b).put("bytes_truncated", this.f97713c).put("trimmed_fields", AbstractC5095hb.b(map)).putOpt("environment", this.f97720j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C5172kb(@NonNull Q5 q10, @NonNull I3 i10, @Nullable HashMap<M3, Integer> map) {
        this.f97711a = q10.getValueBytes();
        this.f97712b = q10.getName();
        this.f97713c = q10.getBytesTruncated();
        if (map != null) {
            this.f97714d = map;
        } else {
            this.f97714d = new HashMap();
        }
        Cf cfA = i10.a();
        this.f97715e = cfA.e();
        this.f97716f = cfA.f();
        this.f97717g = cfA.g();
        CounterConfiguration counterConfigurationB = i10.b();
        this.f97718h = counterConfigurationB.getApiKey();
        this.f97719i = counterConfigurationB.getReporterType();
        this.f97720j = q10.f();
    }
}

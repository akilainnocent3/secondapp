package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class I0 {
    public static String a(H0 h10) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", h10.f95875a).put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, h10.f95876b).put("reporterType", h10.f95877c.getStringValue()).put("processID", h10.f95878d).put("processSessionID", h10.f95879e).put("errorEnvironment", h10.f95880f).toString().getBytes(cv.g.f77202b), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static H0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), cv.g.f77202b));
            return new H0(jSONObject.getString("apiKey"), jSONObject.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}

package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static String a(y yVar) throws JSONException {
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", yVar.f95509a);
        jSONObject.put("url", yVar.f95511c);
        jSONObject.put("responseCode", yVar.f95513e);
        byte[] bArr = yVar.f95514f;
        try {
            strEncodeToString = new String(bArr, cv.g.f77202b);
        } catch (Throwable unused) {
            strEncodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", strEncodeToString);
        Map map = yVar.f95515g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}

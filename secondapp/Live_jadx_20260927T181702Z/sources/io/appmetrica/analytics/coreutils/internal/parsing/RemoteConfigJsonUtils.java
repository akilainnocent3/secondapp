package io.appmetrica.analytics.coreutils.internal.parsing;

import cs.o;
import cv.g;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RemoteConfigJsonUtils {

    @l
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    @o
    public static final boolean extractFeature(@l JSONObject jSONObject, @l String str, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("features");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                return jSONObjectOptJSONObject2.optBoolean("enabled", z10);
            }
        } catch (Throwable unused) {
        }
        return z10;
    }

    @l
    @o
    public static final byte[][] extractHosts(@l JSONObject jSONObject, @l String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("urls")) == null) {
            return new byte[0][];
        }
        int length = jSONArrayOptJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = jSONArrayOptJSONArray.optString(i10).getBytes(g.f77202b);
        }
        return bArr;
    }

    @o
    public static final long extractMillisFromSecondsOrDefault(@l JSONObject jSONObject, @l String str, long j10) {
        return extractMillisOrDefault(jSONObject, str, TimeUnit.SECONDS, j10);
    }

    @o
    public static final long extractMillisOrDefault(@l JSONObject jSONObject, @l String str, @l TimeUnit timeUnit, long j10) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j10);
    }

    @o
    @m
    public static final String extractQuery(@l JSONObject jSONObject, @l String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("queries");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
                String strOptString = jSONObjectOptJSONObject2.optString("url", "");
                remoteConfigJsonUtils.getClass();
                if (!m0.g(strOptString, "")) {
                    return strOptString;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

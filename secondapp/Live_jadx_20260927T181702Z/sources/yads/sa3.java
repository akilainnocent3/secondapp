package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sa3 {
    public static String a(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || kotlin.jvm.internal.m0.g(strOptString, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        if (strOptString.length() != 0) {
            return strOptString;
        }
        throw new z02("Native Ad json has not required attributes");
    }
}

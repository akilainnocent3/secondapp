package com.bytedance.sdk.component.adexpress.dynamic.hv;

import androidx.lifecycle.v0;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {
    public static void hww(String str, JSONObject jSONObject) {
        JSONObject jSONObjectJy = com.bytedance.sdk.component.adexpress.tq.jy(str);
        if (jSONObjectJy == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectJy.optJSONObject(v0.f13454g);
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        hww(jSONObjectOptJSONObject, jSONObject);
    }

    public static String tq(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.vy.tq()) {
            return hww.hww(str);
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return str2 + "static/images/" + str;
    }

    public static JSONObject hww(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectJy = com.bytedance.sdk.component.adexpress.tq.jy(str);
        if (jSONObjectJy == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return hww(jSONObject2, jSONObjectJy.optJSONObject("themeValues"), jSONObject);
    }

    private static void hww(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject hww(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String hww(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectJy = com.bytedance.sdk.component.adexpress.tq.jy(str);
        if (jSONObjectJy == null || (jSONObjectOptJSONObject = jSONObjectJy.optJSONObject(v0.f13454g)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String hww(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectJy = com.bytedance.sdk.component.adexpress.tq.jy(str);
        if (jSONObjectJy == null || (jSONObjectOptJSONObject = jSONObjectJy.optJSONObject(v0.f13454g)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject hww(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject(v0.f13454g);
    }
}

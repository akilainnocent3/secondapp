package hd;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static bd.a a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str = "";
        boolean z10 = true;
        try {
            if (!jSONObject.has("data") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
                z10 = false;
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
                try {
                    if (jSONObjectOptJSONObject.has("features") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("features")) != null) {
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                                str = strOptString;
                            }
                        }
                    }
                    str = strOptString;
                } catch (Exception e10) {
                    e = e10;
                    str = strOptString;
                    gd.b.b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                }
                z10 = false;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return new bd.a(z10, str);
    }
}

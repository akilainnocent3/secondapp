package hd;

import android.text.TextUtils;
import cd.d;
import org.json.JSONObject;
import yc.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            gd.b.b("%s : empty one dt", "OneDTParser");
            return new c("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new c(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e10) {
            cd.b.a(d.ONE_DT_PARSE_ERROR, e10);
            gd.b.b("%s : failed parse one dt", "OneDTParser");
        }
        return new c("", -1L);
    }
}

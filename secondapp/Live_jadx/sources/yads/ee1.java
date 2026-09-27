package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ee1 {
    public static HashMap a(JSONObject jSONObject) {
        Object obj;
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    map.put(next, a((JSONObject) obj));
                } else {
                    map.put(next, obj);
                }
            }
        }
        return map;
    }
}

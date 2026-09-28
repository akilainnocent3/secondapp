package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class mds {
    public static final /* synthetic */ int a = 0;

    public static JSONObject a(String str, ArrayList arrayList, int i, int i2, long j, long j2, double d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sportId", str);
            jSONObject.put("withOneUpMarket", true);
            jSONObject.put("withTwoUpMarket", true);
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    jSONArray2.put((String) obj);
                }
                jSONArray.put(jSONArray2);
                jSONObject.put("tournamentId", jSONArray);
            }
            if (j > 0) {
                jSONObject.put("startTime", j);
            }
            if (j2 > 0) {
                jSONObject.put("endTime", j2);
            }
            if (d > 0.0d) {
                jSONObject.put("timeline", d);
            }
            jSONObject.put("pageSize", 20);
            if (i > 1) {
                jSONObject.put("lastIndex", i2);
            }
            jSONObject.put("productId", 3);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}

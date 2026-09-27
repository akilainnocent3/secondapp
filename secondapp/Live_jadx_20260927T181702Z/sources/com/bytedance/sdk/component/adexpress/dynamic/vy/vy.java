package com.bytedance.sdk.component.adexpress.dynamic.vy;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    public List<hww> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public String f34270sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public String f34271tq;
    public String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public JSONObject f34272tq;
    }

    public static vy hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        vy vyVar = new vy();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    hww hwwVar = new hww();
                    hwwVar.hww = jSONObjectOptJSONObject.optInt("id");
                    hwwVar.f34272tq = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(hwwVar);
                }
            }
        } catch (JSONException unused) {
        }
        vyVar.hww = arrayList;
        vyVar.f34271tq = jSONObject.optString("diff_data");
        vyVar.f34270sd = jSONObject.optString("style_diff");
        vyVar.vy = jSONObject.optString("tag_diff");
        return vyVar;
    }
}

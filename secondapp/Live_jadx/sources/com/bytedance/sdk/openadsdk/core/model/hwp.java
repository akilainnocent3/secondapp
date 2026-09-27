package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hwp {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private hww f36234hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private JSONObject f36235hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f36236sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36237tq;
    private String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private JSONArray hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private JSONArray f36238sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private JSONArray f36239tq;

        public JSONArray hww() {
            return this.hww;
        }

        public JSONArray sd() {
            return this.f36238sd;
        }

        public JSONArray tq() {
            return this.f36239tq;
        }

        public JSONObject vy() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.hww);
                jSONObject.put("fetch", this.f36239tq);
                jSONObject.put("script", this.f36238sd);
                return jSONObject;
            } catch (JSONException e10) {
                e10.getMessage();
                return jSONObject;
            }
        }

        public void hww(JSONArray jSONArray) {
            this.hww = jSONArray;
        }

        public void sd(JSONArray jSONArray) {
            this.f36238sd = jSONArray;
        }

        public void tq(JSONArray jSONArray) {
            this.f36239tq = jSONArray;
        }

        public static hww hww(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            hww hwwVar = new hww();
            hwwVar.hww(jSONArrayOptJSONArray);
            hwwVar.tq(jSONObject.optJSONArray("fetch"));
            hwwVar.sd(jSONObject.optJSONArray("script"));
            return hwwVar;
        }
    }

    public hww hu() {
        return this.f36234hu;
    }

    public JSONObject hv() {
        return this.f36235hv;
    }

    public String hww() {
        return this.hww;
    }

    public String sd() {
        return this.f36236sd;
    }

    public String tq() {
        return this.f36237tq;
    }

    public JSONObject vgm() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.hww);
            jSONObject.put("md5", this.f36237tq);
            jSONObject.put("url", this.f36236sd);
            jSONObject.put("data", this.vy);
            jSONObject.put("custom_components", this.f36235hv);
            hww hwwVar = this.f36234hu;
            if (hwwVar != null) {
                jSONObject.put("preload", hwwVar.vy());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String vy() {
        return this.vy;
    }

    public static hwp hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hwp hwpVar = new hwp();
        hwpVar.hww = jSONObject.optString("id");
        hwpVar.vy = jSONObject.optString("data");
        hwpVar.f36236sd = jSONObject.optString("url");
        hwpVar.f36237tq = jSONObject.optString("md5");
        hwpVar.f36235hv = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            hwpVar.f36234hu = hww.hww(jSONObjectOptJSONObject);
        }
        return hwpVar;
    }
}

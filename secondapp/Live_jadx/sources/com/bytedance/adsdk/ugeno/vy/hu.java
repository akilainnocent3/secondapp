package com.bytedance.adsdk.ugeno.vy;

import fw.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jv.w0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    private hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<hww> f32748tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private Map<String, Object> f32749hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private Map<String, String> f32750hv;
        private String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f32751sd = "global";

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f32752tq;
        private String vy;

        public String hv() {
            return this.f32752tq;
        }

        public String hww() {
            return this.f32751sd;
        }

        public Map<String, String> sd() {
            return this.f32750hv;
        }

        public String toString() {
            return "Action{scheme='" + this.f32751sd + "', name='" + this.vy + "', params=" + this.f32750hv + ", host='" + this.f32752tq + "', origin='" + this.hww + "', extra=" + this.f32749hu + b.f85383j;
        }

        public String tq() {
            return this.vy;
        }

        public String vy() {
            return this.hww;
        }

        public void hww(String str) {
            this.f32751sd = str;
        }

        public void sd(String str) {
            this.hww = str;
        }

        public void tq(String str) {
            this.vy = str;
        }

        public void vy(String str) {
            this.f32752tq = str;
        }

        public void hww(Map<String, String> map) {
            this.f32750hv = map;
        }

        public void tq(Map<String, Object> map) {
            this.f32749hu = map;
        }
    }

    public hww hww() {
        return this.hww;
    }

    public List<hww> tq() {
        return this.f32748tq;
    }

    public static hu hww(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        hu huVar = new hu();
        String strOptString = jSONObject.optString(w0.f100926d);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        huVar.hww = ny.hww(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            hww hwwVarHww = ny.hww(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (hwwVarHww != null) {
                arrayList.add(hwwVarHww);
            }
        }
        huVar.f32748tq = arrayList;
        return huVar;
    }
}

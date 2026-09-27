package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import fw.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private JSONObject f32423hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f32424hv;
    private JSONObject hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f32425ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f32426rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f32427sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private JSONObject f32428tq;
    private boolean vgm;
    private JSONObject vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private hww f32429hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private LinkedList<hww> f32430hv;
        private String hww;
        private boolean nod;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private String f32431ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private boolean f32432rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private JSONObject f32433sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f32434tq;
        private String vgm;
        private JSONObject vy;

        public JSONObject hu() {
            return this.vy;
        }

        public List<hww> hv() {
            return this.f32430hv;
        }

        public String toString() {
            return "UGNode{id='" + this.hww + "', name='" + this.f32434tq + '\'' + b.f85383j;
        }

        public JSONObject vy() {
            return this.f32433sd;
        }

        public String sd() {
            return this.f32434tq;
        }

        public String tq() {
            return this.vgm;
        }

        public String hww() {
            return this.hww;
        }

        public void tq(boolean z10) {
            this.nod = z10;
        }

        public void hww(String str) {
            this.f32434tq = str;
        }

        public void tq(hww hwwVar) {
            if (this.f32430hv == null) {
                this.f32430hv = new LinkedList<>();
            }
            this.f32430hv.addLast(hwwVar);
        }

        public void hww(boolean z10) {
            this.f32432rs = z10;
        }

        public void hww(hww hwwVar) {
            if (this.f32430hv == null) {
                this.f32430hv = new LinkedList<>();
            }
            this.f32430hv.add(hwwVar);
        }

        public void hww(int i10, hww hwwVar) {
            if (this.f32430hv == null) {
                this.f32430hv = new LinkedList<>();
            }
            this.f32430hv.add(i10, hwwVar);
        }
    }

    public vgm(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private hww hv() {
        if (!vy()) {
            return hww(this.hww, (hww) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.f32425ok;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.f32426rs;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.vy;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        hww hwwVar = new hww();
        hwwVar.f32434tq = "View";
        hwwVar.hww = "virtualNode";
        hwwVar.f32433sd = jSONObject;
        hwwVar.f32429hu = null;
        hwwVar.vgm = this.f32427sd;
        hwwVar.f32431ok = this.f32424hv;
        hwwVar.hww(hww(this.hww, hwwVar));
        return hwwVar;
    }

    public hww hww() {
        return hv();
    }

    public List<hww> sd() {
        if (this.f32428tq == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f32428tq.keys();
        while (itKeys.hasNext()) {
            hww hwwVarHww = hww(this.f32428tq.optJSONObject(itKeys.next()), (hww) null);
            if (hwwVarHww != null) {
                arrayList.add(hwwVarHww);
            }
        }
        return arrayList;
    }

    public String tq() {
        return this.f32427sd;
    }

    public boolean vy() {
        return this.vgm;
    }

    public vgm(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.hww = jSONObject.optJSONObject("body");
            } else {
                this.hww = jSONObject.optJSONObject("main_template");
            }
            this.f32428tq = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.vgm = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.f32427sd = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.f32427sd = "3.0";
                    }
                } else {
                    this.f32427sd = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.f32424hv = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.f32427sd = "3.0";
                this.vgm = true;
            }
            this.vy = jSONObject2;
            this.f32423hu = jSONObject3;
        }
    }

    public static boolean vy(hww hwwVar) {
        return (hwwVar == null || hwwVar.f32433sd == null) ? false : true;
    }

    public void hww(float f10, float f11) {
        this.f32425ok = f10;
        this.f32426rs = f11;
    }

    public boolean tq(hww hwwVar) {
        JSONObject jSONObjectVy;
        if (hwwVar == null || (jSONObjectVy = hwwVar.vy()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectVy.optString("height"), "match_parent");
    }

    private hww hww(JSONObject jSONObject, hww hwwVar) {
        String strOptString;
        String strOptString2;
        hww hwwVarHww;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString("name");
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        hww hwwVar2 = new hww();
        hwwVar2.hww = strOptString3;
        if (!this.vgm || !TextUtils.equals("Video", strOptString)) {
            hwwVar2.f32434tq = strOptString;
        } else {
            hwwVar2.f32434tq = strOptString + "V3";
        }
        hwwVar2.f32433sd = jSONObject2;
        hwwVar2.f32429hu = hwwVar;
        hwwVar2.vgm = this.f32427sd;
        hwwVar2.f32431ok = this.f32424hv;
        if (jSONObject2.has("i18n")) {
            hwwVar2.vy = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            hww(jSONObject, hwwVar2.f32433sd);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strHww = com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObjectOptJSONObject.optString("id"), this.vy);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.f32428tq;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strHww);
                        hwwVarHww = hww(jSONObjectOptJSONObject, hwwVar2);
                    } else {
                        hwwVarHww = null;
                    }
                } else {
                    hwwVarHww = hww(jSONObjectOptJSONObject, hwwVar2);
                }
                if (hwwVarHww != null) {
                    hwwVarHww.tq(tq(hwwVarHww));
                    hwwVarHww.hww(hww(hwwVarHww));
                }
                if (sd(hwwVarHww)) {
                    i10++;
                    hwwVar2.tq(hwwVarHww);
                } else if (hwwVarHww != null) {
                    hwwVar2.hww(i11 - i10, hwwVarHww);
                }
            }
        }
        return hwwVar2;
    }

    public boolean sd(hww hwwVar) {
        JSONObject jSONObjectVy;
        if (hwwVar == null || (jSONObjectVy = hwwVar.vy()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectVy.optString(C4235d4.i.L), "absolute");
    }

    public boolean hww(hww hwwVar) {
        JSONObject jSONObjectVy;
        if (hwwVar == null || (jSONObjectVy = hwwVar.vy()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectVy.optString("width"), "match_parent");
    }

    private void hww(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f32423hu == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.f32423hu.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.vgm.tq.hww(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}

package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class grv {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f36210ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36211hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f36212hv;
    private int hww;
    private hwp jpb;
    private int khx;
    private tq mrs;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private JSONObject f36213ny;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f36215rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36216sd;
    private JSONObject vgm;
    private boolean vhb;
    private int vy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36217tq = 10;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f36214ok = 1;
    private hww nod = new hww();
    private int weu = 1;
    private String wgt = "Next Ad";

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f36209bs = "Next ad in %1$ds";

    public static grv hww(String str) {
        grv grvVar = new grv();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                grvVar.hww = jSONObject.optInt("auto_switch");
                grvVar.f36217tq = jSONObject.optInt("playable_preload_count");
                grvVar.f36216sd = jSONObject.optInt("disable_on_interaction");
                grvVar.vy = jSONObject.optInt("ceiling_type");
                grvVar.f36212hv = jSONObject.optInt("can_loop");
                grvVar.f36211hu = jSONObject.optInt("multi_skip_time", -1);
                grvVar.f36214ok = jSONObject.optInt("load_more_strategy");
                grvVar.weu = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                grvVar.vgm = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    hwp hwpVarHww = hwp.hww(jSONObjectOptJSONObject);
                    grvVar.jpb = hwpVarHww;
                    if (hwpVarHww != null && !TextUtils.isEmpty(hwpVarHww.sd())) {
                        com.bytedance.sdk.openadsdk.core.vhb.hww.tq.hww().hww(new com.bytedance.sdk.openadsdk.core.vhb.ok.hww().hww(grvVar.jpb.hww()).tq(grvVar.jpb.tq()).sd(grvVar.jpb.sd()).vy(grvVar.jpb.vy()), "guide");
                    }
                    int iOptInt = grvVar.vgm.optInt("delay_show_time", 5);
                    grvVar.f36210ed = iOptInt;
                    if (iOptInt < 0) {
                        grvVar.f36210ed = 5;
                    }
                    int iOptInt2 = grvVar.vgm.optInt("dismiss_after_idle_time", 3);
                    grvVar.khx = iOptInt2;
                    if (iOptInt2 <= 0) {
                        grvVar.khx = 3;
                    }
                }
                grvVar.f36215rs = jSONObject.optString("agg_endcard_url");
                grvVar.vhb = jSONObject.optBoolean("has_more");
                grvVar.f36213ny = jSONObject.optJSONObject("session_params");
                grvVar.nod = hww.hww(jSONObject.optJSONObject("layout_config"));
                grvVar.mrs = tq.hww(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return grvVar;
    }

    public tq bs() {
        return this.mrs;
    }

    public boolean ed() {
        return this.vhb;
    }

    public hww hu() {
        return this.nod;
    }

    public int hv() {
        return this.khx;
    }

    public JSONObject jpb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.hww);
            jSONObject.put("playable_preload_count", this.f36217tq);
            jSONObject.put("disable_on_interaction", this.f36216sd);
            jSONObject.put("ceiling_type", this.vy);
            jSONObject.put("can_loop", this.f36212hv);
            jSONObject.put("multi_skip_time", this.f36211hu);
            jSONObject.put("load_more_strategy", this.f36214ok);
            jSONObject.put("report_show_by_percent", this.weu);
            jSONObject.put("gesture_tpl_info", this.vgm);
            jSONObject.put("agg_endcard_url", this.f36215rs);
            jSONObject.put("layoutConfig", this.nod.hu());
            jSONObject.put("has_more", this.vhb);
            jSONObject.put("session_params", this.f36213ny);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean khx() {
        return this.f36216sd == 1;
    }

    public boolean nod() {
        return this.f36212hv == 1;
    }

    public JSONObject ny() {
        return this.f36213ny;
    }

    public int ok() {
        return this.f36214ok;
    }

    public int rs() {
        return this.f36211hu;
    }

    public JSONObject sd() {
        hwp hwpVar = this.jpb;
        if (hwpVar == null) {
            return null;
        }
        return hwpVar.hv();
    }

    public JSONObject tq() {
        hwp hwpVar = this.jpb;
        if (hwpVar == null) {
            return null;
        }
        try {
            String strVy = hwpVar.vy();
            if (!TextUtils.isEmpty(strVy)) {
                return new JSONObject(strVy);
            }
            String strHww = com.bytedance.sdk.openadsdk.core.vhb.hww.tq.hww().hww("guide", this.jpb.hww(), this.jpb.tq());
            if (TextUtils.isEmpty(strHww)) {
                return null;
            }
            return new JSONObject(strHww);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String vgm() {
        return this.f36215rs;
    }

    public boolean vhb() {
        return this.vy == 1;
    }

    public int vy() {
        return this.f36210ed;
    }

    public boolean weu() {
        return this.hww == 1;
    }

    public int wgt() {
        return this.f36217tq;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private int f36218hv;
        private int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private int f36219sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private int f36220tq;
        private int vy;

        public static hww hww(JSONObject jSONObject) {
            hww hwwVar = new hww();
            if (jSONObject == null) {
                return hwwVar;
            }
            hwwVar.hww = Math.max(0, jSONObject.optInt("padding_left", 0));
            hwwVar.f36220tq = Math.max(0, jSONObject.optInt("padding_right", 0));
            hwwVar.f36219sd = Math.max(0, jSONObject.optInt("padding_top", 0));
            hwwVar.vy = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            hwwVar.f36218hv = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return hwwVar;
        }

        public JSONObject hu() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.hww);
                jSONObject.put("padding_right", this.f36220tq);
                jSONObject.put("padding_top", this.f36219sd);
                jSONObject.put("padding_bottom", this.vy);
                jSONObject.put("card_spacing", this.f36218hv);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int hv() {
            return this.f36218hv;
        }

        public int sd() {
            return this.hww;
        }

        public int tq() {
            return this.f36219sd;
        }

        public int vy() {
            return this.f36220tq;
        }

        public int hww() {
            return this.vy;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private float f36221hv;
        private int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f36222sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f36223tq;
        private float vy;

        public static tq hww(JSONObject jSONObject) {
            tq tqVar = new tq();
            if (jSONObject == null) {
                return tqVar;
            }
            tqVar.hww = jSONObject.optInt("progress_type", 0);
            tqVar.f36223tq = jSONObject.optString("progress_color");
            tqVar.f36222sd = jSONObject.optString("progress_background_color");
            tqVar.vy = jSONObject.optInt("progress_size", 0);
            tqVar.f36221hv = jSONObject.optInt("bar_radius", 0);
            return tqVar;
        }

        public float hv() {
            return this.f36221hv;
        }

        public String sd() {
            return this.f36222sd;
        }

        public String tq() {
            return this.f36223tq;
        }

        public float vy() {
            return this.vy;
        }

        public int hww() {
            return this.hww;
        }
    }

    public boolean hww() {
        return this.weu == 1;
    }
}

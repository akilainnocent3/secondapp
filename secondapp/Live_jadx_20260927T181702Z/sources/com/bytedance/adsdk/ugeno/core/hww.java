package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.v0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yb.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f32367hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f32368hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<C0298hww> f32369sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f32370tq;
    private long vy;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0298hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private float f32371hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private String f32372hv;
        private long hww;
        private String nod;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private float[] f32373ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private String f32374rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f32375sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private float f32376tq;
        private float vgm;
        private long vy;

        public float hu() {
            return this.f32371hu;
        }

        public String hv() {
            return this.f32372hv;
        }

        public long hww() {
            return this.hww;
        }

        public String nod() {
            return this.nod;
        }

        public float[] ok() {
            return this.f32373ok;
        }

        public String rs() {
            return this.f32374rs;
        }

        public String sd() {
            return this.f32375sd;
        }

        public float tq() {
            return this.f32376tq;
        }

        public float vgm() {
            return this.vgm;
        }

        public long vy() {
            return this.vy;
        }

        public void hww(long j10) {
            this.hww = j10;
        }

        public void sd(float f10) {
            this.vgm = f10;
        }

        public void tq(long j10) {
            this.vy = j10;
        }

        public void vy(String str) {
            this.f32374rs = str;
        }

        public void hww(float f10) {
            this.f32376tq = f10;
        }

        public void sd(String str) {
            this.nod = str;
        }

        public void tq(String str) {
            this.f32372hv = str;
        }

        public void hww(String str) {
            this.f32375sd = str;
        }

        public void tq(float f10) {
            this.f32371hu = f10;
        }

        public void hww(float[] fArr) {
            this.f32373ok = fArr;
        }

        public static C0298hww hww(JSONObject jSONObject, com.bytedance.adsdk.ugeno.tq.sd sdVar) {
            if (jSONObject == null) {
                return null;
            }
            C0298hww c0298hww = new C0298hww();
            c0298hww.hww(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0298hww.hww(-1.0f);
            } else {
                try {
                    c0298hww.hww(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0298hww.hww(0.0f);
                }
            }
            c0298hww.hww(jSONObject.optString("loopMode"));
            c0298hww.tq(jSONObject.optString("type"));
            if (TextUtils.equals(c0298hww.hv(), "ripple")) {
                c0298hww.sd(jSONObject.optString("rippleColor"));
            }
            View viewVhb = sdVar.vhb();
            Context context = viewVhb != null ? viewVhb.getContext() : null;
            if (TextUtils.equals(c0298hww.hv(), "backgroundColor")) {
                String strHww = com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("valueTo"), sdVar.ny());
                int iHww = com.bytedance.adsdk.ugeno.vgm.hww.hww(jSONObject.optString("valueFrom"));
                int iHww2 = com.bytedance.adsdk.ugeno.vgm.hww.hww(strHww);
                c0298hww.tq(iHww);
                c0298hww.sd(iHww2);
            } else if ((TextUtils.equals(c0298hww.hv(), "translateX") || TextUtils.equals(c0298hww.hv(), "translateY")) && context != null) {
                try {
                    float fHww = com.bytedance.adsdk.ugeno.vgm.ok.hww(context, (float) jSONObject.optDouble("valueFrom"));
                    float fHww2 = com.bytedance.adsdk.ugeno.vgm.ok.hww(context, (float) jSONObject.optDouble("valueTo"));
                    c0298hww.tq(fHww);
                    c0298hww.sd(fHww2);
                } catch (Exception unused2) {
                    Log.e(a.f159123h, "animation ");
                }
            } else {
                c0298hww.tq((float) jSONObject.optDouble("valueFrom"));
                c0298hww.sd((float) jSONObject.optDouble("valueTo"));
            }
            c0298hww.vy(jSONObject.optString("interpolator"));
            String strHww2 = com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("startDelay"), sdVar.ny());
            Log.d("TAG", "createAnimationModel: ");
            c0298hww.tq(com.bytedance.adsdk.ugeno.vgm.sd.hww(strHww2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(v0.f13454g);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0298hww.hv(), "translateX") || TextUtils.equals(c0298hww.hv(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.vgm.ok.hww(context, (float) hww.hww(jSONArrayOptJSONArray.optString(i10), sdVar.ny()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) hww.hww(jSONArrayOptJSONArray.optString(i10), sdVar.ny());
                        i10++;
                    }
                }
                c0298hww.hww(fArr);
            }
            return c0298hww;
        }
    }

    public String hu() {
        return this.f32367hu;
    }

    public long hv() {
        return this.f32368hv;
    }

    public String hww() {
        return this.hww;
    }

    public List<C0298hww> sd() {
        return this.f32369sd;
    }

    public float tq() {
        return this.f32370tq;
    }

    public long vy() {
        return this.vy;
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void tq(long j10) {
        this.f32368hv = j10;
    }

    public void hww(float f10) {
        this.f32370tq = f10;
    }

    public void tq(String str) {
        this.f32367hu = str;
    }

    public void hww(List<C0298hww> list) {
        this.f32369sd = list;
    }

    public void hww(long j10) {
        this.vy = j10;
    }

    public static hww hww(String str, com.bytedance.adsdk.ugeno.tq.sd sdVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return hww(new JSONObject(str), sdVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static hww hww(JSONObject jSONObject, com.bytedance.adsdk.ugeno.tq.sd sdVar) {
        return hww(jSONObject, null, sdVar);
    }

    public static hww hww(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.tq.sd sdVar) {
        if (jSONObject == null) {
            return null;
        }
        hww hwwVar = new hww();
        hwwVar.hww(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            hwwVar.hww(-1.0f);
        } else {
            try {
                hwwVar.hww(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                hwwVar.hww(0.0f);
            }
        }
        hwwVar.hww(jSONObject.optLong("duration", 0L));
        hwwVar.tq(com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("startDelay"), sdVar.ny()), 0L));
        hwwVar.tq(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.vgm.tq.hww(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0298hww.hww(jSONObjectOptJSONObject, sdVar));
            }
            hwwVar.hww(arrayList);
        }
        return hwwVar;
    }

    public static double hww(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}

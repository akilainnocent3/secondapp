package com.bytedance.sdk.component.adexpress.dynamic.hv;

import android.text.TextUtils;
import androidx.lifecycle.v0;
import androidx.media3.session.fe;
import com.bytedance.sdk.component.adexpress.tq.ed;
import com.google.android.gms.cast.MediaTrack;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    private static HashMap<String, String> vgm;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.vy.vy f34070hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private sd f34071hv;
    private JSONObject hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.vy.sd f34072sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private JSONObject f34073tq;
    private hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        float hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        boolean f34074sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        float f34075tq;

        public static hww hww(JSONObject jSONObject) {
            hww hwwVar = new hww();
            if (jSONObject != null) {
                hwwVar.hww = (float) jSONObject.optDouble("width");
                hwwVar.f34075tq = (float) jSONObject.optDouble("height");
                hwwVar.f34074sd = jSONObject.optBoolean("isLandscape");
            }
            return hwwVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        vgm = map;
        map.put(MediaTrack.ROLE_SUBTITLE, "description");
        vgm.put("source", "source|app.app_name");
        vgm.put("screenshot", "dynamic_creative.screenshot");
    }

    public hu(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.hww = jSONObject;
        this.f34073tq = jSONObject2;
        this.f34072sd = new com.bytedance.sdk.component.adexpress.dynamic.vy.sd(jSONObject2);
        this.vy = hww.hww(jSONObject3);
        this.f34070hu = com.bytedance.sdk.component.adexpress.dynamic.vy.vy.hww(jSONObject4);
    }

    private void tq(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        com.bytedance.sdk.component.adexpress.dynamic.vy.sd sdVar;
        Object objHww;
        Object objHww2;
        Object objHww3;
        Object objHww4;
        if (okVar == null || (sdVar = this.f34072sd) == null || (objHww = sdVar.hww("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objHww);
        if (TextUtils.isEmpty(strValueOf) || (objHww2 = this.f34072sd.hww("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objHww2);
        if (TextUtils.isEmpty(strValueOf2) || (objHww3 = this.f34072sd.hww("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objHww3);
        if (TextUtils.isEmpty(strValueOf3) || (objHww4 = this.f34072sd.hww("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objHww4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objHww5 = this.f34072sd.hww("app.app_name");
        Object objHww6 = this.f34072sd.hww("source");
        if (objHww5 == null && objHww6 == null) {
            return;
        }
        if (objHww5 == null) {
            objHww5 = objHww6;
        }
        String strValueOf5 = String.valueOf(objHww5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        okVar.hww("imageUrl", strValueOf);
        okVar.hww("title", strValueOf2);
        okVar.hww("description", strValueOf3);
        okVar.hww("icon", strValueOf4);
        okVar.hww("app_name", strValueOf5);
        okVar.hww(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vy.ok hww(double d10, int i10, double d11, String str, ed edVar) {
        JSONObject jSONObject;
        this.f34072sd.hww();
        try {
            jSONObject = new JSONObject(this.f34070hu.f34271tq);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVarHww = hww(vy.hww(this.hww, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.vy.ok) null);
        hww(okVarHww);
        hv hvVar = new hv(d10, i10, d11, str, edVar);
        hv.hww hwwVar = new hv.hww();
        hww hwwVar2 = this.vy;
        hwwVar.hww = hwwVar2.hww;
        hwwVar.f34079tq = hwwVar2.f34075tq;
        hwwVar.f34078sd = 0.0f;
        hvVar.hww(hwwVar);
        hvVar.hww(okVarHww, 0.0f, 0.0f);
        hvVar.hww();
        com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar = hvVar.hww;
        if (tqVar.vy == 65536.0f) {
            return null;
        }
        return tqVar.f34260hu;
    }

    private void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        int iHww;
        if (okVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() != null) {
            iHww = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().weu();
        } else {
            iHww = com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww());
        }
        int iTq = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), iHww);
        hww hwwVar = this.vy;
        float fMin = hwwVar.f34074sd ? hwwVar.hww : Math.min(hwwVar.hww, iTq);
        if (this.vy.f34075tq == 0.0f) {
            okVar.hv(fMin);
            okVar.nod().hv().nod("auto");
            okVar.hu(0.0f);
        } else {
            okVar.hv(fMin);
            int iTq2 = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww()));
            hww hwwVar2 = this.vy;
            okVar.hu(hwwVar2.f34074sd ? hwwVar2.f34075tq : Math.min(hwwVar2.f34075tq, iTq2));
            okVar.nod().hv().nod("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vy.ok hww(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.f34070hu != null) {
                sd sdVar = new sd();
                this.f34071hv = sdVar;
                JSONObject jSONObjectHww = sdVar.hww(this.f34070hu.hww, iOptInt, jSONObject);
                if (jSONObjectHww != null) {
                    jSONObject = jSONObjectHww;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVarHww = hww(jSONObject);
        okVarHww.hww(okVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            okVarHww.hww((List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>) null);
            return okVarHww;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i10);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = okVarHww.nod().hv().ece();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVarHww2 = hww(jSONArrayOptJSONArray2.optJSONObject(i11), okVarHww);
                    if (com.bytedance.sdk.component.adexpress.vy.tq() && "skip-with-time".equals(okVarHww.nod().tq()) && !C4235d4.i.T.equals(okVarHww.kub()) && !TextUtils.isEmpty(okVarHww.kub())) {
                        okVarHww2.sd(okVarHww.kub());
                    }
                    arrayList.add(okVarHww2);
                    arrayList3.add(okVarHww2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            okVarHww.hww(arrayList);
        }
        if (arrayList2.size() > 0) {
            okVarHww.tq(arrayList2);
        }
        return okVarHww;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vy.ok hww(JSONObject jSONObject) {
        String strHww;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(v0.f13454g);
        rs.hww(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectHww = rs.hww(strOptString, rs.hww(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar = new com.bytedance.sdk.component.adexpress.dynamic.vy.ok();
        if (TextUtils.isEmpty(strOptString2)) {
            okVar.tq(String.valueOf(okVar.hashCode()));
        } else {
            okVar.tq(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            tq(okVar);
            okVar.sd((float) jSONObjectOptJSONObject.optDouble("x"));
            okVar.vy((float) jSONObjectOptJSONObject.optDouble("y"));
            okVar.hv((float) jSONObjectOptJSONObject.optDouble("width"));
            okVar.hu((float) jSONObjectOptJSONObject.optDouble("height"));
            okVar.vgm(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.vy.hv hvVar = new com.bytedance.sdk.component.adexpress.dynamic.vy.hv();
            hvVar.hww(strOptString);
            hvVar.tq(jSONObjectOptJSONObject.optString("data"));
            hvVar.sd(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHww = com.bytedance.sdk.component.adexpress.dynamic.vy.hu.hww(jSONObjectOptJSONObject);
            hvVar.hww(huVarHww);
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHww2 = com.bytedance.sdk.component.adexpress.dynamic.vy.hu.hww(jSONObjectHww);
            if (huVarHww2 == null) {
                hvVar.tq(huVarHww);
            } else {
                hvVar.tq(huVarHww2);
            }
            hww(huVarHww);
            hww(huVarHww2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.f34073tq) != null) {
                hww(hvVar, jSONObject2.optInt("image_mode"));
            }
            String strTq = hvVar.tq();
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = hvVar.hv();
            if (vgm.containsKey(strTq) && !huVarHv.xe()) {
                huVarHv.omn(vgm.get(strTq));
            }
            if (huVarHv.xe()) {
                strHww = hvVar.sd();
            } else {
                strHww = hww(hvVar.sd());
            }
            if (com.bytedance.sdk.component.adexpress.vy.tq()) {
                if (TextUtils.equals(strTq, "star") || TextUtils.equals(strTq, "text_star")) {
                    strHww = hww("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strTq, "score-count") || TextUtils.equals(strTq, "score-count-type-1") || TextUtils.equals(strTq, "score-count-type-2")) {
                    strHww = hww("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strTq) && huVarHww.tdy()) {
                    strHww = hww("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(hww()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                hvVar.tq(strHww + "adx:" + hww());
            } else {
                hvVar.tq(strHww);
            }
            okVar.hww(hvVar);
        }
        return okVar;
    }

    private void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.hv hvVar, int i10) {
        int iLastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            hvVar.hww("image");
            String strHww = rs.hww("image");
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = hvVar.hv();
            huVarHv.omn(strHww);
            hvVar.vgm().omn(strHww);
            String strHww2 = rs.hww("image", "clickArea");
            if (!TextUtils.isEmpty(strHww2)) {
                huVarHv.weu(strHww2);
                hvVar.vgm().weu(strHww2);
            }
            JSONObject jSONObjectYk = huVarHv.yk();
            if (jSONObjectYk != null) {
                huVarHv.kub(jSONObjectYk.optString("imageLottieTosPath"));
                huVarHv.ny(jSONObjectYk.optBoolean("animationsLoop"));
                huVarHv.aed(jSONObjectYk.optInt("lottieAppNameMaxLength"));
                huVarHv.mw(jSONObjectYk.optInt("lottieAdDescMaxLength"));
                huVarHv.zvy(jSONObjectYk.optInt("lottieAdTitleMaxLength"));
            }
            hvVar.tq(strHww);
            if (strHww != null && (iLastIndexOf = strHww.lastIndexOf(fe.F)) > 0) {
                String strSubstring = strHww.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", hww(strSubstring + ".width"));
                    jSONObject.put("height", hww(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                hvVar.sd(jSONObject.toString());
            }
            huVarHv.vc();
            return;
        }
        hvVar.hww("video");
        String strHww3 = rs.hww("video");
        hvVar.hv().omn(strHww3);
        String strHww4 = rs.hww("video", "clickArea");
        if (!TextUtils.isEmpty(strHww4)) {
            hvVar.hv().weu(strHww4);
            hvVar.vgm().weu(strHww4);
        }
        hvVar.vgm().omn(strHww3);
        hvVar.tq(strHww3);
        hvVar.hv().kq();
    }

    private String hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f34072sd.tq(str2)) {
                String strValueOf = String.valueOf(this.f34072sd.hww(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String hww() {
        Object objHww;
        com.bytedance.sdk.component.adexpress.dynamic.vy.sd sdVar = this.f34072sd;
        return (sdVar == null || (objHww = sdVar.hww("adx_name")) == null) ? "" : String.valueOf(objHww);
    }

    private void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVar) {
        if (huVar == null) {
            return;
        }
        String strZa = huVar.za();
        if (com.bytedance.sdk.component.adexpress.vy.tq()) {
            String strSd = com.bytedance.sdk.component.adexpress.vy.vgm.sd(com.bytedance.sdk.component.adexpress.vy.hww());
            if ("zh".equals(strSd)) {
                strSd = "cn";
            }
            if (!TextUtils.isEmpty(strSd) && huVar.hu() != null) {
                String strOptString = huVar.hu().optString(strSd);
                if (!TextUtils.isEmpty(strOptString)) {
                    strZa = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strZa)) {
            return;
        }
        int iIndexOf = strZa.indexOf("{{");
        int iIndexOf2 = strZa.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strHww = hww(strZa.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(strZa.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strHww)) {
                sb2.append(strHww);
            }
            sb2.append(strZa.substring(iIndexOf2 + 2));
            huVar.ny(sb2.toString());
            return;
        }
        huVar.ny(strZa);
    }
}

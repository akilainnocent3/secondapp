package com.bytedance.sdk.openadsdk.core.rs.hww;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.hwp;
import com.bytedance.sdk.openadsdk.core.model.jpb;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.model.mrs;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.core.vhb.vgm.sd;
import com.bytedance.sdk.openadsdk.core.yt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static String hww = "https://pag_open_icon_id/appicon.png";

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static String f36661tq = "";

    public static String hww() {
        return f36661tq;
    }

    public static boolean sd() {
        return true;
    }

    public static JSONObject tq() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", ny.tq());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            yt.tq(jSONObject3);
            jSONObject3.put(Q6.H, "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            omn.sd("TemplateUtils", e10.getMessage());
            return jSONObject;
        }
    }

    public static JSONObject hww(float f10, float f11, boolean z10, @NonNull kub kubVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.H, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", hww(false, kubVar));
            jSONObject.put("template_Plugin", tq(kubVar.alz()));
            jSONObject.put("diff_template_Plugin", hww(kubVar.alz()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject sd(kub kubVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            yt.hww(jSONObject, kubVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String tq(kub.hww hwwVar) {
        com.bytedance.sdk.component.adexpress.hww.sd.tq tqVarSd;
        if (hwwVar != null) {
            String strVgm = hwwVar.vgm();
            return (!TextUtils.isEmpty(strVgm) || (tqVarSd = com.bytedance.sdk.component.adexpress.hww.tq.tq.sd(hwwVar.vy())) == null) ? strVgm : tqVarSd.hv();
        }
        return "";
    }

    public static JSONObject hww(kub kubVar) {
        return hww(kubVar, false, (JSONObject) null);
    }

    public static JSONObject hww(kub kubVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObjectHww = null;
        if (kubVar == null) {
            return null;
        }
        try {
            jSONObjectHww = hww(kubVar, false, z10);
            if (jSONObjectHww == null) {
                jSONObjectHww = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            yt.tq(jSONObject2);
            jSONObject2.put(Q6.H, "android");
            jSONObjectHww.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectHww.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectTq = yt.tq(kubVar);
            jSONObjectTq.put("language", ny.tq());
            jSONObjectHww.put("xSetting", jSONObjectTq);
            return jSONObjectHww;
        } catch (Throwable th2) {
            th2.getMessage();
            return jSONObjectHww;
        }
    }

    public static Map<String, String> tq(kub kubVar) {
        HashMap map = null;
        if (kubVar == null) {
            return null;
        }
        List<jpb> listFr = kubVar.fr();
        if (listFr != null && listFr.size() > 0) {
            map = new HashMap();
            for (jpb jpbVar : listFr) {
                if (jpbVar != null) {
                    map.put(jpbVar.hww(), jpbVar.vgm());
                }
            }
            jpb jpbVarVc = kubVar.vc();
            if (jpbVarVc != null) {
                map.put(jpbVarVc.hww(), jpbVarVc.vgm());
            }
        }
        return map;
    }

    private static JSONObject hww(kub kubVar, boolean z10, boolean z11) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (kubVar != null) {
            try {
                String strGs = kubVar.gs();
                if (strGs != null) {
                    JSONObject jSONObject2 = new JSONObject(strGs);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z10 && !z11) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= kubVar.sd() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(kubVar.sd())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th2) {
                omn.hww("TemplateUtils", "filterTemplateInfo", th2);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject hww(float f10, float f11, boolean z10, kub kubVar, String str, sd sdVar) {
        f36661tq = "";
        if (kubVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectHww = hww(f10, f11, z10, kubVar, str);
            if (sdVar != null) {
                sdVar.hww("adv3");
            }
            hwp hwpVarEfj = kubVar.efj();
            if (hwpVarEfj != null) {
                String strVy = hwpVarEfj.vy();
                if (!TextUtils.isEmpty(strVy)) {
                    jSONObjectHww.put("xTemplate", new JSONObject(strVy));
                    f36661tq = "getTemplate success by local data";
                    if (sdVar != null) {
                        sdVar.tq("local");
                        return jSONObjectHww;
                    }
                } else {
                    String strHww = com.bytedance.sdk.openadsdk.core.vhb.hww.tq.hww().hww("adv3", hwpVarEfj.hww(), hwpVarEfj.tq());
                    if (!TextUtils.isEmpty(strHww)) {
                        jSONObjectHww.put("xTemplate", new JSONObject(strHww));
                        f36661tq = "getTemplate success by db data";
                        if (sdVar != null) {
                            sdVar.tq("local");
                            return jSONObjectHww;
                        }
                    } else {
                        String str2 = "local db data is null id is " + hwpVarEfj.hww() + " md5 is " + hwpVarEfj.tq();
                        f36661tq = str2;
                        if (sdVar != null) {
                            sdVar.hww(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectHww;
        } catch (Exception e10) {
            String str3 = "load template exception " + e10.getMessage();
            f36661tq = str3;
            if (sdVar != null) {
                sdVar.hww(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject hww(float f10, float f11, boolean z10, kub kubVar, String str) {
        if (kubVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectHww = hww(kubVar, true, true);
            if (jSONObjectHww == null) {
                return null;
            }
            try {
                hww(jSONObjectHww, kubVar, str);
                JSONObject jSONObjectTq = yt.tq(kubVar);
                jSONObjectTq.put("language", ny.tq());
                jSONObjectHww.put("xSetting", jSONObjectTq);
                jSONObjectHww.put("xAdInfo", hww(str, sd(kubVar), kubVar));
                JSONObject jSONObject = new JSONObject();
                yt.tq(jSONObject);
                jSONObject.put(Q6.H, "android");
                jSONObjectHww.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f10);
                jSONObject2.put("height", f11);
                if (z10) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectHww.put("xSize", jSONObject2);
                return jSONObjectHww;
            } catch (Throwable unused) {
                return jSONObjectHww;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void hww(JSONObject jSONObject, kub kubVar, String str) {
        com.bykv.vk.openvk.hww.hww.hww.sd.tq tqVarRt;
        if (kubVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (tqVarRt = kubVar.rt()) == null) {
                return;
            }
            JSONObject jSONObjectJpb = tqVarRt.jpb();
            if (jSONObjectJpb != null) {
                if ("open_ad".equals(str)) {
                    jSONObjectJpb.put("video_duration", bs.vy().kub(String.valueOf(kubVar.ys())));
                } else {
                    jSONObjectJpb.put("video_duration", tqVarRt.hu() * ((double) tqVarRt.kv()));
                }
            }
            jSONObject.put("video", jSONObjectJpb);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject hww(String str, JSONObject jSONObject, kub kubVar) {
        if (kubVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", rs.tq().ok());
                    int iRs = rs.tq().rs();
                    if (iRs != 0) {
                        int iHh = kubVar.hh();
                        if (9 == iHh) {
                            jSONObject2.put("app_icon", hww);
                        } else if (10 == iHh) {
                            jSONObject2.put("app_icon", c.phraseDel.concat(String.valueOf(iRs)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject hww(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String hww(kub.hww hwwVar) {
        if (hwwVar != null) {
            return hwwVar.ok();
        }
        return "";
    }

    public static JSONObject hww(boolean z10, @NonNull kub kubVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", kubVar.hg());
            if (kubVar.vc() != null) {
                if (kubVar.vc() != null && !TextUtils.isEmpty(kubVar.vc().hww())) {
                    jSONObject.put("icon", kubVar.vc().hww());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (kubVar.fr() != null) {
                for (int i10 = 0; i10 < kubVar.fr().size(); i10++) {
                    jpb jpbVar = kubVar.fr().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", jpbVar.sd());
                    jSONObject2.put("width", jpbVar.tq());
                    jSONObject2.put("url", jpbVar.hww());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", kubVar.tad());
            jSONObject.put("interaction_type", kubVar.pq());
            jSONObject.put("interaction_method", kubVar.bq());
            jSONObject.put("is_compliance_template", sd());
            jSONObject.put("title", kubVar.aj());
            jSONObject.put("description", kubVar.tef());
            jSONObject.put("source", kubVar.ol());
            JSONObject jSONObject3 = new JSONObject();
            mrs mrsVarAeg = kubVar.aeg();
            if (mrsVarAeg == null) {
                mrsVarAeg = new mrs();
            }
            jSONObject3.put("ceiling_time", mrsVarAeg.vy());
            jSONObject3.put("ceiling_ratio", mrsVarAeg.hv());
            jSONObject3.put("expand_ratio", mrsVarAeg.hu());
            jSONObject.put("interaction_params", jSONObject3);
            if (kubVar.eow() != null) {
                jSONObject.put("comment_num", kubVar.eow().hv());
                jSONObject.put(FirebaseAnalytics.d.D, kubVar.eow().vy());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, kubVar.eow().hu());
                jSONObject.put("app", kubVar.eow().ok());
            }
            com.bykv.vk.openvk.hww.hww.hww.sd.tq tqVarRt = kubVar.rt();
            if (tqVarRt != null) {
                JSONObject jSONObjectJpb = tqVarRt.jpb();
                jSONObjectJpb.put("video_duration", tqVarRt.hu() * ((double) tqVarRt.kv()));
                jSONObject.put("video", jSONObjectJpb);
            }
            if (kubVar.alz() != null) {
                jSONObject.put("dynamic_creative", kubVar.alz().rs());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String hww(kub kubVar, String str) {
        List<jpb> listFr;
        if (kubVar != null && (listFr = kubVar.fr()) != null && listFr.size() > 0) {
            for (jpb jpbVar : listFr) {
                if (jpbVar != null && TextUtils.equals(str, jpbVar.hww())) {
                    return jpbVar.vgm();
                }
            }
        }
        return null;
    }
}

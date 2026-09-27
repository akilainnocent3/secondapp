package com.bytedance.adsdk.ugeno.hww;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n0.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sc.p;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    public static int hww(int i10) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return Integer.MIN_VALUE;
        }
        return i10 - 1;
    }

    public static float[] sd(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayHww = com.bytedance.adsdk.ugeno.vgm.tq.hww(str, (JSONArray) null);
        if (jSONArrayHww != null && jSONArrayHww.length() == 2) {
            fArr[0] = (float) jSONArrayHww.optDouble(0);
            fArr[1] = (float) jSONArrayHww.optDouble(1);
        }
        return fArr;
    }

    public static Interpolator tq(String str) {
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                str.equals(d.f115552l);
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    public static List<sd> hww(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(hww(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static sd.hww tq(String str, JSONObject jSONObject) {
        JSONArray jSONArrayHww;
        if (TextUtils.isEmpty(str) || (jSONArrayHww = com.bytedance.adsdk.ugeno.vgm.tq.hww(str, (JSONArray) null)) == null || jSONArrayHww.length() != 2) {
            return null;
        }
        sd.hww hwwVar = new sd.hww();
        hwwVar.hww = com.bytedance.adsdk.ugeno.sd.tq.hww(jSONArrayHww.optString(0), jSONObject);
        hwwVar.f32550tq = com.bytedance.adsdk.ugeno.sd.tq.hww(jSONArrayHww.optString(1), jSONObject);
        return hwwVar;
    }

    public static sd hww(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        sd sdVar = new sd();
        sdVar.tq(com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("delay"), jSONObject2), 0L));
        sdVar.sd(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("name"), jSONObject2));
        sdVar.tq(com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("playState"), jSONObject2), 1));
        sdVar.hww(Math.max(com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        sdVar.hww(com.bytedance.adsdk.ugeno.vgm.sd.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("playCount"), jSONObject2), 1));
        sdVar.hww(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("playDirection"), jSONObject2));
        sdVar.hww(tq(jSONObject.optString("transformOrigin"), jSONObject2));
        sdVar.tq(com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObject.optString("timingFunction", d.f115552l), jSONObject2));
        sdVar.hww(jSONObject.optJSONObject("effect"));
        sdVar.hww(hww(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return sdVar;
    }

    public static Map<String, TreeMap<Float, String>> hww(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.sd.tq.hww(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int hww(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals(p.f130188p) ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int hww(String str, int i10) {
        int i11 = i10 / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i10;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith(c.userBaseExtraDel2)) {
                        try {
                            return (int) ((i10 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                        }
                        break;
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i11;
                        }
                    }
                    break;
            }
        }
        return i11;
    }
}

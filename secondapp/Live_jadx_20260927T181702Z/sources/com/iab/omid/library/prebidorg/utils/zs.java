package com.iab.omid.library.prebidorg.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.prebidorg.adsession.zb;
import com.ironsource.C4235d4;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zs {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private static String[] f53773zr = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    static float f53774zs = Resources.getSystem().getDisplayMetrics().density;
    private static WindowManager zz;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class zr {

        /* JADX INFO: renamed from: zr, reason: collision with root package name */
        final float f53775zr;
        final float zz;

        public zr(float f10, float f11) {
            this.zz = f10;
            this.f53775zr = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class zz {
        static final /* synthetic */ int[] zz;

        static {
            int[] iArr = new int[zb.values().length];
            zz = iArr;
            try {
                iArr[zb.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void zr(JSONObject jSONObject) {
        zr zrVarZz = zz(jSONObject);
        try {
            jSONObject.put("width", zrVarZz.zz);
            jSONObject.put("height", zrVarZz.f53775zr);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean zs(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!zz(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!jSONArrayOptJSONArray.optString(i10, "").equals(jSONArrayOptJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zt(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean zu(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean zv(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f53773zr) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zw(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean zx(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && zv(jSONObject, jSONObject2) && zw(jSONObject, jSONObject2) && zu(jSONObject, jSONObject2) && zt(jSONObject, jSONObject2) && zs(jSONObject, jSONObject2) && zr(jSONObject, jSONObject2);
    }

    public static float zz(int i10) {
        return i10 / f53774zs;
    }

    public static void zr(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            zt.zz("Error with setting not visible reason", e10);
        }
    }

    private static zr zz(JSONObject jSONObject) {
        float fZz;
        float fZz2;
        if (zz != null) {
            Point point = new Point(0, 0);
            zz.getDefaultDisplay().getRealSize(point);
            fZz = zz(point.x);
            fZz2 = zz(point.y);
        } else {
            fZz = 0.0f;
            fZz2 = 0.0f;
        }
        return new zr(fZz, fZz2);
    }

    private static boolean zr(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!zz(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!zx(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject zz(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zz(i10));
            jSONObject.put("y", zz(i11));
            jSONObject.put("width", zz(i12));
            jSONObject.put("height", zz(i13));
            return jSONObject;
        } catch (JSONException e10) {
            zt.zz("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    public static void zz(Context context) {
        if (context != null) {
            f53774zs = context.getResources().getDisplayMetrics().density;
            zz = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zz(JSONObject jSONObject, zb zbVar) {
        try {
            jSONObject.put("noOutputDevice", zz(zbVar));
        } catch (JSONException e10) {
            zt.zz("Error with setting output device status", e10);
        }
    }

    public static void zz(JSONObject jSONObject, com.iab.omid.library.prebidorg.walking.zs.zz zzVar) {
        com.iab.omid.library.prebidorg.internal.zu zuVarZz = zzVar.zz();
        JSONArray jSONArray = new JSONArray();
        Iterator it = zzVar.zr().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zuVarZz.zt());
            jSONObject.put("friendlyObstructionPurpose", zuVarZz.zr());
            jSONObject.put("friendlyObstructionReason", zuVarZz.zz());
        } catch (JSONException e10) {
            zt.zz("Error with setting friendly obstruction", e10);
        }
    }

    public static void zz(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            zt.zz("Error with setting has window focus", e10);
        }
    }

    public static void zz(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zt.zz("Error with setting ad session id", e10);
        }
    }

    public static void zz(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            zt.zz("JSONException during JSONObject.put for name [" + str + C4235d4.j.f61462e, e10);
        }
    }

    public static void zz(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean zz(zb zbVar) {
        return zz.zz[zbVar.ordinal()] == 1;
    }

    private static boolean zz(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

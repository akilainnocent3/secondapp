package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.c;
import com.ironsource.B7;
import com.ironsource.C4235d4;
import com.ironsource.C4299ge;
import com.ironsource.C4342j4;
import com.ironsource.C4485r4;
import com.ironsource.C4523t8;
import com.ironsource.C8;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64069a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f64070b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f64071c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f64072d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f64073e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f64074f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f64075g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<String, String> f64076h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f64077i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f64078j = new AtomicInteger(1);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f64078j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(Context context, C8 c10) {
        int iSaveFile;
        byte[] bArrA = C4342j4.a(context, c10.getName());
        if (bArrA == null || bArrA.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, c10.getPath());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception: " + e10.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile != 0) {
            return true;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c10.getName());
        return false;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4485r4.d().a(e10);
            Logger.d(f64069a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(com.google.android.material.badge.a.f50153v, "%20");
        } catch (UnsupportedEncodingException e10) {
            C4485r4.d().a(e10);
            return "";
        }
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                C4485r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                C4485r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(C4299ge c4299ge) {
        return fetchDemandSourceId(c4299ge.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C4485r4.d().a(e10);
                    Logger.i(f64069a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f64070b;
    }

    public static String getControllerConfig() {
        return f64075g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        if (TextUtils.isEmpty(f64073e)) {
            return !TextUtils.isEmpty(f64072d) ? f64072d : "";
        }
        return f64073e;
    }

    public static int getDebugMode() {
        return f64074f;
    }

    public static String getFileName(String str) {
        String[] strArrSplit = str.split(File.separator);
        try {
            return URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f64076h;
    }

    public static String getLimitAdTracking() {
        return f64071c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C4485r4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C4235d4.d.f61337b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C4235d4.a.f61283b);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject("features");
            return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject;
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject getOrientation(Context context) {
        B7 b7I = Lb.U().i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(b7I.z(context)));
            return jSONObject;
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static C4523t8.e getProductType(String str) {
        C4523t8.e eVar = C4523t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4523t8.e eVar2 = C4523t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.2.0";
    }

    public static String getTesterParameters() {
        return f64077i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(c.f6970r);
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        B7 b7I = Lb.U().i();
        String strI = b7I.I(context);
        String strB = b7I.b(context);
        if (!TextUtils.isEmpty(strI)) {
            f64070b = strI;
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        f64071c = strB;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f64075g = str;
        Lb.O().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f64072d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f64073e = str;
    }

    public static void setDebugMode(int i10) {
        f64074f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f64076h = map;
    }

    public static void setTesterParameters(String str) {
        f64077i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : C4235d4.i.C;
        }
        return C4235d4.i.D;
    }

    public static String translateOrientation(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "none" : C4235d4.i.C;
        }
        return C4235d4.i.D;
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 == 0) {
            return C4235d4.i.C;
        }
        if (i10 == 1) {
            return C4235d4.i.D;
        }
        if (i10 == 11) {
            return C4235d4.i.C;
        }
        if (i10 == 12) {
            return C4235d4.i.D;
        }
        switch (i10) {
            case 6:
            case 8:
                return C4235d4.i.C;
            case 7:
            case 9:
                return C4235d4.i.D;
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f64075g);
            jSONObject2.put(str, jSONObject);
            f64075g = jSONObject2.toString();
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            Logger.i(f64069a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}

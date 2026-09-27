package com.bytedance.sdk.openadsdk.multipro.vy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.rs;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n0.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class tq {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> hww;

    @Nullable
    public static SharedPreferences hww(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(hww(str), 0);
        } catch (Throwable th2) {
            omn.vy("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    public static Map<String, ?> sd(Context context, String str) {
        SharedPreferences sharedPreferencesHww = hww(context, str);
        if (sharedPreferencesHww == null) {
            return null;
        }
        return sharedPreferencesHww.getAll();
    }

    private static void tq(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = hww;
        if (softReference == null || softReference.get() == null || (map = hww.get().get(hww(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String hww(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object hww(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = hww;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(hww(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object tq(Context context, String str, String str2, String str3) {
        String strHww = hww(str);
        if (!hww(context, strHww, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return hww.hww(context, strHww, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(hww.hww(context, strHww, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(hww.hww(context, strHww, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(hww.hww(context, strHww, str2, 0L));
        }
        if (str3.equalsIgnoreCase(w.b.f115804c)) {
            return Float.valueOf(hww.hww(context, strHww, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return hww.hww(context, strHww, str2, (String) null);
        }
        return null;
    }

    private static void hww(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = hww;
        if (softReference == null || softReference.get() == null) {
            hww = new SoftReference<>(new ConcurrentHashMap());
        }
        String strHww = hww(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = hww.get();
        if (concurrentHashMap.get(strHww) == null) {
            concurrentHashMap.put(strHww, new HashMap());
        }
        concurrentHashMap.get(strHww).put(str2, obj);
    }

    public static synchronized <T> void hww(Context context, String str, String str2, T t10) {
        String strHww = hww.hww(str, str2);
        if (rs.vgm(strHww)) {
            com.bytedance.sdk.component.hww hwwVarHww = com.bytedance.sdk.component.hww.hww(context, strHww);
            if (t10.equals(hww(strHww, str2))) {
                return;
            }
            com.bytedance.sdk.component.hww.sd sdVarTq = hwwVarHww.tq();
            hww(sdVarTq, str2, (Object) t10);
            sdVarTq.apply();
            hww(strHww, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesHww = hww(context, strHww);
        if (sharedPreferencesHww == null) {
            return;
        }
        if (t10.equals(hww(strHww, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesHww.edit();
        hww(editorEdit, str2, t10);
        editorEdit.apply();
        hww(strHww, str2, t10);
    }

    public static void tq(Context context, String str, String str2) {
        try {
            String strHww = hww.hww(str, str2);
            if (rs.vgm(strHww)) {
                com.bytedance.sdk.component.hww.hww(context, strHww).tq().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesHww = hww(context, strHww);
            if (sharedPreferencesHww == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesHww.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = hww;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = hww.get().get(hww(strHww));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void tq(Context context, String str) {
        if (rs.vgm(str)) {
            com.bytedance.sdk.component.hww.hww(context, str).tq().clear().apply();
            tq(str);
            return;
        }
        SharedPreferences sharedPreferencesHww = hww(context, str);
        if (sharedPreferencesHww == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesHww.edit();
        editorEdit.clear();
        editorEdit.apply();
        tq(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void hww(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void hww(com.bytedance.sdk.component.hww.sd sdVar, String str, T t10) {
        if (t10 instanceof Integer) {
            sdVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            sdVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            sdVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            sdVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            sdVar.putString(str, (String) t10);
        }
    }

    public static String hww(Context context, String str, String str2, String str3) {
        Object objHww = hww(str, str2);
        if (objHww != null) {
            return String.valueOf(objHww);
        }
        Object objTq = tq(context, str, str2, str3);
        hww(str, str2, objTq);
        return String.valueOf(objTq);
    }

    public static boolean hww(Context context, String str, String str2) {
        String strHww = hww.hww(str, str2);
        if (rs.vgm(strHww)) {
            return com.bytedance.sdk.component.hww.hww(context, strHww).hww(str2);
        }
        SharedPreferences sharedPreferencesHww = hww(context, strHww);
        return sharedPreferencesHww != null && sharedPreferencesHww.contains(str2);
    }
}

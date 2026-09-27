package com.bytedance.sdk.openadsdk.multipro.vy;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.rs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    private static boolean hww() {
        return bs.hww() == null;
    }

    private static String tq(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void hww(String str, String str2, Boolean bool) {
        if (hww()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            hww.hww(tq(str), str2, bool);
        } else {
            hww(tq(str), str2, bool);
        }
    }

    public static String tq(String str, String str2, String str3) {
        if (hww()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            return hww.tq(tq(str), str2, str3);
        }
        return hww.hww(bs.hww(), tq(str), str2, str3);
    }

    public static void hww(String str, String str2, Long l10) {
        if (hww()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            hww.hww(tq(str), str2, l10);
        } else {
            hww(tq(str), str2, l10);
        }
    }

    public static void hww(String str, String str2, String str3) {
        if (hww()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            hww.hww(tq(str), str2, str3);
        } else {
            hww(tq(str), str2, str3);
        }
    }

    public static void hww(String str, String str2, Integer num) {
        if (hww()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            hww.hww(tq(str), str2, num);
        } else {
            hww(tq(str), str2, num);
        }
    }

    public static int hww(String str, String str2, int i10) {
        if (hww()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            return hww.hww(tq(str), str2, i10);
        }
        return hww.hww(bs.hww(), tq(str), str2, i10);
    }

    public static boolean hww(String str, String str2, boolean z10) {
        if (hww()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            return hww.hww(tq(str), str2, z10);
        }
        return hww.hww(bs.hww(), tq(str), str2, z10);
    }

    public static long hww(String str, String str2, long j10) {
        if (hww()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            return hww.hww(tq(str), str2, j10);
        }
        return hww.hww(bs.hww(), tq(str), str2, j10);
    }

    public static void hww(String str, String str2) {
        if (hww()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                hww.tq(tq(str), str2);
            } else {
                tq.tq(bs.hww(), tq(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void hww(String str) {
        if (hww()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
            hww.hww(tq(str));
        } else {
            tq.tq(bs.hww(), tq(str));
        }
    }

    private static <T> void hww(String str, String str2, T t10) {
        String strHww = hww.hww(str, str2);
        if (rs.vgm(strHww)) {
            com.bytedance.sdk.component.hww.sd sdVarTq = com.bytedance.sdk.component.hww.hww(bs.hww(), tq(strHww)).tq();
            tq.hww(sdVarTq, str2, (Object) t10);
            sdVarTq.apply();
        } else {
            SharedPreferences sharedPreferencesHww = tq.hww(bs.hww(), tq(strHww));
            if (sharedPreferencesHww == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesHww.edit();
            tq.hww(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}

package com.bytedance.sdk.component.adexpress.vy;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.kub;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {
    public static int hww(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float sd(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq();
        }
        return f10 * vy(context);
    }

    public static int tq(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq();
        }
        float fVy = vy(context);
        if (fVy <= 0.0f) {
            fVy = 1.0f;
        }
        return (int) ((f10 / fVy) + 0.5f);
    }

    private static float vy(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float hww(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq();
        }
        return (f10 * vy(context)) + 0.5f;
    }

    public static String sd(@NonNull Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = kub.tq(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return hww(language);
    }

    public static int tq(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int hww(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().tq();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String hww(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.hv;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.tq.ed;
import com.bytedance.sdk.component.utils.kub;
import com.google.android.material.timepicker.h;
import fk.n0;
import gi.j;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb {
    private static final Set<String> hww = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static String f34093tq;

    /* JADX WARN: Code duplicated, block: B:225:0x0447  */
    /* JADX WARN: Code duplicated, block: B:228:0x0457 A[Catch: Exception -> 0x0468, TryCatch #2 {Exception -> 0x0468, blocks: (B:226:0x044b, B:228:0x0457, B:233:0x0461), top: B:281:0x044b }] */
    /* JADX WARN: Code duplicated, block: B:230:0x045d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0460  */
    public static tq.sd hww(String str, String str2, String str3, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, double d10, int i11, double d11, String str4, ed edVar) {
        int i12;
        int i13;
        float f10;
        float f11;
        tq.sd sdVarHww;
        int i14;
        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv;
        String strOptString = str;
        int i15 = i10;
        String strVy = edVar.vy();
        int iVgm = edVar.vgm();
        if (com.bytedance.sdk.component.adexpress.vy.tq() && i11 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new tq.sd(0.0f, 0.0f);
        }
        tq.sd sdVar = new tq.sd();
        if (strOptString.startsWith("<svg") || hww.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.vy.tq() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    sdVar.hww = fOptDouble;
                    sdVar.f34088tq = fOptDouble;
                    return sdVar;
                }
            } catch (Exception unused) {
            }
            sdVar.hww = 10.0f;
            sdVar.f34088tq = 10.0f;
            return sdVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_text_privacy_app_version") + strOptString;
            }
            if ("score-count".equals(str2)) {
                try {
                    i12 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                    i12 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.vy.tq() && i12 < 0) {
                    return new tq.sd(0.0f, 0.0f);
                }
                return hww(j.f86770c + String.format(kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_comment_num"), Integer.valueOf(i12)) + j.f86771d, str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i13 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                    i13 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.vy.tq() && i13 < 0) {
                    return new tq.sd(0.0f, 0.0f);
                }
                return hww(j.f86770c + String.format(new DecimalFormat("###,###,###").format(i13), Integer.valueOf(i13)) + j.f86771d, str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.vy.tq()) {
                tq.sd sdVar2 = new tq.sd();
                float fTq = (float) tq(str3);
                sdVar2.hww = fTq;
                sdVar2.f34088tq = fTq;
                return sdVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!edVar.hww() || !com.bytedance.sdk.component.adexpress.vy.hu.tq(strVy)) {
                    return d10 < 10.0d ? hww("0S", str3) : hww("00S", str3);
                }
                if (((int) (d10 + 0.5d)) - iVgm < 10) {
                    return com.bytedance.sdk.component.adexpress.vy.tq() ? hww("0s", str3) : hww(String.format(kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.vy.tq() ? hww("00s", str3) : hww(String.format(kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return hww("| " + kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return hww("| ".concat(String.format(kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                tq.sd sdVarHww2 = hww("| " + kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.vy.tq()) {
                    try {
                        sdVarHww2.f34088tq = (float) ((((double) sdVarHww2.f34088tq) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    sdVarHww2.hww = sdVarHww2.f34088tq;
                }
                return sdVarHww2;
            }
            if (h.f51923u.equals(str2)) {
                return hww(kub.hww(com.bytedance.sdk.component.adexpress.vy.hww(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return hww(n0.f84864h, str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.vy.tq() || (d11 >= 0.0d && d11 <= 5.0d)) ? hww(n0.f84864h, str3) : new tq.sd(0.0f, 0.0f);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return hww("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return hww("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.vy.tq() && TextUtils.isEmpty(strOptString) && (huVarHv = okVar.nod().hv()) != null) {
                strOptString = huVarHv.nuc() != null ? okVar.nod().hv().nuc().optString(com.bytedance.sdk.component.adexpress.vy.vgm.sd(com.bytedance.sdk.component.adexpress.vy.hww())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.vy.tq() && "open_ad".equals(strVy))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return hww(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble("fontSize");
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f12 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                if ("muted".equals(str2)) {
                    sdVar.hww = fOptDouble2;
                    sdVar.f34088tq = fOptDouble2;
                    return sdVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.vy.tq() && (d11 < 0.0d || d11 > 5.0d || i11 != 4)) {
                        return new tq.sd(0.0f, 0.0f);
                    }
                    tq.sd sdVarHww3 = hww("str", str3);
                    sdVarHww3.hww = fOptDouble2 * 5.0f;
                    return sdVarHww3;
                }
                if ("icon".equals(str2)) {
                    sdVar.hww = fOptDouble2;
                    sdVar.f34088tq = fOptDouble2;
                    return sdVar;
                }
                if (z10) {
                    int i16 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z11 && i16 >= i15) {
                        i16 = i15;
                    }
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2 * i16)) * 1.2d);
                } else {
                    f10 = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f12 <= fOptDouble5) {
                        f11 = f12;
                    }
                    if ("title".equals(str2) || (com.bytedance.sdk.component.adexpress.vy.tq() && "open_ad".equals(strVy) && "source".equals(str2))) {
                        try {
                            sdVarHww = hww(strOptString.replace('\n', ' '), str3, false);
                            if (z10) {
                                i14 = ((int) (f12 / fOptDouble5)) + 1;
                                if (z11 || i14 < i15) {
                                    i15 = i14;
                                }
                                sdVarHww.f34088tq *= i15;
                            }
                            return sdVarHww;
                        } catch (Exception unused5) {
                        }
                    }
                    sdVar.hww = f11;
                    sdVar.f34088tq = f10;
                }
                f11 = fOptDouble5;
                if ("title".equals(str2)) {
                    sdVarHww = hww(strOptString.replace('\n', ' '), str3, false);
                    if (z10) {
                        i14 = ((int) (f12 / fOptDouble5)) + 1;
                        if (z11) {
                            i15 = i14;
                        } else {
                            i15 = i14;
                        }
                        sdVarHww.f34088tq *= i15;
                    }
                    return sdVarHww;
                }
                sdVarHww = hww(strOptString.replace('\n', ' '), str3, false);
                if (z10) {
                    i14 = ((int) (f12 / fOptDouble5)) + 1;
                    if (z11) {
                        i15 = i14;
                    } else {
                        i15 = i14;
                    }
                    sdVarHww.f34088tq *= i15;
                }
                return sdVarHww;
            } catch (JSONException unused6) {
            }
        } else {
            if (!com.bytedance.sdk.component.adexpress.vy.tq() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || tq())) {
                return tq() ? hww(sdVar, strOptString, str3, f34093tq) : hww(sdVar, strOptString, str3, "");
            }
            sdVar.hww = "union".equals(strOptString) ? 14.0f : 20.0f;
            sdVar.f34088tq = 10.0f;
            if (com.bytedance.sdk.component.adexpress.vy.tq()) {
                String strZvy = edVar.zvy();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strZvy)) {
                    sdVar.hww = 0.0f;
                }
                String str5 = str2 + strOptString;
                float fTq2 = (float) tq(str3);
                if (str5.contains("logoad")) {
                    String strMw = edVar.mw();
                    if (!TextUtils.isEmpty(strMw)) {
                        return hww(strMw, str3);
                    }
                    sdVar.hww = 0.0f;
                }
                sdVar.f34088tq = fTq2;
                return sdVar;
            }
        }
        return sdVar;
    }

    public static double tq(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] tq(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.vy.hww());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean tq() {
        return !TextUtils.isEmpty(f34093tq);
    }

    public static String hww(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static tq.sd hww(tq.sd sdVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            sdVar.hww = 0.0f;
            sdVar.f34088tq = 0.0f;
            return sdVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = hww(str);
        }
        if (TextUtils.isEmpty(str3)) {
            sdVar.hww = 0.0f;
            sdVar.f34088tq = 0.0f;
            return sdVar;
        }
        return hww(str3, str2);
    }

    public static tq.sd hww(String str, String str2) {
        return hww(str, str2, false);
    }

    public static tq.sd hww(String str, String str2, boolean z10) {
        tq.sd sdVar = new tq.sd();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrHww = hww(str, (float) tq(str2), z10);
            sdVar.hww = iArrHww[0];
            sdVar.f34088tq = iArrHww[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                sdVar.f34088tq = 0.0f;
            }
        } catch (Exception unused) {
        }
        return sdVar;
    }

    public static int[] hww(String str, float f10, boolean z10) {
        int[] iArrTq = tq(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), iArrTq[0]), com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), iArrTq[1])};
    }

    public static String hww() {
        return f34093tq;
    }
}

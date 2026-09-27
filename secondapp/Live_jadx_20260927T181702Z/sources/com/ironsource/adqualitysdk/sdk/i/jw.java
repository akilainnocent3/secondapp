package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class jw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2910 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2911;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2912;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2913;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2914;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject f2915;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2916;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject f2917;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2918;

    static {
        m2714();
        f2915 = null;
        f2911 = (f2910 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static synchronized JSONObject m2708() {
        JSONObject jSONObject;
        try {
            f2911 = (f2910 + 11) % 128;
            if (f2915 == null) {
                JSONObject jSONObject2 = new JSONObject();
                f2915 = jSONObject2;
                try {
                    jSONObject2.put(m2726("\ue73b\ue74c赚\ue9a9㾮", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), -1);
                    f2915.put(m2720(null, Color.alpha(0) + 127, null, "\u0081").intern(), -1);
                    f2910 = (f2911 + 93) % 128;
                } catch (JSONException unused) {
                }
            }
            jSONObject = f2915;
            f2910 = (f2911 + 13) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static synchronized JSONObject m2709() {
        JSONObject jSONObject;
        int i10 = f2911;
        jSONObject = f2917;
        f2910 = (i10 + 75) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static JSONObject m2710() {
        int i10 = f2910 + 115;
        f2911 = i10 % 128;
        if (i10 % 2 != 0) {
            jz.m2749(m2709());
            throw null;
        }
        JSONObject jSONObjectM2749 = jz.m2749(m2709());
        int i11 = f2911 + 13;
        f2910 = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObjectM2749;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2711() {
        String str = Build.VERSION.RELEASE;
        int i10 = f2910;
        int i11 = i10 + 39;
        f2911 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 45;
        f2911 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2714() {
        f2914 = -3258111641122125134L;
        f2913 = true;
        f2912 = true;
        f2916 = 251;
        f2918 = new char[]{355, 370, 356, 361, 351, 362, 319, 352, 369, 350, 336, 367, 359, 366, 320, 365, 283, 354, 328, 353, 360, 348, 363, 372, 371, 368, 309, 358, 349, 357};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m2721() {
        f2910 = (f2911 + 29) % 128;
        JSONObject jSONObjectM2749 = jz.m2749(m2708());
        int i10 = f2910 + 87;
        f2911 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
        return jSONObjectM2749;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2729(int i10, int i11) {
        int i12 = f2911 + 59;
        int i13 = i12 % 128;
        f2910 = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        f2911 = (i13 + 59) % 128;
        if (i10 > m2730()) {
            return false;
        }
        int i14 = f2911 + 97;
        f2910 = i14 % 128;
        if (i14 % 2 == 0) {
            m2725();
            throw null;
        }
        if (i11 > m2725()) {
            return false;
        }
        f2910 = (f2911 + 59) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int m2730() {
        JSONObject jSONObjectM2721;
        int iMyPid;
        int i10 = f2910 + 115;
        f2911 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM2721 = m2721();
            iMyPid = Process.myPid() % 120;
        } else {
            jSONObjectM2721 = m2721();
            iMyPid = Process.myPid() >> 22;
        }
        return jSONObjectM2721.optInt(m2726("\ue73b\ue74c赚\ue9a9㾮", iMyPid).intern());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2712(Application application) {
        int i10 = f2911 + 103;
        f2910 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 41 / 0;
            if (application != null) {
                m2722(application.getApplicationContext());
            }
        } else if (application != null) {
            m2722(application.getApplicationContext());
        }
        int i12 = f2911 + 95;
        f2910 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2719(JSONObject jSONObject) {
        int i10 = f2910 + 9;
        f2911 = i10 % 128;
        try {
            jSONObject.put(i10 % 2 != 0 ? m2726("钴铇佔\uefd1薏竏托ȫ", ViewConfiguration.getPressedStateDuration() * 24).intern() : m2726("钴铇佔\uefd1薏竏托ȫ", ViewConfiguration.getPressedStateDuration() >> 16).intern(), m2721());
            int i11 = f2910 + 47;
            f2911 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 46 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:19:0x005a, B:21:0x0064), top: B:42:0x005a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static synchronized void m2722(Context context) {
        WindowManager windowManager;
        Rect bounds;
        int i10 = (f2911 + 103) % 128;
        f2910 = i10;
        if (context != null) {
            int i11 = i10 + 17;
            f2911 = i11 % 128;
            try {
                if (i11 % 2 != 0) {
                    windowManager = (WindowManager) context.getSystemService(m2720(null, 84 << (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u0082\u0086\u0085\u0084\u0083\u0082").intern());
                    if (windowManager != null) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            try {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                                if (bounds != null) {
                                    m2715(bounds.height(), bounds.width());
                                    return;
                                }
                            } catch (Throwable th2) {
                                k.m2785(m2720(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2720(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0090\u0088\u0092\u0084\u0096\u0093\u0082\u0086\u0085\u0084\u0083\u0082\u0091\u0095\u0086\u0090\u0094\u0091\u008e\u008a\u0083\u0090\u008c\u0088\u0093\u0082\u0086\u0085\u0084\u0083\u0082\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0084\u0083\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th2);
                            }
                        }
                    }
                } else {
                    windowManager = (WindowManager) context.getSystemService(m2720(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u0082\u0086\u0085\u0084\u0083\u0082").intern());
                    if (windowManager != null) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            if (bounds != null) {
                                m2715(bounds.height(), bounds.width());
                                return;
                            }
                        }
                    }
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    int i12 = f2910 + 57;
                    f2911 = i12 % 128;
                    if (i12 % 2 != 0) {
                        m2727(resources.getDisplayMetrics());
                        throw null;
                    }
                    m2727(resources.getDisplayMetrics());
                }
            } catch (Throwable th3) {
                k.m2785(m2720(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2720(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008c\u0099\u0088\u008c\u0084\u0086\u008a\u0091\u0095\u0086\u0090\u0094\u0091\u008e\u008a\u0083\u0090\u008c\u0088\u0093\u0098\u0096\u008d\u0097\u008e\u0083\u0087\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0084\u0083\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th3);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m2725() {
        JSONObject jSONObjectM2721;
        int threadPriority;
        int i10 = f2910 + 79;
        f2911 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM2721 = m2721();
            threadPriority = 99 >>> ((Process.getThreadPriority(0) >> 89) * 25);
        } else {
            jSONObjectM2721 = m2721();
            threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 127;
        }
        int iOptInt = jSONObjectM2721.optInt(m2720(null, threadPriority, null, "\u0081").intern());
        f2911 = (f2910 + 17) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m2713(JSONObject jSONObject) {
        try {
            int i10 = f2910 + 47;
            f2911 = i10 % 128;
            if (i10 % 2 != 0) {
                f2917 = jSONObject;
                int i11 = 93 / 0;
            } else {
                f2917 = jSONObject;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized void m2716(Activity activity) {
        int i10 = (f2911 + 89) % 128;
        f2910 = i10;
        if (activity != null) {
            f2911 = (i10 + 55) % 128;
            m2722(activity.getApplicationContext());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2715(int i10, int i11) {
        int i12 = f2911;
        int i13 = i12 + 39;
        f2910 = i13 % 128;
        try {
            if (i13 % 2 == 0) {
                throw null;
            }
            if (i10 > 0) {
                int i14 = i12 + 61;
                f2910 = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (i11 > 0) {
                    f2910 = (i12 + 25) % 128;
                    JSONObject jSONObjectM2708 = m2708();
                    jSONObjectM2708.put(m2726("\ue73b\ue74c赚\ue9a9㾮", ViewConfiguration.getLongPressTimeout() >> 16).intern(), i11);
                    jSONObjectM2708.put(m2720(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0081").intern(), i10);
                }
            }
        } catch (Throwable th2) {
            k.m2785(m2720(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2726("\ue456\ue413躅ⶉ䑅뢟㫶媏컬篟\uedd6끍놲꺳윔輾摩얯㡆\udafb伄גּ浨ㆮ㆞\u2e6c䚬ི\ue483", (-16777216) - Color.rgb(0, 0, 0)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2731(Context context, JSONObject jSONObject) {
        f2911 = (f2910 + 35) % 128;
        try {
            if (jy.m2744(context, m2726("꾽꿜\ue700\ue9dbⷜ糛롿\ud81b蔚ሓ⦓㊏艹윧͝ප⾌걹ﰔ塸Ӳ銼ꥱ댈稖䟙苒跒꽞ⰽ羘\ud8f0蒃ᅣ⥘㎢囹잳ȫ\u0e6c", ViewConfiguration.getPressedStateDuration() >> 16).intern())) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m2726("䛀䚷\uf7df墱㴄춳㏂厽", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())).getConnectionInfo();
                jSONObject.put(m2726("쇏솸룎怴爚\uf523퀇끥", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    jSONObject.put(m2726("摭搚뗛轇缏ᩑ蔰\ue555", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), connectionInfo.getRssi());
                    jSONObject.put(m2726("\u0efbຌﳄ䲛㘐\ud98c䔇╡", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), connectionInfo.getLinkSpeed());
                }
            }
            int i10 = f2910 + 63;
            f2911 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            k.m2785(m2720(null, 127 - View.combineMeasuredStates(0, 0), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2726("⯳⮶ᨣ쫧탣忱套㤮ŉ\uef79પ폭縇㨈⁽\uec96ꮋ兞\udf32륟肺濑訊刏ﹽ뫖ꆋ泝⬬텡岖㧧î\uec67\u0a4f", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2727(DisplayMetrics displayMetrics) {
        int i10 = f2910 + 23;
        f2911 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (displayMetrics != null) {
            m2715(displayMetrics.heightPixels, displayMetrics.widthPixels);
            f2910 = (f2911 + 85) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2728(JSONObject jSONObject) {
        f2911 = (f2910 + 5) % 128;
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m2720(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0097\u008e\u0082\u0084").intern(), Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis))));
                jSONObject.put(m2720(null, 127 - View.resolveSize(0, 0), null, "\u0099\u0090\u0082\u0084").intern(), totalRxBytes2);
                f2910 = (f2911 + 95) % 128;
            }
        } catch (Throwable th2) {
            k.m2785(m2720(null, View.MeasureSpec.getMode(0) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2720(null, 127 - Color.green(0), null, "\u0088\u0092\u0096\u008e\u009a\u0091\u009c\u0090\u0086\u0082\u008c\u0088\u0084\u0091\u0085\u0084\u0096\u0091\u009a\u0097\u008a\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2717(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m2720(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0098\u008c\u0083\u0089\u0083\u008c\u008a\u0096").intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m2726("环珂瑗\uf6ee뺈揫䍰⌐", View.MeasureSpec.getMode(0)).intern(), memoryInfo.availMem / 1048576);
            jSONObject.put(m2726("㒫㓆胥ⷿ䨺룯쩧ꨙ", ViewConfiguration.getJumpTapTimeout() >> 16).intern(), memoryInfo.threshold / 1048576);
            if (memoryInfo.lowMemory) {
                jSONObject.put(m2720(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0082\u008d\u0095\u0095").intern(), memoryInfo.lowMemory);
                f2910 = (f2911 + 37) % 128;
            }
            f2911 = (f2910 + 53) % 128;
            jSONObject.put(m2726("㢋㣦蛗磙䰈\uedc9逨\uf04a", ViewConfiguration.getEdgeSlop() >> 16).intern(), memoryInfo.totalMem / 1048576);
        } catch (Throwable th2) {
            String strIntern = m2720(null, 127 - Color.green(0), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2720(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "\u0091\u009b\u0088\u0092\u0096\u008e\u009a\u0091\u0098\u0090\u0086\u0095\u0088\u0095\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0090\u0086\u0090\u0090\u008f").intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2765(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2724(JSONObject jSONObject) {
        JSONObject jSONObjectM2710 = m2710();
        if (jSONObjectM2710 != null) {
            int i10 = f2910 + 61;
            f2911 = i10 % 128;
            int i11 = i10 % 2;
            jz.m2750(jSONObject, jSONObjectM2710);
            if (i11 != 0) {
                throw null;
            }
            f2911 = (f2910 + 57) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2723(Context context, JSONObject jSONObject, boolean z10) {
        f2911 = (f2910 + 29) % 128;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m2720(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0098\u008c\u0083\u0089\u0083\u008c\u008a\u0088\u0084\u0084\u0086\u008a").intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m2720(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0088\u0084\u0086\u0081\u0097").intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                jSONObject.put(m2726("㷋㶦측䫡ӱ\udff6瞡ៃ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    jSONObject.put(m2726("ᮎᯣ꙼ꫲ沬㿢Ǩ憎ㄯ", TextUtils.getTrimmedLength("")).intern(), networkInfo.getType());
                    jSONObject.put(m2720(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u0097\u008c\u009d\u0095").intern(), networkInfo.getTypeName());
                    jSONObject.put(m2720(null, TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u0083\u0097\u008e\u009d\u0095").intern(), networkInfo.getSubtype());
                    jSONObject.put(m2720(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0097\u008e\u009d\u0095").intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m2720(null, 127 - View.getDefaultSize(0, 0), null, "\u0086\u0084\u009d\u0095").intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m2720(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u0084\u0086\u009d\u0095").intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m2720(null, 127 - TextUtils.indexOf("", "", 0), null, "\u008a\u008a\u009d\u0095").intern(), telephonyManager.getNetworkCountryIso());
                    if (z10) {
                        f2910 = (f2911 + 75) % 128;
                        jSONObject.put(m2720(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u0086\u008e\u009d\u0095").intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m2726("䓤䒉麤ꊮ呴㞹§惟", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
        } catch (Throwable th2) {
            k.m2785(m2720(null, View.combineMeasuredStates(0, 0) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m2720(null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, "\u008c\u0084\u0088\u0089\u0088\u0091\u0086\u008c\u0091\u0086\u0094\u0084\u0083\u0091\u0088\u008d\u0083\u009d\u0086\u0095\u0091\u0092\u0084\u0083\u0085\u0085\u0096\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2726(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            try {
                char[] cArrM2198 = h.m2198(f2914, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2198.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f2914));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2198, 4, cArrM2198.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2718(Intent intent) {
        int intExtra;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                if (intent.hasExtra(m2726("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", ViewConfiguration.getLongPressTimeout() >> 16).intern())) {
                    int i10 = f2911 + 51;
                    f2910 = i10 % 128;
                    intExtra = intent.getIntExtra((i10 % 2 == 0 ? m2726("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", KeyEvent.getDeadChar(0, 0)) : m2726("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", KeyEvent.getDeadChar(0, 0))).intern(), -1);
                    f2911 = (f2910 + 85) % 128;
                } else {
                    intExtra = -1;
                }
                jSONObject.put(m2726("쨑쩳휣凹ᷥ쓭℥䅟", TextUtils.getOffsetBefore("", 0)).intern(), intExtra);
                jSONObject.put(m2720(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0089\u008d\u008c\u009d").intern(), Math.round(((intent.hasExtra(m2720(null, TextUtils.getOffsetBefore("", 0) + 127, null, "\u008d\u0088\u0089\u0088\u008d").intern()) ? intent.getIntExtra(m2720(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u008d\u0088\u0089\u0088\u008d").intern(), -1) : -1) * 100.0f) / (intent.hasExtra(m2720(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0088\u008d\u0096\u008a\u008e").intern()) ? intent.getIntExtra(m2720(null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u0088\u008d\u0096\u008a\u008e").intern(), -1) : -1)));
            } catch (Throwable th2) {
                String strIntern = m2720(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2720(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0091\u009b\u0084\u0086\u008e\u009e\u0091\u0086\u008c\u0091\u008e\u008d\u0088\u0089\u0088\u008d\u0091\u0098\u0090\u0088\u008c\u008c\u0096\u009d\u0091\u0092\u0084\u0083\u0085\u0085\u0096\u0091\u0090\u0086\u0090\u0090\u008f").intern());
                sb2.append(th2.getLocalizedMessage());
                k.m2765(strIntern, sb2.toString());
            }
        }
        m2713(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2720(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            try {
                char[] cArr2 = f2918;
                int i11 = f2916;
                if (f2912) {
                    int length = bArr.length;
                    m.f2990 = length;
                    char[] cArr3 = new char[length];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i12 = m.f2989;
                        int i13 = m.f2990 - 1;
                        int i14 = m.f2989;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f2989 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2913) {
                    int length2 = cArr.length;
                    m.f2990 = length2;
                    char[] cArr4 = new char[length2];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i15 = m.f2989;
                        int i16 = m.f2990 - 1;
                        int i17 = m.f2989;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f2989 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f2990 = length3;
                char[] cArr5 = new char[length3];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i18 = m.f2989;
                    int i19 = m.f2990 - 1;
                    int i20 = m.f2989;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f2989 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

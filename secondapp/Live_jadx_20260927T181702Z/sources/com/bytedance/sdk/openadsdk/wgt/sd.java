package com.bytedance.sdk.openadsdk.wgt;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.khx;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.settings.vhb;
import com.bytedance.sdk.openadsdk.utils.qt;
import com.bytedance.sdk.openadsdk.utils.syb;
import com.bytedance.sdk.openadsdk.wgt.hww.vy;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static volatile sd hww;

    private sd() {
    }

    public static sd hww() {
        if (hww == null) {
            synchronized (sd.class) {
                try {
                    if (hww == null) {
                        hww = new sd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    private boolean sd(vy vyVar) {
        return vyVar == null;
    }

    public static void tq(final kub kubVar) {
        if (qt.hww(kubVar) == null || TextUtils.isEmpty(kubVar.zx())) {
            return;
        }
        hww("download_gecko_start", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.15
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", kubVar.oo());
                jSONObject.put("channel_name", kubVar.zx());
                return vy.tq().hww("download_gecko_start").hww(kubVar.fyo()).tq(jSONObject.toString());
            }
        });
    }

    public static void vy() {
        hww("disk_log", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.9
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jHww = sd.hww(file2);
                        j10 += jHww;
                        jSONObject.put(file2.getName(), jHww);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return vy.tq().hww("disk_log").tq(jSONObject.toString());
            }
        });
    }

    public void sd() {
        hww("blind_mode_status", true, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.7
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                return vy.tq().hww("blind_mode_status");
            }
        });
    }

    public void tq(final vy vyVar) {
        if (sd(vyVar)) {
            return;
        }
        vyVar.hww("show_backup_endcard");
        bs.hv().hww(new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.18
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                return vyVar;
            }
        });
    }

    public static void hww(final kub kubVar) {
        if (kubVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hww("bidding_receive", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.1
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (kubVar.fyo() == 3) {
                    jSONObject.put("is_icon_only", kubVar.mw() ? 1 : 0);
                }
                return vy.tq().hww("bidding_receive").tq(jSONObject.toString());
            }
        });
    }

    public static void tq() {
        syb.sd(new ok("showFailLog") { // from class: com.bytedance.sdk.openadsdk.wgt.sd.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    sd.hww().hww("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    omn.sd("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void hww(kub kubVar, final long j10) {
        if (kubVar == null) {
            return;
        }
        hww("bidding_load", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.10
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                return vy.tq().hww("bidding_load").tq(jSONObject.toString());
            }
        });
    }

    public static void hww(final String str, final com.bytedance.sdk.openadsdk.vy.hv.tq.hww hwwVar) {
        if (hwwVar == null) {
            return;
        }
        hww(str, false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.14
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObjectSd = hwwVar.sd();
                if (jSONObjectSd == null) {
                    jSONObjectSd = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.vy.hv.tq.sd sdVarHv = hwwVar.hv();
                if (sdVarHv != null) {
                    sdVarHv.hww(jSONObjectSd);
                }
                return vy.tq().hww(str).hww(hwwVar.hww().fyo()).tq(jSONObjectSd.toString());
            }
        });
    }

    public static void hww(final kub kubVar, final JSONObject jSONObject) {
        if (qt.hww(kubVar) == null || TextUtils.isEmpty(kubVar.zx())) {
            return;
        }
        hww("download_gecko_end", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.16
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", kubVar.oo());
                jSONObject2.put("channel_name", kubVar.zx());
                jSONObject2.put("data", jSONObject);
                return vy.tq().hww("download_gecko_end").hww(kubVar.fyo()).tq(jSONObject2.toString());
            }
        });
    }

    public void hww(final vy vyVar) {
        if (sd(vyVar)) {
            return;
        }
        vyVar.hww("express_ad_render");
        bs.hv().hww(new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.17
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                return vyVar;
            }
        });
    }

    public void hww(final String str) {
        hww("click_playable_test_tool", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.2
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return vy.tq().hww("click_playable_test_tool").tq(jSONObject.toString());
            }
        });
    }

    public void hww(final String str, final int i10, final String str2) {
        hww("use_playable_test_tool_error", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.3
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return vy.tq().hww("use_playable_test_tool_error").tq(jSONObject.toString());
            }
        });
    }

    public void hww(final long j10, final long j11) {
        final long j12 = j11 - j10;
        hww("general_label", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.4
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                int i10 = !khx.f36175tq.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return vy.tq().hww("general_label").ok(String.valueOf(j12)).tq(jSONObject.toString());
            }
        });
    }

    public void hww(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        hww(str, false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.6
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                return vy.tq().hww(str).tq(jSONObject.toString());
            }
        });
    }

    public void hww(final JSONObject jSONObject) {
        if (jSONObject == null) {
            omn.hww("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            omn.hww("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            omn.hww("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            hww("ad_revenue", true, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.8
                @Override // com.bytedance.sdk.openadsdk.wgt.tq
                public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, ny.sd(bs.hww()));
                        String strHww = "";
                        try {
                            if (ny.hww(bs.hww()) != null) {
                                strHww = ny.hww(bs.hww());
                            }
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        jSONObject.put("device_id", strHww);
                        jSONObject.put(Q6.H, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    return vy.tq().hww("ad_revenue").tq(jSONObject.toString());
                }
            });
        }
    }

    public static long hww(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jHww = 0;
        for (File file2 : file.listFiles()) {
            jHww += hww(file2);
        }
        return jHww;
    }

    public static void hww(String str, boolean z10, tq tqVar) {
        hww(str, z10, 100, tqVar);
    }

    public static void hww(String str, boolean z10, int i10, tq tqVar) {
        int iHww = vhb.sd().hww(str, i10);
        if (TextUtils.isEmpty(str) || iHww == 0 || tqVar == null) {
            return;
        }
        boolean z11 = iHww == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iHww;
        }
        if (z11) {
            bs.hv().hww(tqVar, z10);
        }
    }

    public static void hww(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        hww("ad_show_cost_time", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.11
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return vy.tq().hww("ad_show_cost_time").tq(jSONObject.toString());
            }
        });
    }

    public static void hww(int i10, String str) {
        hww(i10, str, 0, (String) null);
    }

    public static void hww(final int i10, final String str, final int i11, final String str2) {
        hww("ipv6_req", false, (tq) new tq<com.bytedance.sdk.openadsdk.wgt.hww.sd>() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.12
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = C4235d4.g.f61370e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return vy.tq().hww("ipv6_req").tq(jSONObject.toString());
            }
        });
    }

    public static void hww(final String str, final boolean z10) {
        hww("img_error_param", false, new tq() { // from class: com.bytedance.sdk.openadsdk.wgt.sd.13
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            @Nullable
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return vy.tq().hww("img_error_param").tq(jSONObject.toString());
            }
        });
    }
}

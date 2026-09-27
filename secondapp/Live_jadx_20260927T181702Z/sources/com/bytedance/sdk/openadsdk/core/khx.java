package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class khx {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public static long f36172hv = 0;
    public static volatile boolean hww = false;
    private static volatile HandlerThread vgm;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static AtomicBoolean f36175tq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static long f36174sd = 0;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile int f36171hu = 0;
    public static float vy = 1.0f;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static volatile Handler f36173ok = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.khx.1
            boolean hww = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.hww) {
                    return;
                }
                this.hww = true;
                super.start();
            }
        };
        vgm = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.ok.hww(vgm);
        f36172hv = System.currentTimeMillis();
    }

    public static void hu() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f36174sd <= 10000) {
            return;
        }
        f36174sd = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.syb.hww(new com.bytedance.sdk.component.ok.ok("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.khx.2
            @Override // java.lang.Runnable
            public void run() {
                String strTq = com.bytedance.sdk.openadsdk.core.settings.vhb.tq(bs.hww());
                if (TextUtils.equals(strTq, com.bytedance.sdk.openadsdk.core.settings.vhb.vy)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.vhb.sd().hww(6, true);
                com.bytedance.sdk.openadsdk.core.settings.vhb.vy = strTq;
            }
        });
    }

    public static boolean hv() {
        return vy() == 1;
    }

    public static void hww(long j10) {
        f36172hv = j10;
    }

    public static void ok() {
        tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.khx.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.jpb.sd.hww(new com.bytedance.sdk.openadsdk.jpb.vy() { // from class: com.bytedance.sdk.openadsdk.core.khx.4.1
                        @Override // com.bytedance.sdk.openadsdk.jpb.vy
                        public com.bytedance.sdk.openadsdk.jpb.tq.hww hww() {
                            com.bytedance.sdk.openadsdk.jpb.tq.hww hwwVar = new com.bytedance.sdk.openadsdk.jpb.tq.hww();
                            hwwVar.tq("init");
                            return hwwVar;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.omn.sd("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static Handler sd() {
        return new Handler(Looper.getMainLooper());
    }

    public static Handler tq() {
        if (vgm == null || !vgm.isAlive()) {
            synchronized (khx.class) {
                try {
                    if (vgm == null || !vgm.isAlive()) {
                        vgm = com.bytedance.sdk.component.utils.ok.hww("csj_init_handle", -1);
                        f36173ok = new Handler(vgm.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (f36173ok == null) {
            synchronized (khx.class) {
                try {
                    if (f36173ok == null) {
                        f36173ok = new Handler(vgm.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f36173ok;
    }

    public static void vgm() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f36174sd <= 10000) {
            return;
        }
        synchronized (khx.class) {
            try {
                if (jElapsedRealtime - f36174sd <= 10000) {
                    return;
                }
                f36174sd = jElapsedRealtime;
                com.bytedance.sdk.component.utils.rs.hww().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.khx.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strTq = com.bytedance.sdk.openadsdk.core.settings.vhb.tq(bs.hww());
                        if (TextUtils.equals(strTq, com.bytedance.sdk.openadsdk.core.settings.vhb.vy)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.vhb.sd().hww(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.vhb.vy = strTq;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int vy() {
        return f36171hu;
    }

    public static long hww() {
        return f36172hv;
    }

    public static void hww(int i10) {
        f36171hu = i10;
    }

    public static void hww(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    rs.tq().tq(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("InitHelper", th2.getMessage());
        }
    }
}

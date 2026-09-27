package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class syb {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.ok.sd.hu f37688hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.ok.sd.hu f37689hv;
    private static volatile ThreadPoolExecutor hww;
    private static volatile com.bytedance.sdk.component.ok.sd.hu nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.ok.sd.hu f37690ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.ok.sd.hu f37691rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.ok.sd.hu f37692sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile boolean f37693tq;
    private static volatile com.bytedance.sdk.component.ok.sd.hu vgm;
    private static volatile com.bytedance.sdk.component.ok.sd.hu vhb;
    private static volatile com.bytedance.sdk.component.ok.sd.hu vy;

    static {
        com.bytedance.sdk.component.ok.sd.sd.hww(new com.bytedance.sdk.component.ok.sd.hww() { // from class: com.bytedance.sdk.openadsdk.utils.syb.1
            @Override // com.bytedance.sdk.component.ok.sd.hww
            public void hww(com.bytedance.sdk.component.ok.sd.hu huVar, com.bytedance.sdk.component.ok.sd.tq tqVar) {
                tqVar.tq();
                new RuntimeException();
            }
        });
        hww = null;
        f37693tq = false;
    }

    private static com.bytedance.sdk.component.ok.sd.hu bs() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = vhb;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(vhb)) {
                    try {
                        vhb = hww("imgdisk", vhb);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = vhb;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    private static com.bytedance.sdk.component.ok.sd.hu ed() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = vy;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(vy)) {
                    try {
                        vy = hww("log", vy);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = vy;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static boolean hu() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService hv() {
        return rs();
    }

    public static ScheduledExecutorService hww() {
        return com.bytedance.sdk.component.ok.hu.vy();
    }

    private static com.bytedance.sdk.component.ok.sd.hu khx() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = f37689hv;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(f37689hv)) {
                    try {
                        f37689hv = hww("aidl", f37689hv);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = f37689hv;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static com.bytedance.sdk.component.ok.sd.hu nod() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = f37691rs;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(f37691rs)) {
                    try {
                        f37691rs = hww("express", f37691rs);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = f37691rs;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    private static ThreadPoolExecutor ny() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = f37692sd;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(f37692sd)) {
                    try {
                        f37692sd = hww("ad", f37692sd);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = f37692sd;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static ExecutorService ok() {
        return wgt();
    }

    public static com.bytedance.sdk.component.ok.sd.hu rs() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = f37688hu;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(f37688hu)) {
                    try {
                        f37688hu = hww("cache", f37688hu);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = f37688hu;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static ExecutorService sd() {
        return bs();
    }

    public static ExecutorService tq() {
        return weu();
    }

    public static boolean vgm() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static com.bytedance.sdk.component.ok.sd.hu vhb() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = nod;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(nod)) {
                    try {
                        nod = hww("net", nod);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = nod;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static ExecutorService vy() {
        return ed();
    }

    private static com.bytedance.sdk.component.ok.sd.hu weu() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = f37690ok;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(f37690ok)) {
                    try {
                        f37690ok = hww("image", f37690ok);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = f37690ok;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    private static com.bytedance.sdk.component.ok.sd.hu wgt() {
        com.bytedance.sdk.component.ok.sd.hu huVar;
        com.bytedance.sdk.component.ok.sd.hu huVar2 = vgm;
        if (!hww(huVar2)) {
            return huVar2;
        }
        synchronized (syb.class) {
            try {
                if (hww(vgm)) {
                    try {
                        vgm = hww("io", vgm);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                huVar = vgm;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return huVar;
    }

    public static void hv(final com.bytedance.sdk.component.ok.ok okVar) {
        if (oxu.hww) {
            return;
        }
        ny().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName(), okVar) { // from class: com.bytedance.sdk.openadsdk.utils.syb.9
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void hww(Runnable runnable) {
        if (runnable == null || oxu.hww) {
            return;
        }
        if (hu()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.khx.sd().post(runnable);
        }
    }

    public static void sd(final com.bytedance.sdk.component.ok.ok okVar) {
        if (okVar == null || oxu.hww) {
            return;
        }
        ed().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.5
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void tq(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.khx.sd().removeCallbacks(runnable);
    }

    public static void vy(final com.bytedance.sdk.component.ok.ok okVar) {
        if (okVar == null || oxu.hww) {
            return;
        }
        ny().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.7
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void tq(final com.bytedance.sdk.component.ok.ok okVar) {
        if (oxu.hww) {
            return;
        }
        wgt().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.3
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void sd(final com.bytedance.sdk.component.ok.ok okVar, int i10) {
        if (okVar == null || oxu.hww) {
            return;
        }
        khx().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.8
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void tq(final com.bytedance.sdk.component.ok.ok okVar, int i10) {
        if (okVar == null || oxu.hww) {
            return;
        }
        com.bytedance.sdk.component.ok.sd.tq tqVar = new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.6
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        };
        tqVar.hww(i10);
        ed().execute(tqVar);
    }

    public static void hww(final com.bytedance.sdk.component.ok.ok okVar) {
        if (oxu.hww) {
            return;
        }
        rs().execute(new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.2
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        });
    }

    public static void hww(final com.bytedance.sdk.component.ok.ok okVar, int i10) {
        if (okVar == null || oxu.hww) {
            return;
        }
        com.bytedance.sdk.component.ok.sd.tq tqVar = new com.bytedance.sdk.component.ok.sd.tq(okVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.syb.4
            @Override // java.lang.Runnable
            public void run() {
                okVar.run();
            }
        };
        tqVar.hww(i10);
        wgt().execute(tqVar);
    }

    private static com.bytedance.sdk.component.ok.sd.hu.hww tq(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.ok.sd.hu.hww hwwVar = new com.bytedance.sdk.component.ok.sd.hu.hww();
        str.getClass();
        switch (str) {
            case "express":
                return hwwVar.hww(str).hww(2).tq(4).sd(0).hww(10000L).hww(true).hv(-1).vy(10).tq(false);
            case "ad":
                return hwwVar.hww(str).hww(4).tq(4).sd(0).hww(20000L).hww(true).hv(-1).vy(10).tq(false);
            case "io":
                return hwwVar.hww(str).hww(4).tq(10).sd(0).hww(20000L).hww(true).hv(-1).vy(10).tq(false);
            case "log":
                return hwwVar.hww(str).hww(4).tq(6).sd(2).hww(20000L).hww(true).hv(-1).vy(10).tq(false);
            case "net":
                return hwwVar.hww(str).hww(10).tq(10).sd(0).hww(10000L).hww(true).hv(-1).vy(10).tq(false);
            case "aidl":
                return hwwVar.hww(str).hww(2).tq(4).sd(0).hww(10000L).hww(true).hv(-1).vy(10).tq(false);
            case "cache":
                return hwwVar.hww(str).hww(0).tq(0).sd(0).hww(5000L).hww(true).hv(-1).vy(20).tq(false);
            case "image":
                return hwwVar.hww(str).hww(3).tq(3).sd(0).hww(20000L).hww(true).hv(-1).vy(10).tq(false);
            case "monitor":
                return hwwVar.hww(str).hww(2).tq(2).sd(0).hww(10000L).hww(true).hv(-1).vy(10).tq(false);
            case "imgdisk":
                return hwwVar.hww(str).hww(1).tq(2).sd(3).hww(10000L).hww(true).hv(-1).vy(10).tq(false);
            default:
                return hwwVar.hww(str).hww(8).tq(16).sd(2).hww(20000L).hww(true).hv(-1).vy(10).tq(false);
        }
    }

    public static void hww(com.bytedance.sdk.component.ok.sd.tq tqVar) {
        vhb().execute(tqVar);
    }

    private static boolean hww(com.bytedance.sdk.component.ok.sd.hu huVar) {
        if (huVar != null) {
            return !huVar.hww() && com.bytedance.sdk.openadsdk.core.settings.vhb.lb();
        }
        return true;
    }

    private static com.bytedance.sdk.component.ok.sd.hu hww(String str, com.bytedance.sdk.component.ok.sd.hu huVar) {
        com.bytedance.sdk.component.ok.sd.hu.hww hwwVarHww = hww(str);
        if (huVar == null) {
            return hwwVarHww.hww();
        }
        huVar.hww(hwwVarHww);
        return huVar;
    }

    private static com.bytedance.sdk.component.ok.sd.hu.hww hww(String str) {
        com.bytedance.sdk.component.ok.sd.hu.hww hwwVarTq = tq(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.vhb.lb()) {
                hwwVarTq.tq(true);
                JSONObject jSONObjectCu = com.bytedance.sdk.openadsdk.core.settings.vhb.sd().cu();
                JSONObject jSONObjectOptJSONObject = jSONObjectCu != null ? jSONObjectCu.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    hwwVarTq.tq(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        hwwVarTq.hww(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        hwwVarTq.tq(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        hwwVarTq.sd(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        hwwVarTq.hww(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        hwwVarTq.hww(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return hwwVarTq;
        } catch (Throwable th2) {
            th2.getMessage();
            return hwwVarTq;
        }
    }
}

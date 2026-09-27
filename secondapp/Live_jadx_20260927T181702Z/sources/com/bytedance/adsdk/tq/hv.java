package com.bytedance.adsdk.tq;

import android.content.Context;
import android.os.Trace;
import androidx.media3.session.fe;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static long[] f31967hu = null;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static String[] f31968hv = null;
    public static boolean hww = false;
    private static com.bytedance.adsdk.tq.vy.hv nod = null;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private static volatile com.bytedance.adsdk.tq.vy.vgm f31969ny = null;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static int f31970ok = 0;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static com.bytedance.adsdk.tq.vy.hu f31971rs = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static boolean f31972sd = true;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static boolean f31973tq = false;
    private static int vgm = 0;
    private static volatile com.bytedance.adsdk.tq.vy.ok vhb = null;
    private static boolean vy = true;

    public static void hww(String str) {
        if (f31973tq) {
            int i10 = vgm;
            if (i10 == 20) {
                f31970ok++;
                return;
            }
            f31968hv[i10] = str;
            f31967hu[i10] = System.nanoTime();
            Trace.beginSection(str);
            vgm++;
        }
    }

    public static float tq(String str) {
        int i10 = f31970ok;
        if (i10 > 0) {
            f31970ok = i10 - 1;
            return 0.0f;
        }
        if (!f31973tq) {
            return 0.0f;
        }
        int i11 = vgm - 1;
        vgm = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f31968hv[i11])) {
            Trace.endSection();
            return (System.nanoTime() - f31967hu[vgm]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f31968hv[vgm] + fe.F);
    }

    public static com.bytedance.adsdk.tq.vy.ok hww(Context context) {
        com.bytedance.adsdk.tq.vy.ok okVar;
        com.bytedance.adsdk.tq.vy.ok okVar2 = vhb;
        if (okVar2 != null) {
            return okVar2;
        }
        synchronized (com.bytedance.adsdk.tq.vy.ok.class) {
            try {
                okVar = vhb;
                if (okVar == null) {
                    com.bytedance.adsdk.tq.vy.vgm vgmVarTq = tq(context);
                    com.bytedance.adsdk.tq.vy.hu tqVar = f31971rs;
                    if (tqVar == null) {
                        tqVar = new com.bytedance.adsdk.tq.vy.tq();
                    }
                    okVar = new com.bytedance.adsdk.tq.vy.ok(vgmVarTq, tqVar);
                    vhb = okVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return okVar;
    }

    public static com.bytedance.adsdk.tq.vy.vgm tq(Context context) {
        com.bytedance.adsdk.tq.vy.vgm vgmVar;
        if (!f31972sd) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.tq.vy.vgm vgmVar2 = f31969ny;
        if (vgmVar2 != null) {
            return vgmVar2;
        }
        synchronized (com.bytedance.adsdk.tq.vy.vgm.class) {
            try {
                vgmVar = f31969ny;
                if (vgmVar == null) {
                    com.bytedance.adsdk.tq.vy.hv hvVar = nod;
                    if (hvVar == null) {
                        hvVar = new com.bytedance.adsdk.tq.vy.hv() { // from class: com.bytedance.adsdk.tq.hv.1
                            @Override // com.bytedance.adsdk.tq.vy.hv
                            public File hww() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    vgmVar = new com.bytedance.adsdk.tq.vy.vgm(hvVar);
                    f31969ny = vgmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vgmVar;
    }

    public static boolean hww() {
        return vy;
    }
}

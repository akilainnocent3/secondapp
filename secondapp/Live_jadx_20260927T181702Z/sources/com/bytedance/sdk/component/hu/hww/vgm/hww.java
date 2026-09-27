package com.bytedance.sdk.component.hu.hww.vgm;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.hu.hww.hv;
import com.bytedance.sdk.component.hu.hww.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static volatile HandlerThread hww = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static int f34630sd = 3000;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile Handler f34631tq;

    static {
        sd();
    }

    public static Handler hww() {
        if (hww == null || !hww.isAlive()) {
            synchronized (hww.class) {
                try {
                    if (hww == null || !hww.isAlive()) {
                        sd();
                        f34631tq = new Handler(hww.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (f34631tq == null) {
            synchronized (hww.class) {
                try {
                    if (f34631tq == null) {
                        f34631tq = new Handler(hww.getLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f34631tq;
    }

    private static void sd() {
        HandlerThread handlerThreadHww;
        hv hvVarWgt = ok.vgm().wgt();
        if (hvVarWgt != null && (handlerThreadHww = hvVarWgt.hww("csj_ad_log", 10)) != null) {
            hww = handlerThreadHww;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        hww = handlerThread;
        handlerThread.start();
    }

    public static int tq() {
        if (f34630sd <= 0) {
            f34630sd = 3000;
        }
        return f34630sd;
    }
}

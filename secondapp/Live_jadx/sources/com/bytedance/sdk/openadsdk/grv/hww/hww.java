package com.bytedance.sdk.openadsdk.grv.hww;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static Handler hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static HandlerThread f37187tq;

    public static Handler hww() {
        try {
            HandlerThread handlerThread = f37187tq;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (hww.class) {
                    try {
                        HandlerThread handlerThread2 = f37187tq;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            f37187tq = ok.hww("csj_ev");
                            hww = new Handler(f37187tq.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (hww == null) {
                synchronized (hww.class) {
                    try {
                        if (hww == null) {
                            hww = new Handler(f37187tq.getLooper());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hww;
    }
}

package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {
    private static HandlerThread hww;

    public static void hww(HandlerThread handlerThread) {
        hww = handlerThread;
    }

    public static HandlerThread hww(String str) {
        return hww(str, 0);
    }

    public static HandlerThread hww(String str, int i10) {
        if (com.bytedance.sdk.component.ok.rs.vy) {
            return hww;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i10) { // from class: com.bytedance.sdk.component.utils.ok.1
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
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th2) {
            omn.hww("HandlerThreadUtils", "new handlerThread error", th2);
            return hww;
        }
    }
}

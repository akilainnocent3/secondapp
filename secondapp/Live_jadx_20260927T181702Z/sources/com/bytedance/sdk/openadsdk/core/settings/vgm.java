package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.omn;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {
    private static final AtomicInteger hww = new AtomicInteger(1);

    public static boolean hww() {
        return hww.get() == 1;
    }

    public static void hww(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = hww;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th2) {
                        th = th2;
                        omn.sd("SdkSwitch", th.getMessage());
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            if (z10) {
                Log.e("SdkSwitch", "switch status changed: " + hww());
                if (hww()) {
                    com.bytedance.sdk.openadsdk.vy.hww.tq.tq();
                } else {
                    com.bytedance.sdk.openadsdk.vy.hww.tq.sd();
                }
            }
        }
    }
}

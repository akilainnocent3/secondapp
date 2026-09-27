package com.bykv.vk.openvk.hww.hww.tq.tq;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class hww {
    public static boolean hww() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}

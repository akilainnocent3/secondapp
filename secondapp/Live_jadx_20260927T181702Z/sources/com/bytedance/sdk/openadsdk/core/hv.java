package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends hu {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile hv hww;

    private hv(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu
    public /* bridge */ /* synthetic */ hu.sd hww() {
        return super.hww();
    }

    public static hv hww(Context context) {
        if (hww == null) {
            synchronized (hv.class) {
                try {
                    if (hww == null) {
                        hww = new hv(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }
}

package com.bytedance.sdk.component.hu.hww.hww.hww;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends tq {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile hww hww;

    private hww(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.tq
    public /* bridge */ /* synthetic */ tq.C0322tq hww() {
        return super.hww();
    }

    public static hww hww(Context context) {
        if (hww == null) {
            synchronized (hww.class) {
                try {
                    if (hww == null) {
                        hww = new hww(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }
}

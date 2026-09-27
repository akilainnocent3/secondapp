package com.bytedance.sdk.openadsdk.vy.hww;

import android.content.Context;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ny;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static AtomicInteger hww = new AtomicInteger(0);

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final AtomicBoolean f37902tq = new AtomicBoolean(false);

    public static void hww(Context context, boolean z10) {
        try {
            if (f37902tq.compareAndSet(false, true)) {
                com.bytedance.sdk.component.hu.hww.tq.hww(new com.bytedance.sdk.component.hu.hww.hww.C0321hww().hww(new vgm()).tq(com.bytedance.sdk.component.hu.hww.vy.tq.hww.sd()).sd(com.bytedance.sdk.component.hu.hww.vy.tq.hww.hv()).hww(com.bytedance.sdk.component.hu.hww.vy.tq.hww.vy()).hww(z10).hww(new ok()).hww(hv.hww).tq(bs.vy().weu()).hww(bs.vy().wgt()).hww(bs.vy().kft()).hww(), context);
                tq();
            }
        } catch (Throwable unused) {
            f37902tq.set(false);
        }
    }

    public static void sd() {
        try {
            com.bytedance.sdk.component.hu.hww.tq.vy();
            com.bytedance.sdk.component.hu.hww.tq.hv();
        } catch (Throwable th2) {
            omn.sd("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void tq() {
        com.bytedance.sdk.component.hu.hww.tq.sd();
    }

    public static void hww(com.bytedance.sdk.openadsdk.vy.hww hwwVar) {
        com.bytedance.sdk.component.hu.hww.vy.hww.hww hwwVar2 = new com.bytedance.sdk.component.hu.hww.vy.hww.hww(hwwVar.vy(), hwwVar);
        hwwVar2.tq(hwwVar.hv() ? (byte) 1 : (byte) 2);
        hwwVar2.hww((byte) 0);
        if (com.bytedance.sdk.component.hu.hww.tq.tq()) {
            hww(bs.hww(), com.bytedance.sdk.openadsdk.multipro.tq.sd());
        }
        com.bytedance.sdk.component.hu.hww.tq.hww(hwwVar2);
    }

    public static com.bytedance.sdk.openadsdk.wgt.sd.sd hww() {
        return rs.hww;
    }

    public static void hww(final List<String> list, final int i10, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.vy.sd.hww(new com.bytedance.sdk.component.ok.ok("track") { // from class: com.bytedance.sdk.openadsdk.vy.hww.tq.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.hu.hww.tq.tq()) {
                    tq.hww(bs.hww(), com.bytedance.sdk.openadsdk.multipro.tq.sd());
                }
                com.bytedance.sdk.component.hu.hww.tq.hww(ny.hww(bs.hww()), list, true, i10, str);
            }
        });
    }

    public static void hww(String str) {
        hww(str, false);
    }

    public static void hww(String str, boolean z10) {
        if (com.bytedance.sdk.component.hu.hww.tq.tq()) {
            hww(bs.hww(), com.bytedance.sdk.openadsdk.multipro.tq.sd());
        }
        com.bytedance.sdk.component.hu.hww.tq.hww(str, z10);
    }
}

package com.bytedance.sdk.component.adexpress.vy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    public static void hww(com.bytedance.sdk.component.ok.ok okVar, int i10) {
        if (okVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hww.hww.sd sdVarSd = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd();
        ExecutorService executorServiceKhx = sdVarSd != null ? sdVarSd.khx() : null;
        if (executorServiceKhx == null) {
            com.bytedance.sdk.component.ok.hu.hww(okVar, i10);
        } else {
            okVar.setPriority(i10);
            executorServiceKhx.execute(okVar);
        }
    }

    public static void tq(com.bytedance.sdk.component.ok.ok okVar, int i10) {
        if (okVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hww.hww.sd sdVarSd = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd();
        ExecutorService executorServiceEd = sdVarSd != null ? sdVarSd.ed() : null;
        if (executorServiceEd == null) {
            com.bytedance.sdk.component.ok.hu.hww(okVar);
        } else {
            okVar.setPriority(i10);
            executorServiceEd.execute(okVar);
        }
    }

    public static ScheduledFuture hww(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.ok.hu.vy().schedule(runnable, j10, timeUnit);
    }
}

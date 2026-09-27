package com.bytedance.sdk.component.hu.hww.tq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.hww.hv;
import com.bytedance.sdk.component.hu.hww.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static boolean hu() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.hu())) ? false : true;
    }

    public static boolean hv() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.sd())) ? false : true;
    }

    public static long hww(int i10, Context context) {
        return tq(i10, context);
    }

    public static boolean sd() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.vy())) ? false : true;
    }

    private static long tq(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean vy() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.hv())) ? false : true;
    }

    public static boolean hww() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.hww())) ? false : true;
    }

    public static boolean tq() {
        hv hvVarVy = ok.vgm().vy();
        return (hvVarVy == null || TextUtils.isEmpty(hvVarVy.tq())) ? false : true;
    }
}

package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {
    static int hww = -1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static long f37695sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    static float f37696tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public final int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public final float f37697tq;

        public hww(int i10, float f10) {
            this.hww = i10;
            this.f37697tq = f10;
        }
    }

    private static void hww(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            hww = 1;
        } else {
            hww = 0;
        }
        f37696tq = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static hww hww() {
        if (f37695sd == 0 || SystemClock.elapsedRealtime() - f37695sd > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.bs.hww().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                hww(intentRegisterReceiver);
                f37695sd = SystemClock.elapsedRealtime();
            }
        }
        return new hww(hww, f37696tq);
    }
}

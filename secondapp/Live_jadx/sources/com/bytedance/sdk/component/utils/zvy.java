package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zvy {
    private static final Object hww = new Object();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final Map<hww, Object> f35108tq = new ConcurrentHashMap();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static AtomicBoolean f35107sd = new AtomicBoolean(false);
    private static volatile int vy = -1;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static volatile long f35105hv = 0;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile int f35104hu = 60000;
    private static mrs vgm = null;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static final AtomicBoolean f35106ok = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(Context context, Intent intent, boolean z10, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq extends BroadcastReceiver {
        private tq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean z10 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (zvy.f35108tq != null && zvy.f35108tq.size() > 0) {
                    z10 = true;
                }
                zvy.tq(context, intent, z10, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }

    private static int sd(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        mrs mrsVar = vgm;
                        return (mrsVar == null || !mrsVar.hww(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            vy = 0;
        } else if (f35106ok.compareAndSet(false, true)) {
            com.bytedance.sdk.component.ok.hu.tq(new com.bytedance.sdk.component.ok.ok("getNetworkType") { // from class: com.bytedance.sdk.component.utils.zvy.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = zvy.vy = z11 ? 0 : zvy.tq(context);
                    zvy.f35106ok.set(false);
                    if (z10) {
                        zvy.tq(context, intent, zvy.vy, z11);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq(Context context, Intent intent, int i10, boolean z10) {
        Map<hww, Object> map = f35108tq;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (hww hwwVar : map.keySet()) {
            if (hwwVar != null) {
                try {
                    hwwVar.hww(context, intent, !z10, i10);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int hww(Context context, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f35105hv + j10 <= jElapsedRealtime) {
            return tq(context);
        }
        if (vy == -1) {
            return tq(context);
        }
        if (jElapsedRealtime - f35105hv >= f35104hu) {
            tq(context, (Intent) null, false, false);
        }
        return vy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int tq(Context context) {
        vy = sd(context);
        f35105hv = SystemClock.elapsedRealtime();
        return vy;
    }

    public static void hww(hww hwwVar, Context context) {
        if (hwwVar == null) {
            return;
        }
        if (!f35107sd.get()) {
            try {
                context.registerReceiver(new tq(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f35107sd.set(true);
            } catch (Throwable unused) {
            }
        }
        f35108tq.put(hwwVar, hww);
    }

    public static void hww(hww hwwVar) {
        if (hwwVar == null) {
            return;
        }
        f35108tq.remove(hwwVar);
    }
}

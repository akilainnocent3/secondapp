package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f44326a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f44327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelephonyManager f44328c;

    public b(TelephonyManager telephonyManager, h hVar) {
        this.f44328c = telephonyManager;
        this.f44327b = hVar;
    }

    public final void a() {
        this.f44327b = null;
        TelephonyManager telephonyManager = this.f44328c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f44326a.shutdownNow();
    }

    public final void b() {
        TelephonyManager telephonyManager = this.f44328c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f44326a, this);
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.f44328c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        z0 z0Var;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType == 2 || overrideNetworkType == 3 || overrideNetworkType == 5) {
            z0Var = z0.MOBILE_5G;
        } else if (networkType == 0) {
            z0Var = z0.UNKNOWN;
        } else if (networkType == 3) {
            z0Var = z0.MOBILE_3G;
        } else if (networkType == 18) {
            z0Var = z0.WIFI;
        } else if (networkType == 20) {
            z0Var = z0.MOBILE_5G;
        } else if (networkType != 5 && networkType != 6) {
            switch (networkType) {
                default:
                    switch (networkType) {
                        case 12:
                        case 14:
                        case 15:
                            break;
                        case 13:
                            z0Var = z0.MOBILE_4G;
                            break;
                        default:
                            z0Var = z0.CELLULAR;
                            break;
                    }
                case 8:
                case 9:
                case 10:
                    z0Var = z0.MOBILE_3G;
                    break;
            }
        } else {
            z0Var = z0.MOBILE_3G;
        }
        h hVar = this.f44327b;
        if (hVar != null) {
            hVar.a(z0Var);
        }
    }
}

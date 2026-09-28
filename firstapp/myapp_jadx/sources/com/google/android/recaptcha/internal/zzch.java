package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import defpackage.kpu;
import defpackage.t3g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class zzch {
    public zzch() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzvs.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzvs.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzvs.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzvs.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzvs.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return t3g.a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapG = kpu.g(new Pair(0, zzvs.NET_CAPABILITY_MMS), new Pair(1, zzvs.NET_CAPABILITY_SUPL), new Pair(2, zzvs.NET_CAPABILITY_DUN), new Pair(3, zzvs.NET_CAPABILITY_FOTA), new Pair(4, zzvs.NET_CAPABILITY_IMS), new Pair(5, zzvs.NET_CAPABILITY_CBS), new Pair(6, zzvs.NET_CAPABILITY_WIFI_P2P), new Pair(7, zzvs.NET_CAPABILITY_IA), new Pair(8, zzvs.NET_CAPABILITY_RCS), new Pair(9, zzvs.NET_CAPABILITY_XCAP), new Pair(10, zzvs.NET_CAPABILITY_EIMS), new Pair(11, zzvs.NET_CAPABILITY_NOT_METERED), new Pair(12, zzvs.NET_CAPABILITY_INTERNET), new Pair(13, zzvs.NET_CAPABILITY_NOT_RESTRICTED), new Pair(14, zzvs.NET_CAPABILITY_TRUSTED), new Pair(15, zzvs.NET_CAPABILITY_NOT_VPN));
        linkedHashMapG.put(17, zzvs.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapG.put(16, zzvs.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMapG.put(18, zzvs.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapG.put(19, zzvs.NET_CAPABILITY_FOREGROUND);
            linkedHashMapG.put(20, zzvs.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapG.put(21, zzvs.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapG.put(23, zzvs.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapG.put(25, zzvs.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapG.put(32, zzvs.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapG.put(29, zzvs.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapG.put(35, zzvs.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapG.put(34, zzvs.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapG.put(33, zzvs.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapG;
    }
}

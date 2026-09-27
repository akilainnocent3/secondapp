package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f70482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f70483b;

    public static boolean a() {
        if (f70482a == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f70482a = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f70482a != null && f70482a.booleanValue();
    }

    public static boolean b() {
        if (f70483b == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                f70483b = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f70483b != null && f70483b.booleanValue();
    }
}

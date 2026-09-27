package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f67423a;

    public static synchronized ConnectivityManager a() {
        try {
            if (f67423a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                f67423a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        return f67423a;
    }
}

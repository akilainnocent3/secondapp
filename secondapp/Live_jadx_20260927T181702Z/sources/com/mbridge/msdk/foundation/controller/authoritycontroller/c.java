package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f66705j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f66705j == null) {
            synchronized (c.class) {
                try {
                    if (f66705j == null) {
                        f66705j = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f66705j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.x0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.w0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.y0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iL0 = gVarD.l0();
        boolean z11 = iL0 != 0 ? iL0 == 1 && a(gVarD, str) == 1 : a(str) == 1 && a(gVarD, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            return (gVarD.I0() || z10 || a(str) != 1) ? false : true;
        }
        return z11;
    }
}

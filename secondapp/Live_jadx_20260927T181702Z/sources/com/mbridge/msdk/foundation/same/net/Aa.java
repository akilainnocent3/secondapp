package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f67097a = "";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.killProcess(Process.myPid());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static String a() {
        return f67097a;
    }

    public static String b() {
        return null;
    }

    private static Integer c(String str) {
        Throwable th2;
        Integer numValueOf;
        if (str != null) {
            int iIndexOf = str.indexOf(C_START);
            int iIndexOf2 = str.indexOf(C_END);
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf2 > iIndexOf) {
                try {
                    numValueOf = Integer.valueOf(str.substring(iIndexOf + 11, iIndexOf2));
                    try {
                        if (numValueOf.intValue() > 0) {
                            return numValueOf;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        th2.printStackTrace();
                        return numValueOf;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    numValueOf = null;
                }
            }
        }
        return null;
    }

    private static void g() {
        new Handler().postDelayed(new a(), 500L);
    }

    private static void b(String str) {
        String strA;
        Integer numC;
        if (!TextUtils.isEmpty(str)) {
            try {
                strA = k0.a(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
                strA = null;
            }
            if (!TextUtils.isEmpty(strA) && strA.startsWith(C_START) && strA.endsWith(C_END) && (numC = c(strA)) != null) {
                f67097a = String.valueOf(numC);
            } else {
                if (MBridgeConstans.DEBUG) {
                    g();
                    throw new RuntimeException("please don't update this value");
                }
                f67097a = "";
            }
        }
        if (com.mbridge.msdk.config.manager.a.b().c()) {
            HashMap map = new HashMap();
            map.put("channel", a());
            com.mbridge.msdk.config.manager.a.b().a(com.mbridge.msdk.config.component.common.util.c.a(), "c22", map);
        }
    }
}

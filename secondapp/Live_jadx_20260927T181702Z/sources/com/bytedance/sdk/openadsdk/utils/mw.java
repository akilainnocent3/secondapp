package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mw {
    private static String hww = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static String f37664sd = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static String f37665tq = null;
    private static volatile boolean vy = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends com.bytedance.sdk.component.ok.ok {
        public static AtomicBoolean hww = new AtomicBoolean(false);

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private static final AtomicLong f37666tq = new AtomicLong(0);

        public hww(String str, int i10) {
            super(str, i10);
        }

        public static void hww() {
            if (hww.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f37666tq;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            syb.tq((com.bytedance.sdk.component.ok.ok) new hww("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            hww.set(true);
            mw.hv();
            hww.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hv() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.bs.hww() == null) {
            return;
        }
        vy = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.bs.hww().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    vy = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.sd("SimUtils", th2.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                hww = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f37665tq = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            f37664sd = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String hww() {
        hww.hww();
        return hww;
    }

    public static String sd() {
        hww.hww();
        return f37664sd;
    }

    public static String tq() {
        try {
            hww.hww();
            if (!vy) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(vy ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.omn.sd("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.bs.hww().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : f37665tq;
            com.bytedance.sdk.component.utils.omn.sd("MCC", "config=" + configuration.mcc + ",sMCC=" + f37665tq);
            return strValueOf;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("SimUtils", th2.getMessage());
            return null;
        }
    }
}

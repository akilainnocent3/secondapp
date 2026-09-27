package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f26249a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26250b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26251c;

    public static MonitorCrash a() {
        if (f26249a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f26249a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f26249a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f26250b == -1) {
            f26250b = 5;
        }
        int i10 = f26251c;
        if (i10 < f26250b) {
            f26251c = i10 + 1;
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}

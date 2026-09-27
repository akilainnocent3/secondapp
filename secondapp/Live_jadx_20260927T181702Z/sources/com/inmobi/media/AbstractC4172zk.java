package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4172zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C4003t1 f58284a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e10) {
            kotlin.jvm.internal.m0.o("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C4003t1 c4003t1 = f58284a;
            if (c4003t1 == null || (str = c4003t1.f57687b) == null) {
                return;
            }
            kotlin.jvm.internal.m0.o("zk", "TAG");
            Kb.a((byte) 2, "zk", "Publisher device Id is " + str);
        } catch (Exception e10) {
            kotlin.jvm.internal.m0.o("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void c() {
        boolean z10;
        boolean zBooleanValue;
        C4003t1 c4003t1;
        try {
            Context context = Ji.f54934a;
            if (context != null) {
                C4003t1 c4003t2 = new C4003t1();
                try {
                    kotlin.jvm.internal.m1.d(AdvertisingIdClient.class).K();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        kotlin.jvm.internal.m0.o(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c4003t2.f57687b = advertisingIdInfo.getId();
                        c4003t2.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f58284a = c4003t2;
                        Boolean bool = Tg.f55548b;
                        if (bool == null) {
                            Context context2 = Ji.f54934a;
                            z10 = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                                Ea eaA = Da.a(context2, "user_info_store");
                                kotlin.jvm.internal.m0.p("user_age_restricted", "key");
                                Tg.f55548b = Boolean.valueOf(eaA.f54560a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = Tg.f55548b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z10 || (c4003t1 = f58284a) == null) {
                                return;
                            }
                            c4003t1.f57687b = null;
                            return;
                            kotlin.jvm.internal.m0.o("zk", "TAG");
                            e.getMessage();
                        }
                        zBooleanValue = bool.booleanValue();
                        z10 = zBooleanValue;
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e10) {
                        kotlin.jvm.internal.m0.o("zk", "TAG");
                        e10.getMessage();
                        return;
                    }
                } catch (NoClassDefFoundError unused) {
                    return;
                }
                kotlin.jvm.internal.m0.o("zk", "TAG");
                e.getMessage();
            }
        } catch (Exception e11) {
            kotlin.jvm.internal.m0.o("zk", "TAG");
            e11.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z10) {
        C4003t1 c4003t1 = f58284a;
        if (c4003t1 == null) {
            return;
        }
        if (z10) {
            c4003t1.f57687b = null;
        } else if (c4003t1.f57687b == null) {
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.r30
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4172zk.d();
                }
            };
            Context context = Ji.f54934a;
            kotlin.jvm.internal.m0.p(runnable, "runnable");
            Ji.f54940g.submit(runnable);
        }
    }
}

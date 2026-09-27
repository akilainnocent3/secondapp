package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Ea f55478a;

    public static final Ea a() {
        Ea eaA;
        if (f55478a == null) {
            Context context = Ji.f54934a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                eaA = Da.a(context, "CrashSession-store");
            } else {
                eaA = null;
            }
            f55478a = eaA;
        }
        return f55478a;
    }
}

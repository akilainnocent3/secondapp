package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3570bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ea f56085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f56087c;

    static {
        Ea eaA;
        Context context = Ji.f54934a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f54559b;
            eaA = Da.a(context, "imtelemetrydboverflow");
        } else {
            eaA = null;
        }
        f56085a = eaA;
        f56086b = -1;
    }

    public static int a() {
        if (f56086b == -1) {
            Ea ea2 = f56085a;
            int i10 = 0;
            if (ea2 != null) {
                kotlin.jvm.internal.m0.p("count", "key");
                i10 = ea2.f54560a.getInt("count", 0);
            }
            f56086b = i10;
        }
        return f56086b;
    }
}

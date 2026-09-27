package com.tiktok.appevents;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f76063a = "com.tiktok.appevents.d0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<c> f76064b = new ArrayList();

    public static synchronized void a(c event) {
        kp.i.a(f76063a);
        f76064b.add(event);
        d();
    }

    public static synchronized void b() {
        try {
            kp.i.a(f76063a);
            f76064b = new ArrayList();
            d();
        } catch (Throwable unused) {
        }
    }

    public static synchronized List<c> c() {
        List<c> list;
        list = f76064b;
        f76064b = new ArrayList();
        d();
        return list;
    }

    public static void d() {
        dp.c.f fVar = dp.c.f79409w;
        if (fVar != null) {
            fVar.a(f76064b.size());
        }
        if (dp.c.f79411y != null) {
            dp.c.f79411y.b(100, Math.max(100 - e(), 0));
        }
    }

    public static synchronized int e() {
        return f76064b.size();
    }
}

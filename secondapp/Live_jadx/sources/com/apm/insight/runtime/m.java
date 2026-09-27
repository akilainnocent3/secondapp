package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f26265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f26266b;

    public static p a() {
        if (f26265a == null) {
            b();
        }
        return f26265a;
    }

    private static HandlerThread b() {
        if (f26265a == null) {
            synchronized (m.class) {
                try {
                    if (f26265a == null) {
                        p pVar = new p("default_npth_thread");
                        f26265a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f26265a.c();
    }
}

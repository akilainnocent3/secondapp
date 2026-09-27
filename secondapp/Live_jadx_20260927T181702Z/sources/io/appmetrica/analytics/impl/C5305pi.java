package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5305pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98147a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5536z0 f98148b;

    public C5305pi(C5536z0 c5536z0) {
        this.f98148b = c5536z0;
    }

    public static C5305pi a() {
        return AbstractC5280oi.f98078a;
    }

    public final C5102hi a(Context context, String str) {
        C5102hi c5102hi;
        C5102hi c5102hi2 = (C5102hi) this.f98147a.get(str);
        if (c5102hi2 != null) {
            return c5102hi2;
        }
        synchronized (this.f98147a) {
            try {
                c5102hi = (C5102hi) this.f98147a.get(str);
                if (c5102hi == null) {
                    IHandlerExecutor iHandlerExecutorA = C4959c4.l().f97038c.a();
                    this.f98148b.getClass();
                    if (C5511y0.f98631e == null) {
                        ((A9) iHandlerExecutorA).f95546b.post(new RunnableC5255ni(this, context));
                    }
                    c5102hi = new C5102hi(context.getApplicationContext(), str, new C5536z0());
                    this.f98147a.put(str, c5102hi);
                    c5102hi.d(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5102hi;
    }
}

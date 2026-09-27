package com.inmobi.media;

import android.content.Context;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f54312a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f54313b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54314c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4152z0 f54315d = new C4152z0(this);

    public A0() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.bp
            @Override // java.lang.Runnable
            public final void run() {
                A0.a(this.f56102b);
            }
        };
        Context context = Ji.f54934a;
        kotlin.jvm.internal.m0.p(runnable, "runnable");
        Ji.f54940g.submit(runnable);
    }

    public static final void a(A0 a10) {
        H0 h10 = (H0) E0.f54539a.getValue();
        C4152z0 listener = a10.f54315d;
        h10.getClass();
        kotlin.jvm.internal.m0.p(listener, "listener");
        h10.f54750b = new WeakReference(listener);
    }

    public static final dr.w2 b(A0 a10) {
        a10.f54312a.set(true);
        C3733i4 c3733i4 = Y3.f55798a;
        kotlin.jvm.internal.m0.p(AdConfig.class, "clazz");
        jv.k.f(A9.f54334c, null, null, new C4127y0(a10, (AdConfig) c3733i4.a(AdConfig.class), null), 3, null);
        return dr.w2.f79517a;
    }

    public final void a() {
        AbstractC3601d.a(new ds.a() { // from class: com.inmobi.media.ap
            @Override // ds.a
            public final Object invoke() {
                return A0.b(this.f56011b);
            }
        });
    }

    public static void a(AdQualityResult result) {
        kotlin.jvm.internal.m0.p(result, "result");
        try {
            jv.j.b(null, new C4102x0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            new File(result.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}

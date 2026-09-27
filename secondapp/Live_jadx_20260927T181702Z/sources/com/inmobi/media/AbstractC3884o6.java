package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3884o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr.i0 f57186a = dr.k0.b(new ds.a() { // from class: com.inmobi.media.c00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dr.i0 f57187b = dr.k0.b(new ds.a() { // from class: com.inmobi.media.d00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dr.i0 f57188c = dr.k0.b(new ds.a() { // from class: com.inmobi.media.e00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.e();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dr.i0 f57189d = dr.k0.b(new ds.a() { // from class: com.inmobi.media.f00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.b();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dr.i0 f57190e = dr.k0.b(new ds.a() { // from class: com.inmobi.media.g00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dr.i0 f57191f = dr.k0.b(new ds.a() { // from class: com.inmobi.media.h00
        @Override // ds.a
        public final Object invoke() {
            return AbstractC3884o6.f();
        }
    });

    public static final ExecutorService a() {
        kotlin.jvm.internal.m0.p("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        kotlin.jvm.internal.m0.p("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        kotlin.jvm.internal.m0.p("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.highIO", false));
    }

    public static final Wb d() {
        return new Wb();
    }

    public static final ExecutorService e() {
        kotlin.jvm.internal.m0.p("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        kotlin.jvm.internal.m0.p("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new B9("ExecutorProvider.single", false));
    }
}

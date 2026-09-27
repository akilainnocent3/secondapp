package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr.i0 f41087a = dr.k0.b(b.f41090b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr.i0 f41088b = dr.k0.b(a.f41089b);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f41089b = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return o2.a(0, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f41090b = new b();

        public b() {
            super(0);
        }

        @Override // ds.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return o2.a(4, 0L, null, 6, null);
        }
    }

    @Override // com.chartboost.sdk.impl.t7
    public ExecutorService a() {
        return (ExecutorService) this.f41087a.getValue();
    }

    @Override // com.chartboost.sdk.impl.t7
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.f41088b.getValue();
    }
}

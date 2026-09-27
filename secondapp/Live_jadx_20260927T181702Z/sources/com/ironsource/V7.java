package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class V7 implements Tf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f60238c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private static final V9 f60240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    private static final V9 f60241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private static final V9 f60242g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final V7 f60236a = new V7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private static final Handler f60237b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private static final dr.i0 f60239d = dr.k0.b(a.f60243a);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a<C4352je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f60243a = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4352je invoke() {
            return new C4352je(0, null, null, 7, null);
        }
    }

    static {
        V9 v10 = new V9("isadplayer-background");
        v10.start();
        v10.a();
        f60240e = v10;
        V9 v11 = new V9("isadplayer-publisher-callbacks");
        v11.start();
        v11.a();
        f60241f = v11;
        V9 v12 = new V9("isadplayer-release");
        v12.start();
        v12.a();
        f60242g = v12;
    }

    private V7() {
    }

    private final boolean f(Runnable runnable) {
        return f60238c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z10) {
        f60238c = z10;
    }

    @cs.k
    public final void b(@oy.l Runnable action) {
        kotlin.jvm.internal.m0.p(action, "action");
        a(this, action, 0L, 2, null);
    }

    @cs.k
    public final void c(@oy.l Runnable action) {
        kotlin.jvm.internal.m0.p(action, "action");
        b(this, action, 0L, 2, null);
    }

    @cs.k
    public final void d(@oy.l Runnable action) {
        kotlin.jvm.internal.m0.p(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(@oy.l Runnable action) {
        kotlin.jvm.internal.m0.p(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f60242g.b(action);
        }
    }

    private final C4352je b() {
        return (C4352je) f60239d.getValue();
    }

    public static /* synthetic */ void c(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.d(runnable, j10);
    }

    @Override // com.ironsource.Tf
    public void a(@oy.l Runnable action) {
        kotlin.jvm.internal.m0.p(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return f60238c;
    }

    public static /* synthetic */ void a(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.b(runnable, j10);
    }

    @cs.k
    public final void b(@oy.l Runnable action, long j10) {
        kotlin.jvm.internal.m0.p(action, "action");
        f60240e.a(action, j10);
    }

    @cs.k
    public final void c(@oy.l Runnable action, long j10) {
        kotlin.jvm.internal.m0.p(action, "action");
        f60241f.a(action, j10);
    }

    @cs.k
    public final void d(@oy.l Runnable action, long j10) {
        kotlin.jvm.internal.m0.p(action, "action");
        f60237b.postDelayed(action, j10);
    }

    public static /* synthetic */ void b(V7 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.c(runnable, j10);
    }

    @Override // com.ironsource.Tf
    public void a(@oy.l Runnable action, long j10) {
        kotlin.jvm.internal.m0.p(action, "action");
        if (f60238c) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f60242g.a(action, j10);
        }
    }

    @oy.l
    public final ThreadPoolExecutor c() {
        return b();
    }

    @oy.m
    public final Looper a() {
        return f60240e.getLooper();
    }
}

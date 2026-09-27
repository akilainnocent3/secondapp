package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class V9 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private Handler f60244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(@oy.l String name) {
        super(name);
        kotlin.jvm.internal.m0.p(name, "name");
    }

    @cs.k
    public final void a(@oy.l Runnable task) {
        kotlin.jvm.internal.m0.p(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(@oy.l Runnable task) {
        kotlin.jvm.internal.m0.p(task, "task");
        Handler handler = this.f60244a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(V9 v10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v10.a(runnable, j10);
    }

    @cs.k
    public final void a(@oy.l Runnable task, long j10) {
        kotlin.jvm.internal.m0.p(task, "task");
        Handler handler = this.f60244a;
        if (handler != null) {
            handler.postDelayed(task, j10);
        }
    }

    public final void a() {
        this.f60244a = new Handler(getLooper());
    }
}

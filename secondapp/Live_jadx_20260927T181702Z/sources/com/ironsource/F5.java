package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class F5 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private Handler f58941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(@oy.l String name) {
        super(name);
        kotlin.jvm.internal.m0.p(name, "name");
    }

    public final void a(@oy.l Runnable task) {
        kotlin.jvm.internal.m0.p(task, "task");
        Handler handler = this.f58941a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f58941a = new Handler(getLooper());
    }
}

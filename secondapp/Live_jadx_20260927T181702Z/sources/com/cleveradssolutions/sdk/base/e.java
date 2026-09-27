package com.cleveradssolutions.sdk.base;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements ds.a<Boolean>, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f44001b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f44002c;

    @Override // com.cleveradssolutions.sdk.base.d
    public final void N() {
        Handler handler;
        if (!this.f44001b.getAndSet(false) || (handler = this.f44002c) == null) {
            return;
        }
        handler.removeCallbacks(this);
    }

    @Override // com.cleveradssolutions.sdk.base.d
    @m
    public final Handler S() {
        return this.f44002c;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final boolean e0() {
        return this.f44001b.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f44001b.get() || invoke().booleanValue()) {
            return;
        }
        this.f44001b.set(false);
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final void y0(@m Handler handler) {
        this.f44002c = handler;
        this.f44001b.set(true);
    }
}

package com.cleveradssolutions.internal.threads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements com.cleveradssolutions.sdk.base.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f43835b;

    @Override // com.cleveradssolutions.sdk.base.d
    public final void N() {
        Handler handler = this.f43835b;
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.f43835b = null;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final Handler S() {
        return this.f43835b;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final boolean e0() {
        return this.f43835b != null;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final void y0(Handler handler) {
        this.f43835b = handler;
    }
}

package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class k8 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f75082a;

    public k8(Handler handler) {
        this.f75082a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f75082a.post(runnable);
    }
}

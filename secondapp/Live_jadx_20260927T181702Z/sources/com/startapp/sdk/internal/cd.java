package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class cd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f74646a;

    public cd(ld ldVar) {
        this.f74646a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f74646a.f75123c.a()).execute(this.f74646a.f75140t);
    }
}

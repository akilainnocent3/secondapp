package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Hd implements InterfaceC4950bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95891a;

    public Hd(int i10) {
        this.f95891a = i10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4950bl
    public final boolean a(@oy.l String str) {
        return this.f95891a != Process.myPid();
    }
}

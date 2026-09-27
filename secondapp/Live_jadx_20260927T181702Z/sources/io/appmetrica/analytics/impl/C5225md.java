package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5225md extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5275od f97898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f97899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f97900c;

    public C5225md(C5275od c5275od, String str, byte[] bArr) {
        this.f97898a = c5275od;
        this.f97899b = str;
        this.f97900c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5275od.a(this.f97898a).setSessionExtra(this.f97899b, this.f97900c);
    }
}

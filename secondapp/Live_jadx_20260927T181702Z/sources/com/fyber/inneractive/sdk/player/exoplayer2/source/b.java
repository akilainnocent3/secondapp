package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f46821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f46822d;

    public b(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f46822d = fVar;
        this.f46819a = obj;
        this.f46820b = j10;
        this.f46821c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f46822d.f46845b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f46820b);
        f.a(this.f46822d, this.f46821c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", b0Var.a());
    }
}

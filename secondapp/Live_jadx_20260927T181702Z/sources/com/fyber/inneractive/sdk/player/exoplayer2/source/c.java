package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f46825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f46826d;

    public c(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f46826d = fVar;
        this.f46823a = obj;
        this.f46824b = j10;
        this.f46825c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f46826d.f46845b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f46824b);
        f.a(this.f46826d, this.f46825c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", b0Var.a());
    }
}

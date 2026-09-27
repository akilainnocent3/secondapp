package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f46843c;

    public e(f fVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, Object obj, long j10) {
        this.f46843c = fVar;
        this.f46841a = obj;
        this.f46842b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f46843c.f46845b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f46842b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}

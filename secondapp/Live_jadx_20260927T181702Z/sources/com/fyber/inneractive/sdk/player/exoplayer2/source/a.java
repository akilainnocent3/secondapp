package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f46817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f46818d;

    public a(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12) {
        this.f46818d = fVar;
        this.f46815a = obj;
        this.f46816b = j10;
        this.f46817c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f46818d.f46845b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f46816b);
        f.a(this.f46818d, this.f46817c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}

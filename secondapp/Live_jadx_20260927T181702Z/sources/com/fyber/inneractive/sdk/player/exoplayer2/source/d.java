package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f46838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f46839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f46840e;

    public d(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        this.f46840e = fVar;
        this.f46836a = obj;
        this.f46837b = j10;
        this.f46838c = j11;
        this.f46839d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f46840e.f46845b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f46837b);
        f.a(this.f46840e, this.f46838c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.f46839d);
    }
}

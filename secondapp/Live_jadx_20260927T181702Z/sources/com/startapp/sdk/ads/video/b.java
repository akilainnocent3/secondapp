package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.pd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f74165a;

    public b(c cVar) {
        this.f74165a = cVar;
    }

    public final void a() {
        c cVar = this.f74165a;
        if (!cVar.f74172f0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        pd pdVar = this.f74165a.L;
        if (pdVar != null) {
            pdVar.f75372h.stopPlayback();
        }
    }
}

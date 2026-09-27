package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f47275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f47276b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f47276b = pVar;
        this.f47275a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f47276b.f47297i;
        if (nVar != null) {
            ((q) nVar).a(this.f47275a);
        }
    }
}

package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f44426a;

    public q(s sVar) {
        this.f44426a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f44426a;
        Iterator it = sVar.f44481c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f44480b);
        }
    }
}

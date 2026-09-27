package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f45517a;

    public n(q qVar) {
        this.f45517a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f45517a.f45519b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e10) {
            if (IAlog.f47836a <= 3) {
                q qVar = this.f45517a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}

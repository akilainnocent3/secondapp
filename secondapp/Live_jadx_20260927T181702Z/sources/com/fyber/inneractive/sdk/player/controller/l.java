package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f45514b;

    public l(q qVar, int i10) {
        this.f45514b = qVar;
        this.f45513a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f45514b.f45520c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f45513a);
            }
        } catch (Exception e10) {
            if (IAlog.f47836a <= 3) {
                q qVar = this.f45514b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}

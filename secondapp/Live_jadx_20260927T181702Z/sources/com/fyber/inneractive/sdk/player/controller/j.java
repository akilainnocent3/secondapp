package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f45509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f45510b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f45510b = qVar;
        this.f45509a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f45510b;
        if (qVar.f45524g) {
            return;
        }
        try {
            Iterator it = qVar.f45519b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f45509a);
            }
        } catch (Exception e10) {
            if (IAlog.f47836a <= 3) {
                q qVar2 = this.f45510b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}

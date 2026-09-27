package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f45433a;

    public a(g gVar) {
        this.f45433a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f45433a) {
            try {
                g gVar = this.f45433a;
                if (gVar.f45454i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.f45433a;
                int i10 = gVar2.f45456k;
                if (i10 >= 2000 && i10 >= gVar2.f45455j.size()) {
                    this.f45433a.c();
                    this.f45433a.f45456k = 0;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

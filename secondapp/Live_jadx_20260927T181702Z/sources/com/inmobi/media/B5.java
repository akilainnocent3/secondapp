package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class B5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H5 f54388a;

    public B5(H5 h10) {
        this.f54388a = h10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f54388a) {
            try {
                H5 h10 = this.f54388a;
                if (h10.f54766l == null) {
                    return null;
                }
                while (h10.f54765k > h10.f54764j) {
                    h10.d((String) ((Map.Entry) h10.f54763i.entrySet().iterator().next()).getKey());
                }
                H5 h11 = this.f54388a;
                int i10 = h11.f54767m;
                if (i10 >= 2000 && i10 >= h11.f54763i.size()) {
                    this.f54388a.c();
                    this.f54388a.f54767m = 0;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f44632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f44633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f44634c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f44635d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f44633b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f44632a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f44632a;
            if (handler != null) {
                handler.removeCallbacks(this.f44635d);
            }
            this.f44632a.getLooper().quitSafely();
            this.f44632a = null;
        }
    }
}

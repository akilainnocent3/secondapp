package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f47281a;

    public g(p pVar) {
        this.f47281a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f47281a);
        Handler handler = this.f47281a.f47303o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f47281a.f47303o = null;
        }
        this.f47281a.f47302n = null;
        Looper.myLooper().quit();
    }
}

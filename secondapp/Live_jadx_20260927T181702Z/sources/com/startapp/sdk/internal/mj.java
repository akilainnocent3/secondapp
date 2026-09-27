package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class mj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoListener f75208a;

    public mj(VideoListener videoListener, Context context) {
        this.f75208a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75208a.onVideoCompleted();
        } catch (Throwable th2) {
            si.a((Object) this.f75208a, th2);
        }
    }
}

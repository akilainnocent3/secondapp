package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f47285b;

    public j(p pVar, int i10) {
        this.f47285b = pVar;
        this.f47284a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f47285b;
        int i10 = this.f47284a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.seekTo(i10);
        IAlog.e(strB + "timelog: seekTo took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}

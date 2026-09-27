package com.startapp.sdk.internal;

import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xm implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HttpURLConnection f75845b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f75845b.disconnect();
    }
}

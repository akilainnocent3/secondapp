package com.fyber.inneractive.sdk.privacysandbox;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47421a;

    public a(String str) {
        this.f47421a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.c("Registered source %s", this.f47421a);
    }
}

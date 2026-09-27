package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ni implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f75263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f75264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75265c;

    public ni(Intent[] intentArr, Context context, String str) {
        this.f75263a = intentArr;
        this.f75264b = context;
        this.f75265c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75263a[0] = si.a(this.f75264b, this.f75265c);
        synchronized (this.f75263a) {
            this.f75263a.notifyAll();
        }
    }
}

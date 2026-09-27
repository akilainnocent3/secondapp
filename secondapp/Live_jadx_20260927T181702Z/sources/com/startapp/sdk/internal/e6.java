package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f74719b;

    public e6(Context context, ConnectivityManager connectivityManager) {
        this.f74718a = context;
        this.f74719b = connectivityManager;
    }

    public abstract int a();

    public void b() {
    }
}

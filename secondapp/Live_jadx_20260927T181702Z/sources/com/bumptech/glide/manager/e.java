package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31483a = "ConnectivityMonitor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f31484b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.bumptech.glide.manager.c
    @NonNull
    public b a(@NonNull Context context, @NonNull b.a aVar) {
        boolean z10 = f1.d.checkSelfPermission(context, f31484b) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new m();
    }
}

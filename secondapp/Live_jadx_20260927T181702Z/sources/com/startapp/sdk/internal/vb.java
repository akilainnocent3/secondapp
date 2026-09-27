package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f75699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f75700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75701c;

    public vb(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f75699a = intentFilter;
        this.f75700b = broadcastReceiver;
    }
}

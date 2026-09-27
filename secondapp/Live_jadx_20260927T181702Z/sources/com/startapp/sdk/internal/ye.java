package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ye extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef f75903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze f75904b;

    public ye(ze zeVar, ef efVar) {
        this.f75904b = zeVar;
        this.f75903a = efVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f75903a.a(new Pair(this.f75904b, intent));
    }
}

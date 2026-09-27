package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f25739b;

    public /* synthetic */ y(z zVar, zzcb zzcbVar) {
        this.f25739b = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.f25739b.I = zzau.zzc(iBinder);
        this.f25739b.H = 2;
        this.f25739b.E1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.f25739b.I = null;
        this.f25739b.H = 0;
    }
}

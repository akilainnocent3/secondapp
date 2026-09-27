package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvb extends BroadcastReceiver {
    final /* synthetic */ zzfvc zza;

    public zzfvb(zzfvc zzfvcVar) {
        Objects.requireNonNull(zzfvcVar);
        this.zza = zzfvcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfvc zzfvcVar = this.zza;
            zzfvcVar.zzd(true, zzfvcVar.zzf());
            zzfvcVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfvc zzfvcVar2 = this.zza;
            zzfvcVar2.zzd(false, zzfvcVar2.zzf());
            zzfvcVar2.zze(false);
        }
    }
}

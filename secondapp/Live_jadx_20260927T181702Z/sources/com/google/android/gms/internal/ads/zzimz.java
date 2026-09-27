package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimz extends z.i {
    private final WeakReference zza;

    public zzimz(zzbjf zzbjfVar) {
        this.zza = new WeakReference(zzbjfVar);
    }

    @Override // z.i
    public final void onCustomTabsServiceConnected(ComponentName componentName, z.d dVar) {
        zzbjf zzbjfVar = (zzbjf) this.zza.get();
        if (zzbjfVar != null) {
            zzbjfVar.zzf(dVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjf zzbjfVar = (zzbjf) this.zza.get();
        if (zzbjfVar != null) {
            zzbjfVar.zzg();
        }
    }
}

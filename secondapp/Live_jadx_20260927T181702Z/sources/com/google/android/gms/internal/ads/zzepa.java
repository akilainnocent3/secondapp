package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepa {

    @Nullable
    private zzeor zza;

    public zzepa() {
    }

    public static zzepa zza(zzeor zzeorVar) {
        return new zzepa(zzeorVar);
    }

    public final zzeor zzb(Clock clock, zzeot zzeotVar, zzell zzellVar, zzfro zzfroVar) {
        zzeor zzeorVar = this.zza;
        return zzeorVar != null ? zzeorVar : new zzeor(clock, zzeotVar, zzellVar, zzfroVar);
    }

    private zzepa(zzeor zzeorVar) {
        this.zza = zzeorVar;
    }
}

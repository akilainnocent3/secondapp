package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzdlr {
    private final zzdnc zza;

    @Nullable
    private final zzcki zzb;

    public zzdlr(zzdnc zzdncVar, @Nullable zzcki zzckiVar) {
        this.zza = zzdncVar;
        this.zzb = zzckiVar;
    }

    public final zzdnc zza() {
        return this.zza;
    }

    @Nullable
    public final zzcki zzb() {
        return this.zzb;
    }

    @Nullable
    public final View zzc() {
        zzcki zzckiVar = this.zzb;
        if (zzckiVar != null) {
            return zzckiVar.zzD();
        }
        return null;
    }

    @Nullable
    public final View zzd() {
        zzcki zzckiVar = this.zzb;
        if (zzckiVar == null) {
            return null;
        }
        return zzckiVar.zzD();
    }

    public Set zze(zzday zzdayVar) {
        return Collections.singleton(new zzdke(zzdayVar, zzcff.zzh));
    }

    public Set zzf(zzday zzdayVar) {
        return Collections.singleton(new zzdke(zzdayVar, zzcff.zzh));
    }

    public final zzdke zzg(Executor executor) {
        final zzcki zzckiVar = this.zzb;
        return new zzdke(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzcki zzckiVar2 = zzckiVar;
                if (zzckiVar2 == null || (zzmVarZzL = zzckiVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }
}

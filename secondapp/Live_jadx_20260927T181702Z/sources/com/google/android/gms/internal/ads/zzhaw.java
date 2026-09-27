package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhaw extends zzhak {
    private zzhav zza;

    public zzhaw(zzgvv zzgvvVar, boolean z10, Executor executor, Callable callable) {
        super(zzgvvVar, z10, false);
        this.zza = new zzhau(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzhav zzhavVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzi() {
        zzhav zzhavVar = this.zza;
        if (zzhavVar != null) {
            zzhavVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzx() {
        zzhav zzhavVar = this.zza;
        if (zzhavVar != null) {
            zzhavVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzw(int i10, Object obj) {
    }
}

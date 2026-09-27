package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzacm {
    final /* synthetic */ zzacn zza;
    private zzv zzb;

    public /* synthetic */ zzacm(zzacn zzacnVar, byte[] bArr) {
        Objects.requireNonNull(zzacnVar);
        this.zza = zzacnVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo("video/raw");
        this.zzb = zztVar.zzO();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzacn zzacnVar = this.zza;
            if (zzacnVar.zzA() != null) {
                zzacnVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzO = this.zzb;
        if (zzvVarZzO == null) {
            zzvVarZzO = new zzt().zzO();
        }
        zzv zzvVar = zzvVarZzO;
        zzacn zzacnVar2 = this.zza;
        zzacnVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzaek) zzacnVar2.zzz().remove()).zza(j10);
    }
}

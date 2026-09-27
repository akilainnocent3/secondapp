package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzef extends zzek {
    final /* synthetic */ zzeg zza;

    public zzef(zzeg zzegVar) {
        this.zza = zzegVar;
    }

    @Override // com.google.android.gms.internal.cast.zzek
    public final void zza(long j10) {
        this.zza.zzc++;
        zzeg zzegVar = this.zza;
        if (zzegVar.zza(zzegVar.zza) || this.zza.zza.isStarted()) {
            return;
        }
        zzeg zzegVar2 = this.zza;
        if (zzeg.zze(zzegVar2)) {
            return;
        }
        zzegVar2.zza.start();
    }
}

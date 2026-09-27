package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduo extends zzdtz implements zzdkm {
    private zzdkm zza;

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void zzdR() {
        zzdkm zzdkmVar = this.zza;
        if (zzdkmVar != null) {
            zzdkmVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void zzdu() {
        zzdkm zzdkmVar = this.zza;
        if (zzdkmVar != null) {
            zzdkmVar.zzdu();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnu zzbnuVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbnw zzbnwVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdkm zzdkmVar) throws Throwable {
        try {
            try {
                super.zzm(zzaVar, zzbnuVar, zzrVar, zzbnwVar, zzadVar);
                this.zza = zzdkmVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}

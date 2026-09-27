package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefp extends zzcah {
    private final zzcfk zza;
    private final zzcar zzb;

    public zzefp(zzcfk zzcfkVar, zzcar zzcarVar) {
        this.zza = zzcfkVar;
        this.zzb = zzcarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzegg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) {
        this.zza.zzc(new zzegg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcarVar));
    }
}

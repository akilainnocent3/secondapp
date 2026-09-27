package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzd extends zzj {
    final /* synthetic */ zze zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzl zzlVar) {
        super(zzlVar);
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzb(byte[] bArr) {
        this.zza.zzb.setResult(bArr);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcib extends zzaue {
    static final zzcib zzb = new zzcib();

    @Override // com.google.android.gms.internal.ads.zzaue
    public final zzaui zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzauk();
        }
        return "mvhd".equals(str) ? new zzaul() : new zzaum(str);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzauy implements zzaux {
    @Override // com.google.android.gms.internal.ads.zzaux
    public final byte zza(zzavj zzavjVar, int i10) {
        return zzavjVar.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final zzavj zzb(zzavj zzavjVar, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = zzavjVar.zza).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzavj(zzavj.zzh(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final zzaux zzc() {
        return new zzauy();
    }
}

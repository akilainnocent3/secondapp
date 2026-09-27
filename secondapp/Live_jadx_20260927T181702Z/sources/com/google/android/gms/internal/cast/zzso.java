package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzso extends zzsr {
    private final int zzc;

    public zzso(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzsu.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.cast.zzsr
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final int zzd() {
        return this.zzc;
    }
}

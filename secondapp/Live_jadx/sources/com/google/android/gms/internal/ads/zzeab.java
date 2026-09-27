package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzeab extends zzeaf {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzeab(long j10, int i10, byte[] bArr) {
        this.zza = j10;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeaf) {
            zzeaf zzeafVar = (zzeaf) obj;
            if (this.zza == zzeafVar.zza() && this.zzb == zzeafVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        sb2.append("OnDeviceStorageKey{id=");
        sb2.append(j10);
        sb2.append(", eventType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final int zzb() {
        return this.zzb;
    }
}

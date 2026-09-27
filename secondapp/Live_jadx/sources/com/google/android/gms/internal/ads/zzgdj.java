package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdj {
    public static String zza(byte[] bArr, boolean z10) {
        return zzc(z10).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z10).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgyu zzc(boolean z10) {
        return z10 ? zzgyu.zzm().zzh() : zzgyu.zzl();
    }
}

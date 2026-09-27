package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyx {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i10) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhyw zzhywVar = new zzhyw(2, new byte[(length * 3) / 4]);
        if (!zzhywVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = zzhywVar.zzb;
        byte[] bArr = zzhywVar.zza;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }
}

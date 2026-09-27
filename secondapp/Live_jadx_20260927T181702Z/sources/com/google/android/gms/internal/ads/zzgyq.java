package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgyq extends zzgyt {
    final char[] zza;

    private zzgyq(zzgyp zzgypVar) {
        super(zzgypVar, null);
        this.zza = new char[512];
        zzgsw.zza(zzgypVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgypVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzgypVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgsw.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgys {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new zzgys(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzgyp zzgypVar = this.zzb;
            bArr[i11] = (byte) (zzgypVar.zzc(charSequence.charAt(i10 + 1)) | (zzgypVar.zzc(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final zzgyu zzc(zzgyp zzgypVar, Character ch2) {
        return new zzgyq(zzgypVar);
    }

    public zzgyq(String str, String str2) {
        this(new zzgyp("base16()", "0123456789ABCDEF".toCharArray()));
    }
}

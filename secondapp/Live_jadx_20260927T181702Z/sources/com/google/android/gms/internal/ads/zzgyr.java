package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgyr extends zzgyt {
    private zzgyr(zzgyp zzgypVar, Character ch2) {
        super(zzgypVar, ch2);
        zzgsw.zza(zzgypVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgsw.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            zzgyp zzgypVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzgypVar.zza(i17 >>> 18));
            appendable.append(zzgypVar.zza((i17 >>> 12) & 63));
            appendable.append(zzgypVar.zza((i17 >>> 6) & 63));
            appendable.append(zzgypVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgys {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgyp zzgypVar = this.zzb;
        if (!zzgypVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length2);
            throw new zzgys(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzc = (zzgypVar.zzc(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzgypVar.zzc(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzc2 = iZzc | (zzgypVar.zzc(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzc2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzc2 | zzgypVar.zzc(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final zzgyu zzc(zzgyp zzgypVar, Character ch2) {
        return new zzgyr(zzgypVar, ch2);
    }

    public zzgyr(String str, String str2, Character ch2) {
        this(new zzgyp(str, str2.toCharArray()), ch2);
    }
}

package com.google.android.gms.internal.ads;

import com.ironsource.G5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class zzgyt extends zzgyu {
    private volatile zzgyu zza;
    final zzgyp zzb;
    final Character zzc;

    public zzgyt(zzgyp zzgypVar, Character ch2) {
        this.zzb = zzgypVar;
        boolean z10 = true;
        if (ch2 != null && zzgypVar.zze(G5.T)) {
            z10 = false;
        }
        zzgsw.zzf(z10, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) obj;
            if (this.zzb.equals(zzgytVar.zzb) && Objects.equals(this.zzc, zzgytVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgyp zzgypVar = this.zzb;
        sb2.append(zzgypVar);
        if (8 % zzgypVar.zzb != 0) {
            Character ch2 = this.zzc;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgsw.zzo(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zze(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgys {
        int i10;
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
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzgypVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzc <<= zzgypVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgypVar.zzc(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzgypVar.zzd;
            int i16 = i14 * zzgypVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzc >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public zzgyu zzc(zzgyp zzgypVar, Character ch2) {
        return new zzgyt(zzgypVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final int zzd(int i10) {
        zzgyp zzgypVar = this.zzb;
        return zzgypVar.zzc * zzgzm.zzb(i10, zzgypVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgsw.zzo(i10, i10 + i11, bArr.length);
        zzgyp zzgypVar = this.zzb;
        int i12 = zzgypVar.zzd;
        int i13 = 0;
        zzgsw.zza(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzgypVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzgypVar.zza(zzgypVar.zza & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzc != null) {
            while (i13 < i12 * 8) {
                appendable.append(G5.T);
                i13 += i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final int zzf(int i10) {
        return (int) (((((long) this.zzb.zzb) * ((long) i10)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final zzgyu zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final zzgyu zzi() {
        zzgyu zzgyuVarZzc = this.zza;
        if (zzgyuVarZzc == null) {
            zzgyp zzgypVar = this.zzb;
            zzgyp zzgypVarZzd = zzgypVar.zzd();
            zzgyuVarZzc = zzgypVarZzd == zzgypVar ? this : zzc(zzgypVarZzd, this.zzc);
            this.zza = zzgyuVarZzc;
        }
        return zzgyuVarZzc;
    }

    public zzgyt(String str, String str2, Character ch2) {
        this(new zzgyp(str, str2.toCharArray()), ch2);
    }
}

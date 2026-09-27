package com.google.android.gms.internal.ads;

import com.ironsource.G5;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgyu {
    private static final zzgyu zza;
    private static final zzgyu zzb;
    private static final zzgyu zzc;

    static {
        Character chValueOf = Character.valueOf(G5.T);
        zza = new zzgyr("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzgyr("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzgyt("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzgyt("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzc = new zzgyq("base16()", "0123456789ABCDEF");
    }

    public static zzgyu zzl() {
        return zza;
    }

    public static zzgyu zzm() {
        return zzb;
    }

    public static zzgyu zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgys;

    public abstract int zzd(int i10);

    public abstract int zzf(int i10);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgyu zzh();

    public abstract zzgyu zzi();

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzgsw.zzo(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgys e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzr implements Serializable {
    private static final zzgzr zza = new zzgzr(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgzr(int[] iArr, int i10, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    public static zzgzr zza() {
        return zza;
    }

    public static zzgzr zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgzr(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgzr)) {
            return false;
        }
        zzgzr zzgzrVar = (zzgzr) obj;
        int i10 = this.zzc;
        if (i10 != zzgzrVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzd(i11) != zzgzrVar.zzd(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append(fw.b.f85384k);
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(fw.b.f85385l);
        return sb2.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i10) {
        zzgsw.zzm(i10, this.zzc, "index");
        return this.zzb[i10];
    }
}

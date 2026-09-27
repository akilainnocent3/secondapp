package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamf implements zzagw {
    public final int zza;
    public final zzgzr zzb;

    public zzamf(int i10, @Nullable int[] iArr) {
        this.zza = i10;
        this.zzb = iArr != null ? zzgzr.zzb(iArr) : zzgzr.zza();
    }

    public final String toString() {
        zzgzr zzgzrVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgzrVar.zzc());
        for (int i10 = 0; i10 < zzgzrVar.zzc(); i10++) {
            arrayList.add(zzfk.zzz(zzgzrVar.zzd(i10)));
        }
        String strZzz = zzfk.zzz(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(strZzz.length() + 37 + string.length() + 1);
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzz);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}

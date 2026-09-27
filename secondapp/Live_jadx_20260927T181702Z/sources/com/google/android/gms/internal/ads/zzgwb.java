package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwb {
    Object[] zza;
    int zzb;
    zzgwa zzc;

    public zzgwb() {
        this(4);
    }

    private final void zze(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzgvu.zze(length, i11));
        }
    }

    private final zzgwc zzf(boolean z10) {
        zzgwa zzgwaVar;
        zzgwa zzgwaVar2;
        if (z10 && (zzgwaVar2 = this.zzc) != null) {
            throw zzgwaVar2.zza();
        }
        zzgxz zzgxzVarZzk = zzgxz.zzk(this.zzb, this.zza, this);
        if (!z10 || (zzgwaVar = this.zzc) == null) {
            return zzgxzVarZzk;
        }
        throw zzgwaVar.zza();
    }

    public final zzgwb zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzguv.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzgwb zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgwc zzc() {
        return zzf(true);
    }

    public final zzgwc zzd() {
        return zzf(false);
    }

    public zzgwb(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}

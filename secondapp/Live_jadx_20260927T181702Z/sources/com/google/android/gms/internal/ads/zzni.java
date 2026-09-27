package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzni {
    private final zzs zza;
    private final SparseArray zzb;

    public zzni(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i10 = 0; i10 < zzsVar.zzb(); i10++) {
            int iZzc = zzsVar.zzc(i10);
            zznh zznhVar = (zznh) sparseArray.get(iZzc);
            zznhVar.getClass();
            sparseArray2.append(iZzc, zznhVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznh zza(int i10) {
        zznh zznhVar = (zznh) this.zzb.get(i10);
        zznhVar.getClass();
        return zznhVar;
    }

    public final boolean zzb(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i10) {
        return this.zza.zzc(i10);
    }
}

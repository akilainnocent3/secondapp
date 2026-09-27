package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class zzch extends zzci {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzch(int i10) {
        zzbw.zza(i10, "initialCapacity");
        this.zza = new Object[i10];
        this.zzb = 0;
    }

    private final void zzd(int i10) {
        int length = this.zza.length;
        int iZzc = zzci.zzc(length, this.zzb + i10);
        if (iZzc > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZzc);
            this.zzc = false;
        }
    }

    public final zzch zza(Object obj) {
        obj.getClass();
        zzd(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void zzb(Object[] objArr, int i10) {
        zzdd.zzb(objArr, i10);
        zzd(i10);
        System.arraycopy(objArr, 0, this.zza, this.zzb, i10);
        this.zzb += i10;
    }
}

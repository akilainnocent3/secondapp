package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgwi extends zzgvt {
    Object[] zzd;
    private int zze;

    public zzgwi() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt, com.google.android.gms.internal.ads.zzgvu
    public final /* bridge */ /* synthetic */ zzgvu zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgwi zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgwj.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgvs.zza(iHashCode);
                while (true) {
                    int i10 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i10 + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgwi zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgwj zzh() {
        zzgwj zzgwjVarZzw;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzgya.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgyk(obj);
        }
        if (this.zzd == null || zzgwj.zzo(i10) != this.zzd.length) {
            zzgwjVarZzw = zzgwj.zzw(this.zzb, this.zza);
            this.zzb = zzgwjVarZzw.size();
        } else {
            int i11 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgwj.zzx(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            int i12 = this.zze;
            Object[] objArr = this.zzd;
            zzgwjVarZzw = new zzgya(objArrCopyOf, i12, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgwjVarZzw;
    }

    public zzgwi(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzgwj.zzo(i10)];
    }
}

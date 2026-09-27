package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgwj<E> extends zzgvv<E> implements Set<E> {
    private transient zzgvz zza;

    public static zzgwj zzh() {
        return zzgya.zza;
    }

    public static zzgwj zzi(Object obj) {
        return new zzgyk(obj);
    }

    public static zzgwj zzj(Object obj, Object obj2) {
        return zzw(2, obj, obj2);
    }

    public static zzgwj zzk(Object obj, Object obj2, Object obj3) {
        return zzw(3, obj, obj2, obj3);
    }

    public static zzgwj zzl(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzw(4, obj, obj2, obj3, obj4);
    }

    public static zzgwj zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzw(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgwj zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 6;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzw(i10, objArr2);
    }

    public static int zzo(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            zzgsw.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgwj zzp(Collection collection) {
        if ((collection instanceof zzgwj) && !(collection instanceof SortedSet)) {
            zzgwj zzgwjVar = (zzgwj) collection;
            if (!zzgwjVar.zzf()) {
                return zzgwjVar;
            }
        }
        Object[] array = collection.toArray();
        return zzw(array.length, array);
    }

    public static zzgwj zzq(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzw(length, (Object[]) objArr.clone()) : new zzgyk(objArr[0]);
        }
        return zzgya.zza;
    }

    public static zzgwi zzt(int i10) {
        zzguv.zzb(i10, "expectedSize");
        return new zzgwi(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgwj zzw(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzgya.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgyk(obj);
        }
        int iZzo = zzo(i10);
        Object[] objArr2 = new Object[iZzo];
        int i11 = iZzo - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzgxs.zzb(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZza = zzgvs.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgyk(obj4);
        }
        if (zzo(i13) < iZzo / 2) {
            return zzw(i13, objArr);
        }
        if (zzx(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzgya(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzx(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgwj) && zzr() && ((zzgwj) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgyj.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgyj.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgyn iterator();

    @Override // com.google.android.gms.internal.ads.zzgvv
    public zzgvz zze() {
        zzgvz zzgvzVar = this.zza;
        if (zzgvzVar != null) {
            return zzgvzVar;
        }
        zzgvz zzgvzVarZzs = zzs();
        this.zza = zzgvzVarZzs;
        return zzgvzVarZzs;
    }

    public boolean zzr() {
        return false;
    }

    public zzgvz zzs() {
        Object[] array = toArray();
        int i10 = zzgvz.zzd;
        return zzgvz.zzt(array, array.length);
    }
}

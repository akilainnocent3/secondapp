package com.google.android.recaptcha.internal;

import defpackage.dsl0;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzui {
    public static final /* synthetic */ int zza = 0;
    private static final zzuv zzb;

    static {
        int i = zzuc.zza;
        zzb = new zzux();
    }

    public static void zzA(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzA(i, list, z);
    }

    public static void zzB(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzC(i, list, z);
    }

    public static void zzC(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzE(i, list, z);
    }

    public static void zzD(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzJ(i, list, z);
    }

    public static void zzE(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzL(i, list, z);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzqv.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zzso zzsoVar = (zzso) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzqv.zzB(zzsoVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzqv.zzA(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzqv.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zzso zzsoVar = (zzso) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzqv.zzB(zzsoVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzqv.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzth zzthVar = (zzth) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzqv.zzB(zzthVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzh(int i, Object obj, zzug zzugVar) {
        int i2 = i << 3;
        if (!(obj instanceof zztd)) {
            return zzqv.zzy((zzts) obj, zzugVar) + zzqv.zzA(i2);
        }
        int iZzA = zzqv.zzA(i2);
        int iZza = ((zztd) obj).zza();
        return dsl0.a(iZza, iZza, iZzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzqv.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zzso zzsoVar = (zzso) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZze = zzsoVar.zze(i);
            iZzA2 += zzqv.zzA((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzqv.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzth zzthVar = (zzth) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZze = zzthVar.zze(i);
            iZzB2 += zzqv.zzB((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzB2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzso)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzqv.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzso zzsoVar = (zzso) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzqv.zzA(zzsoVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzth)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzqv.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzth zzthVar = (zzth) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzqv.zzB(zzthVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static zzuv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
        if (zzsrVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzsrVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzuvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzsrVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzo(obj, i, iIntValue2, obj2, zzuvVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i, int i2, Object obj2, zzuv zzuvVar) {
        if (obj2 == null) {
            obj2 = zzuvVar.zza(obj);
        }
        zzuvVar.zzh(obj2, i, i2);
        return obj2;
    }

    public static void zzp(zzrz zzrzVar, Object obj, Object obj2) {
        zzsd zzsdVar = ((zzsk) obj2).zzb;
        if (zzsdVar.zza.isEmpty()) {
            return;
        }
        ((zzsk) obj).zzi().zzh(zzsdVar);
    }

    public static void zzq(zzuv zzuvVar, Object obj, Object obj2) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVarZze = zzsnVar.zzc;
        zzuw zzuwVar = ((zzsn) obj2).zzc;
        if (!zzuw.zzc().equals(zzuwVar)) {
            if (zzuw.zzc().equals(zzuwVarZze)) {
                zzuwVarZze = zzuw.zze(zzuwVarZze, zzuwVar);
            } else {
                zzuwVarZze.zzd(zzuwVar);
            }
        }
        zzsnVar.zzc = zzuwVarZze;
    }

    public static void zzr(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzvi zzviVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzviVar.zzy(i, list, z);
    }
}

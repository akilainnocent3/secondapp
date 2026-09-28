package com.google.android.recaptcha.internal;

import defpackage.itg0;
import defpackage.l48;
import defpackage.mwo;
import defpackage.ndv;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkp implements zzjt {
    public static final zzkp zza = new zzkp();

    private zzkp() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
        if (zzztVarArr.length != 2) {
            itg0.b(4, 3, null);
            return;
        }
        Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itg0.b(4, 5, null);
            return;
        }
        Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 != null) {
            zzizVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            itg0.b(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzdm {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
        }
        int iA = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (iA < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[iA] ^ ((Number) obj2).byteValue())));
                    iA++;
                }
                return CollectionsKt.w0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (iA < length2) {
                    iA = ndv.a(charArray[iA] ^ ((Number) obj2).intValue(), iA, 1, arrayList2);
                }
                return CollectionsKt.z0(arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length;
            ArrayList arrayList5 = new ArrayList(length3);
            int iA2 = 0;
            while (iA2 < length3) {
                iA2 = ndv.a(iArr[iA2] ^ ((Number) obj).intValue(), iA2, 1, arrayList5);
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z5 = obj instanceof byte[];
        if (z5 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z6 = obj instanceof short[];
        if (z6 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z7 = obj instanceof int[];
        if (z7 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length4 = iArr2.length;
            ArrayList arrayList9 = new ArrayList(length4);
            int iA3 = 0;
            while (iA3 < length4) {
                iA3 = ndv.a(iArr2[iA3] ^ ((Number) obj2).intValue(), iA3, 1, arrayList9);
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof long[];
        if (z8 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList10.add(Long.valueOf(j2 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length5 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzjs.zza(this, length5, bArr4.length);
            IntRange intRangeN = f.n(0, length5);
            ArrayList arrayList11 = new ArrayList(l48.r(intRangeN, 10));
            Iterator<Integer> it = intRangeN.iterator();
            while (((mwo) it).c) {
                int iNextInt = ((zvo) it).nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iNextInt] ^ bArr3[iNextInt])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z6 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length6 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzjs.zza(this, length6, sArr4.length);
            IntRange intRangeN2 = f.n(0, length6);
            ArrayList arrayList12 = new ArrayList(l48.r(intRangeN2, 10));
            Iterator<Integer> it2 = intRangeN2.iterator();
            while (((mwo) it2).c) {
                int iNextInt2 = ((zvo) it2).nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[iNextInt2] ^ sArr3[iNextInt2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z7 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length7 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzjs.zza(this, length7, iArr4.length);
            IntRange intRangeN3 = f.n(0, length7);
            ArrayList arrayList13 = new ArrayList(l48.r(intRangeN3, 10));
            Iterator<Integer> it3 = intRangeN3.iterator();
            while (((mwo) it3).c) {
                int iNextInt3 = ((zvo) it3).nextInt();
                arrayList13.add(Integer.valueOf(iArr4[iNextInt3] ^ iArr3[iNextInt3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z8 || !(obj2 instanceof long[])) {
            itg0.b(4, 5, null);
            return null;
        }
        long[] jArr3 = (long[]) obj;
        int length8 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzjs.zza(this, length8, jArr4.length);
        IntRange intRangeN4 = f.n(0, length8);
        ArrayList arrayList14 = new ArrayList(l48.r(intRangeN4, 10));
        Iterator<Integer> it4 = intRangeN4.iterator();
        while (((mwo) it4).c) {
            int iNextInt4 = ((zvo) it4).nextInt();
            arrayList14.add(Long.valueOf(jArr3[iNextInt4] ^ jArr4[iNextInt4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzifr {
    public static final /* synthetic */ zzicn zza(zzicn zzicnVar, zzicn zzicnVar2, ArrayDeque arrayDeque) {
        zzb(zzicnVar, arrayDeque);
        zzb(zzicnVar2, arrayDeque);
        zzicn zziftVar = (zzicn) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zziftVar = new zzift((zzicn) arrayDeque.pop(), zziftVar, null);
        }
        return zziftVar;
    }

    private static final void zzb(zzicn zzicnVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzicnVar.zzq()) {
            if (!(zzicnVar instanceof zzift)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzicnVar.getClass())));
            }
            zzift zziftVar = (zzift) zzicnVar;
            zzb(zziftVar.zzo(), arrayDeque);
            zzb(zziftVar.zzF(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzicnVar.zzb(), arrayDeque);
        int iZzn = zzift.zzn(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzicn) arrayDeque.peek()).zzb() >= iZzn) {
            arrayDeque.push(zzicnVar);
            return;
        }
        int iZzn2 = zzift.zzn(iZzc);
        zzicn zziftVar2 = (zzicn) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzicn) arrayDeque.peek()).zzb() >= iZzn2) {
                break;
            } else {
                zziftVar2 = new zzift((zzicn) arrayDeque.pop(), zziftVar2, bArr);
            }
        }
        zzift zziftVar3 = new zzift(zziftVar2, zzicnVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzicn) arrayDeque.peek()).zzb() >= zzift.zzn(zzc(zziftVar3.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zziftVar3 = new zzift((zzicn) arrayDeque.pop(), zziftVar3, bArr);
            }
        }
        arrayDeque.push(zziftVar3);
    }

    private static final int zzc(int i10, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzift.zzb, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}

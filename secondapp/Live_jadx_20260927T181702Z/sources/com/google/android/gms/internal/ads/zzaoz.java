package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoz implements zzamz {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaoz(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzaop zzaopVar = (zzaop) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzaopVar.zzb;
            jArr[i11 + 1] = zzaopVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final long zzb(int i10) {
        zzgsw.zza(i10 >= 0);
        long[] jArr = this.zzc;
        zzgsw.zza(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzaop zzaopVar = (zzaop) list.get(i10);
                zzcx zzcxVar = zzaopVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaopVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, zzaoy.zza);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcw zzcwVarZza = ((zzaop) arrayList2.get(i12)).zza.zza();
            zzcwVarZza.zzf((-1) - i12, 1);
            arrayList.add(zzcwVarZza.zzr());
        }
        return arrayList;
    }
}

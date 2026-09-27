package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawb implements Comparator {
    private final boolean zza;

    public zzawb(boolean z10) {
        this.zza = z10;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 496612959;
        zzawf zzawfVar = (zzawf) obj;
        zzawf zzawfVar2 = (zzawf) obj2;
        int i20 = zzawfVar.zza;
        if (i20 != zzawfVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i21 = i19 ^ i18;
        try {
            if (i20 == 0) {
                throw null;
            }
            switch (i20 + i21) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzawfVar.zzl() != zzawfVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzawfVar.zzm(), zzawfVar2.zzm());
                case 3:
                    comparatorZza = zzavj.zzc;
                    objZzn = zzawfVar.zzn();
                    objZzn2 = zzawfVar2.zzn();
                    break;
                case 4:
                    objZzn = zzawfVar.zzo();
                    objZzn2 = zzawfVar2.zzo();
                    comparatorZza = zzgvj.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzawfVar.zzp() != zzawfVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzawfVar.zzq(), zzawfVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzawc e10) {
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabz {
    private static final Comparator zza = zzaby.zza;
    private static final Comparator zzb = zzabx.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabw[] zzd = new zzabw[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabz(int i10) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i10, float f10) {
        zzabw zzabwVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzabw[] zzabwVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzabwVar = zzabwVarArr[i12];
        } else {
            zzabwVar = new zzabw(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzabwVar.zza = i13;
        zzabwVar.zzb = i10;
        zzabwVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabwVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 + u4.a0.U2;
            zzabw zzabwVar2 = (zzabw) arrayList.get(0);
            int i16 = zzabwVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzabw[] zzabwVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzabwVarArr2[i17] = zzabwVar2;
                }
            } else {
                zzabwVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final float zzc(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabw) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzabw zzabwVar = (zzabw) arrayList.get(i10);
            i11 += zzabwVar.zzb;
            if (i11 >= f12) {
                return zzabwVar.zzc;
            }
            i10++;
        }
    }
}

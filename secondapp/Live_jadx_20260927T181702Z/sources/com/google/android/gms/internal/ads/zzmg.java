package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzmg implements zzxn, zzub {
    final /* synthetic */ zzml zza;
    private final zzmi zzb;

    public zzmg(zzml zzmlVar, zzmi zzmiVar) {
        Objects.requireNonNull(zzmlVar);
        this.zza = zzmlVar;
        this.zzb = zzmiVar;
    }

    @Nullable
    private final Pair zzf(int i10, @Nullable zzxc zzxcVar) {
        zzxc zzxcVarZza;
        zzxc zzxcVar2 = null;
        if (zzxcVar != null) {
            zzmi zzmiVar = this.zzb;
            int i11 = 0;
            while (true) {
                List list = zzmiVar.zzc;
                if (i11 >= list.size()) {
                    zzxcVarZza = null;
                    break;
                }
                if (((zzxc) list.get(i11)).zzd == zzxcVar.zzd) {
                    Object obj = zzxcVar.zza;
                    Object obj2 = zzmiVar.zzb;
                    int i12 = zzms.zzb;
                    zzxcVarZza = zzxcVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (zzxcVarZza == null) {
                return null;
            }
            zzxcVar2 = zzxcVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzxcVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzai(int i10, @Nullable zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final int i11) {
        final Pair pairZzf = zzf(0, zzxcVar);
        if (pairZzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar, i11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzaj(int i10, @Nullable zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final Pair pairZzf = zzf(0, zzxcVar);
        if (pairZzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzak(int i10, @Nullable zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final Pair pairZzf = zzf(0, zzxcVar);
        if (pairZzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzal(int i10, @Nullable zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final IOException iOException, final boolean z10) {
        final Pair pairZzf = zzf(0, zzxcVar);
        if (pairZzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzam(int i10, @Nullable zzxc zzxcVar, final zzwy zzwyVar) {
        final Pair pairZzf = zzf(0, zzxcVar);
        if (pairZzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzme
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwyVar);
                }
            });
        }
    }
}

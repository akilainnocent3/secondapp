package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzar implements com.google.android.gms.cast.framework.internal.featurehighlight.zzg {
    final /* synthetic */ Activity zza;
    final /* synthetic */ com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzb;
    final /* synthetic */ zzas zzc;

    public zzar(zzas zzasVar, Activity activity, com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar) {
        this.zzc = zzasVar;
        this.zza = activity;
        this.zzb = zzhVar;
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zza() {
        if (this.zzc.zzf) {
            com.google.android.gms.cast.framework.zzbf.zza(this.zza);
            com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
            final Activity activity = this.zza;
            zzhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.cast.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzar zzarVar = this.zza;
                    if (zzarVar.zzc.zzf) {
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzarVar.zzc);
                        zzas zzasVar = zzarVar.zzc;
                        if (zzasVar.zzc != null) {
                            zzasVar.zzc.onOverlayDismissed();
                        }
                        zzarVar.zzc.zzd();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zzb() {
        if (this.zzc.zzf) {
            com.google.android.gms.cast.framework.zzbf.zza(this.zza);
            com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
            final Activity activity = this.zza;
            zzhVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.cast.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    zzar zzarVar = this.zza;
                    if (zzarVar.zzc.zzf) {
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzarVar.zzc);
                        zzas zzasVar = zzarVar.zzc;
                        if (zzasVar.zzc != null) {
                            zzasVar.zzc.onOverlayDismissed();
                        }
                        zzarVar.zzc.zzd();
                    }
                }
            });
        }
    }
}

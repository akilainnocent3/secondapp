package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfp implements zzgem {
    private final zzgco zza;
    private final zzgfl zzb;
    private final zzgff zzc;
    private final ExecutorService zzd;
    private final zzgpu zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzgfp(zzgco zzgcoVar, zzgfl zzgflVar, zzgff zzgffVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgcoVar;
        this.zzb = zzgflVar;
        this.zzc = zzgffVar;
        this.zzd = executorService;
        this.zze = zzgpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final nj.t1 zza() {
        zzgfl zzgflVar = this.zzb;
        zzgco zzgcoVar = this.zza;
        zzhba zzhbaVar = (zzhba) zzhbi.zzk(zzhba.zzw(zzgflVar.zzb(zzgcoVar.zzG(), zzgcoVar.zza())), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgfo
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgfe zzgfeVar = (zzgfe) obj;
                this.zza.zzf(zzgfeVar);
                return zzgfeVar;
            }
        }, zzhbz.zza());
        zzhbi.zzr(zzhbaVar, new zzgfn(this), this.zzd);
        return zzhbaVar;
    }

    public final nj.t1 zzb(Context context) {
        return ((zzgfe) this.zzf.get()).zzc(context);
    }

    public final nj.t1 zzc(Context context, String str, View view, Activity activity) {
        return ((zzgfe) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final nj.t1 zzd(Context context, String str, View view, Activity activity) {
        return ((zzgfe) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgfe zzgfeVar = (zzgfe) this.zzf.get();
        if (zzgfeVar == null) {
            this.zze.zzb(54);
        } else {
            zzgfeVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzgfe zzf(zzgfe zzgfeVar) {
        this.zzf.set(zzgfeVar);
        return zzgfeVar;
    }

    public final /* synthetic */ zzgff zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzgfe zzgfeVar = (zzgfe) this.zzf.get();
        if (zzgfeVar == null) {
            return 1;
        }
        return zzgfeVar.zzg();
    }
}

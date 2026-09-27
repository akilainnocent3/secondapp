package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnh implements zzdcf, zzdjr {
    private final zzcdk zza;
    private final Context zzb;
    private final zzcdn zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbhj.zza.EnumC0459zza zzf;
    private final zzfjt zzg;

    public zzdnh(zzcdk zzcdkVar, Context context, zzcdn zzcdnVar, @Nullable View view, zzbhj.zza.EnumC0459zza enumC0459zza, zzfjt zzfjtVar) {
        this.zza = zzcdkVar;
        this.zzb = context;
        this.zzc = zzcdnVar;
        this.zzd = view;
        this.zzf = enumC0459zza;
        this.zzg = zzfjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    @zq.j
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
        zzcdn zzcdnVar = this.zzc;
        Context context = this.zzb;
        if (zzcdnVar.zza(context) && this.zzg.zzaG) {
            try {
                zzcdnVar.zzo(context, zzcdnVar.zzj(context), this.zza.zzb(), zzcbdVar.zzb(), zzcbdVar.zzc());
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
        zzbhj.zza.EnumC0459zza enumC0459zza = this.zzf;
        if (enumC0459zza != zzbhj.zza.EnumC0459zza.APP_OPEN && this.zzg.zzaG) {
            String strZzf = this.zzc.zzf(this.zzb);
            this.zze = strZzf;
            this.zze = String.valueOf(strZzf).concat(enumC0459zza == zzbhj.zza.EnumC0459zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
    }
}

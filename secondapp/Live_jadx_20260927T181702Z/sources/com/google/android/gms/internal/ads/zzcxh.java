package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzcxh implements zzeos {
    protected final zzfke zza;
    protected final zzfjt zzb;
    private final zzdde zzc;
    private final zzddr zzd;

    @Nullable
    private final zzfhh zze;
    private final zzdby zzf;
    private final zzdgw zzg;
    private final zzddv zzh;
    private final zzdkb zzi;
    private final zzdbb zzj;
    private final zzeac zzk;

    public zzcxh(zzcxg zzcxgVar) {
        this.zza = zzcxgVar.zza();
        this.zzb = zzcxgVar.zzb();
        this.zzc = zzcxgVar.zzc();
        this.zzd = zzcxgVar.zzd();
        this.zze = zzcxgVar.zze();
        this.zzf = zzcxgVar.zzf();
        this.zzg = zzcxgVar.zzg();
        this.zzh = zzcxgVar.zzh();
        this.zzi = zzcxgVar.zzi();
        this.zzj = zzcxgVar.zzj();
        this.zzk = zzcxgVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzdde zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzdby zzn() {
        return this.zzf;
    }

    public final zzdbb zzo() {
        return this.zzj;
    }

    @Nullable
    public final zzfhh zzp() {
        return this.zze;
    }

    public final zzdfv zzq() {
        return this.zzg.zzn();
    }

    public final zzfke zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzeac zzeacVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzeacVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziL)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgyo zzgyoVarListIterator = ((zzgvz) list).listIterator(0);
        while (zzgyoVarListIterator.hasNext()) {
            zzead zzeadVar = (zzead) zzgyoVarListIterator.next();
            for (int i10 : zzeadVar.zzb) {
                if (i10 == 1) {
                    zzeacVar.zza(zzeadVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
            }
        }
    }
}

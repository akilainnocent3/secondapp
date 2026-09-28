package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.hwr;
import defpackage.ttr;
import defpackage.txf0;
import defpackage.v1b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfp {
    private final String zza;
    private final ttr zzb;
    private final ttr zzc;
    private final ttr zzd;
    private final ttr zze;
    private final ttr zzf;
    private final ttr zzg;
    private final ttr zzh;
    private final ttr zzi;

    public zzfp(String str) {
        this.zza = str;
        int i = zzby.zza;
        this.zzb = hwr.b(zzff.zza);
        this.zzc = hwr.b(zzfg.zza);
        this.zzd = hwr.b(zzfh.zza);
        this.zze = hwr.b(zzfi.zza);
        this.zzf = hwr.b(zzfj.zza);
        this.zzg = hwr.b(zzfk.zza);
        this.zzh = hwr.b(zzfl.zza);
        this.zzi = hwr.b(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) zzfpVar.zzi.getValue();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        if (exc instanceof txf0) {
            return zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null));
        }
        return exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
    }

    public static final /* synthetic */ zzci zze(zzfp zzfpVar) {
        return (zzci) zzfpVar.zzd.getValue();
    }

    public static final /* synthetic */ zzcr zzf(zzfp zzfpVar) {
        return (zzcr) zzfpVar.zzh.getValue();
    }

    public static final /* synthetic */ zzcy zzg(zzfp zzfpVar) {
        return (zzcy) zzfpVar.zzc.getValue();
    }

    public static final /* synthetic */ zzda zzh(zzfp zzfpVar) {
        return (zzda) zzfpVar.zzg.getValue();
    }

    public static final /* synthetic */ zzht zzi(zzfp zzfpVar) {
        return (zzht) zzfpVar.zzb.getValue();
    }

    public static final /* synthetic */ zzif zzj(zzfp zzfpVar) {
        return (zzif) zzfpVar.zze.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzs() {
        return (Application) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcg zzt(Exception exc, zzcg zzcgVar) {
        return !zzu() ? new zzcg(zzce.zzc, zzcd.zzao, exc.getMessage(), null, 8, null) : zzcgVar;
    }

    private final boolean zzu() {
        NetworkCapabilities networkCapabilities;
        int i = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzv(String str) throws zzcg {
        try {
            zzxg zzxgVarZzj = zzxg.zzj(zzdb.zza(str));
            int i = zzby.zza;
            ((zziq) hwr.b(zzeu.zza).getValue()).zza(zzxgVarZzj);
        } catch (Exception e) {
            throw new zzcg(zzce.zzl, zzcd.zzan, e.getMessage(), null, 8, null);
        }
    }

    public final zzye zzk(RecaptchaAction recaptchaAction, zzxx zzxxVar, zzxn zzxnVar) {
        zzyd zzydVarZzf = zzye.zzf();
        zzydVarZzf.zzs(this.zza);
        zzydVarZzf.zze(recaptchaAction.getAction());
        zzydVarZzf.zzf(zzxnVar.zzO());
        zzydVarZzf.zzq(zzxnVar.zzN());
        zzydVarZzf.zzr(zzxxVar);
        return (zzye) zzydVarZzf.zzk();
    }

    public final Object zzl(String str, long j, v1b v1bVar) {
        return new zzhf(27, new zzet(this, str, j, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j, v1b v1bVar) {
        return new zzhf(28, new zzex(this, j, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j, v1b v1bVar) {
        return new zzhg(new zzfd(j, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, v1b v1bVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j, v1b v1bVar) {
        return new zzhf(22, new zzfo(j, this, null), null);
    }
}

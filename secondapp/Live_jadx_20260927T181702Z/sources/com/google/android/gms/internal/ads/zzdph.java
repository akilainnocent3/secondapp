package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.C4235d4;
import f0.k3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdph {
    private int zza;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzea zzb;

    @Nullable
    private zzbll zzc;

    @Nullable
    private View zzd;

    @Nullable
    private List zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzew zzg;

    @Nullable
    private Bundle zzh;

    @Nullable
    private zzcki zzi;

    @Nullable
    private zzcki zzj;

    @Nullable
    private zzcki zzk;

    @Nullable
    private zzelb zzl;

    @Nullable
    private nj.t1 zzm;

    @Nullable
    private zzcfk zzn;

    @Nullable
    private View zzo;

    @Nullable
    private View zzp;

    @Nullable
    private IObjectWrapper zzq;
    private double zzr;

    @Nullable
    private zzbls zzs;

    @Nullable
    private zzbls zzt;

    @Nullable
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final k3 zzv = new k3();
    private final k3 zzw = new k3();
    private List zzf = Collections.EMPTY_LIST;

    @Nullable
    public static zzdph zzaf(zzbvf zzbvfVar) {
        try {
            return zzak(zzam(zzbvfVar.zzn(), zzbvfVar), zzbvfVar.zzo(), (View) zzal(zzbvfVar.zzp()), zzbvfVar.zze(), zzbvfVar.zzf(), zzbvfVar.zzg(), zzbvfVar.zzs(), zzbvfVar.zzi(), (View) zzal(zzbvfVar.zzq()), zzbvfVar.zzr(), zzbvfVar.zzl(), zzbvfVar.zzm(), zzbvfVar.zzk(), zzbvfVar.zzh(), zzbvfVar.zzj(), zzbvfVar.zzz());
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdph zzag(zzbvc zzbvcVar) {
        try {
            zzdpg zzdpgVarZzam = zzam(zzbvcVar.zzs(), null);
            zzbll zzbllVarZzt = zzbvcVar.zzt();
            View view = (View) zzal(zzbvcVar.zzr());
            String strZze = zzbvcVar.zze();
            List listZzf = zzbvcVar.zzf();
            String strZzg = zzbvcVar.zzg();
            Bundle bundleZzp = zzbvcVar.zzp();
            String strZzi = zzbvcVar.zzi();
            View view2 = (View) zzal(zzbvcVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbvcVar.zzv();
            String strZzj = zzbvcVar.zzj();
            zzbls zzblsVarZzh = zzbvcVar.zzh();
            zzdph zzdphVar = new zzdph();
            zzdphVar.zza = 1;
            zzdphVar.zzb = zzdpgVarZzam;
            zzdphVar.zzc = zzbllVarZzt;
            zzdphVar.zzd = view;
            zzdphVar.zzs("headline", strZze);
            zzdphVar.zze = listZzf;
            zzdphVar.zzs("body", strZzg);
            zzdphVar.zzh = bundleZzp;
            zzdphVar.zzs("call_to_action", strZzi);
            zzdphVar.zzo = view2;
            zzdphVar.zzq = iObjectWrapperZzv;
            zzdphVar.zzs(C4235d4.i.F0, strZzj);
            zzdphVar.zzt = zzblsVarZzh;
            return zzdphVar;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdph zzah(zzbvb zzbvbVar) {
        try {
            zzdpg zzdpgVarZzam = zzam(zzbvbVar.zzt(), null);
            zzbll zzbllVarZzv = zzbvbVar.zzv();
            View view = (View) zzal(zzbvbVar.zzu());
            String strZze = zzbvbVar.zze();
            List listZzf = zzbvbVar.zzf();
            String strZzg = zzbvbVar.zzg();
            Bundle bundleZzr = zzbvbVar.zzr();
            String strZzi = zzbvbVar.zzi();
            View view2 = (View) zzal(zzbvbVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbvbVar.zzx();
            String strZzk = zzbvbVar.zzk();
            String strZzl = zzbvbVar.zzl();
            double dZzj = zzbvbVar.zzj();
            zzbls zzblsVarZzh = zzbvbVar.zzh();
            try {
                zzdph zzdphVar = new zzdph();
                zzdphVar.zza = 2;
                zzdphVar.zzb = zzdpgVarZzam;
                zzdphVar.zzc = zzbllVarZzv;
                zzdphVar.zzd = view;
                zzdphVar.zzs("headline", strZze);
                zzdphVar.zze = listZzf;
                zzdphVar.zzs("body", strZzg);
                zzdphVar.zzh = bundleZzr;
                zzdphVar.zzs("call_to_action", strZzi);
                zzdphVar.zzo = view2;
                zzdphVar.zzq = iObjectWrapperZzx;
                zzdphVar.zzs(C4235d4.i.U, strZzk);
                zzdphVar.zzs("price", strZzl);
                zzdphVar.zzr = dZzj;
                zzdphVar.zzs = zzblsVarZzh;
                return zzdphVar;
            } catch (RemoteException e10) {
                e = e10;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e11) {
            e = e11;
        }
    }

    @Nullable
    public static zzdph zzai(zzbvb zzbvbVar) {
        try {
            return zzak(zzam(zzbvbVar.zzt(), null), zzbvbVar.zzv(), (View) zzal(zzbvbVar.zzu()), zzbvbVar.zze(), zzbvbVar.zzf(), zzbvbVar.zzg(), zzbvbVar.zzr(), zzbvbVar.zzi(), (View) zzal(zzbvbVar.zzw()), zzbvbVar.zzx(), zzbvbVar.zzk(), zzbvbVar.zzl(), zzbvbVar.zzj(), zzbvbVar.zzh(), null, 0.0f);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdph zzaj(zzbvc zzbvcVar) {
        try {
            return zzak(zzam(zzbvcVar.zzs(), null), zzbvcVar.zzt(), (View) zzal(zzbvcVar.zzr()), zzbvcVar.zze(), zzbvcVar.zzf(), zzbvcVar.zzg(), zzbvcVar.zzp(), zzbvcVar.zzi(), (View) zzal(zzbvcVar.zzu()), zzbvcVar.zzv(), null, null, -1.0d, zzbvcVar.zzh(), zzbvcVar.zzj(), 0.0f);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdph zzak(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbll zzbllVar, @Nullable View view, String str, List list, String str2, Bundle bundle, String str3, @Nullable View view2, IObjectWrapper iObjectWrapper, @Nullable String str4, @Nullable String str5, double d10, zzbls zzblsVar, @Nullable String str6, float f10) {
        zzdph zzdphVar = new zzdph();
        zzdphVar.zza = 6;
        zzdphVar.zzb = zzeaVar;
        zzdphVar.zzc = zzbllVar;
        zzdphVar.zzd = view;
        zzdphVar.zzs("headline", str);
        zzdphVar.zze = list;
        zzdphVar.zzs("body", str2);
        zzdphVar.zzh = bundle;
        zzdphVar.zzs("call_to_action", str3);
        zzdphVar.zzo = view2;
        zzdphVar.zzq = iObjectWrapper;
        zzdphVar.zzs(C4235d4.i.U, str4);
        zzdphVar.zzs("price", str5);
        zzdphVar.zzr = d10;
        zzdphVar.zzs = zzblsVar;
        zzdphVar.zzs(C4235d4.i.F0, str6);
        zzdphVar.zzu(f10);
        return zzdphVar;
    }

    @Nullable
    private static Object zzal(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    private static zzdpg zzam(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, @Nullable zzbvf zzbvfVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdpg(zzeaVar, zzbvfVar);
    }

    @Nullable
    public final synchronized View zzA() {
        return this.zzd;
    }

    @Nullable
    public final synchronized String zzB() {
        return zzw("headline");
    }

    @Nullable
    public final synchronized List zzC() {
        return this.zze;
    }

    @Nullable
    public final zzbls zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzblr.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    @Nullable
    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzh;
    }

    @Nullable
    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    @Nullable
    public final synchronized View zzJ() {
        return this.zzo;
    }

    @Nullable
    public final synchronized View zzK() {
        return this.zzp;
    }

    @Nullable
    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    @Nullable
    public final synchronized String zzM() {
        return zzw(C4235d4.i.U);
    }

    @Nullable
    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    @Nullable
    public final synchronized zzbls zzP() {
        return this.zzs;
    }

    @Nullable
    public final synchronized String zzQ() {
        return zzw(C4235d4.i.F0);
    }

    @Nullable
    public final synchronized zzbls zzR() {
        return this.zzt;
    }

    @Nullable
    public final synchronized String zzS() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzcki zzT() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzcki zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    @Nullable
    public final synchronized zzcki zzW() {
        return this.zzk;
    }

    @Nullable
    public final synchronized nj.t1 zzX() {
        return this.zzm;
    }

    @Nullable
    public final synchronized zzcfk zzY() {
        return this.zzn;
    }

    @Nullable
    public final synchronized zzelb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i10) {
        this.zza = i10;
    }

    @Nullable
    public final synchronized k3 zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    @Nullable
    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized k3 zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcki zzckiVar = this.zzi;
            if (zzckiVar != null) {
                zzckiVar.destroy();
                this.zzi = null;
            }
            zzcki zzckiVar2 = this.zzj;
            if (zzckiVar2 != null) {
                zzckiVar2.destroy();
                this.zzj = null;
            }
            zzcki zzckiVar3 = this.zzk;
            if (zzckiVar3 != null) {
                zzckiVar3.destroy();
                this.zzk = null;
            }
            nj.t1 t1Var = this.zzm;
            if (t1Var != null) {
                t1Var.cancel(false);
                this.zzm = null;
            }
            zzcfk zzcfkVar = this.zzn;
            if (zzcfkVar != null) {
                zzcfkVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(zzbll zzbllVar) {
        this.zzc = zzbllVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(@Nullable com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzj(zzbls zzblsVar) {
        this.zzs = zzblsVar;
    }

    public final synchronized void zzk(zzbls zzblsVar) {
        this.zzt = zzblsVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcki zzckiVar) {
        this.zzi = zzckiVar;
    }

    public final synchronized void zzn(zzcki zzckiVar) {
        this.zzj = zzckiVar;
    }

    public final synchronized void zzo(zzcki zzckiVar) {
        this.zzk = zzckiVar;
    }

    public final synchronized void zzp(nj.t1 t1Var) {
        this.zzm = t1Var;
    }

    public final synchronized void zzq(zzelb zzelbVar) {
        this.zzl = zzelbVar;
    }

    public final synchronized void zzr(zzcfk zzcfkVar) {
        this.zzn = zzcfkVar;
    }

    public final synchronized void zzs(String str, @Nullable String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzt(String str, zzbld zzbldVar) {
        try {
            if (zzbldVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbldVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzu(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzv(@Nullable String str) {
        this.zzy = str;
    }

    @Nullable
    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    @Nullable
    public final synchronized zzbll zzz() {
        return this.zzc;
    }
}

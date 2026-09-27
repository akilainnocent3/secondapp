package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.Mf;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeam {
    private final zzbqe zza;

    public zzeam(zzbqe zzbqeVar) {
        this.zza = zzbqeVar;
    }

    private final void zzs(zzeal zzealVar) throws RemoteException {
        String strZza = zzealVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzeal(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("creation", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("nativeObjectCreated");
        zzs(zzealVar);
    }

    public final void zzc(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("creation", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("nativeObjectNotCreated");
        zzs(zzealVar);
    }

    public final void zzd(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzealVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc(Mf.f59499j);
        zzs(zzealVar);
    }

    public final void zzf(long j10, int i10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onAdFailedToLoad");
        zzealVar.zzd(Integer.valueOf(i10));
        zzs(zzealVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc(Mf.f59492c);
        zzs(zzealVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc(Mf.f59495f);
        this.zza.zzb(zzealVar.zza());
    }

    public final void zzi(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc(Mf.f59496g);
        zzs(zzealVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzealVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onRewardedAdLoaded");
        zzs(zzealVar);
    }

    public final void zzl(long j10, int i10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onRewardedAdFailedToLoad");
        zzealVar.zzd(Integer.valueOf(i10));
        zzs(zzealVar);
    }

    public final void zzm(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onRewardedAdOpened");
        zzs(zzealVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onRewardedAdFailedToShow");
        zzealVar.zzd(Integer.valueOf(i10));
        zzs(zzealVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onRewardedAdClosed");
        zzs(zzealVar);
    }

    public final void zzp(long j10, zzcbt zzcbtVar) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onUserEarnedReward");
        zzealVar.zze(zzcbtVar.zze());
        zzealVar.zzf(Integer.valueOf(zzcbtVar.zzf()));
        zzs(zzealVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc("onAdImpression");
        zzs(zzealVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j10));
        zzealVar.zzc(Mf.f59495f);
        zzs(zzealVar);
    }
}

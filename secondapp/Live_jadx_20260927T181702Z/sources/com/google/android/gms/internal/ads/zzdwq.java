package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwq {
    private final zzfli zza;
    private final zzdwn zzb;

    public zzdwq(zzfli zzfliVar, zzdwn zzdwnVar) {
        this.zza = zzfliVar;
        this.zzb = zzdwnVar;
    }

    public final zzflk zza(String str, JSONObject jSONObject) throws zzfkt {
        zzbut zzbutVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbutVarZzb = new zzbvr(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbutVarZzb = new zzbvr(new zzbxi());
            } else {
                zzbuq zzbuqVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(gp.e.f87283v);
                        if (zzbuqVarZzd.zzc(string)) {
                            zzbutVarZzb = zzbuqVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbutVarZzb = zzbuqVarZzd.zzd(string) ? zzbuqVarZzd.zzb(string) : zzbuqVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e10);
                        zzbutVarZzb = zzbuqVarZzd.zzb(str);
                    }
                } else {
                    zzbutVarZzb = zzbuqVarZzd.zzb(str);
                }
            }
            zzflk zzflkVar = new zzflk(zzbutVarZzb);
            this.zzb.zza(str, zzflkVar);
            return zzflkVar;
        } catch (Throwable th2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfkt(th2);
        }
    }

    public final zzbwp zzb(String str) throws RemoteException {
        zzbwp zzbwpVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbwpVarZze);
        return zzbwpVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    @k.h1
    public final zzbuq zzd() throws RemoteException {
        zzbuq zzbuqVarZzd = this.zza.zzd();
        if (zzbuqVarZzd != null) {
            return zzbuqVarZzd;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}

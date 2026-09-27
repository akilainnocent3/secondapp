package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhd {
    private final zzbhi zza;
    private final zzbhj.zzt.zza zzb;
    private final boolean zzc;

    private zzbhd() {
        this.zzb = zzbhj.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbhi();
    }

    public static zzbhd zza() {
        return new zzbhd();
    }

    private final synchronized void zzd(int i10) {
        zzbhj.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzj());
        zzbhh zzbhhVar = new zzbhh(this.zza, zzaVar.zzbu().zzaN(), null);
        int i11 = i10 - 1;
        zzbhhVar.zzb(i11);
        zzbhhVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfyu.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzf(i10).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i10) {
        zzbhj.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbhc zzbhcVar) {
        if (this.zzc) {
            try {
                zzbhcVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgf)).booleanValue()) {
                zze(i10);
            } else {
                zzd(i10);
            }
        }
    }

    public zzbhd(zzbhi zzbhiVar) {
        this.zzb = zzbhj.zzt.zzx();
        this.zza = zzbhiVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbrc implements zzasq {
    private volatile zzbqp zza;
    private final Context zzb;

    public zzbrc(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzasq
    @Nullable
    public final zzast zza(zzasx zzasxVar) throws zzatg {
        Parcelable.Creator<zzbqq> creator = zzbqq.CREATOR;
        Map mapZzm = zzasxVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzbqq zzbqqVar = new zzbqq(zzasxVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcfk zzcfkVar = new zzcfk();
            this.zza = new zzbqp(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbra(this, zzcfkVar), new zzbrb(this, zzcfkVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqy zzbqyVar = new zzbqy(this, zzbqqVar);
            zzhbs zzhbsVar = zzcff.zza;
            nj.t1 t1VarZzi = zzhbi.zzi(zzhbi.zzj(zzcfkVar, zzbqyVar, zzhbsVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfs)).intValue(), TimeUnit.MILLISECONDS, zzcff.zzd);
            t1VarZzi.addListener(new zzbqz(this), zzhbsVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) t1VarZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            zzbqs zzbqsVar = (zzbqs) new zzcap(parcelFileDescriptor).zza(zzbqs.CREATOR);
            if (zzbqsVar == null) {
                return null;
            }
            if (zzbqsVar.zza) {
                throw new zzatg(zzbqsVar.zzb);
            }
            String[] strArr3 = zzbqsVar.zze;
            String[] strArr4 = zzbqsVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                map.put(strArr3[i11], strArr4[i11]);
            }
            return new zzast(zzbqsVar.zzc, zzbqsVar.zzd, map, zzbqsVar.zzg, zzbqsVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            return null;
        } catch (Throwable th2) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
            throw th2;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbqp zzc() {
        return this.zza;
    }
}

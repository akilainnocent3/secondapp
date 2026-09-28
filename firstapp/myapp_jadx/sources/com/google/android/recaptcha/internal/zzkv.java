package com.google.android.recaptcha.internal;

import defpackage.hbh0;
import defpackage.itg0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkv implements zzkt {
    private final zzku zza;

    public zzkv(zzku zzkuVar, zzks zzksVar) {
        this.zza = zzkuVar;
    }

    private final zzzo zzb(String str, List list) throws zzdm {
        if (str.length() == 0) {
            itg0.b(3, 17, null);
            return null;
        }
        try {
            zzkr zzkrVar = new zzkr(this.zza.zza(CollectionsKt.B0(list)), 255L, zzkr.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                hbh0.a aVar = hbh0.b;
                sb.append((char) (cCharAt ^ ((int) zzkrVar.zza())));
            }
            return zzzo.zzg(zzpp.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            itg0.b(3, 18, e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkt
    public final zzzo zza(zzzq zzzqVar) throws zzdm {
        zzmf zzmfVarZzb = zzmf.zzb();
        zzzo zzzoVarZzb = zzb(zzzqVar.zzj(), zzzqVar.zzk());
        zzmfVarZzb.zzf();
        long jZza = zzmfVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzco.zza;
        zzco.zza(zzcp.zza.zza(), jZza);
        return zzzoVarZzb;
    }
}

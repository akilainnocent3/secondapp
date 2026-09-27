package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcfk;
import java.util.Map;
import nj.t1;
import zq.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j
public final class zzbl {
    private static zzata zza;
    private static final Object zzb = new Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public zzbl(Context context) {
        zzata zzataVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbie.zza(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        zzataVarZza = zzauc.zza(context, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfq)).booleanValue()) {
                            zzataVarZza = zzay.zzb(context);
                        } else {
                            zzataVarZza = zzauc.zza(context, null);
                        }
                    }
                    zza = zzataVarZza;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final t1 zza(String str) {
        zzcfk zzcfkVar = new zzcfk();
        zza.zzb(new zzbk(str, null, zzcfkVar));
        return zzcfkVar;
    }

    public final t1 zzb(int i10, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i10, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzasf e10) {
                String message = e10.getMessage();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibo extends zziaz {
    public static final zzibo zza = new zzibo();

    private zzibo() {
    }

    public final void zza(zzibs zzibsVar, zziat zziatVar) throws IOException {
        if (zziatVar == null || (zziatVar instanceof zziau)) {
            zzibsVar.zzj();
            return;
        }
        if (zziatVar instanceof zziax) {
            zziax zziaxVarZzg = zziatVar.zzg();
            if (zziaxVarZzg.zzc()) {
                zzibsVar.zzi(zziaxVarZzg.zzh());
                return;
            } else if (zziaxVarZzg.zza()) {
                zzibsVar.zzh(zziaxVarZzg.zzb());
                return;
            } else {
                zzibsVar.zzg(zziaxVarZzg.zzd());
                return;
            }
        }
        if (zziatVar instanceof zzias) {
            zzibsVar.zzb();
            Iterator it = zziatVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzibsVar, (zziat) it.next());
            }
            zzibsVar.zzc();
            return;
        }
        if (!(zziatVar instanceof zziav)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zziatVar.getClass())));
        }
        zzibsVar.zzd();
        for (Map.Entry entry : zziatVar.zze().zzb()) {
            zzibsVar.zzf((String) entry.getKey());
            zza(zzibsVar, (zziat) entry.getValue());
        }
        zzibsVar.zze();
    }
}

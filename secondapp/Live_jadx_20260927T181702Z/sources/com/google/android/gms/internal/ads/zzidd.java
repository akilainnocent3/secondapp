package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzidd extends zzidc {
    @Override // com.google.android.gms.internal.ads.zzidc
    public final void zza(Object obj) {
        ((zzidn) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final void zzb(zzigw zzigwVar, Map.Entry entry) throws IOException {
        zzido zzidoVar = (zzido) entry.getKey();
        if (!zzidoVar.zzc) {
            zzigu zziguVar = zzigu.zza;
            switch (zzidoVar.zzb.ordinal()) {
                case 0:
                    zzigwVar.zzf(zzidoVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzigwVar.zze(zzidoVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzigwVar.zzc(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzigwVar.zzh(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzigwVar.zzi(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzigwVar.zzj(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzigwVar.zzk(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzigwVar.zzl(zzidoVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzigwVar.zzm(zzidoVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzigwVar.zzs(zzidoVar.zza, entry.getValue(), zzifm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzigwVar.zzr(zzidoVar.zza, entry.getValue(), zzifm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzigwVar.zzn(zzidoVar.zza, (zzicn) entry.getValue());
                    break;
                case 12:
                    zzigwVar.zzo(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzigwVar.zzi(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzigwVar.zzb(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzigwVar.zzd(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzigwVar.zzp(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzigwVar.zzq(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzigu zziguVar2 = zzigu.zza;
        switch (zzidoVar.zzb.ordinal()) {
            case 0:
                zzifw.zza(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 1:
                zzifw.zzb(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 2:
                zzifw.zzc(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 3:
                zzifw.zzd(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 4:
                zzifw.zzh(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 5:
                zzifw.zzf(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 6:
                zzifw.zzk(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 7:
                zzifw.zzn(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 8:
                zzifw.zzo(zzidoVar.zza, (List) entry.getValue(), zzigwVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzifw.zzr(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzifm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzifw.zzq(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzifm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzifw.zzp(zzidoVar.zza, (List) entry.getValue(), zzigwVar);
                break;
            case 12:
                zzifw.zzi(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 13:
                zzifw.zzh(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 14:
                zzifw.zzl(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 15:
                zzifw.zzg(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 16:
                zzifw.zzj(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case 17:
                zzifw.zze(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
@Deprecated
public final class zzbit {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbit(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.d.f52079b, str2);
    }

    public static final zzbiq zzf() {
        return new zzbiq(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(@Nullable zzbit zzbitVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbiq zzbiqVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbiq(j10, strArr[0], zzbiqVar));
        }
        return true;
    }

    public final zzbis zzc() {
        zzbis zzbisVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbiq> list = this.zza;
                for (zzbiq zzbiqVar : list) {
                    long jZza = zzbiqVar.zza();
                    String strZzb = zzbiqVar.zzb();
                    zzbiq zzbiqVarZzc = zzbiqVar.zzc();
                    if (zzbiqVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbiqVarZzc.zza();
                        sb2.append(strZzb);
                        sb2.append(kj.e.f102543c);
                        sb2.append(jZza2);
                        sb2.append(fw.b.f85380g);
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbiqVarZzc.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbiqVarZzc.zza()));
                                sb3.append('+');
                                sb3.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbiqVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append(kj.e.f102543c);
                        sb4.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                        sb4.append(fw.b.f85380g);
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbisVar = new zzbis(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbisVar;
    }

    public final void zzd(String str, String str2) {
        zzbij zzbijVarZza;
        if (TextUtils.isEmpty(str2) || (zzbijVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbip zzbipVarZzd = zzbijVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbipVarZzd.zza((String) map.get(str), str2));
        }
    }

    @k.h1
    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}

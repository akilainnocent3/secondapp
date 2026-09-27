package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfst {
    private final zzftm zzc;
    private final zzfsp zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfst(zzftm zzftmVar, zzfsp zzfspVar, Context context, Clock clock) {
        this.zzc = zzftmVar;
        this.zzd = zzfspVar;
        this.zze = context;
        this.zzh = clock;
    }

    public static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length());
        sb2.append(str);
        sb2.append("#");
        sb2.append(strName);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzy)).booleanValue()) {
            zzj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzftl) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzftl) it2.next()).zzi();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
                String strZzh = zzh(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
                hashSet.add(strZzh);
                ConcurrentMap concurrentMap = this.zza;
                zzftl zzftlVar = (zzftl) concurrentMap.get(strZzh);
                if (zzftlVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(strZzh)) {
                        zzftl zzftlVar2 = (zzftl) concurrentMap2.get(strZzh);
                        if (zzftlVar2.zze.equals(zzfpVar)) {
                            zzftlVar2.zzw(zzfpVar.zzd);
                            zzftlVar2.zzj();
                            concurrentMap.put(strZzh, zzftlVar2);
                            concurrentMap2.remove(strZzh);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (zzftlVar.zze.equals(zzfpVar)) {
                    zzftlVar.zzw(zzfpVar.zzd);
                } else {
                    this.zzb.put(strZzh, zzftlVar);
                    concurrentMap.remove(strZzh);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzftl) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzftl zzftlVar3 = (zzftl) ((Map.Entry) it3.next()).getValue();
                zzftlVar3.zzh();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzA)).booleanValue()) {
                    zzftlVar3.zzr();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzB)).booleanValue()) {
                        zzftlVar3.zzr();
                    }
                }
                if (!zzftlVar3.zzf()) {
                    it3.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzftl zzftlVar) {
        zzftlVar.zzd();
        this.zza.put(str, zzftlVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z10;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzftl zzftlVarZzq = zzq(str, adFormat);
            int iZzp = 0;
            z10 = zzftlVarZzq != null && zzftlVarZzq.zzf();
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfsw zzfswVar = new zzfsw(new zzfsv(str, adFormat), null);
            zzfsp zzfspVar = this.zzd;
            int i10 = zzftlVarZzq == null ? 0 : zzftlVarZzq.zze.zzd;
            if (zzftlVarZzq != null) {
                iZzp = zzftlVarZzq.zzp();
            }
            zzfspVar.zzd(i10, iZzp, jCurrentTimeMillis, lValueOf, zzftlVarZzq != null ? zzftlVarZzq.zzk() : null, zzfswVar, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfsw zzfswVar = new zzfsw(new zzfsv(str, adFormat), null);
        zzfsp zzfspVar = this.zzd;
        Clock clock = this.zzh;
        zzfspVar.zzf(clock.currentTimeMillis(), zzfswVar, -1, -1, "1");
        zzftl zzftlVarZzq = zzq(str, adFormat);
        if (zzftlVarZzq == null) {
            return null;
        }
        try {
            String strZzk = zzftlVarZzq.zzk();
            Object objZzg = zzftlVarZzq.zzg();
            Object objCast = objZzg == null ? null : cls.cast(objZzg);
            if (objCast != null) {
                zzfspVar.zzh(clock.currentTimeMillis(), zzftlVarZzq.zze.zzd, zzftlVarZzq.zzp(), strZzk, zzfswVar, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    @Nullable
    private final synchronized zzftl zzq(String str, AdFormat adFormat) {
        return (zzftl) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e10) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfss(this));
                    } catch (RuntimeException e11) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfsr(this));
            }
            List<com.google.android.gms.ads.internal.client.zzfp> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : listZzm) {
                String str = zzfpVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
                zzftl zzftlVarZza = this.zzc.zza(zzfpVar, zzcbVar);
                if (adFormat != null && zzftlVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzftlVarZza.zzm(atomicInteger.get());
                    }
                    zzfsp zzfspVar = this.zzd;
                    zzftlVarZza.zzl(zzfspVar);
                    zzn(zzh(str, adFormat), zzftlVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfspVar.zza(zzfpVar.zzd, this.zzh.currentTimeMillis(), new zzfsw(new zzfsv(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzcbw zzc(String str) {
        return (zzcbw) zzp(zzcbw.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbfx zze(String str) {
        return (zzbfx) zzp(zzbfx.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbu zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzp(com.google.android.gms.ads.internal.client.zzbu.class, str, AdFormat.INTERSTITIAL);
    }
}

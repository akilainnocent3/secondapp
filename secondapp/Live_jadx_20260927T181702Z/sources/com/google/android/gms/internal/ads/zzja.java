package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzja implements zzls {
    public static final zzgvz zza = zzgvz.zzn(C4235d4.i.f61404b, "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabj zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgwc zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzja() {
        zzabj zzabjVar = new zzabj(true, 65536);
        zzgwc zzgwcVarZza = zzgwc.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabjVar;
        this.zze = zzfk.zzs(50000L);
        this.zzf = zzfk.zzs(1000L);
        this.zzg = zzfk.zzs(50000L);
        this.zzh = zzfk.zzs(50000L);
        this.zzi = zzfk.zzs(1000L);
        this.zzj = zzfk.zzs(1000L);
        this.zzk = zzfk.zzs(2000L);
        this.zzl = zzfk.zzs(1000L);
        this.zzm = zzfk.zzs(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgwc.zzc(zzgwcVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpz zzpzVar) {
        Integer num = (Integer) this.zzn.get(zzpzVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpz zzpzVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        if (zzizVar != null) {
            int i10 = zzizVar.zza - 1;
            zzizVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzpzVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabj zzabjVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zziz) it.next()).zzc;
        }
        zzabjVar.zzf(i10);
    }

    private final boolean zzp(zzlr zzlrVar) {
        zzbf zzbfVar = zzlrVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlrVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        zzgsw.zzh(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpz zzpzVar) {
        zziz zzizVar = (zziz) this.zzo.get(zzpzVar);
        zzizVar.getClass();
        return zzizVar.zzc() * 65536;
    }

    private final int zzs(zzpz zzpzVar) {
        zziz zzizVar = (zziz) this.zzo.get(zzpzVar);
        zzizVar.getClass();
        return zzizVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzpz zzpzVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzgsw.zzj(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        if (zzizVar == null) {
            concurrentHashMap.put(zzpzVar, new zziz());
        } else {
            zzizVar.zza++;
        }
        zziz zzizVar2 = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar2.getClass();
        int iZzm = zzm(zzpzVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzizVar2.zzc = iZzm;
        zzizVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpz zzpzVar = zzlrVar.zza;
        int iZzm = zzm(zzpzVar);
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlrVar);
            int length = zzaasVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    zzaas zzaasVar = zzaasVarArr[i10];
                    if (zzaasVar != null) {
                        switch (zzaasVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                i12 = !zZzp ? 131072000 : androidx.media3.exoplayer.d.I;
                                break;
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = androidx.media3.exoplayer.d.N;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    String str = zzfk.zza;
                    iZzm = Math.max(13107200, Math.min(i11, androidx.media3.exoplayer.d.Q));
                }
            }
        }
        zzizVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzc(zzpz zzpzVar) {
        zzn(zzpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzd(zzpz zzpzVar) {
        zzn(zzpzVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzabd zze(zzpz zzpzVar) {
        return new zziy(this, zzpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzf(zzpz zzpzVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzg(zzpz zzpzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzh(zzlr zzlrVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpz zzpzVar = zzlrVar.zza;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar.getClass();
        int iZzr = zzr(zzpzVar);
        int iZzs = zzs(zzpzVar);
        if (zzpzVar.equals(zzpz.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlrVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzlrVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfk.zzx(jMin, f10), j10);
        }
        long j11 = zzlrVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z10 = zzt(zZzp) || iZzr < iZzs;
            zzizVar.zzb = z10;
            if (!z10 && j11 < 500000) {
                zzef.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzizVar.zzb = false;
        }
        return zzizVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzi(zzlr zzlrVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzlrVar.zzg;
        long j10 = zzlrVar.zze;
        float f10 = zzlrVar.zzf;
        boolean zZzp = zzp(zzlrVar);
        long jZzy = zzfk.zzy(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzlrVar.zzh;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jZzy >= jMin) {
            return true;
        }
        if (!zzt(z10)) {
            zzpz zzpzVar = zzlrVar.zza;
            if (zzr(zzpzVar) >= zzs(zzpzVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzj(zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zziz) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzabj zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}

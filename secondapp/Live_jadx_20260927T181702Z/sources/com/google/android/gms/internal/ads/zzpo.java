package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpo implements zzpx {
    public static final zzgto zza = zzpm.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpw zzf;
    private zzbf zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzpo() {
        throw null;
    }

    @ux.m({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zznh zznhVar) {
        if (zznhVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpn zzpnVar = (zzpn) this.zze.get(str);
                zzpnVar.getClass();
                zzm(zzpnVar);
                return;
            }
            return;
        }
        zzpn zzpnVar2 = (zzpn) this.zze.get(this.zzh);
        int i10 = zznhVar.zzc;
        zzxc zzxcVar = zznhVar.zzd;
        this.zzh = zzo(i10, zzxcVar).zze();
        zzc(zznhVar);
        if (zzxcVar == null || !zzxcVar.zzb()) {
            return;
        }
        if (zzpnVar2 != null) {
            if (zzpnVar2.zzg() == zzxcVar.zzd && zzpnVar2.zzh() != null) {
                zzxc zzxcVarZzh = zzpnVar2.zzh();
                if (zzxcVarZzh.zzb == zzxcVar.zzb) {
                    zzxc zzxcVarZzh2 = zzpnVar2.zzh();
                    if (zzxcVarZzh2.zzc == zzxcVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i10, new zzxc(zzxcVar.zza, zzxcVar.zzd));
    }

    private final void zzm(zzpn zzpnVar) {
        if (zzpnVar.zzg() != -1 && zzpnVar.zzi()) {
            this.zzi = zzpnVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpn zzpnVar = (zzpn) this.zze.get(this.zzh);
        return (zzpnVar == null || zzpnVar.zzg() == -1) ? this.zzi + 1 : zzpnVar.zzg();
    }

    private final zzpn zzo(int i10, @Nullable zzxc zzxcVar) {
        HashMap map = this.zze;
        long j10 = Long.MAX_VALUE;
        zzpn zzpnVar = null;
        for (zzpn zzpnVar2 : map.values()) {
            zzpnVar2.zzc(i10, zzxcVar);
            if (zzpnVar2.zzb(i10, zzxcVar)) {
                long jZzg = zzpnVar2.zzg();
                if (jZzg == -1 || jZzg < j10) {
                    zzpnVar = zzpnVar2;
                    j10 = jZzg;
                } else if (jZzg == j10) {
                    String str = zzfk.zza;
                    if (zzpnVar.zzh() != null && zzpnVar2.zzh() != null) {
                        zzpnVar = zzpnVar2;
                    }
                }
            }
        }
        if (zzpnVar != null) {
            return zzpnVar;
        }
        String strZzp = zzp();
        zzpn zzpnVar3 = new zzpn(this, strZzp, i10, zzxcVar);
        map.put(strZzp, zzpnVar3);
        return zzpnVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(zzpw zzpwVar) {
        this.zzf = zzpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized String zzb(zzbf zzbfVar, zzxc zzxcVar) {
        return zzo(zzbfVar.zzo(zzxcVar.zza, this.zzd).zzc, zzxcVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzc(zznh zznhVar) {
        int i10;
        zzpn zzpnVarZzo;
        Object obj;
        int i11;
        zzpn zzpnVarZzo2;
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = zznhVar.zzb;
            if (!zzbfVar.zzg()) {
                zzxc zzxcVar = zznhVar.zzd;
                if (zzxcVar != null) {
                    long j10 = zzxcVar.zzd;
                    if (j10 == -1 || j10 >= zzi()) {
                        zzpn zzpnVar = (zzpn) this.zze.get(this.zzh);
                        if (zzpnVar == null || zzpnVar.zzg() != -1 || zzpnVar.zzf() == zznhVar.zzc) {
                            i10 = zznhVar.zzc;
                            zzpnVarZzo = zzo(i10, zzxcVar);
                            if (this.zzh == null) {
                                this.zzh = zzpnVarZzo.zze();
                            }
                            if (zzxcVar != null && zzxcVar.zzb()) {
                                obj = zzxcVar.zza;
                                long j11 = zzxcVar.zzd;
                                i11 = zzxcVar.zzb;
                                zzpnVarZzo2 = zzo(i10, new zzxc(obj, j11, i11));
                                if (!zzpnVarZzo2.zzi()) {
                                    zzpnVarZzo2.zzj(true);
                                    zzbd zzbdVar = this.zzd;
                                    zzbfVar.zzo(obj, zzbdVar);
                                    zzbdVar.zzc(i11);
                                    Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                                }
                            }
                            if (!zzpnVarZzo.zzi()) {
                                zzpnVarZzo.zzj(true);
                            }
                            if (zzpnVarZzo.zze().equals(this.zzh) && !zzpnVarZzo.zzk()) {
                                zzpnVarZzo.zzl(true);
                                this.zzf.zzc(zznhVar, zzpnVarZzo.zze());
                            }
                        }
                    }
                } else {
                    i10 = zznhVar.zzc;
                    zzpnVarZzo = zzo(i10, zzxcVar);
                    if (this.zzh == null) {
                        this.zzh = zzpnVarZzo.zze();
                    }
                    if (zzxcVar != null) {
                        obj = zzxcVar.zza;
                        long j12 = zzxcVar.zzd;
                        i11 = zzxcVar.zzb;
                        zzpnVarZzo2 = zzo(i10, new zzxc(obj, j12, i11));
                        if (!zzpnVarZzo2.zzi()) {
                            zzpnVarZzo2.zzj(true);
                            zzbd zzbdVar2 = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar2);
                            zzbdVar2.zzc(i11);
                            Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                        }
                    }
                    if (!zzpnVarZzo.zzi()) {
                        zzpnVarZzo.zzj(true);
                    }
                    if (zzpnVarZzo.zze().equals(this.zzh)) {
                        zzpnVarZzo.zzl(true);
                        this.zzf.zzc(zznhVar, zzpnVarZzo.zze());
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzd(zznh zznhVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = this.zzg;
            this.zzg = zznhVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpn zzpnVar = (zzpn) it.next();
                if (!zzpnVar.zza(zzbfVar, this.zzg) || zzpnVar.zzd(zznhVar)) {
                    it.remove();
                    if (zzpnVar.zze().equals(this.zzh)) {
                        zzm(zzpnVar);
                    }
                    if (zzpnVar.zzi()) {
                        this.zzf.zzd(zznhVar, zzpnVar.zze(), false);
                    }
                }
            }
            zzl(zznhVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zze(zznh zznhVar, int i10) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpn zzpnVar = (zzpn) it.next();
                if (zzpnVar.zzd(zznhVar)) {
                    it.remove();
                    boolean zEquals = zzpnVar.zze().equals(this.zzh);
                    if (zEquals) {
                        zzm(zzpnVar);
                    }
                    if (zzpnVar.zzi()) {
                        boolean z10 = false;
                        if (i10 == 0 && zEquals && zzpnVar.zzk()) {
                            z10 = true;
                        }
                        this.zzf.zzd(zznhVar, zzpnVar.zze(), z10);
                    }
                }
            }
            zzl(zznhVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    @Nullable
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzg(zznh zznhVar) {
        zzpw zzpwVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzpn zzpnVar = (zzpn) this.zze.get(str);
                if (zzpnVar == null) {
                    throw null;
                }
                zzm(zzpnVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpn zzpnVar2 = (zzpn) it.next();
                it.remove();
                if (zzpnVar2.zzi() && (zzpwVar = this.zzf) != null) {
                    zzpwVar.zzd(zznhVar, zzpnVar2.zze(), false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpo(zzgto zzgtoVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}

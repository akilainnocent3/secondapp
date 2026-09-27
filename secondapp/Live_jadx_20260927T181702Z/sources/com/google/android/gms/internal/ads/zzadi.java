package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class zzadi implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaem zze;
    private final zzdo zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadn zzi;
    private zzfg zzj = new zzfg(10);
    private zzv zzk;
    private zzdy zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzadi(zzada zzadaVar, byte[] bArr) {
        this.zza = zzadaVar.zze();
        zzbs zzbsVarZzg = zzadaVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgvz.zzi();
        this.zzd = zzadaVar.zzh();
        zzdo zzdoVarZzi = zzadaVar.zzi();
        this.zzf = zzdoVarZzi;
        this.zzh = -zzadaVar.zzj();
        zzadn zzadnVarZzk = zzadaVar.zzk();
        this.zzi = zzadnVarZzk;
        this.zze = new zzacn(zzadaVar.zzf(), zzadnVarZzk, zzdoVarZzi);
        new zzacz(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzO();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzaem zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzfk.zza(sparseArray, 0)) {
            return (zzaem) sparseArray.get(0);
        }
        zzadc zzadcVar = new zzadc(this, this.zza, 0);
        this.zzg.add(zzadcVar);
        sparseArray.put(0, zzadcVar);
        return zzadcVar;
    }

    public final void zzc(Surface surface, zzet zzetVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzet) this.zzm.second).equals(zzetVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzetVar);
        zzetVar.zza();
        zzetVar.zzb();
    }

    public final void zzd() {
        zzet zzetVar = zzet.zza;
        zzetVar.zza();
        zzetVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdy zzdyVar = this.zzl;
        if (zzdyVar != null) {
            zzdyVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: zzdv -> 0x0033, TRY_LEAVE, TryCatch #1 {zzdv -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0064), top: B:40:0x0012 }] */
    public final /* synthetic */ boolean zzi(zzv zzvVar, int i10) throws zzael {
        zzgsw.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzF);
        try {
            int i11 = zziVarZzC.zzd;
            if (i11 != 7) {
                if (zzdw.zzc(i11) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i11)};
                    String str = zzfk.zza;
                    zzef.zzc(d6.r.E, String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zziVarZzC = zzi.zza;
                } else if (i11 != 2 || i11 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdw.zzd()) {
                i11 = 7;
                if (zzdw.zzc(i11)) {
                    if (i11 != 2) {
                        zziVarZzC = zzi.zza;
                    } else {
                        zziVarZzC = zzi.zza;
                    }
                } else if (i11 != 2) {
                    zziVarZzC = zzi.zza;
                } else {
                    zziVarZzC = zzi.zza;
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdo zzdoVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzdy zzdyVarZzd = zzdoVar.zzd(looperMyLooper, null);
            this.zzl = zzdyVarZzd;
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                Objects.requireNonNull(zzdyVarZzd);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadb
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdyVarZzd.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e10) {
                throw new zzael(e10, zzvVar);
            }
        } catch (zzdv e11) {
            throw new zzael(e11, zzvVar);
        }
    }

    public final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j10, long j11) throws zzael {
        this.zze.zzv(j10, j11);
    }

    public final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzaem zzaemVar = this.zze;
            zzaemVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzadh zzadhVar = (zzadh) this.zzj.zzd();
                zzadhVar.getClass();
                zzaemVar.zzs(1, this.zzk, zzadhVar.zza, zzadhVar.zzb, zzgvz.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z10) {
                this.zzq = -9223372036854775807L;
            }
            zzdy zzdyVar = this.zzl;
            zzdyVar.getClass();
            zzdyVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzadj zzadjVar) {
        this.zze.zzl(zzadjVar);
    }

    public final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    public final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    public final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzadn zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzfg zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzfg zzfgVar) {
        this.zzj = zzfgVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}

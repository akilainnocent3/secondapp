package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import zi.g0;
import zi.l0;
import zi.u0;
import zi.w0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();

    @zq.h
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        l0.F(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z10, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzkh zzkhVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkhVar == null || zzkhVar.zza() != context) {
                                if (zzkhVar != null) {
                                    zzjr.zzd();
                                    zzko.zzb();
                                    zzjy.zzc();
                                }
                                zze = new zzjn(context, w0.b(new u0() { // from class: com.google.android.gms.internal.measurement.zzkl
                                    @Override // zi.u0
                                    public final /* synthetic */ Object get() {
                                        int i10 = zzkm.zzc;
                                        return zzjz.zza(context);
                                    }
                                }));
                                zzh.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    @zq.h
    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 zi.g0) = (r2v0 zi.g0), (r2v0 zi.g0), (r2v7 zi.g0) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzd() {
        String strZza;
        zzjv zzjvVarZza;
        String strZzb;
        Object objZze;
        int i10 = zzh.get();
        if (this.zzi < i10) {
            synchronized (this) {
                try {
                    if (this.zzi < i10) {
                        zzkh zzkhVar = zze;
                        g0 g0VarD = g0.d();
                        Object objZza = null;
                        if (zzkhVar == null || zzkhVar.zzb() == null) {
                            strZza = null;
                        } else {
                            g0VarD = (g0) ((u0) l0.E(zzkhVar.zzb())).get();
                            if (g0VarD.j()) {
                                zzjt zzjtVar = (zzjt) g0VarD.i();
                                zzkg zzkgVar = this.zza;
                                strZza = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        }
                        l0.h0(zzkhVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkg zzkgVar2 = this.zza;
                        Uri uri = zzkgVar2.zza;
                        if (uri != null) {
                            zzjvVarZza = zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null;
                        } else {
                            zzjvVarZza = zzko.zza(zzkhVar.zza(), (String) l0.E(null), zzki.zza);
                        }
                        Object objZza2 = (zzjvVarZza == null || (objZze = zzjvVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                        if (objZza2 == null) {
                            if (!zzkgVar2.zzd && (strZzb = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                objZza = zza(strZzb);
                            }
                            objZza2 = objZza == null ? this.zzg : objZza;
                        }
                        if (g0VarD.j()) {
                            objZza2 = strZza == null ? this.zzg : zza(strZza);
                        }
                        this.zzj = objZza2;
                        this.zzi = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzj;
    }
}

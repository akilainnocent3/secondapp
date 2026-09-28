package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.cm8;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ojd;
import defpackage.quw;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.uuw;
import defpackage.v1b;
import defpackage.y5b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbo {
    public cm8 zza;
    private final ttr zzb;
    private zzbp zzc;
    private final ttr zzd;
    private long zze;
    private final quw zzf;
    private boolean zzg;

    public zzbo(long j) {
        int i = zzby.zza;
        this.zzb = hwr.b(zzbk.zza);
        this.zzc = zzbp.zza;
        this.zzd = hwr.b(zzbl.zza);
        this.zzf = uuw.a();
    }

    public static final /* synthetic */ zzcr zzb(zzbo zzboVar) {
        return (zzcr) zzboVar.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(v1b v1bVar) {
        zzbc zzbcVar;
        if (v1bVar instanceof zzbc) {
            zzbcVar = (zzbc) v1bVar;
            int i = zzbcVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbcVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzbcVar = new zzbc(this, v1bVar);
            }
        } else {
            zzbcVar = new zzbc(this, v1bVar);
        }
        Object obj = zzbcVar.zza;
        y5b y5bVar = y5b.a;
        int i2 = zzbcVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ojd ojdVarZza = zzdf.zza(((StandardIntegrityManager) this.zzd.getValue()).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zze).build()));
        zzbcVar.zzc = 1;
        Object objAwait = ojdVarZza.await(zzbcVar);
        return objAwait == y5bVar ? y5bVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(java.lang.String r7, defpackage.v1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzbg
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzbg r0 = (com.google.android.recaptcha.internal.zzbg) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzbg r0 = new com.google.android.recaptcha.internal.zzbg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            y5b r1 = defpackage.y5b.a
            int r2 = r0.zzc
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            java.lang.String r7 = r0.zzd
            defpackage.uj50.b(r8)
            goto L48
        L37:
            defpackage.uj50.b(r8)
            cm8 r6 = r6.zzf()
            r0.zzd = r7
            r0.zzc = r5
            java.lang.Object r8 = r6.await(r0)
            if (r8 == r1) goto L70
        L48:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r6.setRequestHash(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r8.request(r6)
            ojd r6 = com.google.android.recaptcha.internal.zzdf.zza(r6)
            r0.zzd = r3
            r0.zzc = r4
            java.lang.Object r8 = r6.await(r0)
            if (r8 != r1) goto L69
            goto L70
        L69:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r8
            java.lang.String r6 = r8.token()
            return r6
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbo.zzm(java.lang.String, v1b):java.lang.Object");
    }

    public final Object zze(v1b v1bVar) {
        return new zzhg(new zzbn(this, null));
    }

    public final cm8 zzf() {
        cm8 cm8Var = this.zza;
        if (cm8Var != null) {
            return cm8Var;
        }
        return null;
    }

    public final void zzj(long j) {
        this.zze = j;
    }

    public zzbo() {
        this(28800000L);
    }
}

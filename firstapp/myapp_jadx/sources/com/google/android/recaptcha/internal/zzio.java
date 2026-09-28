package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzio extends tje0 implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zziz zzd;
    final /* synthetic */ zzip zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(zziz zzizVar, zzip zzipVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzizVar;
        this.zze = zzipVar;
        this.zzf = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzio(this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzio) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r1.zzh(r7, r2, r6) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto Ld
            defpackage.uj50.b(r7)
            goto L7d
        Ld:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzmf r1 = (com.google.android.recaptcha.internal.zzmf) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzzq r2 = (com.google.android.recaptcha.internal.zzzq) r2
            defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L19
            goto L58
        L19:
            r7 = move-exception
            goto L6a
        L1b:
            defpackage.uj50.b(r7)
            com.google.android.recaptcha.internal.zziz r7 = r6.zzd
            com.google.android.recaptcha.internal.zzcs r1 = new com.google.android.recaptcha.internal.zzcs
            r1.<init>()
            r7.zza = r1
            java.lang.String r1 = r6.zzf     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzpp r3 = com.google.android.recaptcha.internal.zzpp.zzh()     // Catch: java.lang.Exception -> L19
            byte[] r1 = r3.zzj(r1)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzzq r1 = com.google.android.recaptcha.internal.zzzq.zzi(r1)     // Catch: java.lang.Exception -> L19
            r1.zzf()     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzip r3 = r6.zze     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzkt r4 = com.google.android.recaptcha.internal.zzip.zzb(r3)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzzo r4 = r4.zza(r1)     // Catch: java.lang.Exception -> L19
            com.google.android.recaptcha.internal.zzmf r5 = com.google.android.recaptcha.internal.zzmf.zzb()     // Catch: java.lang.Exception -> L19
            java.util.List r4 = r4.zzi()     // Catch: java.lang.Exception -> L19
            r6.zza = r1     // Catch: java.lang.Exception -> L19
            r6.zzb = r5     // Catch: java.lang.Exception -> L19
            r6.zzc = r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzip.zzc(r3, r4, r7, r6)     // Catch: java.lang.Exception -> L19
            if (r7 == r0) goto L7c
            r2 = r1
            r1 = r5
        L58:
            r1.zzf()     // Catch: java.lang.Exception -> L19
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L19
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L19
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L19
            r7.<init>(r3)     // Catch: java.lang.Exception -> L19
            r2.zzf()     // Catch: java.lang.Exception -> L19
            goto L7d
        L6a:
            com.google.android.recaptcha.internal.zzip r1 = r6.zze
            com.google.android.recaptcha.internal.zziz r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzip.zzd(r1, r7, r2, r6)
            if (r6 != r0) goto L7d
        L7c:
            return r0
        L7d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzio.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

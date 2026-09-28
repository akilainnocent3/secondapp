package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfb extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, v1bVar);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r8).zza(r1, r7) == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.zza
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.uj50.b(r8)     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            goto L53
        L10:
            r8 = move-exception
            goto L56
        L12:
            java.lang.Object r7 = r7.zze
            com.google.android.recaptcha.internal.zzcg r7 = (com.google.android.recaptcha.internal.zzcg) r7
            defpackage.uj50.b(r8)
            goto L8c
        L1a:
            java.lang.Object r1 = r7.zze
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r8)     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            goto L45
        L22:
            defpackage.uj50.b(r8)
            java.lang.Object r8 = r7.zze
            r1 = r8
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            com.google.android.recaptcha.internal.zzfp r8 = r7.zzb
            com.google.android.recaptcha.internal.zzxn r4 = r7.zzc
            java.lang.String r5 = r4.zzP()
            com.google.android.recaptcha.internal.zzfp.zzr(r8, r5)
            com.google.android.recaptcha.internal.zzq r8 = com.google.android.recaptcha.internal.zzfp.zzb(r8)     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            long r5 = r7.zzd     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            r7.zze = r1     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            r7.zza = r3     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            java.lang.Object r8 = r8.zzc(r5, r4, r7)     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            if (r8 == r0) goto L8a
        L45:
            com.google.android.recaptcha.internal.zzhf r8 = (com.google.android.recaptcha.internal.zzhf) r8     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            r3 = 0
            r7.zze = r3     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            r7.zza = r2     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            java.lang.Object r7 = r8.zza(r1, r7)     // Catch: com.google.android.recaptcha.internal.zzcg -> L10
            if (r7 != r0) goto L53
            goto L8a
        L53:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L56:
            com.google.android.recaptcha.internal.zzfp r1 = r7.zzb
            com.google.android.recaptcha.internal.zzcr r2 = com.google.android.recaptcha.internal.zzfp.zzf(r1)
            v5b r2 = r2.zzd()
            kotlin.coroutines.CoroutineContext r2 = r2.getCoroutineContext()
            defpackage.i9p.d(r2)
            com.google.android.recaptcha.internal.zzcr r1 = com.google.android.recaptcha.internal.zzfp.zzf(r1)
            v5b r1 = r1.zzd()
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            c9p r1 = defpackage.i9p.f(r1)
            kotlin.sequences.Sequence r1 = r1.getChildren()
            java.util.List r1 = defpackage.ld80.k(r1)
            r7.zze = r8
            r2 = 3
            r7.zza = r2
            java.lang.Object r7 = defpackage.up1.c(r1, r7)
            if (r7 != r0) goto L8b
        L8a:
            return r0
        L8b:
            r7 = r8
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

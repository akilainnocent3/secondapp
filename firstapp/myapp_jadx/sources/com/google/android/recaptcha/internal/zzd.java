package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzd extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, v1bVar);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r10 != r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.zza
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.uj50.b(r10)
            goto L60
        L10:
            java.lang.Object r9 = r9.zze
            com.google.android.recaptcha.internal.zzcg r9 = (com.google.android.recaptcha.internal.zzcg) r9
            defpackage.uj50.b(r10)
            goto L71
        L18:
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L1c
            goto L42
        L1c:
            r10 = move-exception
            goto L51
        L1e:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.zze
            com.google.android.recaptcha.internal.zzgr r10 = (com.google.android.recaptcha.internal.zzgr) r10
            com.google.android.recaptcha.internal.zzg r1 = r9.zzb
            boolean r4 = r1.zzi()
            if (r4 == 0) goto L30
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L30:
            long r4 = r9.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzc r6 = new com.google.android.recaptcha.internal.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzxn r7 = r9.zzd     // Catch: java.lang.Exception -> L1c
            r8 = 0
            r6.<init>(r10, r1, r7, r8)     // Catch: java.lang.Exception -> L1c
            r9.zza = r3     // Catch: java.lang.Exception -> L1c
            java.lang.Object r10 = defpackage.vxf0.b(r4, r6, r9)     // Catch: java.lang.Exception -> L1c
            if (r10 == r0) goto L6f
        L42:
            zi50 r10 = (defpackage.zi50) r10     // Catch: java.lang.Exception -> L1c
            java.lang.Object r10 = r10.a     // Catch: java.lang.Exception -> L1c
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzg r10 = r9.zzb     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzg.zzg(r10, r3)     // Catch: java.lang.Exception -> L1c
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L51:
            com.google.android.recaptcha.internal.zzg r1 = r9.zzb
            r3 = 0
            com.google.android.recaptcha.internal.zzg.zzg(r1, r3)
            r9.zza = r2
            java.lang.Object r10 = r1.zzf(r10, r9)
            if (r10 != r0) goto L60
            goto L6f
        L60:
            com.google.android.recaptcha.internal.zzg r1 = r9.zzb
            com.google.android.recaptcha.internal.zzcg r10 = (com.google.android.recaptcha.internal.zzcg) r10
            r9.zze = r10
            r2 = 3
            r9.zza = r2
            java.lang.Object r9 = r1.zzc(r10, r9)
            if (r9 != r0) goto L70
        L6f:
            return r0
        L70:
            r9 = r10
        L71:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

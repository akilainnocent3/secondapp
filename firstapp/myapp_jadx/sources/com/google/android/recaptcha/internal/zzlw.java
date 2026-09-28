package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlw extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzgr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlw(zzly zzlyVar, zzgr zzgrVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzlyVar;
        this.zzd = zzgrVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzlw(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlw) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (defpackage.vxf0.b(20000, r10, r9) == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r9 = this;
            y5b r1 = defpackage.y5b.a
            int r0 = r9.zzb
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L10
            goto L41
        L10:
            r0 = move-exception
            r10 = r0
            goto L44
        L13:
            java.lang.Object r9 = r9.zza
            com.google.android.recaptcha.internal.zzcg r9 = (com.google.android.recaptcha.internal.zzcg) r9
            defpackage.uj50.b(r10)
            goto L71
        L1b:
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L10
            goto L2c
        L1f:
            defpackage.uj50.b(r10)
            com.google.android.recaptcha.internal.zzly r10 = r9.zzc     // Catch: java.lang.Exception -> L10
            r9.zzb = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r10 = r10.zzw(r9)     // Catch: java.lang.Exception -> L10
            if (r10 == r1) goto L6f
        L2c:
            com.google.android.recaptcha.internal.zzlv r10 = new com.google.android.recaptcha.internal.zzlv     // Catch: java.lang.Exception -> L10
            com.google.android.recaptcha.internal.zzly r0 = r9.zzc     // Catch: java.lang.Exception -> L10
            com.google.android.recaptcha.internal.zzgr r3 = r9.zzd     // Catch: java.lang.Exception -> L10
            r4 = 0
            r10.<init>(r0, r3, r4)     // Catch: java.lang.Exception -> L10
            r9.zzb = r2     // Catch: java.lang.Exception -> L10
            r2 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r9 = defpackage.vxf0.b(r2, r10, r9)     // Catch: java.lang.Exception -> L10
            if (r9 != r1) goto L41
            goto L6f
        L41:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L44:
            r10.getMessage()
            com.google.android.recaptcha.internal.zzcg r2 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r3 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r4 = com.google.android.recaptcha.internal.zzcd.zzV
            java.lang.String r5 = r10.getMessage()
            r7 = 8
            r8 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.recaptcha.internal.zzcg r10 = com.google.android.recaptcha.internal.zzh.zza(r10, r2)
            com.google.android.recaptcha.internal.zzly r0 = r9.zzc
            com.google.android.recaptcha.internal.zzdj r0 = r0.zzn()
            com.google.android.recaptcha.internal.zzmc r2 = com.google.android.recaptcha.internal.zzmc.zza
            r9.zza = r10
            r3 = 3
            r9.zzb = r3
            java.lang.Object r9 = r0.zzc(r2, r9)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            r9 = r10
        L71:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzlw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

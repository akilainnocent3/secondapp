package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzf extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j, zzg zzgVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = j;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, v1bVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        return r1;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r14 = this;
            y5b r1 = defpackage.y5b.a
            int r0 = r14.zza
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L11
            defpackage.uj50.b(r15)     // Catch: java.lang.Exception -> Ld
            goto L34
        Ld:
            r0 = move-exception
            r15 = r0
            r6 = r15
            goto L3e
        L11:
            java.lang.Object r14 = r14.zze
            com.google.android.recaptcha.internal.zzcg r14 = (com.google.android.recaptcha.internal.zzcg) r14
            defpackage.uj50.b(r15)
            goto L67
        L19:
            defpackage.uj50.b(r15)
            java.lang.Object r15 = r14.zze
            com.google.android.recaptcha.internal.zzgr r15 = (com.google.android.recaptcha.internal.zzgr) r15
            long r3 = r14.zzb     // Catch: java.lang.Exception -> Ld
            com.google.android.recaptcha.internal.zze r0 = new com.google.android.recaptcha.internal.zze     // Catch: java.lang.Exception -> Ld
            com.google.android.recaptcha.internal.zzg r5 = r14.zzc     // Catch: java.lang.Exception -> Ld
            java.lang.String r6 = r14.zzd     // Catch: java.lang.Exception -> Ld
            r7 = 0
            r0.<init>(r15, r5, r6, r7)     // Catch: java.lang.Exception -> Ld
            r14.zza = r2     // Catch: java.lang.Exception -> Ld
            java.lang.Object r15 = defpackage.vxf0.b(r3, r0, r14)     // Catch: java.lang.Exception -> Ld
            if (r15 == r1) goto L65
        L34:
            zi50 r15 = (defpackage.zi50) r15     // Catch: java.lang.Exception -> Ld
            java.lang.Object r15 = r15.a     // Catch: java.lang.Exception -> Ld
            defpackage.uj50.b(r15)     // Catch: java.lang.Exception -> Ld
            com.google.android.recaptcha.internal.zzxx r15 = (com.google.android.recaptcha.internal.zzxx) r15     // Catch: java.lang.Exception -> Ld
            return r15
        L3e:
            com.google.android.recaptcha.internal.zzcg r7 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r8 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r9 = com.google.android.recaptcha.internal.zzcd.zzaa
            java.lang.String r10 = r6.getMessage()
            r12 = 8
            r13 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.google.android.recaptcha.internal.zzcg r15 = com.google.android.recaptcha.internal.zzh.zza(r6, r7)
            com.google.android.recaptcha.internal.zzg r2 = r14.zzc
            java.lang.String r3 = r14.zzd
            long r4 = r14.zzb
            r14.zze = r15
            r0 = 2
            r14.zza = r0
            r7 = r14
            java.lang.Object r14 = r2.zze(r3, r4, r6, r7)
            if (r14 != r1) goto L66
        L65:
            return r1
        L66:
            r14 = r15
        L67:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

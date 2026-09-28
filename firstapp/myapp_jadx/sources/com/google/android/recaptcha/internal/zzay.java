package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzay extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzba zzbaVar, zzxp zzxpVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzbaVar;
        this.zzc = zzxpVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzay zzayVar = new zzay(this.zzb, this.zzc, v1bVar);
        zzayVar.zzd = obj;
        return zzayVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r9).zza(r1, r8) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.zza
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.uj50.b(r9)
            goto L6c
        Ld:
            java.lang.Object r1 = r8.zzd
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r9)
            goto L5d
        L15:
            defpackage.uj50.b(r9)
            java.lang.Object r9 = r8.zzd
            r1 = r9
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            com.google.android.recaptcha.internal.zzba r9 = r8.zzb
            com.google.android.recaptcha.internal.zzda r3 = com.google.android.recaptcha.internal.zzba.zzk(r9)
            android.app.Application r4 = com.google.android.recaptcha.internal.zzba.zzb(r9)
            boolean r3 = r3.zzb(r4)
            if (r3 == 0) goto L70
            com.google.android.recaptcha.internal.zzxp r3 = r8.zzc
            long r4 = r3.zzf()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L70
            com.google.android.recaptcha.internal.zzqm r4 = r3.zzg()
            java.lang.String r4 = com.google.android.recaptcha.internal.zzba.zzl(r9, r4)
            com.google.android.recaptcha.internal.zzba.zzn(r9, r4)
            com.google.android.recaptcha.internal.zzbo r4 = com.google.android.recaptcha.internal.zzba.zzj(r9)
            long r5 = r3.zzf()
            r4.zzj(r5)
            com.google.android.recaptcha.internal.zzbo r9 = com.google.android.recaptcha.internal.zzba.zzj(r9)
            r8.zzd = r1
            r8.zza = r2
            java.lang.Object r9 = r9.zze(r8)
            if (r9 == r0) goto L6f
        L5d:
            com.google.android.recaptcha.internal.zzhg r9 = (com.google.android.recaptcha.internal.zzhg) r9
            r2 = 0
            r8.zzd = r2
            r2 = 2
            r8.zza = r2
            java.lang.Object r8 = r9.zza(r1, r8)
            if (r8 != r0) goto L6c
            goto L6f
        L6c:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L6f:
            return r0
        L70:
            r8 = 0
            r9.zzo(r8)
            com.google.android.recaptcha.internal.zzcg r0 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r1 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r2 = com.google.android.recaptcha.internal.zzcd.zzab
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzay.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

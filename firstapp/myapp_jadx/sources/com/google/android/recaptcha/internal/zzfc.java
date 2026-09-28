package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfc extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L14;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.zzb
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.uj50.b(r10)
            goto L40
        Ld:
            java.lang.Object r1 = r9.zza
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r10)
            goto L31
        L15:
            defpackage.uj50.b(r10)
            com.google.android.recaptcha.internal.zzhk r1 = r9.zzc
            com.google.android.recaptcha.internal.zzfp r4 = r9.zzd
            com.google.android.recaptcha.internal.zzxn r5 = r9.zze
            long r6 = r9.zzf
            r9.zza = r1
            r9.zzb = r2
            com.google.android.recaptcha.internal.zzfb r3 = new com.google.android.recaptcha.internal.zzfb
            r8 = 0
            r3.<init>(r4, r5, r6, r8)
            com.google.android.recaptcha.internal.zzhg r10 = new com.google.android.recaptcha.internal.zzhg
            r10.<init>(r3)
            if (r10 == r0) goto L43
        L31:
            com.google.android.recaptcha.internal.zzhg r10 = (com.google.android.recaptcha.internal.zzhg) r10
            r2 = 0
            r9.zza = r2
            r2 = 2
            r9.zzb = r2
            java.lang.Object r9 = r10.zza(r1, r9)
            if (r9 != r0) goto L40
            goto L43
        L40:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

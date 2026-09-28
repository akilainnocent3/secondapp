package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzb extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zzg zzgVar, String str, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, v1bVar);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r12 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r12 == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.zza
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L15
            if (r1 == r2) goto L11
            defpackage.uj50.b(r12)
            goto L64
        L11:
            defpackage.uj50.b(r12)     // Catch: java.lang.Exception -> L52
            goto L4d
        L15:
            java.lang.Object r1 = r11.zze
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r12)     // Catch: java.lang.Exception -> L52
            goto L41
        L1d:
            defpackage.uj50.b(r12)
            java.lang.Object r12 = r11.zze
            r1 = r12
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            com.google.android.recaptcha.internal.zzg r8 = r11.zzb     // Catch: java.lang.Exception -> L52
            java.lang.String r9 = r11.zzc     // Catch: java.lang.Exception -> L52
            long r6 = r11.zzd     // Catch: java.lang.Exception -> L52
            r11.zze = r1     // Catch: java.lang.Exception -> L52
            r11.zza = r3     // Catch: java.lang.Exception -> L52
            int r12 = r8.zzj()     // Catch: java.lang.Exception -> L52
            com.google.android.recaptcha.internal.zzf r5 = new com.google.android.recaptcha.internal.zzf     // Catch: java.lang.Exception -> L52
            r10 = 0
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Exception -> L52
            com.google.android.recaptcha.internal.zzhf r3 = new com.google.android.recaptcha.internal.zzhf     // Catch: java.lang.Exception -> L52
            r3.<init>(r12, r5, r4)     // Catch: java.lang.Exception -> L52
            if (r3 == r0) goto L63
            r12 = r3
        L41:
            com.google.android.recaptcha.internal.zzhf r12 = (com.google.android.recaptcha.internal.zzhf) r12     // Catch: java.lang.Exception -> L52
            r11.zze = r4     // Catch: java.lang.Exception -> L52
            r11.zza = r2     // Catch: java.lang.Exception -> L52
            java.lang.Object r12 = r12.zza(r1, r11)     // Catch: java.lang.Exception -> L52
            if (r12 == r0) goto L63
        L4d:
            com.google.android.recaptcha.internal.zzxx r12 = (com.google.android.recaptcha.internal.zzxx) r12     // Catch: java.lang.Exception -> L52
            zi50$a r11 = defpackage.zi50.b     // Catch: java.lang.Exception -> L52
            goto L66
        L52:
            zi50$a r12 = defpackage.zi50.b
            com.google.android.recaptcha.internal.zzg r12 = r11.zzb
            java.lang.String r1 = r11.zzc
            r11.zze = r4
            r2 = 3
            r11.zza = r2
            java.lang.Object r12 = r12.zza(r1, r11)
            if (r12 != r0) goto L64
        L63:
            return r0
        L64:
            zi50$a r11 = defpackage.zi50.b
        L66:
            zi50 r11 = new zi50
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

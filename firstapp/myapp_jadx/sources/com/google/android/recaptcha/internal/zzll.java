package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzll extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzxn zzxnVar, zzly zzlyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, v1bVar);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r8).zza(r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r8.zzc(r1, r7) != r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.zza
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L10
            defpackage.uj50.b(r8)
            goto L57
        L10:
            java.lang.Object r1 = r7.zzd
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r8)
            goto L48
        L18:
            defpackage.uj50.b(r8)
            goto L6c
        L1c:
            defpackage.uj50.b(r8)
            java.lang.Object r8 = r7.zzd
            r1 = r8
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            com.google.android.recaptcha.internal.zzxn r8 = r7.zzb
            boolean r4 = r8.zzV()
            if (r4 == 0) goto L5c
            boolean r4 = r8.zzT()
            if (r4 == 0) goto L5c
            boolean r4 = r8.zzS()
            if (r4 != 0) goto L39
            goto L5c
        L39:
            com.google.android.recaptcha.internal.zzly r3 = r7.zzc
            com.google.android.recaptcha.internal.zzly.zzA(r3, r8)
            r7.zzd = r1
            r7.zza = r2
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzly.zzu(r3, r7)
            if (r8 == r0) goto L87
        L48:
            com.google.android.recaptcha.internal.zzhg r8 = (com.google.android.recaptcha.internal.zzhg) r8
            r2 = 0
            r7.zzd = r2
            r2 = 3
            r7.zza = r2
            java.lang.Object r7 = r8.zza(r1, r7)
            if (r7 != r0) goto L57
            goto L87
        L57:
            zi50$a r7 = defpackage.zi50.b
            kotlin.Unit r7 = kotlin.Unit.a
            goto L81
        L5c:
            com.google.android.recaptcha.internal.zzly r8 = r7.zzc
            com.google.android.recaptcha.internal.zzdj r8 = r8.zzn()
            com.google.android.recaptcha.internal.zzmc r1 = com.google.android.recaptcha.internal.zzmc.zzd
            r7.zza = r3
            java.lang.Object r7 = r8.zzc(r1, r7)
            if (r7 == r0) goto L87
        L6c:
            zi50$a r7 = defpackage.zi50.b
            com.google.android.recaptcha.internal.zzcg r0 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzce r1 = com.google.android.recaptcha.internal.zzce.zzb
            com.google.android.recaptcha.internal.zzcd r2 = com.google.android.recaptcha.internal.zzcd.zzay
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            zi50$b r7 = new zi50$b
            r7.<init>(r0)
        L81:
            zi50 r8 = new zi50
            r8.<init>(r7)
            return r8
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzll.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

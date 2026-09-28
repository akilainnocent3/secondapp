package com.google.android.recaptcha.internal;

import defpackage.dq40;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzbd extends tje0 implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    final /* synthetic */ dq40 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbo zzboVar, dq40 dq40Var, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzboVar;
        this.zze = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzbd(this.zzd, this.zze, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (defpackage.hkd.b(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            boolean r1 = r7.zzb
            long r4 = r7.zza
            defpackage.uj50.b(r8)
        L11:
            r8 = r1
            goto L76
        L14:
            long r4 = r7.zza
            defpackage.uj50.b(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L42
        L1c:
            defpackage.uj50.b(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r3
        L22:
            if (r8 == 0) goto L7a
            com.google.android.recaptcha.internal.zzbo r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzbo.zzc(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r0) goto L78
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzbo r1 = r7.zzd     // Catch: java.lang.Exception -> L1a
            cm8 r6 = r1.zzf()     // Catch: java.lang.Exception -> L1a
            r6.G(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzbp r8 = com.google.android.recaptcha.internal.zzbp.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzbo.zzi(r1, r8)     // Catch: java.lang.Exception -> L1a
            r8 = r2
            goto L22
        L42:
            dq40 r1 = r7.zze
            r1.a = r8
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L63
            r1 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r6 = -100
            if (r1 == r6) goto L65
            r6 = -18
            if (r1 == r6) goto L65
            r6 = -12
            if (r1 == r6) goto L65
            r6 = -8
            if (r1 == r6) goto L65
            r6 = -3
            if (r1 == r6) goto L65
        L63:
            r1 = r2
            goto L66
        L65:
            r1 = r3
        L66:
            if (r1 == 0) goto L79
            r7.zza = r4
            r7.zzb = r3
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = defpackage.hkd.b(r4, r7)
            if (r8 == r0) goto L78
            goto L11
        L76:
            long r4 = r4 + r4
            goto L22
        L78:
            return r0
        L79:
            throw r8
        L7a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

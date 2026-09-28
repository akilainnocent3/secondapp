package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzeb extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
        this.zzg = zzhhVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, v1bVar);
        zzebVar.zzh = obj;
        return zzebVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r15 == r0) goto L33;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.google.android.recaptcha.internal.zzcg {
        /*
            r14 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r14.zza
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            defpackage.uj50.b(r15)
            goto Lb1
        L15:
            java.lang.Object r1 = r14.zzh
            com.google.android.recaptcha.internal.zzgr r1 = (com.google.android.recaptcha.internal.zzgr) r1
            defpackage.uj50.b(r15)
            goto L9f
        L1e:
            defpackage.uj50.b(r15)
            goto L5e
        L22:
            java.lang.Object r1 = r14.zzh
            com.google.android.recaptcha.internal.zzgr r1 = (com.google.android.recaptcha.internal.zzgr) r1
            defpackage.uj50.b(r15)
            goto L4e
        L2a:
            defpackage.uj50.b(r15)
            java.lang.Object r15 = r14.zzh
            r1 = r15
            com.google.android.recaptcha.internal.zzgr r1 = (com.google.android.recaptcha.internal.zzgr) r1
            com.google.android.recaptcha.internal.zzeh r7 = r14.zzb
            com.google.android.recaptcha.internal.zzeq r15 = com.google.android.recaptcha.internal.zzeh.zzb(r7)
            if (r15 == 0) goto L61
            java.lang.String r2 = r14.zzc
            r14.zzh = r1
            r14.zza = r4
            com.google.android.recaptcha.internal.zzeg r4 = new com.google.android.recaptcha.internal.zzeg
            r4.<init>(r15, r2, r5)
            com.google.android.recaptcha.internal.zzhf r15 = new com.google.android.recaptcha.internal.zzhf
            r2 = 45
            r15.<init>(r2, r4, r5)
            if (r15 == r0) goto Lb4
        L4e:
            com.google.android.recaptcha.internal.zzhf r15 = (com.google.android.recaptcha.internal.zzhf) r15
            r14.zzh = r5
            r14.zza = r3
            com.google.android.recaptcha.internal.zzhk r1 = r1.zza()
            java.lang.Object r15 = r15.zza(r1, r14)
            if (r15 == r0) goto Lb4
        L5e:
            com.google.android.recaptcha.internal.zzeq r15 = (com.google.android.recaptcha.internal.zzeq) r15
            return r15
        L61:
            com.google.android.recaptcha.internal.zzdw r15 = r14.zzd
            if (r15 != 0) goto L7b
            java.lang.String r15 = r14.zzc
            com.google.android.recaptcha.internal.zzdq r3 = r14.zze
            com.google.android.recaptcha.internal.zzfp r4 = new com.google.android.recaptcha.internal.zzfp
            r4.<init>(r15)
            com.google.android.recaptcha.internal.zzdq r15 = com.google.android.recaptcha.internal.zzdq.zza
            boolean r15 = kotlin.jvm.internal.Intrinsics.g(r3, r15)
            if (r15 == 0) goto L7d
            com.google.android.recaptcha.internal.zzge r15 = new com.google.android.recaptcha.internal.zzge
            r15.<init>(r4)
        L7b:
            r10 = r15
            goto L88
        L7d:
            com.google.android.recaptcha.internal.zzgb r15 = new com.google.android.recaptcha.internal.zzgb
            com.google.android.recaptcha.internal.zzct r3 = new com.google.android.recaptcha.internal.zzct
            r3.<init>()
            r15.<init>(r4, r3)
            goto L7b
        L88:
            java.lang.String r11 = r14.zzc
            long r8 = r14.zzf
            com.google.android.recaptcha.internal.zzhh r12 = r14.zzg
            r14.zzh = r1
            r14.zza = r2
            com.google.android.recaptcha.internal.zzee r6 = new com.google.android.recaptcha.internal.zzee
            r13 = 0
            r6.<init>(r7, r8, r10, r11, r12, r13)
            com.google.android.recaptcha.internal.zzhg r15 = new com.google.android.recaptcha.internal.zzhg
            r15.<init>(r6)
            if (r15 == r0) goto Lb4
        L9f:
            com.google.android.recaptcha.internal.zzhg r15 = (com.google.android.recaptcha.internal.zzhg) r15
            r14.zzh = r5
            r2 = 4
            r14.zza = r2
            com.google.android.recaptcha.internal.zzhk r1 = r1.zza()
            java.lang.Object r15 = r15.zza(r1, r14)
            if (r15 != r0) goto Lb1
            goto Lb4
        Lb1:
            com.google.android.recaptcha.internal.zzeq r15 = (com.google.android.recaptcha.internal.zzeq) r15
            return r15
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzeb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

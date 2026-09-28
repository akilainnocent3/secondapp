package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzae extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzar zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzhkVar;
        this.zzd = zzarVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzae(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 == r0) goto L14;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.zzb
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.uj50.b(r5)
            goto L37
        Ld:
            java.lang.Object r1 = r4.zza
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r5)
            goto L28
        L15:
            defpackage.uj50.b(r5)
            com.google.android.recaptcha.internal.zzhk r1 = r4.zzc
            com.google.android.recaptcha.internal.zzar r5 = r4.zzd
            java.lang.String r3 = r4.zze
            r4.zza = r1
            r4.zzb = r2
            java.lang.Object r5 = r5.zzc(r3, r4)
            if (r5 == r0) goto L41
        L28:
            com.google.android.recaptcha.internal.zzhg r5 = (com.google.android.recaptcha.internal.zzhg) r5
            r2 = 0
            r4.zza = r2
            r2 = 2
            r4.zzb = r2
            java.lang.Object r5 = r5.zza(r1, r4)
            if (r5 != r0) goto L37
            goto L41
        L37:
            java.util.List r4 = r4.zzf
            com.google.android.recaptcha.internal.zzat r5 = (com.google.android.recaptcha.internal.zzat) r5
            r4.add(r5)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

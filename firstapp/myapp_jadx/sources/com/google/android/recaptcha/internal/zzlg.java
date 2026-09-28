package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlg extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlg(zzly zzlyVar, zzhk zzhkVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzlyVar;
        this.zzd = zzhkVar;
        this.zze = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzlg(this.zzc, this.zzd, this.zze, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlg) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.zzb
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 == r2) goto L11
            defpackage.uj50.b(r6)
            goto L55
        L11:
            java.lang.Object r1 = r5.zza
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r6)
            goto L47
        L19:
            defpackage.uj50.b(r6)
            goto L2a
        L1d:
            defpackage.uj50.b(r6)
            com.google.android.recaptcha.internal.zzly r6 = r5.zzc
            r5.zzb = r4
            java.lang.Object r6 = r6.zzv(r5)
            if (r6 == r0) goto L58
        L2a:
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            r6.clearCache(r4)
            com.google.android.recaptcha.internal.zzhk r1 = r5.zzd
            com.google.android.recaptcha.internal.zzly r6 = r5.zzc
            java.lang.String r4 = r5.zze
            r5.zza = r1
            r5.zzb = r2
            com.google.android.recaptcha.internal.zzli r2 = new com.google.android.recaptcha.internal.zzli
            r2.<init>(r6, r4, r3)
            com.google.android.recaptcha.internal.zzhf r6 = new com.google.android.recaptcha.internal.zzhf
            r4 = 26
            r6.<init>(r4, r2, r3)
            if (r6 == r0) goto L58
        L47:
            com.google.android.recaptcha.internal.zzhf r6 = (com.google.android.recaptcha.internal.zzhf) r6
            r5.zza = r3
            r2 = 3
            r5.zzb = r2
            java.lang.Object r5 = com.google.android.recaptcha.internal.zzhj.zzb(r1, r6, r5)
            if (r5 != r0) goto L55
            goto L58
        L55:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzlg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlf extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlf(zzly zzlyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzlyVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzlf(this.zzc, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlf) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r7
      0x0055: PHI (r7v14 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.zzb
            java.lang.String r2 = "RN"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L15
            defpackage.uj50.b(r7)
            if (r1 == r3) goto L55
            goto L6a
        L15:
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzly r1 = (com.google.android.recaptcha.internal.zzly) r1
            defpackage.uj50.b(r7)
            goto L3f
        L1d:
            defpackage.uj50.b(r7)
            goto L2e
        L21:
            defpackage.uj50.b(r7)
            com.google.android.recaptcha.internal.zzly r7 = r6.zzc
            r6.zzb = r5
            java.lang.Object r7 = r7.zzv(r6)
            if (r7 == r0) goto L79
        L2e:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r2)
            com.google.android.recaptcha.internal.zzly r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r4
            java.lang.Object r7 = r7.zzv(r6)
            if (r7 == r0) goto L79
        L3f:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r5)
            com.google.android.recaptcha.internal.zzly r7 = r6.zzc
            r1 = 0
            r6.zza = r1
            r6.zzb = r3
            java.lang.Object r7 = r7.zzv(r6)
            if (r7 == r0) goto L79
        L55:
            com.google.android.recaptcha.internal.zzly r1 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzld r3 = r1.zzr()
            r7.addJavascriptInterface(r3, r2)
            r7 = 4
            r6.zzb = r7
            java.lang.Object r7 = r1.zzv(r6)
            if (r7 != r0) goto L6a
            goto L79
        L6a:
            com.google.android.recaptcha.internal.zzly r6 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzle r0 = new com.google.android.recaptcha.internal.zzle
            r0.<init>(r6)
            r7.setWebViewClient(r0)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzlf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

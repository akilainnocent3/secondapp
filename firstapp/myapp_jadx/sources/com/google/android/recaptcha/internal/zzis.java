package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.ej5;
import defpackage.v5b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzis {
    private final WebView zza;
    private final v5b zzb;

    public zzis(WebView webView, v5b v5bVar) {
        this.zza = webView;
        this.zzb = v5bVar;
    }

    public final void zzb(String str, String... strArr) {
        ej5.c(this.zzb, null, null, new zzir((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}

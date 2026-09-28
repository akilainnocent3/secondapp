package com.google.android.recaptcha.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.hwr;
import defpackage.ttr;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class zzii {
    private final ttr zza;

    public zzii() {
        int i = zzby.zza;
        this.zza = hwr.b(zzih.zza);
    }

    public final HttpURLConnection zza(String str) throws zzcg {
        if (!((zzig) this.zza.getValue()).zzb(str)) {
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.getClass();
        return (HttpURLConnection) uRLConnection;
    }
}

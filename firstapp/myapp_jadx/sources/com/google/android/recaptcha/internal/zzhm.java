package com.google.android.recaptcha.internal;

import com.twilio.voice.VoiceURLConnection;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhm {
    private final zzii zza;

    public /* synthetic */ zzhm(zzii zziiVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzii();
    }

    public final zzhl zza(String str) throws zzcg {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzhl(httpURLConnectionZza);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzc, zzcd.zzai, e2.getMessage(), null, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzhm() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

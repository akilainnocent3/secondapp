package com.google.android.recaptcha.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import defpackage.dmf0;
import defpackage.hwr;
import defpackage.ttr;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhp implements zzhn {
    private final ttr zza;

    public zzhp() {
        int i = zzby.zza;
        this.zza = hwr.b(zzho.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final zzxn zza(String str, zzzd zzzdVar) throws zzcg {
        zzhl zzhlVarZza = null;
        try {
            try {
                zzhlVarZza = ((zzhm) this.zza.getValue()).zza(str);
                zzhlVarZza.zzc();
                zzhlVarZza.zze(zzzdVar.zzd());
                zzts zztsVarZza = zzhlVarZza.zza(zzxn.zzj());
                zztsVarZza.getClass();
                zzxn zzxnVar = (zzxn) zztsVarZza;
                zzhlVarZza.zzd();
                return zzxnVar;
            } catch (zzcg e) {
                if (zzhlVarZza == null || !Intrinsics.g(e.zza(), zzcd.zzax)) {
                    throw e;
                }
                try {
                    throw zzcf.zza(zzzj.zzg(zzhlVarZza.zzb().getErrorStream()).zzi());
                } catch (Exception e2) {
                    throw new zzcg(zzce.zzc, zzcd.zzG, e2.getMessage(), null, 8, null);
                }
            } catch (Exception e3) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e3.getMessage(), null, 8, null);
            }
        } catch (Throwable th) {
            if (zzhlVarZza == null) {
                throw th;
            }
            zzhlVarZza.zzd();
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final String zzb(String str) throws zzcg {
        String str2 = UccrWswQGaIj.Mqri;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", str2);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzcg(zzce.zzc, new zzcd(httpURLConnection.getResponseCode()), null, null, 12, null);
                }
                try {
                    return dmf0.b(str2.equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzcg(zzce.zzc, zzcd.zzP, null, null, 12, null);
                }
            } catch (Exception unused2) {
                throw new zzcg(zzce.zzc, zzcd.zzO, null, null, 12, null);
            }
        } catch (Exception unused3) {
            throw new zzcg(zzce.zzb, zzcd.zzN, null, null, 12, null);
        }
    }
}

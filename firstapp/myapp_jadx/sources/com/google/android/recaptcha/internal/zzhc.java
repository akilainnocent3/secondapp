package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.twilio.voice.VoiceURLConnection;
import defpackage.hwr;
import defpackage.ttr;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhc implements zzha {
    private final ttr zza;

    public zzhc() {
        int i = zzby.zza;
        this.zza = hwr.b(zzhb.zza);
    }

    private static final void zzb(byte[] bArr) {
        for (zzwn zzwnVar : zzwq.zzk(bArr).zzl()) {
            String str = "INIT_TOTAL";
            List listK = b.k("INIT_TOTAL", "EXECUTE_TOTAL");
            switch (zzwnVar.zzaa()) {
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INIT_NATIVE";
                    break;
                case 4:
                    str = "INIT_NETWORK";
                    break;
                case 5:
                    str = "INIT_JS";
                    break;
                case 6:
                    break;
                case 7:
                    str = "EXECUTE_NATIVE";
                    break;
                case 8:
                    str = "EXECUTE_JS";
                    break;
                case 9:
                    str = "EXECUTE_TOTAL";
                    break;
                case 10:
                    str = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    str = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    str = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    str = "VERIFY_PIN_NATIVE";
                    break;
                case 14:
                    str = "VERIFY_PIN_JS";
                    break;
                case 15:
                    str = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    str = "RUN_PROGRAM";
                    break;
                case 17:
                    str = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    str = "JS_LOAD";
                    break;
                case 19:
                    str = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    str = "INIT_NETWORK_MRI_ACTION";
                    break;
                case 21:
                    str = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    str = "VALIDATE_INPUT";
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    str = "DOWNLOAD_JS";
                    break;
                case 24:
                    str = "SAVE_CACHE_JS";
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    str = "LOAD_CACHE_JS";
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    str = "LOAD_WEBVIEW";
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str = "COLLECT_SIGNALS";
                    break;
                case 28:
                    str = "FETCH_TOKEN";
                    break;
                case 29:
                    str = "POST_EXECUTE";
                    break;
                case 30:
                    str = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    str = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    str = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    str = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    str = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    str = "PIA_WARMUP";
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    str = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case 40:
                    str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 41:
                    str = "INIT_ATTEMPT";
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    str = "WEBVIEW_INITIALIZATION";
                    break;
                case 43:
                    str = "ORCAS_ENGINE_INITIALIZATION";
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    str = "ORCAS_ENGINE_SIGNAL_COLLECTION";
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    str = "INIT_CLIENT_REUSE";
                    break;
                case 46:
                    str = "ORCAS_SIGNAL_COLLECTION";
                    break;
                case 47:
                    str = "ORCAS_SIGNAL_INITIALIZATION";
                    break;
                case 48:
                    str = "FETCH_TOKEN_ATTEMPT";
                    break;
                case 49:
                    str = "ORCAS_FETCH_VERIFICATION_KEY";
                    break;
                case 50:
                    str = "ORCAS_VALIDATE_SIGNATURE";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            if (listK.contains(str) && zzwnVar.zzY()) {
                zzwnVar.zzN();
                zzwnVar.zzO();
                zzwnVar.zzaa();
                zzwnVar.zzi().zzk();
                zzwnVar.zzi().zzf();
                zzwnVar.zzab();
            } else {
                zzwnVar.zzN();
                zzwnVar.zzO();
                zzwnVar.zzaa();
                zzwnVar.zzab();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzha
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            String strZzc = ((zzcy) this.zza.getValue()).zzc();
            if (URLUtil.isHttpUrl(strZzc)) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(strZzc).openConnection());
                uRLConnection.getClass();
                httpURLConnection = (HttpURLConnection) uRLConnection;
            } else {
                if (!URLUtil.isHttpsUrl(strZzc)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(strZzc).openConnection());
                uRLConnection2.getClass();
                httpURLConnection = (HttpsURLConnection) uRLConnection2;
            }
            httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}

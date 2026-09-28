package defpackage;

import android.content.Context;
import com.twilio.voice.Constants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class bid implements xzm {
    @Override // defpackage.xzm
    public final LinkedHashMap a(b5 b5Var) {
        String strValueOf;
        b5Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b5Var.getAccessToken() != null) {
            linkedHashMap.put("cookie", "accessToken=" + b5Var.getAccessToken());
        }
        linkedHashMap.put("content-type", Constants.APP_JSON_PAYLOAD_TYPE);
        linkedHashMap.put("accept-encoding", "gzip");
        String nullableCountry = b5Var.getNullableCountry();
        if (nullableCountry != null) {
            linkedHashMap.put("country-code", nullableCountry);
        }
        String property = System.getProperty("http.agent");
        if (property != null) {
            strValueOf = property.concat("-") + b5Var.fetchversionCode();
        } else {
            strValueOf = String.valueOf(b5Var.fetchversionCode());
        }
        linkedHashMap.put("user-agent", strValueOf);
        linkedHashMap.put("x-platform", "ANDROID");
        try {
            Context appContext = b5Var.getAppContext();
            linkedHashMap.put("download-source", (appContext == null || !b5Var.isSideLoading(appContext)) ? "google-play-store" : "external-link");
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }
}

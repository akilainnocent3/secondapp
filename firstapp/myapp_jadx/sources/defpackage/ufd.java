package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.twilio.voice.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ufd {
    public final String a;

    public ufd(String str, t19 t19Var) {
        this.a = str;
    }

    public static void a(spm spmVar, am80 am80Var) {
        String str = am80Var.a;
        if (str != null) {
            spmVar.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        spmVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        spmVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.1");
        spmVar.c("Accept", Constants.APP_JSON_PAYLOAD_TYPE);
        spmVar.c("X-CRASHLYTICS-DEVICE-MODEL", am80Var.b);
        String str2 = am80Var.c;
        if (str2 != null) {
            spmVar.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = am80Var.d;
        if (str3 != null) {
            spmVar.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = am80Var.e.c().a;
        if (str4 != null) {
            spmVar.c("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(am80 am80Var) {
        HashMap map = new HashMap();
        map.put("build_version", am80Var.h);
        map.put("display_version", am80Var.g);
        map.put("source", Integer.toString(am80Var.i));
        String str = am80Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject c(vpm vpmVar) {
        int i = vpmVar.a;
        ngt ngtVar = ngt.a;
        ngtVar.c("Settings response code was: " + i);
        String str = this.a;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = vpmVar.b;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                ngtVar.d("Failed to parse settings JSON from ".concat(str), e);
                ngtVar.d("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (ngtVar.a(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }
}

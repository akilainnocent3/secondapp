package defpackage;

import android.text.TextUtils;
import com.sportybet.android.instantwin.newtork.model.ErrorServer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class gm {
    public String a;
    public String b;

    public static gm a(ErrorServer errorServer) {
        if (errorServer != null) {
            long j = errorServer.errorCode;
            if (19202 == j || 19106 == j) {
                try {
                    JSONObject jSONObject = new JSONObject(errorServer.causeMsg);
                    gm gmVar = new gm();
                    gmVar.a = jSONObject.optString("title");
                    gmVar.b = jSONObject.optString("msg");
                    if ((TextUtils.isEmpty(gmVar.a) && TextUtils.isEmpty(gmVar.b)) ? false : true) {
                        return gmVar;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }
}

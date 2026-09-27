package sg.bigo.ads.controller.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import gp.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f134328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f134329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f134330d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f134329c = jSONObject.optString("data");
            this.f134327a = jSONObject.optInt(e.f87280s);
            this.f134328b = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            r.a(jSONObject.optInt("timestamp", 0));
            this.f134330d = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals(e.f87280s, next) && !TextUtils.equals(NotificationCompat.CATEGORY_MESSAGE, next)) {
                    this.f134330d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f134329c = "";
            this.f134327a = 1005;
            this.f134328b = "Invalid response.";
        }
    }

    public final boolean b() {
        return this.f134327a == -14;
    }

    public final boolean a() {
        return this.f134327a == 1;
    }
}

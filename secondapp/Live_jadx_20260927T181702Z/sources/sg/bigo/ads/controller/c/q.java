package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements sg.bigo.ads.api.core.b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f134112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f134115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f134116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f134117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f134118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f134119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f134120i;

    public q(@NonNull JSONObject jSONObject) {
        this.f134112a = jSONObject;
        this.f134113b = jSONObject.optInt("type", 0);
        this.f134114c = jSONObject.optString("value", "");
        this.f134115d = jSONObject.optString("name", "");
        this.f134116e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f134117f = jSONObject.optInt("replace", 0);
        this.f134118g = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray == null) {
            this.f134119h = new String[0];
            this.f134120i = new String[0];
            return;
        }
        this.f134119h = new String[jSONArrayOptJSONArray.length()];
        this.f134120i = new String[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                this.f134119h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f134120i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.f
    public final JSONObject a() {
        return this.f134112a;
    }
}

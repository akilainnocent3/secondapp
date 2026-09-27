package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements sg.bigo.ads.api.core.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f134089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f134090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f134091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f134092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f134093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f134094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String[] f134095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f134096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f134097i;

    public n(@NonNull JSONObject jSONObject) {
        this.f134089a = jSONObject.optString("icon");
        this.f134090b = jSONObject.optString("title");
        this.f134091c = jSONObject.optString("rate");
        this.f134092d = jSONObject.optString("comments");
        this.f134093e = jSONObject.optString("downloads");
        this.f134094f = jSONObject.optString("description");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genre");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.f134095g = new String[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f134095g[i10] = jSONArrayOptJSONArray.optString(i10);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("img");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.f134096h = new String[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                this.f134096h[i11] = jSONArrayOptJSONArray2.optString(i11);
            }
        }
        this.f134097i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String a() {
        return this.f134089a;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String b() {
        return this.f134090b;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String c() {
        return this.f134094f;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] d() {
        return this.f134095g;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] e() {
        return this.f134096h;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String f() {
        return this.f134097i;
    }
}

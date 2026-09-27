package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements sg.bigo.ads.api.core.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f134098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f134099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f134101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f134102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f134103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f134104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f134105h;

    public o(@NonNull JSONObject jSONObject) {
        this.f134098a = jSONObject.optString("imageurl");
        this.f134099b = jSONObject.optString("clickurl");
        this.f134100c = jSONObject.optString("longlegaltext");
        this.f134101d = jSONObject.optString("ad_info");
        this.f134102e = jSONObject.optString("ad_link");
        this.f134103f = jSONObject.optInt("percent");
        this.f134104g = jSONObject.optString("rec_rule");
        this.f134105h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String a() {
        return this.f134098a;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String b() {
        return this.f134099b;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String c() {
        return this.f134100c;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String d() {
        return this.f134101d;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String e() {
        return this.f134102e;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final int f() {
        return this.f134103f;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String g() {
        return this.f134104g;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String h() {
        return this.f134105h;
    }
}

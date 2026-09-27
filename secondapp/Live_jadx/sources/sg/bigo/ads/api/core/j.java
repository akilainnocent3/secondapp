package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sg.bigo.ads.api.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f132799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f132801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f132802d;

    public j(@NonNull JSONObject jSONObject) {
        this.f132799a = jSONObject.optInt("w");
        this.f132800b = jSONObject.optInt("h");
        this.f132801c = jSONObject.optString("url");
        this.f132802d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f132799a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.f132800b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.f132801c;
    }
}

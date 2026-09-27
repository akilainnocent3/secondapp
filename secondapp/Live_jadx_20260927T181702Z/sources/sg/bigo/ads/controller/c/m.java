package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements sg.bigo.ads.api.core.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f134086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f134087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134088c;

    public m(@NonNull JSONObject jSONObject) {
        this.f134086a = jSONObject.optString("vendor_url");
        this.f134087b = jSONObject.optString("vendor_key");
        this.f134088c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String a() {
        return this.f134086a;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String b() {
        return this.f134087b;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String c() {
        return this.f134088c;
    }
}

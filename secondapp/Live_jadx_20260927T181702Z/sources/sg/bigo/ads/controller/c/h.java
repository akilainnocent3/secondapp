package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sg.bigo.ads.api.core.h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134055c;

    public h(@NonNull JSONObject jSONObject) {
        this.f134053a = jSONObject.optInt("w");
        this.f134054b = jSONObject.optInt("h");
        this.f134055c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int a() {
        return this.f134053a;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int b() {
        return this.f134054b;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final String c() {
        return this.f134055c;
    }
}

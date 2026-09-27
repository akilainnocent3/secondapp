package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sg.bigo.ads.api.core.n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f134059d;

    public i(@NonNull JSONObject jSONObject) {
        this.f134056a = jSONObject.optInt("w");
        this.f134057b = jSONObject.optInt("h");
        this.f134058c = jSONObject.optString("url");
        this.f134059d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int a() {
        return this.f134056a;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final int b() {
        return this.f134057b;
    }

    @Override // sg.bigo.ads.api.core.n.a
    public final String c() {
        return this.f134058c;
    }
}

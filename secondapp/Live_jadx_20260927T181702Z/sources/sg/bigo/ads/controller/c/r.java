package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements sg.bigo.ads.api.core.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f134123c;

    public r(@NonNull JSONObject jSONObject) {
        this.f134121a = jSONObject.optInt("w");
        this.f134122b = jSONObject.optInt("h");
        this.f134123c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int a() {
        return this.f134121a;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int b() {
        return this.f134122b;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final String c() {
        return this.f134123c;
    }
}

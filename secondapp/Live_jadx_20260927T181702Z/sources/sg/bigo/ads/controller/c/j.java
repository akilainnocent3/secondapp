package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sg.bigo.ads.api.core.n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f134061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f134062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f134063d;

    public j(@NonNull JSONObject jSONObject) {
        this.f134060a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f134061b = jSONObject.optLong("video_impression_time", 0L);
        this.f134062c = jSONObject.optInt("image_impression_area_rate", 0);
        this.f134063d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int a() {
        return this.f134060a;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long b() {
        return this.f134061b;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int c() {
        return this.f134062c;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long d() {
        return this.f134063d;
    }
}

package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements sg.bigo.ads.api.core.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f134047a;

    public e(@NonNull JSONObject jSONObject) {
        this.f134047a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.h.a
    public final boolean a() {
        return this.f134047a;
    }

    @Override // sg.bigo.ads.api.core.h.a
    @NonNull
    public final String[] b() {
        return new String[0];
    }
}

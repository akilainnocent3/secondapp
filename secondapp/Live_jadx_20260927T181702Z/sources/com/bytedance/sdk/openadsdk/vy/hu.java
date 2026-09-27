package com.bytedance.sdk.openadsdk.vy;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends hww {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static final SimpleDateFormat f37829sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public hu(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.vy.hww
    public JSONObject sd() {
        return this.f37883tq;
    }
}

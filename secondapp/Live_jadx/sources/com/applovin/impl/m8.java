package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f27562c;

    public m8(JSONObject jSONObject) {
        this.f27560a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f27561b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f27562c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f27560a;
    }

    public String b() {
        return this.f27561b;
    }

    public List c() {
        return this.f27562c;
    }
}

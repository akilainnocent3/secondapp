package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f44431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f44432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f44433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f44434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f44435g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f44429a);
        c1.a(jSONObject, "spotId", this.f44430b);
        c1.a(jSONObject, "display", this.f44431c);
        c1.a(jSONObject, kp.b.f102821a, this.f44432d);
        c1.a(jSONObject, "native", this.f44433e);
        c1.a(jSONObject, "video", this.f44434f);
        c1.a(jSONObject, "viewability", this.f44435g);
        return jSONObject.toString();
    }
}

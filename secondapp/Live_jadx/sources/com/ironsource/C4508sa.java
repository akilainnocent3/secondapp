package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4508sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4475qa f63578a;

    public C4508sa(InterfaceC4475qa interfaceC4475qa) {
        this.f63578a = interfaceC4475qa;
    }

    public void a(C4491ra c4491ra, JSONObject jSONObject) {
        this.f63578a.a(false, c4491ra.a(), jSONObject);
    }

    public void b(C4491ra c4491ra, JSONObject jSONObject) {
        this.f63578a.a(true, c4491ra.d(), jSONObject);
    }
}

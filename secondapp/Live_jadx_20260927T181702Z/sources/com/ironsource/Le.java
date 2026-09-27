package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final JSONObject f59447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final C4596xd f59448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final Map<String, C4528td> f59449c;

    public Le(@oy.l JSONObject configurations, @oy.l C4596xd providerOrder, @oy.l Map<String, C4528td> providerSettings) {
        kotlin.jvm.internal.m0.p(configurations, "configurations");
        kotlin.jvm.internal.m0.p(providerOrder, "providerOrder");
        kotlin.jvm.internal.m0.p(providerSettings, "providerSettings");
        this.f59447a = configurations;
        this.f59448b = providerOrder;
        this.f59449c = providerSettings;
    }

    @oy.l
    public final JSONObject a() {
        return this.f59447a;
    }

    @oy.l
    public final C4596xd b() {
        return this.f59448b;
    }

    @oy.l
    public final Map<String, C4528td> c() {
        return this.f59449c;
    }

    @oy.l
    public final JSONObject d() {
        return this.f59447a;
    }

    @oy.l
    public final C4596xd e() {
        return this.f59448b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return kotlin.jvm.internal.m0.g(this.f59447a, le2.f59447a) && kotlin.jvm.internal.m0.g(this.f59448b, le2.f59448b) && kotlin.jvm.internal.m0.g(this.f59449c, le2.f59449c);
    }

    @oy.l
    public final Map<String, C4528td> f() {
        return this.f59449c;
    }

    public int hashCode() {
        return (((this.f59447a.hashCode() * 31) + this.f59448b.hashCode()) * 31) + this.f59449c.hashCode();
    }

    @oy.l
    public String toString() {
        return "ServerResponse2(configurations=" + this.f59447a + ", providerOrder=" + this.f59448b + ", providerSettings=" + this.f59449c + gi.j.f86771d;
    }

    @oy.l
    public final Le a(@oy.l JSONObject configurations, @oy.l C4596xd providerOrder, @oy.l Map<String, C4528td> providerSettings) {
        kotlin.jvm.internal.m0.p(configurations, "configurations");
        kotlin.jvm.internal.m0.p(providerOrder, "providerOrder");
        kotlin.jvm.internal.m0.p(providerSettings, "providerSettings");
        return new Le(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Le a(Le le2, JSONObject jSONObject, C4596xd c4596xd, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = le2.f59447a;
        }
        if ((i10 & 2) != 0) {
            c4596xd = le2.f59448b;
        }
        if ((i10 & 4) != 0) {
            map = le2.f59449c;
        }
        return le2.a(jSONObject, c4596xd, map);
    }
}

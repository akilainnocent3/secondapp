package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Nb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f59539d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f59540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f59541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final JSONObject f59542c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final Nb a(@oy.l String jsonStr) throws JSONException {
            kotlin.jvm.internal.m0.p(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(com.ironsource.sdk.controller.f.b.f63771c);
            String command = jSONObject.getString(com.ironsource.sdk.controller.f.b.f63775g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.m0.o(adId, "adId");
            kotlin.jvm.internal.m0.o(command, "command");
            return new Nb(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public Nb(@oy.l String adId, @oy.l String command, @oy.m JSONObject jSONObject) {
        kotlin.jvm.internal.m0.p(adId, "adId");
        kotlin.jvm.internal.m0.p(command, "command");
        this.f59540a = adId;
        this.f59541b = command;
        this.f59542c = jSONObject;
    }

    @oy.l
    public final String a() {
        return this.f59540a;
    }

    @oy.l
    public final String b() {
        return this.f59541b;
    }

    @oy.m
    public final JSONObject c() {
        return this.f59542c;
    }

    @oy.l
    public final String d() {
        return this.f59540a;
    }

    @oy.l
    public final String e() {
        return this.f59541b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb2 = (Nb) obj;
        return kotlin.jvm.internal.m0.g(this.f59540a, nb2.f59540a) && kotlin.jvm.internal.m0.g(this.f59541b, nb2.f59541b) && kotlin.jvm.internal.m0.g(this.f59542c, nb2.f59542c);
    }

    @oy.m
    public final JSONObject f() {
        return this.f59542c;
    }

    public int hashCode() {
        int iHashCode = ((this.f59540a.hashCode() * 31) + this.f59541b.hashCode()) * 31;
        JSONObject jSONObject = this.f59542c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @oy.l
    public String toString() {
        return "MessageToNative(adId=" + this.f59540a + ", command=" + this.f59541b + ", params=" + this.f59542c + gi.j.f86771d;
    }

    @oy.l
    public final Nb a(@oy.l String adId, @oy.l String command, @oy.m JSONObject jSONObject) {
        kotlin.jvm.internal.m0.p(adId, "adId");
        kotlin.jvm.internal.m0.p(command, "command");
        return new Nb(adId, command, jSONObject);
    }

    public static /* synthetic */ Nb a(Nb nb2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nb2.f59540a;
        }
        if ((i10 & 2) != 0) {
            str2 = nb2.f59541b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = nb2.f59542c;
        }
        return nb2.a(str, str2, jSONObject);
    }

    @oy.l
    @cs.o
    public static final Nb a(@oy.l String str) throws JSONException {
        return f59539d.a(str);
    }
}

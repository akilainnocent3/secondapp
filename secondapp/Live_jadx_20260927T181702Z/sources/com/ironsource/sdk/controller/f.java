package com.ironsource.sdk.controller;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final C0591a f63766c = new C0591a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f63767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private final JSONObject f63768b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0591a {
            public /* synthetic */ C0591a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            @cs.o
            public final a a(@oy.l String jsonStr) throws JSONException {
                kotlin.jvm.internal.m0.p(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id2 = jSONObject.getString(b.f63770b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                kotlin.jvm.internal.m0.o(id2, "id");
                return new a(id2, jSONObjectOptJSONObject);
            }

            private C0591a() {
            }
        }

        public a(@oy.l String msgId, @oy.m JSONObject jSONObject) {
            kotlin.jvm.internal.m0.p(msgId, "msgId");
            this.f63767a = msgId;
            this.f63768b = jSONObject;
        }

        @oy.l
        public final String a() {
            return this.f63767a;
        }

        @oy.m
        public final JSONObject b() {
            return this.f63768b;
        }

        @oy.l
        public final String c() {
            return this.f63767a;
        }

        @oy.m
        public final JSONObject d() {
            return this.f63768b;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f63767a, aVar.f63767a) && kotlin.jvm.internal.m0.g(this.f63768b, aVar.f63768b);
        }

        public int hashCode() {
            int iHashCode = this.f63767a.hashCode() * 31;
            JSONObject jSONObject = this.f63768b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @oy.l
        public String toString() {
            return "CallbackToNative(msgId=" + this.f63767a + ", params=" + this.f63768b + gi.j.f86771d;
        }

        @oy.l
        public final a a(@oy.l String msgId, @oy.m JSONObject jSONObject) {
            kotlin.jvm.internal.m0.p(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f63767a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f63768b;
            }
            return aVar.a(str, jSONObject);
        }

        @oy.l
        @cs.o
        public static final a a(@oy.l String str) throws JSONException {
            return f63766c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f63769a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f63770b = "msgId";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f63771c = "adId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f63772d = "params";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public static final String f63773e = "success";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.l
        public static final String f63774f = "reason";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.l
        public static final String f63775g = "command";

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f63776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final String f63777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        private final JSONObject f63778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        private String f63779d;

        public c(@oy.l String adId, @oy.l String command, @oy.l JSONObject params) {
            kotlin.jvm.internal.m0.p(adId, "adId");
            kotlin.jvm.internal.m0.p(command, "command");
            kotlin.jvm.internal.m0.p(params, "params");
            this.f63776a = adId;
            this.f63777b = command;
            this.f63778c = params;
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m0.o(string, "randomUUID().toString()");
            this.f63779d = string;
        }

        @oy.l
        public final String a() {
            return this.f63776a;
        }

        @oy.l
        public final String b() {
            return this.f63777b;
        }

        @oy.l
        public final JSONObject c() {
            return this.f63778c;
        }

        @oy.l
        public final String d() {
            return this.f63776a;
        }

        @oy.l
        public final String e() {
            return this.f63777b;
        }

        public boolean equals(@oy.m Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return kotlin.jvm.internal.m0.g(this.f63779d, cVar.f63779d) && kotlin.jvm.internal.m0.g(this.f63776a, cVar.f63776a) && kotlin.jvm.internal.m0.g(this.f63777b, cVar.f63777b) && kotlin.jvm.internal.m0.g(this.f63778c.toString(), cVar.f63778c.toString());
        }

        @oy.l
        public final String f() {
            return this.f63779d;
        }

        @oy.l
        public final JSONObject g() {
            return this.f63778c;
        }

        @oy.l
        public final String h() {
            String string = new JSONObject().put(b.f63770b, this.f63779d).put(b.f63771c, this.f63776a).put("params", this.f63778c).toString();
            kotlin.jvm.internal.m0.o(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @oy.l
        public String toString() {
            return "MessageToController(adId=" + this.f63776a + ", command=" + this.f63777b + ", params=" + this.f63778c + gi.j.f86771d;
        }

        @oy.l
        public final c a(@oy.l String adId, @oy.l String command, @oy.l JSONObject params) {
            kotlin.jvm.internal.m0.p(adId, "adId");
            kotlin.jvm.internal.m0.p(command, "command");
            kotlin.jvm.internal.m0.p(params, "params");
            return new c(adId, command, params);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f63776a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f63777b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f63778c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(@oy.l String str) {
            kotlin.jvm.internal.m0.p(str, "<set-?>");
            this.f63779d = str;
        }
    }
}

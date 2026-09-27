package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface W {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final JSONObject f60250a;

        public a(@oy.l JSONObject applicationConfig) {
            kotlin.jvm.internal.m0.p(applicationConfig, "applicationConfig");
            this.f60250a = applicationConfig;
        }

        @Override // com.ironsource.W
        @oy.l
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.f60250a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.W
        public int b() {
            int iOptInt = this.f60250a.optInt("debugMode", 0);
            if (this.f60250a.optBoolean(b.f60255e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.W
        @oy.l
        public String c() {
            String strOptString = this.f60250a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f60251a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f60252b = "controllerUrl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f60253c = "controllerConfig";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f60254d = "debugMode";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public static final String f60255e = "adptDebugMode";

        private b() {
        }
    }

    @oy.l
    JSONObject a();

    int b();

    @oy.l
    String c();
}

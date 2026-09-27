package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface V1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements V1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private final JSONObject f60222a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.V1
        @oy.l
        public com.ironsource.mediationsdk.demandOnly.p a(@oy.l String instanceId) {
            kotlin.jvm.internal.m0.p(instanceId, "instanceId");
            JSONObject jSONObject = this.f60222a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new com.ironsource.mediationsdk.demandOnly.p.a(strOptString) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(@oy.m JSONObject jSONObject) {
            this.f60222a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    @oy.l
    com.ironsource.mediationsdk.demandOnly.p a(@oy.l String str);
}

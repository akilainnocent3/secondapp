package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class wa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41335c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41337b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final wa a(JSONObject jsonObject) throws JSONException {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("clickthrough_url", "https://docs.chartboost.com/opt-out");
            kotlin.jvm.internal.m0.o(strOptString, "optString(...)");
            String string = jsonObject.getString(CampaignEx.JSON_KEY_IMAGE_URL);
            kotlin.jvm.internal.m0.o(string, "getString(...)");
            return new wa(strOptString, string);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public wa(String clickthroughUrl, String imageUrl) {
        kotlin.jvm.internal.m0.p(clickthroughUrl, "clickthroughUrl");
        kotlin.jvm.internal.m0.p(imageUrl, "imageUrl");
        this.f41336a = clickthroughUrl;
        this.f41337b = imageUrl;
    }

    public final String a() {
        return this.f41336a;
    }

    public final String b() {
        return this.f41337b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return kotlin.jvm.internal.m0.g(this.f41336a, waVar.f41336a) && kotlin.jvm.internal.m0.g(this.f41337b, waVar.f41337b);
    }

    public int hashCode() {
        return (this.f41336a.hashCode() * 31) + this.f41337b.hashCode();
    }

    public String toString() {
        return "InfoIconModel(clickthroughUrl=" + this.f41336a + ", imageUrl=" + this.f41337b + gi.j.f86771d;
    }
}

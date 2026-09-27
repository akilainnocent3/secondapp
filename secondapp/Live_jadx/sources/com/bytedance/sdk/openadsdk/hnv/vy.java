package com.bytedance.sdk.openadsdk.hnv;

import com.ironsource.Z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum vy {
    TYPE_2G("2g"),
    TYPE_3G(Z3.f60405a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(Z3.f60406b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");


    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f37334ok;

    vy(String str) {
        this.f37334ok = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f37334ok;
    }
}

package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGErrorModel {
    private final int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final String f35492tq;

    public PAGErrorModel(int i10, String str) {
        this.hww = i10;
        this.f35492tq = str;
    }

    public int getErrorCode() {
        return this.hww;
    }

    public String getErrorMessage() {
        return this.f35492tq;
    }
}

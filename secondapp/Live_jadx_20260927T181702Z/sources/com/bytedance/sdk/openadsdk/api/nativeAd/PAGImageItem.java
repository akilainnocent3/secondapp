package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGImageItem {
    private final int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f35493sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f35494tq;
    private float vy;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.hww = i10;
        this.f35494tq = i11;
        this.f35493sd = str;
        this.vy = f10;
    }

    public float getDuration() {
        return this.vy;
    }

    public int getHeight() {
        return this.hww;
    }

    public String getImageUrl() {
        return this.f35493sd;
    }

    public int getWidth() {
        return this.f35494tq;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}

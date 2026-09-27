package com.bytedance.sdk.openadsdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class TTImage {
    private final int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f35180sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f35181tq;
    private double vy;

    public TTImage(int i10, int i11, String str, double d10) {
        this.hww = i10;
        this.f35181tq = i11;
        this.f35180sd = str;
        this.vy = d10;
    }

    public double getDuration() {
        return this.vy;
    }

    public int getHeight() {
        return this.hww;
    }

    public String getImageUrl() {
        return this.f35180sd;
    }

    public int getWidth() {
        return this.f35181tq;
    }

    public boolean isValid() {
        String str;
        return this.hww > 0 && this.f35181tq > 0 && (str = this.f35180sd) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}

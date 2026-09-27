package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f67882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f67883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f67884c;

    public c(String str, String str2) {
        this.f67882a = str;
        this.f67883b = str2;
    }

    public String getmFloorPrice() {
        return this.f67884c;
    }

    public String getmPlacementId() {
        return this.f67882a;
    }

    public String getmUnitId() {
        return this.f67883b;
    }

    public void setmFloorPrice(String str) {
        this.f67884c = str;
    }

    public void setmPlacementId(String str) {
        this.f67882a = str;
    }

    public void setmUnitId(String str) {
        this.f67883b = str;
    }

    public c(String str, String str2, String str3) {
        this.f67882a = str;
        this.f67883b = str2;
        this.f67884c = str3;
    }
}

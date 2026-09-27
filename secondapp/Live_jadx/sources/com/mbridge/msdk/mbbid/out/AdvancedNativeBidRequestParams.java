package com.mbridge.msdk.mbbid.out;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67901e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f67900d = i11;
        this.f67901e = i10;
    }

    public int getHeight() {
        return this.f67900d;
    }

    public int getWidth() {
        return this.f67901e;
    }

    public void setHeight(int i10) {
        this.f67900d = i10;
    }

    public void setWidth(int i10) {
        this.f67901e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f67900d = i11;
        this.f67901e = i10;
    }
}

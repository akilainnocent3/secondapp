package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70742b;

    a(int i10, String str) {
        this.f70741a = i10;
        this.f70742b = str;
    }

    public int g() {
        return this.f70741a;
    }

    public String h() {
        return this.f70742b;
    }
}

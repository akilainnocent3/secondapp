package com.ironsource.adapters.admob.banner;

import com.cleveradssolutions.adapters.google.a;
import com.ironsource.mediationsdk.ISBannerSize;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
enum zv {
    NB_TMP_BASIC(a.g.f43023a, true, true, 1, 1),
    NB_TMP_BASIC_LARGE(a.g.f43023a, false, true, 1, 1),
    NB_TMP_ICON_TEXT(a.g.f43024b, true, true, 1, 1),
    NB_TMP_TEXT_CTA(a.g.f43026d, false, true, 3, 1),
    NB_TMP_RECT(a.g.f43025c, false, false, 1, 1);


    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final boolean f60637zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final boolean f60638zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final int f60639zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private final int f60640zu;
    private final int zz;

    zv(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.zz = i10;
        this.f60637zr = z10;
        this.f60638zs = z11;
        this.f60639zt = i11;
        this.f60640zu = i12;
    }

    public int zr() {
        return this.f60639zt;
    }

    public int zs() {
        return this.zz;
    }

    public int zt() {
        return this.f60640zu;
    }

    public boolean zu() {
        return this.f60637zr;
    }

    public boolean zv() {
        return this.f60638zs;
    }

    public static zv zz(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                return NB_TMP_RECT;
            case "LARGE":
                return NB_TMP_BASIC_LARGE;
            case "SMART":
            case "BANNER":
                try {
                    return valueOf(jSONObject.optString("nativeBannerTemplateName", NB_TMP_ICON_TEXT.toString()));
                } catch (IllegalArgumentException unused) {
                    return NB_TMP_ICON_TEXT;
                }
            default:
                return NB_TMP_BASIC;
        }
    }
}

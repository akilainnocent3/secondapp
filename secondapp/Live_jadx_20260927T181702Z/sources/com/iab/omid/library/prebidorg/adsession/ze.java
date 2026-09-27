package com.iab.omid.library.prebidorg.adsession;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class ze {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final URL f53689zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final String f53690zs;
    private final String zz;

    private ze(String str, URL url, String str2) {
        this.zz = str;
        this.f53689zr = url;
        this.f53690zs = str2;
    }

    public static ze zz(String str, URL url, String str2) {
        com.iab.omid.library.prebidorg.utils.zw.zz(str, "VendorKey is null or empty");
        com.iab.omid.library.prebidorg.utils.zw.zz(url, "ResourceURL is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(str2, "VerificationParameters is null or empty");
        return new ze(str, url, str2);
    }

    public String zr() {
        return this.zz;
    }

    public String zs() {
        return this.f53690zs;
    }

    public JSONObject zt() {
        JSONObject jSONObject = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "vendorKey", this.zz);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "resourceUrl", this.f53689zr.toString());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "verificationParameters", this.f53690zs);
        return jSONObject;
    }

    public URL zz() {
        return this.f53689zr;
    }
}

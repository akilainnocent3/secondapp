package com.iab.omid.library.prebidorg.adsession;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zd {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final String f53688zr;
    private final String zz;

    private zd(String str, String str2) {
        this.zz = str;
        this.f53688zr = str2;
    }

    public static zd zz(String str, String str2) {
        com.iab.omid.library.prebidorg.utils.zw.zz(str, "Name is null or empty");
        com.iab.omid.library.prebidorg.utils.zw.zz(str2, "Version is null or empty");
        return new zd(str, str2);
    }

    public String zr() {
        return this.f53688zr;
    }

    public String zz() {
        return this.zz;
    }
}

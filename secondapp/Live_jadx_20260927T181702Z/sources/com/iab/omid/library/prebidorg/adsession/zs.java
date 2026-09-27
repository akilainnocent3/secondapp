package com.iab.omid.library.prebidorg.adsession;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zs {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final zc f53700zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final boolean f53701zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final zv f53702zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private final zy f53703zu;
    private final zc zz;

    private zs(zv zvVar, zy zyVar, zc zcVar, zc zcVar2, boolean z10) {
        this.f53702zt = zvVar;
        this.f53703zu = zyVar;
        this.zz = zcVar;
        if (zcVar2 == null) {
            this.f53700zr = zc.NONE;
        } else {
            this.f53700zr = zcVar2;
        }
        this.f53701zs = z10;
    }

    public static zs zz(zv zvVar, zy zyVar, zc zcVar, zc zcVar2, boolean z10) {
        com.iab.omid.library.prebidorg.utils.zw.zz(zvVar, "CreativeType is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(zyVar, "ImpressionType is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(zcVar, "Impression owner is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(zcVar, zvVar, zyVar);
        return new zs(zvVar, zyVar, zcVar, zcVar2, z10);
    }

    public boolean zr() {
        return zc.NATIVE == this.f53700zr;
    }

    public JSONObject zs() {
        JSONObject jSONObject = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "impressionOwner", this.zz);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "mediaEventsOwner", this.f53700zr);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "creativeType", this.f53702zt);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "impressionType", this.f53703zu);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f53701zs));
        return jSONObject;
    }

    public boolean zz() {
        return zc.NATIVE == this.zz;
    }
}

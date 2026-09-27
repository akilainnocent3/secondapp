package com.iab.omid.library.prebidorg.adsession.media;

import com.iab.omid.library.prebidorg.utils.zw;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zu {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final Float f53676zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final boolean f53677zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final zt f53678zt;
    private final boolean zz;

    private zu(boolean z10, Float f10, boolean z11, zt ztVar) {
        this.zz = z10;
        this.f53676zr = f10;
        this.f53677zs = z11;
        this.f53678zt = ztVar;
    }

    public JSONObject zz() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.zz);
            if (this.zz) {
                jSONObject.put("skipOffset", this.f53676zr);
            }
            jSONObject.put("autoPlay", this.f53677zs);
            jSONObject.put(C4235d4.i.L, this.f53678zt);
            return jSONObject;
        } catch (JSONException e10) {
            com.iab.omid.library.prebidorg.utils.zt.zz("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public static zu zz(boolean z10, zt ztVar) {
        zw.zz(ztVar, "Position is null");
        return new zu(false, null, z10, ztVar);
    }
}

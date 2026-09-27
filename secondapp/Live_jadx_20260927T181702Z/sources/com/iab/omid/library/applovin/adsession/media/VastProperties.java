package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f52606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f52608d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f52605a = z10;
        this.f52606b = f10;
        this.f52607c = z11;
        this.f52608d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f52605a);
            if (this.f52605a) {
                jSONObject.put("skipOffset", this.f52606b);
            }
            jSONObject.put("autoPlay", this.f52607c);
            jSONObject.put(C4235d4.i.L, this.f52608d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f52608d;
    }

    public Float getSkipOffset() {
        return this.f52606b;
    }

    public boolean isAutoPlay() {
        return this.f52607c;
    }

    public boolean isSkippable() {
        return this.f52605a;
    }
}

package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f53543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f53545d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f53542a = z10;
        this.f53543b = f10;
        this.f53544c = z11;
        this.f53545d = position;
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
            jSONObject.put("skippable", this.f53542a);
            if (this.f53542a) {
                jSONObject.put("skipOffset", this.f53543b);
            }
            jSONObject.put("autoPlay", this.f53544c);
            jSONObject.put(C4235d4.i.L, this.f53545d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f53545d;
    }

    public Float getSkipOffset() {
        return this.f53543b;
    }

    public boolean isAutoPlay() {
        return this.f53544c;
    }

    public boolean isSkippable() {
        return this.f53542a;
    }
}

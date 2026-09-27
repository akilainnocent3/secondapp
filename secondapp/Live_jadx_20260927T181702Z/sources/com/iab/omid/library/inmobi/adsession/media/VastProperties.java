package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.utils.d;
import com.iab.omid.library.inmobi.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f53267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f53269d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f53266a = z10;
        this.f53267b = f10;
        this.f53268c = z11;
        this.f53269d = position;
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
            jSONObject.put("skippable", this.f53266a);
            if (this.f53266a) {
                jSONObject.put("skipOffset", this.f53267b);
            }
            jSONObject.put("autoPlay", this.f53268c);
            jSONObject.put(C4235d4.i.L, this.f53269d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f53269d;
    }

    public Float getSkipOffset() {
        return this.f53267b;
    }

    public boolean isAutoPlay() {
        return this.f53268c;
    }

    public boolean isSkippable() {
        return this.f53266a;
    }
}

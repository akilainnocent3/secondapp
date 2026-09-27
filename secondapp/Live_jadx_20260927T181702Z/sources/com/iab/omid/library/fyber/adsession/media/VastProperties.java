package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.utils.d;
import com.iab.omid.library.fyber.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f53132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f53134d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f53131a = z10;
        this.f53132b = f10;
        this.f53133c = z11;
        this.f53134d = position;
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
            jSONObject.put("skippable", this.f53131a);
            if (this.f53131a) {
                jSONObject.put("skipOffset", this.f53132b);
            }
            jSONObject.put("autoPlay", this.f53133c);
            jSONObject.put(C4235d4.i.L, this.f53134d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f53134d;
    }

    public Float getSkipOffset() {
        return this.f53132b;
    }

    public boolean isAutoPlay() {
        return this.f53133c;
    }

    public boolean isSkippable() {
        return this.f53131a;
    }
}

package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.d;
import com.iab.omid.library.unity3d.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f53992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f53994d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f53991a = z10;
        this.f53992b = f10;
        this.f53993c = z11;
        this.f53994d = position;
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
            jSONObject.put("skippable", this.f53991a);
            if (this.f53991a) {
                jSONObject.put("skipOffset", this.f53992b);
            }
            jSONObject.put("autoPlay", this.f53993c);
            jSONObject.put(C4235d4.i.L, this.f53994d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f53994d;
    }

    public Float getSkipOffset() {
        return this.f53992b;
    }

    public boolean isAutoPlay() {
        return this.f53993c;
    }

    public boolean isSkippable() {
        return this.f53991a;
    }
}

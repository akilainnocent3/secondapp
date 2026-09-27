package com.iab.omid.library.startio.adsession.media;

import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.g;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f53825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f53827d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f53824a = z10;
        this.f53825b = f10;
        this.f53826c = z11;
        this.f53827d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f53824a);
            if (this.f53824a) {
                jSONObject.put("skipOffset", this.f53825b);
            }
            jSONObject.put("autoPlay", this.f53826c);
            jSONObject.put(C4235d4.i.L, this.f53827d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public final Position getPosition() {
        return this.f53827d;
    }

    public final Float getSkipOffset() {
        return this.f53825b;
    }

    public final boolean isAutoPlay() {
        return this.f53826c;
    }

    public final boolean isSkippable() {
        return this.f53824a;
    }
}

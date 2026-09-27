package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.d.c;
import com.iab.omid.library.bigosg.d.e;
import com.ironsource.C4235d4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f52746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f52748d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f52745a = z10;
        this.f52746b = f10;
        this.f52747c = z11;
        this.f52748d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f52745a);
            if (this.f52745a) {
                jSONObject.put("skipOffset", this.f52746b);
            }
            jSONObject.put("autoPlay", this.f52747c);
            jSONObject.put(C4235d4.i.L, this.f52748d);
            return jSONObject;
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public final Position getPosition() {
        return this.f52748d;
    }

    public final Float getSkipOffset() {
        return this.f52746b;
    }

    public final boolean isAutoPlay() {
        return this.f52747c;
    }

    public final boolean isSkippable() {
        return this.f52745a;
    }
}

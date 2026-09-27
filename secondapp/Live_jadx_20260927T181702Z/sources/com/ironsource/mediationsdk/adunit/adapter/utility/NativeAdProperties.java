package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4485r4;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class NativeAdProperties {

    @l
    private final AdOptionsPosition adOptionsPosition;

    @l
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(@l JSONObject config) {
        m0.p(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    @l
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            m0.o(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            return this.defaultAdOptionPosition;
        }
    }
}

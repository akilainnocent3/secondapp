package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import fr.h0;
import java.util.HashMap;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class OmSdkInfo {
    private final byte impressionType;
    private final boolean isolateVerificationScripts;
    private final boolean omidEnabled;

    @l
    private final String customReferenceData = "";

    @l
    private final HashMap<String, String> macros = new HashMap<>();

    @l
    private final List<AdVerification> adVerifications = h0.J();

    @l
    public final List<AdVerification> getAdVerifications() {
        return this.adVerifications;
    }

    @l
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final byte getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @l
    public final HashMap<String, String> getMacros() {
        return this.macros;
    }

    public final boolean getOmidEnabled() {
        return this.omidEnabled;
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }
}

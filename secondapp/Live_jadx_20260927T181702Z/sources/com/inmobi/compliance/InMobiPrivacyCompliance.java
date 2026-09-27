package com.inmobi.compliance;

import com.chartboost.sdk.privacy.model.CCPA;
import com.inmobi.media.X3;
import com.ironsource.mediationsdk.metadata.a;
import cs.o;
import java.util.HashMap;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class InMobiPrivacyCompliance {

    @l
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    @o
    public static final void setDoNotSell(boolean z10) {
        X3.f55761a.put(a.f62740a, z10 ? "1" : "0");
    }

    @o
    public static final void setUSPrivacyString(@l String privacyString) {
        m0.p(privacyString, "privacyString");
        HashMap map = X3.f55761a;
        m0.p(privacyString, "privacyString");
        map.put(CCPA.CCPA_STANDARD, privacyString);
    }
}

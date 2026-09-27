package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import nv.z0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdQualityVerificationStateFlow {
    @l
    AdQualityVerificationMode getVerificationMode();

    @l
    z0<AdQualityVerificationState> getVerificationResultStateFlow();
}

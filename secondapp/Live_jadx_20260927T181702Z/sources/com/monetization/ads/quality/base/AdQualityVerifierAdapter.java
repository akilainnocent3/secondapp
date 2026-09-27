package com.monetization.ads.quality.base;

import android.content.Context;
import com.monetization.ads.quality.base.model.AdQualityVerifierAdapterInfo;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AdQualityVerifierAdapter implements AdQualityVerifierAdEventListener {
    @l
    public AdQualityVerifierAdapterInfo getAdapterInfo() {
        return new AdQualityVerifierAdapterInfo.Builder().build();
    }

    @m
    public abstract Object verifyAd(@l Context context, @l AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, @l AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, @l f<? super AdQualityVerificationResult> fVar);
}

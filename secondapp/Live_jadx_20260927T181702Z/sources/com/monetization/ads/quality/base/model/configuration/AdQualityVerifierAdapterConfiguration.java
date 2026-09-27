package com.monetization.ads.quality.base.model.configuration;

import f0.p;
import g8.a;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityVerifierAdapterConfiguration {

    @l
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(@l String str, long j10, boolean z10) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j10;
        this.debug = z10;
    }

    public static /* synthetic */ AdQualityVerifierAdapterConfiguration copy$default(AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, String str, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityVerifierAdapterConfiguration.apiKey;
        }
        if ((i10 & 2) != 0) {
            j10 = adQualityVerifierAdapterConfiguration.verificationTimeoutInSec;
        }
        if ((i10 & 4) != 0) {
            z10 = adQualityVerifierAdapterConfiguration.debug;
        }
        return adQualityVerifierAdapterConfiguration.copy(str, j10, z10);
    }

    @l
    public final String component1() {
        return this.apiKey;
    }

    public final long component2() {
        return this.verificationTimeoutInSec;
    }

    public final boolean component3() {
        return this.debug;
    }

    @l
    public final AdQualityVerifierAdapterConfiguration copy(@l String str, long j10, boolean z10) {
        return new AdQualityVerifierAdapterConfiguration(str, j10, z10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        return m0.g(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    @l
    public final String getApiKey() {
        return this.apiKey;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        return a.a(this.debug) + ((p.a(this.verificationTimeoutInSec) + (this.apiKey.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + j.f86771d;
    }

    public /* synthetic */ AdQualityVerifierAdapterConfiguration(String str, long j10, boolean z10, int i10, x xVar) {
        this(str, j10, (i10 & 4) != 0 ? false : z10);
    }
}

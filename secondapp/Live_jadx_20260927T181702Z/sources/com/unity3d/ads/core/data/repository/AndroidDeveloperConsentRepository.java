package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {

    @l
    private final DeveloperConsentDataSource developerConsentDataSource;

    public AndroidDeveloperConsentRepository(@l DeveloperConsentDataSource developerConsentDataSource) {
        m0.p(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsentDataSource = developerConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    @l
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsentDataSource.getDeveloperConsent();
    }
}

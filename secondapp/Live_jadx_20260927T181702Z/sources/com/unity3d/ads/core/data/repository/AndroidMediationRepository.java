package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidMediationRepository implements MediationRepository {

    @l
    private final MediationDataSource mediationDataSource;

    @l
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(@l MediationDataSource mediationDataSource, @l MediationProviderParser mediationProviderParser) {
        m0.p(mediationDataSource, "mediationDataSource");
        m0.p(mediationProviderParser, "mediationProviderParser");
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @l
    public ds.a<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @m
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @m
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}

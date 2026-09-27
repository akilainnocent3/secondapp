package com.unity3d.ads.core.domain;

import cv.k0;
import gatewayprotocol.v1.ClientInfoOuterClass;
import oy.l;
import oy.m;
import wc.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonMediationProviderParser implements MediationProviderParser {
    @Override // com.unity3d.ads.core.domain.MediationProviderParser
    @l
    public ClientInfoOuterClass.MediationProvider invoke(@m String str) {
        ClientInfoOuterClass.MediationProvider mediationProvider;
        if (str != null) {
            if (k0.J2(str, "AppLovinSdk_", false, 2, null)) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (k0.c2(str, d.f142717b, true)) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
            } else if (k0.c2(str, "MAX", true)) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                mediationProvider = k0.c2(str, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            }
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}

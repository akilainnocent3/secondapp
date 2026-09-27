package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.MediationInfoOuterClass;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface MediationInfoConverter {
    @l
    MediationInfoOuterClass.MediationInfo invoke(@l MediationInfo mediationInfo);
}

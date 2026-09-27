package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ScarEligibleEffectiveUseCase {
    @l
    List<AdFormatOuterClass.AdFormat> invoke(@m TokenConfiguration tokenConfiguration);
}

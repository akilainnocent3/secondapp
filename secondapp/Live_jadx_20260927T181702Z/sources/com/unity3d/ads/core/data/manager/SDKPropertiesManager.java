package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface SDKPropertiesManager {
    @l
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(@l SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z10);
}

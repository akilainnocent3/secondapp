package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OnStorageEvent implements WebViewEvent {

    @l
    private final String category;

    @l
    private final String name;

    @l
    private final Object[] parameters;

    public OnStorageEvent(@l StorageEvent eventType, @l StorageManager.StorageType storageType, @m Object obj) {
        m0.p(eventType, "eventType");
        m0.p(storageType, "storageType");
        this.category = "STORAGE";
        this.name = eventType.name();
        this.parameters = new Object[]{storageType.name(), obj};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public Object[] getParameters() {
        return this.parameters;
    }
}

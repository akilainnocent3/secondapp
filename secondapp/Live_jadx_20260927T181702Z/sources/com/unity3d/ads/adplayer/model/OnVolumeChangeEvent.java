package com.unity3d.ads.adplayer.model;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OnVolumeChangeEvent implements WebViewEvent {

    @l
    private final String category = "ADVIEWER";

    @l
    private final String name = "ON_VOLUME_CHANGE";

    @l
    private final Object[] parameters;

    public OnVolumeChangeEvent(double d10) {
        this.parameters = new Object[]{Double.valueOf(d10)};
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

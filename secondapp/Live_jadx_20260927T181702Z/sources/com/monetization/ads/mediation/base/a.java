package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.model.MediatedAdObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    @m
    public MediatedAdObject getAdObject() {
        return null;
    }

    @l
    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean getShouldTrackImpressionAutomatically() {
        return true;
    }
}

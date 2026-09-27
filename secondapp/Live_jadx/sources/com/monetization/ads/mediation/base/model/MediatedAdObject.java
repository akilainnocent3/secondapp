package com.monetization.ads.mediation.base.model;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedAdObject {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @l
    private final Object f71874ad;

    @l
    private final MediatedAdObjectInfo info;

    public MediatedAdObject(@l Object obj, @l MediatedAdObjectInfo mediatedAdObjectInfo) {
        this.f71874ad = obj;
        this.info = mediatedAdObjectInfo;
    }

    @l
    public final Object getAd() {
        return this.f71874ad;
    }

    @l
    public final MediatedAdObjectInfo getInfo() {
        return this.info;
    }
}

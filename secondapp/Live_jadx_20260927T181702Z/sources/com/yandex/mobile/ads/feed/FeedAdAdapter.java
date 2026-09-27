package com.yandex.mobile.ads.feed;

import oy.l;
import oy.m;
import yads.gs0;
import yads.lh3;
import yads.sr0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FeedAdAdapter extends gs0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeedAdEventListener f76848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sr0 f76849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lh3 f76850j;

    public FeedAdAdapter(@l FeedAd feedAd) {
        super(feedAd.a());
        this.f76849i = new sr0(this);
        this.f76850j = new lh3();
    }

    @Override // yads.gs0
    public final sr0 a() {
        return this.f76849i;
    }

    @Override // yads.gs0
    public final lh3 b() {
        return this.f76850j;
    }

    @m
    public final FeedAdEventListener getEventListener() {
        return this.f76848h;
    }

    public final void setEventListener(@m FeedAdEventListener feedAdEventListener) {
        this.f76848h = feedAdEventListener;
    }
}

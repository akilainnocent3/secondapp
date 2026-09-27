package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    private View f62420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    private View f62421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    private View f62422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    private View f62423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    private LevelPlayMediaView f62424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @m
    private View f62425f;

    @m
    public final View getAdvertiserView() {
        return this.f62421b;
    }

    @m
    public final View getBodyView() {
        return this.f62423d;
    }

    @m
    public final View getCallToActionView() {
        return this.f62425f;
    }

    @m
    public final View getIconView() {
        return this.f62422c;
    }

    @m
    public final LevelPlayMediaView getMediaView() {
        return this.f62424e;
    }

    @m
    public final View getTitleView() {
        return this.f62420a;
    }

    public final void setAdvertiserView(@m View view) {
        this.f62421b = view;
    }

    public final void setBodyView(@m View view) {
        this.f62423d = view;
    }

    public final void setCallToActionView(@m View view) {
        this.f62425f = view;
    }

    public final void setIconView(@m View view) {
        this.f62422c = view;
    }

    public final void setMediaView(@m LevelPlayMediaView levelPlayMediaView) {
        this.f62424e = levelPlayMediaView;
    }

    public final void setTitleView(@m View view) {
        this.f62420a = view;
    }
}

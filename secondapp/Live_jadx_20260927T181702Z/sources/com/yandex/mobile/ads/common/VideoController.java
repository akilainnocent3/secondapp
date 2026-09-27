package com.yandex.mobile.ads.common;

import k.j0;
import oy.l;
import oy.m;
import yads.jv3;
import yads.lh3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public final class VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh3 f76833a;

    public VideoController(@l lh3 lh3Var) {
        this.f76833a = lh3Var;
    }

    public final void setVideoEventListener(@m VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.f76833a.f151990b = new jv3(videoEventListener);
        } else {
            this.f76833a.f151990b = null;
        }
    }
}

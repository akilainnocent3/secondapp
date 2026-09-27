package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f75064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[] f75065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NotDisplayedReason f75066d;

    public jk() {
    }

    public jk(NotDisplayedReason notDisplayedReason, float f10, Rect rect, Rect[] rectArr) {
        this.f75063a = f10;
        this.f75064b = rect;
        this.f75065c = rectArr;
        this.f75066d = notDisplayedReason;
    }
}

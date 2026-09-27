package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class y implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f51163a;

    public y(@NonNull TimeInterpolator timeInterpolator) {
        this.f51163a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator a(boolean z10, @NonNull TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new y(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f51163a.getInterpolation(f10);
    }
}

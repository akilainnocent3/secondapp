package com.chartboost.sdk.impl;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class jc implements uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39588a;

    public jc(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f39588a = context;
    }

    @Override // com.chartboost.sdk.impl.uc
    public rc a() {
        int i10 = this.f39588a.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return rc.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return rc.LANDSCAPE;
    }

    @Override // com.chartboost.sdk.impl.uc
    public boolean isLocked() {
        return Settings.System.getInt(this.f39588a.getContentResolver(), "accelerometer_rotation", 0) != 0;
    }
}

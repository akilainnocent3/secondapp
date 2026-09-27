package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class lc implements vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f39866a;

    public lc(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        Object systemService = context.getSystemService("audio");
        this.f39866a = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    @Override // com.chartboost.sdk.impl.vc
    public Float a() {
        AudioManager audioManager = this.f39866a;
        if (audioManager == null) {
            return null;
        }
        return Float.valueOf((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100);
    }
}

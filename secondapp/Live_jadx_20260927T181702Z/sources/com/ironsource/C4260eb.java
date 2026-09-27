package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;

/* JADX INFO: renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4260eb implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final LevelPlayImpressionDataListener f61665a;

    public C4260eb(@oy.l LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.m0.p(listener, "listener");
        this.f61665a = listener;
    }

    @oy.l
    public final LevelPlayImpressionDataListener a() {
        return this.f61665a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4260eb) {
            return kotlin.jvm.internal.m0.g(this.f61665a, ((C4260eb) obj).f61665a);
        }
        return false;
    }

    public int hashCode() {
        return this.f61665a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@oy.l Z8 impressionData) {
        kotlin.jvm.internal.m0.p(impressionData, "impressionData");
        this.f61665a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}

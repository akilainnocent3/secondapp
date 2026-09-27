package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75478a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdPreferences.Placement f75479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75480c;

    public s(AdPreferences.Placement placement, String str) {
        this.f75479b = placement;
        this.f75480c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f75478a - ((s) obj).f75478a;
        if (j10 > 0) {
            return 1;
        }
        return j10 == 0 ? 0 : -1;
    }
}

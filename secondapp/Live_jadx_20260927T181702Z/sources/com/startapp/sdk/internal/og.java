package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f75325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75326b;

    public og(AdPreferences.Placement placement) {
        this.f75325a = placement;
        this.f75326b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && og.class == obj.getClass()) {
            og ogVar = (og) obj;
            if (this.f75326b == ogVar.f75326b && this.f75325a == ogVar.f75325a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f75325a, Integer.valueOf(this.f75326b)};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    public og(AdPreferences.Placement placement, int i10) {
        this.f75325a = placement;
        this.f75326b = i10;
    }
}

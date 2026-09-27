package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f54554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f54555c;

    public E6(float f10, F6 f11, ArrayList arrayList) {
        this.f54553a = f10;
        this.f54554b = f11;
        this.f54555c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e10 = (E6) obj;
        return Float.compare(this.f54553a, e10.f54553a) == 0 && kotlin.jvm.internal.m0.g(this.f54554b, e10.f54554b) && kotlin.jvm.internal.m0.g(this.f54555c, e10.f54555c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f54553a) * 31;
        F6 f10 = this.f54554b;
        int iHashCode = (iFloatToIntBits + (f10 == null ? 0 : f10.hashCode())) * 31;
        ArrayList arrayList = this.f54555c;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f54553a + ", visibleRectangle=" + this.f54554b + ", occlusionRectangles=" + this.f54555c + gi.j.f86771d;
    }
}

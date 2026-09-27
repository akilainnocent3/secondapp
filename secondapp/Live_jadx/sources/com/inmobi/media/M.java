package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f55101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f55102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55104d;

    public M(RectF visibleRect, ArrayList obstructions, int i10, int i11) {
        kotlin.jvm.internal.m0.p(visibleRect, "visibleRect");
        kotlin.jvm.internal.m0.p(obstructions, "obstructions");
        this.f55101a = visibleRect;
        this.f55102b = obstructions;
        this.f55103c = i10;
        this.f55104d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return kotlin.jvm.internal.m0.g(this.f55101a, m10.f55101a) && kotlin.jvm.internal.m0.g(this.f55102b, m10.f55102b) && this.f55103c == m10.f55103c && this.f55104d == m10.f55104d;
    }

    public final int hashCode() {
        return this.f55104d + AbstractC3671fi.a(this.f55103c, (this.f55102b.hashCode() + (this.f55101a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f55101a + ", obstructions=" + this.f55102b + ", screenWidth=" + this.f55103c + ", screenHeight=" + this.f55104d + gi.j.f86771d;
    }
}

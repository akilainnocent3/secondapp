package com.inmobi.media;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f55014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f55015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f55016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f55017d;

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f55014a = rectF;
        this.f55015b = rectF2;
        this.f55016c = rectF3;
        this.f55017d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return kotlin.jvm.internal.m0.g(this.f55014a, l10.f55014a) && kotlin.jvm.internal.m0.g(this.f55015b, l10.f55015b) && kotlin.jvm.internal.m0.g(this.f55016c, l10.f55016c) && kotlin.jvm.internal.m0.g(this.f55017d, l10.f55017d);
    }

    public final int hashCode() {
        RectF rectF = this.f55014a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f55015b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f55016c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f55017d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f55014a + ", topRight=" + this.f55015b + ", bottomLeft=" + this.f55016c + ", bottomRight=" + this.f55017d + gi.j.f86771d;
    }
}

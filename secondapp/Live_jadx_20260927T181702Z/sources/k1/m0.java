package k1;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f101705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f101707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101708d;

    public m0(@NonNull PointF pointF, float f10, @NonNull PointF pointF2, float f11) {
        this.f101705a = (PointF) e2.x.m(pointF, "start == null");
        this.f101706b = f10;
        this.f101707c = (PointF) e2.x.m(pointF2, "end == null");
        this.f101708d = f11;
    }

    @NonNull
    public PointF a() {
        return this.f101707c;
    }

    public float b() {
        return this.f101708d;
    }

    @NonNull
    public PointF c() {
        return this.f101705a;
    }

    public float d() {
        return this.f101706b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Float.compare(this.f101706b, m0Var.f101706b) == 0 && Float.compare(this.f101708d, m0Var.f101708d) == 0 && this.f101705a.equals(m0Var.f101705a) && this.f101707c.equals(m0Var.f101707c);
    }

    public int hashCode() {
        int iHashCode = this.f101705a.hashCode() * 31;
        float f10 = this.f101706b;
        int iFloatToIntBits = (((iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f101707c.hashCode()) * 31;
        float f11 = this.f101708d;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f101705a + ", startFraction=" + this.f101706b + ", end=" + this.f101707c + ", endFraction=" + this.f101708d + fw.b.f85383j;
    }
}

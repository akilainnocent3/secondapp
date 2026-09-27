package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54605d;

    public F6(float f10, float f11, int i10, int i11) {
        this.f54602a = f10;
        this.f54603b = f11;
        this.f54604c = i10;
        this.f54605d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f10 = (F6) obj;
        return Float.compare(this.f54602a, f10.f54602a) == 0 && Float.compare(this.f54603b, f10.f54603b) == 0 && this.f54604c == f10.f54604c && this.f54605d == f10.f54605d;
    }

    public final int hashCode() {
        return this.f54605d + AbstractC3671fi.a(this.f54604c, (Float.floatToIntBits(this.f54603b) + (Float.floatToIntBits(this.f54602a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f54602a + ", y=" + this.f54603b + ", width=" + this.f54604c + ", height=" + this.f54605d + gi.j.f86771d;
    }
}

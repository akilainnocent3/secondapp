package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class rkm {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public rkm(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkm)) {
            return false;
        }
        rkm rkmVar = (rkm) obj;
        return Float.compare(this.a, rkmVar.a) == 0 && Float.compare(this.b, rkmVar.b) == 0 && Float.compare(this.c, rkmVar.c) == 0 && Float.compare(this.d, rkmVar.d) == 0 && Float.compare(this.e, rkmVar.e) == 0 && Float.compare(this.f, rkmVar.f) == 0 && Float.compare(this.g, rkmVar.g) == 0 && Float.compare(this.h, rkmVar.h) == 0 && Float.compare(this.i, rkmVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + tvh.a(this.h, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HotColdNumberMetrics(collapsedCircleRadiusPx=");
        sb.append(this.a);
        sb.append(", iconMaxSizePx=");
        sb.append(this.b);
        sb.append(", iconInnerPaddingPx=");
        ew7.b(sb, this.c, ", iconTextPaddingPx=", this.d, ", textHorizontalPaddingPx=");
        ew7.b(sb, this.e, ", borderWidthPx=", this.f, ", bgImageSizePx=");
        ew7.b(sb, this.g, ", bgImageEndOverflowPx=", this.h, ", bgImageTopPaddingPx=");
        return wi1.a(this.i, ")", sb);
    }
}

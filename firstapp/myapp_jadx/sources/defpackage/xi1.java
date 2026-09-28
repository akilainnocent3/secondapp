package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xi1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xi1) {
            xi1 xi1Var = (xi1) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(xi1Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(xi1Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(xi1Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(xi1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        return wi1.a(this.d, "}", sb);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class gtz {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final px80 h;
    public final int i;

    public gtz(float f, float f2, float f3, float f4, int i, float f5, float f6, px80 px80Var, int i2) {
        px80Var.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = f5;
        this.g = f6;
        this.h = px80Var;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtz)) {
            return false;
        }
        gtz gtzVar = (gtz) obj;
        return Float.compare(this.a, gtzVar.a) == 0 && Float.compare(this.b, gtzVar.b) == 0 && Float.compare(this.c, gtzVar.c) == 0 && Float.compare(this.d, gtzVar.d) == 0 && this.e == gtzVar.e && Float.compare(this.f, gtzVar.f) == 0 && Float.compare(this.g, gtzVar.g) == 0 && Intrinsics.g(this.h, gtzVar.h) && this.i == gtzVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + tvh.a(this.g, tvh.a(this.f, gpp.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", width=");
        ew7.b(sb, this.c, ", height=", this.d, ", color=");
        sb.append(this.e);
        sb.append(", rotation=");
        sb.append(this.f);
        sb.append(", scaleX=");
        sb.append(this.g);
        sb.append(", shape=");
        sb.append(this.h);
        sb.append(", alpha=");
        return zk1.a(this.i, ")", sb);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wy60 {
    public final float a;
    public final long b;
    public final goh<Float> c;

    public wy60(float f, long j, goh<Float> gohVar) {
        this.a = f;
        this.b = j;
        this.c = gohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy60)) {
            return false;
        }
        wy60 wy60Var = (wy60) obj;
        return Float.compare(this.a, wy60Var.a) == 0 && jsg0.a(this.b, wy60Var.b) && Intrinsics.g(this.c, wy60Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = jsg0.c;
        return this.c.hashCode() + f87.a(iHashCode, this.b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) jsg0.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}

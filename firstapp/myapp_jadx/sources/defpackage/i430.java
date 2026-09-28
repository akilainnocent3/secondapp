package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i430 {
    public final float a;
    public final ubh b;

    public i430(float f, ubh ubhVar) {
        ubhVar.getClass();
        this.a = f;
        this.b = ubhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i430)) {
            return false;
        }
        i430 i430Var = (i430) obj;
        return Float.compare(this.a, i430Var.a) == 0 && Intrinsics.g(this.b, i430Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}

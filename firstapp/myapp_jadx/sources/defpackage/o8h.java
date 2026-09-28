package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o8h {
    public final float a;
    public final goh<Float> b;

    public o8h(float f, goh<Float> gohVar) {
        this.a = f;
        this.b = gohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8h)) {
            return false;
        }
        o8h o8hVar = (o8h) obj;
        return Float.compare(this.a, o8hVar.a) == 0 && Intrinsics.g(this.b, o8hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

package e2;

import android.util.SizeF;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f79793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f79794b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static final class a {
        @NonNull
        @k.t
        public static SizeF a(@NonNull i0 i0Var) {
            x.l(i0Var);
            return new SizeF(i0Var.b(), i0Var.a());
        }

        @NonNull
        @k.t
        public static i0 b(@NonNull SizeF sizeF) {
            x.l(sizeF);
            return new i0(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public i0(float f10, float f11) {
        this.f79793a = x.d(f10, "width");
        this.f79794b = x.d(f11, "height");
    }

    @NonNull
    @t0(21)
    public static i0 d(@NonNull SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f79794b;
    }

    public float b() {
        return this.f79793a;
    }

    @NonNull
    @t0(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i0Var.f79793a == this.f79793a && i0Var.f79794b == this.f79794b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f79793a) ^ Float.floatToIntBits(this.f79794b);
    }

    @NonNull
    public String toString() {
        return this.f79793a + "x" + this.f79794b;
    }
}

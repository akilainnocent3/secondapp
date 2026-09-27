package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f156467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f156468b;

    public uj0(Drawable drawable, s41 s41Var) {
        this.f156467a = drawable;
        this.f156468b = s41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return kotlin.jvm.internal.m0.g(this.f156467a, uj0Var.f156467a) && this.f156468b == uj0Var.f156468b;
    }

    public final int hashCode() {
        return this.f156468b.hashCode() + (this.f156467a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.f156467a + ", imageType=" + this.f156468b + gi.j.f86771d;
    }
}

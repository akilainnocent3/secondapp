package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f149663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s41 f149664b;

    public gk0(Drawable drawable, s41 s41Var) {
        this.f149663a = drawable;
        this.f149664b = s41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        return kotlin.jvm.internal.m0.g(this.f149663a, gk0Var.f149663a) && this.f149664b == gk0Var.f149664b;
    }

    public final int hashCode() {
        return this.f149664b.hashCode() + (this.f149663a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.f149663a + ", imageType=" + this.f149664b + gi.j.f86771d;
    }
}

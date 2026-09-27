package yads;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f154244b;

    public q31(String str, Bitmap bitmap) {
        this.f154243a = str;
        this.f154244b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return kotlin.jvm.internal.m0.g(this.f154243a, q31Var.f154243a) && kotlin.jvm.internal.m0.g(this.f154244b, q31Var.f154244b);
    }

    public final int hashCode() {
        return this.f154244b.hashCode() + (this.f154243a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f154243a + ", bitmap=" + this.f154244b + gi.j.f86771d;
    }
}

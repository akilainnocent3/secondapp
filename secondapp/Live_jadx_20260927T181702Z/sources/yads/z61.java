package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f158632a;

    public z61(Uri uri) {
        this.f158632a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && kotlin.jvm.internal.m0.g(this.f158632a, ((z61) obj).f158632a);
    }

    public final int hashCode() {
        return this.f158632a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.f158632a + gi.j.f86771d;
    }
}

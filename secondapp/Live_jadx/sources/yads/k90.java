package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f151438a;

    public k90(Uri uri) {
        this.f151438a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && kotlin.jvm.internal.m0.g(this.f151438a, ((k90) obj).f151438a);
    }

    public final int hashCode() {
        return this.f151438a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.f151438a + gi.j.f86771d;
    }
}

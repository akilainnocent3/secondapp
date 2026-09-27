package yads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f147738a;

    public ci0(Uri uri) {
        this.f147738a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci0) && kotlin.jvm.internal.m0.g(this.f147738a, ((ci0) obj).f147738a);
    }

    public final int hashCode() {
        return this.f147738a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f147738a + gi.j.f86771d;
    }
}

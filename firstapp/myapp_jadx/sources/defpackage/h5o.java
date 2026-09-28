package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h5o implements pdd0 {
    public final String a = "home__featured_virtuals__view";

    public h5o(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5o) && Intrinsics.g(this.a, ((h5o) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("HomeFeaturedVirtualViewEvent(name=", this.a, ")");
    }
}

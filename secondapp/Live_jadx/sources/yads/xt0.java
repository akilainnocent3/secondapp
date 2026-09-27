package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qt0 f157984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157985b;

    public xt0(qt0 qt0Var, List list) {
        this.f157984a = qt0Var;
        this.f157985b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0Var = (xt0) obj;
        return kotlin.jvm.internal.m0.g(this.f157984a, xt0Var.f157984a) && kotlin.jvm.internal.m0.g(this.f157985b, xt0Var.f157985b);
    }

    public final int hashCode() {
        return this.f157985b.hashCode() + (this.f157984a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedState(state=" + this.f157984a + ", items=" + this.f157985b + gi.j.f86771d;
    }
}

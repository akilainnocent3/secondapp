package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oi2 extends pi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ns0 f153507a;

    public oi2(ns0 ns0Var) {
        super(0);
        this.f153507a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi2) && kotlin.jvm.internal.m0.g(this.f153507a, ((oi2) obj).f153507a);
    }

    public final int hashCode() {
        return this.f153507a.hashCode();
    }

    public final String toString() {
        return "Success(feedItem=" + this.f153507a + gi.j.f86771d;
    }
}

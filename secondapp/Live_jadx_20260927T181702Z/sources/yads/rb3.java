package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154859a;

    public rb3(List list) {
        this.f154859a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb3) && kotlin.jvm.internal.m0.g(this.f154859a, ((rb3) obj).f154859a);
    }

    public final int hashCode() {
        return this.f154859a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.f154859a + gi.j.f86771d;
    }
}

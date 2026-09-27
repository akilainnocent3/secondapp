package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yt1 implements zt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158485a;

    public yt1(List list) {
        this.f158485a = list;
    }

    public final List a() {
        return this.f158485a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt1) && kotlin.jvm.internal.m0.g(this.f158485a, ((yt1) obj).f158485a);
    }

    public final int hashCode() {
        return this.f158485a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.f158485a + gi.j.f86771d;
    }
}

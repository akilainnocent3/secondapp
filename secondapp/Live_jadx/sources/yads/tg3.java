package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155894a;

    public tg3(List list) {
        super(0);
        this.f155894a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg3) && kotlin.jvm.internal.m0.g(this.f155894a, ((tg3) obj).f155894a);
    }

    public final int hashCode() {
        return this.f155894a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f155894a + gi.j.f86771d;
    }
}

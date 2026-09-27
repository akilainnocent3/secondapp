package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e51 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f148506a;

    public e51(Map map) {
        this.f148506a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51) && kotlin.jvm.internal.m0.g(this.f148506a, ((e51) obj).f148506a);
    }

    public final int hashCode() {
        return this.f148506a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.f148506a + gi.j.f86771d;
    }
}

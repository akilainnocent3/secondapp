package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154750a;

    public r40(List list) {
        this.f154750a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r40) && kotlin.jvm.internal.m0.g(this.f154750a, ((r40) obj).f154750a);
    }

    public final int hashCode() {
        return this.f154750a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f154750a + gi.j.f86771d;
    }
}

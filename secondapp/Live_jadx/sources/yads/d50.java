package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148074a;

    public d50(ArrayList arrayList) {
        this.f148074a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && kotlin.jvm.internal.m0.g(this.f148074a, ((d50) obj).f148074a);
    }

    public final int hashCode() {
        return this.f148074a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f148074a + gi.j.f86771d;
    }
}

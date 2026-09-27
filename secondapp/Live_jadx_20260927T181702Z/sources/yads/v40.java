package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156735a;

    public v40(ArrayList arrayList) {
        this.f156735a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && kotlin.jvm.internal.m0.g(this.f156735a, ((v40) obj).f156735a);
    }

    public final int hashCode() {
        return this.f156735a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f156735a + gi.j.f86771d;
    }
}

package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ol3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153555a;

    public ol3(ArrayList arrayList) {
        this.f153555a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol3) && kotlin.jvm.internal.m0.g(this.f153555a, ((ol3) obj).f153555a);
    }

    public final int hashCode() {
        return this.f153555a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f153555a + gi.j.f86771d;
    }
}

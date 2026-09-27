package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class eo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f148796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f148797c;

    public eo2(String str, Map map, c cVar) {
        this.f148795a = str;
        this.f148796b = map;
        this.f148797c = cVar;
        map.put("sdk_version", "7.18.1");
    }

    public final c a() {
        return this.f148797c;
    }

    public final Map b() {
        return this.f148796b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo2)) {
            return false;
        }
        eo2 eo2Var = (eo2) obj;
        return kotlin.jvm.internal.m0.g(this.f148795a, eo2Var.f148795a) && kotlin.jvm.internal.m0.g(this.f148796b, eo2Var.f148796b) && kotlin.jvm.internal.m0.g(this.f148797c, eo2Var.f148797c);
    }

    public final int hashCode() {
        int iHashCode = (this.f148796b.hashCode() + (this.f148795a.hashCode() * 31)) * 31;
        c cVar = this.f148797c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f148795a + ", data=" + this.f148796b + ", abExperiments=" + this.f148797c + gi.j.f86771d;
    }
}

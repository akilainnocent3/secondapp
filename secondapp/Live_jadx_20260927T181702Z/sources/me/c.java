package me;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.a f107252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<ae.h, g.b> f107253f;

    public c(pe.a aVar, Map<ae.h, g.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f107252e = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f107253f = map;
    }

    @Override // me.g
    public pe.a e() {
        return this.f107252e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f107252e.equals(gVar.e()) && this.f107253f.equals(gVar.i())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f107252e.hashCode() ^ 1000003) * 1000003) ^ this.f107253f.hashCode();
    }

    @Override // me.g
    public Map<ae.h, g.b> i() {
        return this.f107253f;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f107252e + ", values=" + this.f107253f + "}";
    }
}

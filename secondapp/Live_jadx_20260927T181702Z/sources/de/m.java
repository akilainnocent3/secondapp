package de;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.c f78991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.b f78992b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w.c f78993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w.b f78994b;

        @Override // de.w.a
        public w a() {
            return new m(this.f78993a, this.f78994b);
        }

        @Override // de.w.a
        public w.a b(@Nullable w.b bVar) {
            this.f78994b = bVar;
            return this;
        }

        @Override // de.w.a
        public w.a c(@Nullable w.c cVar) {
            this.f78993a = cVar;
            return this;
        }
    }

    @Override // de.w
    @Nullable
    public w.b b() {
        return this.f78992b;
    }

    @Override // de.w
    @Nullable
    public w.c c() {
        return this.f78991a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f78991a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f78992b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f78991a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f78992b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f78991a + ", mobileSubtype=" + this.f78992b + "}";
    }

    public m(@Nullable w.c cVar, @Nullable w.b bVar) {
        this.f78991a = cVar;
        this.f78992b = bVar;
    }
}

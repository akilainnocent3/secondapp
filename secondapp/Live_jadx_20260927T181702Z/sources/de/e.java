package de;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.b f78942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final de.a f78943b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.b f78944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public de.a f78945b;

        @Override // de.o.a
        public o a() {
            return new e(this.f78944a, this.f78945b);
        }

        @Override // de.o.a
        public o.a b(@Nullable de.a aVar) {
            this.f78945b = aVar;
            return this;
        }

        @Override // de.o.a
        public o.a c(@Nullable o.b bVar) {
            this.f78944a = bVar;
            return this;
        }
    }

    @Override // de.o
    @Nullable
    public de.a b() {
        return this.f78943b;
    }

    @Override // de.o
    @Nullable
    public o.b c() {
        return this.f78942a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f78942a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                de.a aVar = this.f78943b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f78942a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        de.a aVar = this.f78943b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f78942a + ", androidClientInfo=" + this.f78943b + "}";
    }

    public e(@Nullable o.b bVar, @Nullable de.a aVar) {
        this.f78942a = bVar;
        this.f78943b = aVar;
    }
}

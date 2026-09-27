package de;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f78946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.b f78947b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f78948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p.b f78949b;

        @Override // de.p.a
        public p a() {
            return new f(this.f78948a, this.f78949b);
        }

        @Override // de.p.a
        public p.a b(@Nullable s sVar) {
            this.f78948a = sVar;
            return this;
        }

        @Override // de.p.a
        public p.a c(@Nullable p.b bVar) {
            this.f78949b = bVar;
            return this;
        }
    }

    @Override // de.p
    @Nullable
    public s b() {
        return this.f78946a;
    }

    @Override // de.p
    @Nullable
    public p.b c() {
        return this.f78947b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f78946a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f78947b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f78946a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f78947b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f78946a + ", productIdOrigin=" + this.f78947b + "}";
    }

    public f(@Nullable s sVar, @Nullable p.b bVar) {
        this.f78946a = sVar;
        this.f78947b = bVar;
    }
}

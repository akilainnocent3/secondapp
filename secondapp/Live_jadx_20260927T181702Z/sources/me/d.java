package me;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f107255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<g.c> f107256c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends g.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f107257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f107258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<g.c> f107259c;

        @Override // me.g.b.a
        public g.b a() {
            String str = "";
            if (this.f107257a == null) {
                str = " delta";
            }
            if (this.f107258b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f107259c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f107257a.longValue(), this.f107258b.longValue(), this.f107259c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // me.g.b.a
        public g.b.a b(long j10) {
            this.f107257a = Long.valueOf(j10);
            return this;
        }

        @Override // me.g.b.a
        public g.b.a c(Set<g.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f107259c = set;
            return this;
        }

        @Override // me.g.b.a
        public g.b.a d(long j10) {
            this.f107258b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // me.g.b
    public long b() {
        return this.f107254a;
    }

    @Override // me.g.b
    public Set<g.c> c() {
        return this.f107256c;
    }

    @Override // me.g.b
    public long d() {
        return this.f107255b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            if (this.f107254a == bVar.b() && this.f107255b == bVar.d() && this.f107256c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f107254a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f107255b;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f107256c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f107254a + ", maxAllowedDelay=" + this.f107255b + ", flags=" + this.f107256c + "}";
    }

    public d(long j10, long j11, Set<g.c> set) {
        this.f107254a = j10;
        this.f107255b = j11;
        this.f107256c = set;
    }
}

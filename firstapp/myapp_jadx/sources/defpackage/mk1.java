package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends sm70.a {
    public final long a;
    public final long b;
    public final Set<sm70.b> c;

    public mk1(long j, long j2, Set<sm70.b> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // sm70.a
    public final long a() {
        return this.a;
    }

    @Override // sm70.a
    public final Set<sm70.b> b() {
        return this.c;
    }

    @Override // sm70.a
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sm70.a)) {
            return false;
        }
        sm70.a aVar = (sm70.a) obj;
        return this.a == aVar.a() && this.b == aVar.c() && this.c.equals(aVar.b());
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}

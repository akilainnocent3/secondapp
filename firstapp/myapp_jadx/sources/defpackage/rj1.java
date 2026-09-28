package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 extends jmx {
    public final jmx.b a;
    public final jmx.a b;

    public rj1(jmx.b bVar, jmx.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // defpackage.jmx
    public final jmx.a a() {
        return this.b;
    }

    @Override // defpackage.jmx
    public final jmx.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jmx)) {
            return false;
        }
        jmx jmxVar = (jmx) obj;
        jmx.b bVar = this.a;
        if (bVar == null) {
            if (jmxVar.b() != null) {
                return false;
            }
        } else if (!bVar.equals(jmxVar.b())) {
            return false;
        }
        jmx.a aVar = this.b;
        if (aVar == null) {
            return jmxVar.a() == null;
        }
        return aVar.equals(jmxVar.a());
    }

    public final int hashCode() {
        jmx.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        jmx.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}

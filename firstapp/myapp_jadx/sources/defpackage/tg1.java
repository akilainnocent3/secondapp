package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg1 extends cs7 {
    public final cs7.a a = cs7.a.a;
    public final gg1 b;

    public tg1(gg1 gg1Var) {
        this.b = gg1Var;
    }

    @Override // defpackage.cs7
    public final j40 a() {
        return this.b;
    }

    @Override // defpackage.cs7
    public final cs7.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cs7)) {
            return false;
        }
        cs7 cs7Var = (cs7) obj;
        cs7.a aVar = this.a;
        if (aVar == null) {
            if (cs7Var.b() != null) {
                return false;
            }
        } else if (!aVar.equals(cs7Var.b())) {
            return false;
        }
        gg1 gg1Var = this.b;
        if (gg1Var == null) {
            return cs7Var.a() == null;
        }
        return gg1Var.equals(cs7Var.a());
    }

    public final int hashCode() {
        cs7.a aVar = this.a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        gg1 gg1Var = this.b;
        return iHashCode ^ (gg1Var != null ? gg1Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}

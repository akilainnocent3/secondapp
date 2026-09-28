package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nox {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nox(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nox)) {
            return false;
        }
        nox noxVar = (nox) obj;
        return this.a == noxVar.a && this.b == noxVar.b && this.c == noxVar.c && this.d == noxVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        return ruw.a(sb, this.d, ')');
    }
}

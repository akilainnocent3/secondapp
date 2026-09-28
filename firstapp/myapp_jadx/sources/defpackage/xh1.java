package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xh1 extends ktb.e.f {
    public final String a;

    public xh1(String str) {
        this.a = str;
    }

    @Override // ktb.e.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktb.e.f) {
            return this.a.equals(((ktb.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return uf80.a(new StringBuilder("User{identifier="), this.a, "}");
    }
}

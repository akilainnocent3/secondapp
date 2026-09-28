package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sh1 extends ktb.e.d.AbstractC0792d {
    public final String a;

    public sh1(String str) {
        this.a = str;
    }

    @Override // ktb.e.d.AbstractC0792d
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktb.e.d.AbstractC0792d) {
            return this.a.equals(((ktb.e.d.AbstractC0792d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return uf80.a(new StringBuilder("Log{content="), this.a, "}");
    }
}

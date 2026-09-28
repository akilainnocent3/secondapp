package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j4g {
    public final String a;

    public j4g(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bmy.a("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4g)) {
            return false;
        }
        return this.a.equals(((j4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return uf80.a(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}

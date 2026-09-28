package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yk1 extends i9e0 {
    public final String a;

    public yk1(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bmy.a("Null asString");
            throw null;
        }
    }

    @Override // defpackage.ih4
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i9e0)) {
            return false;
        }
        return this.a.equals(((yk1) ((i9e0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return uf80.a(new StringBuilder("StringBody{asString="), this.a, "}");
    }
}

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class rt40 {
    public final int a;

    public rt40(int i) {
        this.a = 2000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt40) && this.a == ((rt40) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "RegisterBvnParam(source=", ")");
    }

    public rt40() {
        this(0);
    }
}

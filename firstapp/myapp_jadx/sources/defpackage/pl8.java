package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class pl8<T> extends f3z<T> implements Serializable {
    public final fid a;

    public pl8(fid fidVar) {
        this.a = fidVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pl8) {
            return this.a.equals(((pl8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxy {
    public final String a;

    public qxy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxy) && this.a.equals(((qxy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}

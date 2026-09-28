package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b8w implements uov.a {
    public final int a;

    public b8w(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8w) && this.a == ((b8w) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}

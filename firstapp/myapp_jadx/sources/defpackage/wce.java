package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wce {
    public static final /* synthetic */ int c = 0;
    public final int a = 0;
    public final int b = 0;

    public static final class a {
    }

    static {
        jrh0.J(0);
        jrh0.J(1);
        jrh0.J(2);
        jrh0.J(3);
    }

    public wce(a aVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wce)) {
            return false;
        }
        wce wceVar = (wce) obj;
        return this.a == wceVar.a && this.b == wceVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class aty {
    public final int a;

    public aty(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aty) && this.a == ((aty) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "OneUpPromoBetSuccessResult(oneUpTag=", ")");
    }
}

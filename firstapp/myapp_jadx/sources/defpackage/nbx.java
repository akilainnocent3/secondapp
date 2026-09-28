package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nbx extends jld0 {
    public final int a;

    public nbx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbx) && this.a == ((nbx) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return rr1.b(new StringBuilder("Nack(rowNumber="), this.a, ')');
    }
}

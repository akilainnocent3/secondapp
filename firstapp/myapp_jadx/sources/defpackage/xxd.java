package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class xxd {
    public final int a;

    public xxd(int i) {
        this.a = 150;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxd) && this.a == ((xxd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "DepositDedicatedAccountValues(animationDurationMs=", ")");
    }

    public xxd() {
        this(0);
    }
}

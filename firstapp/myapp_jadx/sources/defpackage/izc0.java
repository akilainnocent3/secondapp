package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class izc0 {
    public final boolean a;

    public izc0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izc0) && this.a == ((izc0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("SportyPenaltyOverallConfig(active=", ")", this.a);
    }
}

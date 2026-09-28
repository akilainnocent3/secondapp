package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ll1 {
    public static final ll1 b = new ll1(true);
    public final boolean a;

    static {
        new ll1(false);
    }

    public ll1(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ll1) && this.a == ((ll1) obj).a();
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        return mq0.a(new StringBuilder("TracerConfig{enabled="), this.a, "}");
    }
}

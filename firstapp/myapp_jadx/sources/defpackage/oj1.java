package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class oj1 {
    public static final oj1 b = new oj1(true);
    public final boolean a;

    static {
        new oj1(false);
    }

    public oj1(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof oj1) && this.a == ((oj1) obj).a();
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        return mq0.a(new StringBuilder("MeterConfig{enabled="), this.a, "}");
    }
}

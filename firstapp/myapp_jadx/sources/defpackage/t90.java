package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t90 implements g020 {
    public final int b;

    public t90(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t90.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((t90) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return rr1.b(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}

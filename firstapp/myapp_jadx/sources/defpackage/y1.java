package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y1<T> extends l2z<T> {
    public static final y1<Object> a = new y1<>();

    @Override // defpackage.l2z
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.l2z
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

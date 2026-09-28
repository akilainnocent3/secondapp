package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class bp50<T> extends f3z<T> implements Serializable {
    public final f3z<? super T> a;

    public bp50(f3z<? super T> f3zVar) {
        this.a = f3zVar;
    }

    @Override // defpackage.f3z
    public final <S extends T> f3z<S> a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bp50) {
            return this.a.equals(((bp50) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}

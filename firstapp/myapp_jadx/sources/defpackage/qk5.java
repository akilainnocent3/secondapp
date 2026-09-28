package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qk5<F, T> extends f3z<F> implements Serializable {
    public final baj<F, ? extends T> a;
    public final f3z<T> b;

    public qk5(baj<F, ? extends T> bajVar, f3z<T> f3zVar) {
        this.a = bajVar;
        this.b = f3zVar;
    }

    @Override // java.util.Comparator
    public final int compare(F f, F f2) {
        baj<F, ? extends T> bajVar = this.a;
        return this.b.compare(bajVar.apply(f), bajVar.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qk5) {
            qk5 qk5Var = (qk5) obj;
            if (this.a.equals(qk5Var.a) && this.b.equals(qk5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class pna<T> extends f3z<T> implements Serializable {
    public final Comparator<? super T>[] a;

    public pna(qk5 qk5Var, qk5 qk5Var2) {
        this.a = new Comparator[]{qk5Var, qk5Var2};
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pna) {
            return Arrays.equals(this.a, ((pna) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return uf80.a(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}

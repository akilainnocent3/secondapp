package defpackage;

import java.lang.Comparable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class ol8<T extends Comparable<? super T>> implements it7<T> {
    public final BigDecimal a;
    public final BigDecimal b;

    public ol8(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
    }

    @Override // defpackage.it7
    public final boolean c(T t) {
        BigDecimal bigDecimal = (BigDecimal) t;
        return bigDecimal.compareTo(this.a) >= 0 && bigDecimal.compareTo(this.b) <= 0;
    }

    @Override // defpackage.it7
    public final T d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ol8)) {
            return false;
        }
        if (isEmpty() && ((ol8) obj).isEmpty()) {
            return true;
        }
        ol8 ol8Var = (ol8) obj;
        return this.a.equals(ol8Var.a) && this.b.equals(ol8Var.b);
    }

    @Override // defpackage.it7
    public final T getStart() {
        return this.a;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.it7
    public final boolean isEmpty() {
        return this.a.compareTo(this.b) > 0;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}

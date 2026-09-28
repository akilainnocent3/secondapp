package kotlin.ranges;

import defpackage.it7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends kotlin.ranges.a implements it7<Character> {
    public static final a d = new a(null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b((char) 1, (char) 0);
    }

    @Override // defpackage.it7
    public final boolean c(Comparable comparable) {
        char cCharValue = ((Character) comparable).charValue();
        return this.a <= cCharValue && cCharValue <= this.b;
    }

    @Override // defpackage.it7
    public final Comparable d() {
        return Character.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    @Override // defpackage.it7
    public final Comparable getStart() {
        return Character.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.it7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}

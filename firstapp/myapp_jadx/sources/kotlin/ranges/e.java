package kotlin.ranges;

import defpackage.it7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends d implements it7<Long> {
    public static final a e = new a(null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new e(1L, 0L);
    }

    public e(long j, long j2) {
        super(j, j2, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.it7
    public final boolean c(Comparable comparable) {
        long jLongValue = ((Number) comparable).longValue();
        return this.a <= jLongValue && jLongValue <= this.b;
    }

    @Override // defpackage.it7
    public final Comparable d() {
        return Long.valueOf(this.b);
    }

    @Override // kotlin.ranges.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    @Override // defpackage.it7
    public final Comparable getStart() {
        return Long.valueOf(this.a);
    }

    @Override // kotlin.ranges.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // kotlin.ranges.d, defpackage.it7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // kotlin.ranges.d
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

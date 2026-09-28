package kotlin.ranges;

import defpackage.it7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/c;", "Lit7;", "", "", "e", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class IntRange extends c implements it7<Integer> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final IntRange f = new IntRange(1, 0, 1);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public IntRange() {
        super(2, 10, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.it7
    public final /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return e(((Number) comparable).intValue());
    }

    @Override // defpackage.it7
    public final Comparable d() {
        return Integer.valueOf(this.b);
    }

    public final boolean e(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // kotlin.ranges.c
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.a == intRange.a && this.b == intRange.b;
    }

    @Override // defpackage.it7
    public final Comparable getStart() {
        return Integer.valueOf(this.a);
    }

    @Override // kotlin.ranges.c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // kotlin.ranges.c, defpackage.it7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // kotlin.ranges.c
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

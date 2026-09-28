package kotlin.time;

import defpackage.rgf;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements i {
        public static final a a = new a();

        /* JADX INFO: renamed from: kotlin.time.i$a$a, reason: collision with other inner class name */
        public static final class C0776a implements kotlin.time.a {
            public final long a;

            public /* synthetic */ C0776a(long j) {
                this.a = j;
            }

            public static long b(long j) {
                h.a.getClass();
                return (1 | (j - 1)) == Long.MAX_VALUE ? b.l(g.a(j)) : g.b(h.b(), j, rgf.NANOSECONDS);
            }

            @Override // kotlin.time.a
            /* JADX INFO: renamed from: G */
            public final /* bridge */ int compareTo(kotlin.time.a aVar) {
                return kotlin.time.a.C0775a.a(this, aVar);
            }

            @Override // kotlin.time.TimeMark
            public final long a() {
                return b(this.a);
            }

            @Override // kotlin.time.a, java.lang.Comparable
            public final /* bridge */ int compareTo(Object obj) {
                return kotlin.time.a.C0775a.a(this, (kotlin.time.a) obj);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C0776a) {
                    return this.a == ((C0776a) obj).a;
                }
                return false;
            }

            @Override // kotlin.time.a
            public final long g(kotlin.time.a aVar) {
                aVar.getClass();
                boolean z = aVar instanceof C0776a;
                long j = this.a;
                if (z) {
                    long j2 = ((C0776a) aVar).a;
                    h.a.getClass();
                    return g.c(j, j2, rgf.NANOSECONDS);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + aVar);
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.a + ')';
            }
        }

        @Override // kotlin.time.i
        public final TimeMark a() {
            h.a.getClass();
            return new C0776a(h.b());
        }

        public final String toString() {
            h.a.getClass();
            return "TimeSource(System.nanoTime())";
        }
    }

    TimeMark a();
}

package kotlin.time;

import defpackage.fae;
import defpackage.nrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public abstract class AbstractDoubleTimeSource implements i {

    public static final class a implements kotlin.time.a {
        public final double a;
        public final AbstractDoubleTimeSource b;
        public final long c;

        public a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            abstractDoubleTimeSource.getClass();
            this.a = d;
            this.b = abstractDoubleTimeSource;
            this.c = j;
        }

        @Override // kotlin.time.a
        /* JADX INFO: renamed from: G */
        public final /* bridge */ int compareTo(kotlin.time.a aVar) {
            return kotlin.time.a.C0775a.a(this, aVar);
        }

        @Override // kotlin.time.TimeMark
        public final long a() {
            c.g(this.b.b() - this.a, null);
            throw null;
        }

        @Override // kotlin.time.a, java.lang.Comparable
        public final /* bridge */ int compareTo(Object obj) {
            return kotlin.time.a.C0775a.a(this, (kotlin.time.a) obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (!this.b.equals(((a) obj).b)) {
                return false;
            }
            g((kotlin.time.a) obj);
            b.b.getClass();
            return b.d(0L, 0L);
        }

        @Override // kotlin.time.a
        public final long g(kotlin.time.a aVar) {
            aVar.getClass();
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                long j = aVar2.c;
                if (this.b.equals(aVar2.b)) {
                    long j2 = this.c;
                    if (b.d(j2, j) && b.h(j2)) {
                        b.b.getClass();
                        return 0L;
                    }
                    b.i(j2, b.l(j));
                    c.g(this.a - aVar2.a, null);
                    throw null;
                }
            }
            nrh0.a(this, "Subtracting or comparing time marks from different time sources is not possible: ", " and ", aVar);
            return 0L;
        }

        public final int hashCode() {
            c.g(this.a, null);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Override // kotlin.time.i
    public final TimeMark a() {
        double dB = b();
        b.b.getClass();
        return new a(dB, this, 0L, null);
    }

    public abstract double b();
}

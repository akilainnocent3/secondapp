package ms;

import fr.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class m implements Iterable<Long>, es.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f115148e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115151d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final m a(long j10, long j11, long j12) {
            return new m(j10, j11, j12);
        }

        public a() {
        }
    }

    public m(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f115149b = j10;
        this.f115150c = ur.o.d(j10, j11, j12);
        this.f115151d = j12;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return this.f115149b == mVar.f115149b && this.f115150c == mVar.f115150c && this.f115151d == mVar.f115151d;
    }

    public final long f() {
        return this.f115149b;
    }

    public final long g() {
        return this.f115150c;
    }

    public final long h() {
        return this.f115151d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f115149b;
        long j12 = this.f115150c;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f115151d;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    @Override // java.lang.Iterable
    @oy.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g1 iterator() {
        return new n(this.f115149b, this.f115150c, this.f115151d);
    }

    public boolean isEmpty() {
        long j10 = this.f115151d;
        long j11 = this.f115149b;
        long j12 = this.f115150c;
        if (j10 > 0) {
            return j11 > j12;
        }
        return j11 < j12;
    }

    @oy.l
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f115151d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f115149b);
            sb2.append("..");
            sb2.append(this.f115150c);
            sb2.append(" step ");
            j10 = this.f115151d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f115149b);
            sb2.append(" downTo ");
            sb2.append(this.f115150c);
            sb2.append(" step ");
            j10 = -this.f115151d;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}

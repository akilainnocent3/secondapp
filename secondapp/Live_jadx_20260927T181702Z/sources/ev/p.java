package ev;

import dr.g1;
import dr.l1;
import dr.p0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "2.1")
@o
@s1({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,864:1\n1#2:865\n803#3,14:866\n786#3,6:880\n803#3,14:886\n786#3,6:900\n786#3,6:907\n548#4:906\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n150#1:866,14\n153#1:880,6\n161#1:886,14\n164#1:900,6\n188#1:907,6\n184#1:906\n*E\n"})
public final class p implements Comparable<p>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f81694d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final p f81695e = new p(y.f81702c, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final p f81696f = new p(y.f81703d, 999999999);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81698c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,864:1\n786#2,6:865\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n312#1:865,6\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ p d(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j11 = 0;
            }
            return aVar.c(j10, j11);
        }

        @oy.l
        public final p a(long j10) {
            long j11 = j10 / 1000;
            if ((j10 ^ 1000) < 0 && j11 * 1000 != j10) {
                j11--;
            }
            long j12 = j10 % 1000;
            int i10 = (int) ((j12 + (1000 & (((j12 ^ 1000) & ((-j12) | j12)) >> 63))) * ((long) 1000000));
            if (j11 < y.f81702c) {
                return h();
            }
            return j11 > y.f81703d ? g() : b(j11, i10);
        }

        @oy.l
        public final p b(long j10, int i10) {
            return c(j10, i10);
        }

        @oy.l
        public final p c(long j10, long j11) {
            long j12 = j11 / 1000000000;
            if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                j12--;
            }
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                return j10 > 0 ? p.f81694d.g() : p.f81694d.h();
            }
            if (j13 < y.f81702c) {
                return h();
            }
            if (j13 > y.f81703d) {
                return g();
            }
            long j14 = j11 % 1000000000;
            return new p(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
        }

        @oy.l
        public final p e() {
            return b(y.f81701b, 0);
        }

        @oy.l
        public final p f() {
            return b(y.f81700a, 999999999);
        }

        @oy.l
        public final p g() {
            return p.f81696f;
        }

        @oy.l
        public final p h() {
            return p.f81695e;
        }

        @oy.l
        @dr.o(level = dr.q.ERROR, message = "Use Clock.System.now() instead", replaceWith = @g1(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        public final p i() {
            throw new p0(null, 1, null);
        }

        @oy.l
        public final p j(@oy.l CharSequence input) {
            m0.p(input, "input");
            return y.r(input).toInstant();
        }

        @l1(version = "2.2")
        @oy.m
        public final p k(@oy.l CharSequence input) {
            m0.p(input, "input");
            return y.r(input).a();
        }

        public a() {
        }
    }

    public p(long j10, int i10) {
        this.f81697b = j10;
        this.f81698c = i10;
        if (y.f81702c > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f81697b == pVar.f81697b && this.f81698c == pVar.f81698c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(@oy.l p other) {
        m0.p(other, "other");
        int iU = m0.u(this.f81697b, other.f81697b);
        return iU != 0 ? iU : m0.t(this.f81698c, other.f81698c);
    }

    public int hashCode() {
        return f0.p.a(this.f81697b) + (this.f81698c * 51);
    }

    public final long i() {
        return this.f81697b;
    }

    public final int j() {
        return this.f81698c;
    }

    @oy.l
    public final p k(long j10) {
        return m(h.j0(j10));
    }

    public final long l(@oy.l p other) {
        m0.p(other, "other");
        h.a aVar = h.f81657c;
        return h.T(j.x(this.f81697b - other.f81697b, k.SECONDS), j.w(this.f81698c - other.f81698c, k.NANOSECONDS));
    }

    @oy.l
    public final p m(long j10) {
        long jZ = h.z(j10);
        int iE = h.E(j10);
        if (jZ == 0 && iE == 0) {
            return this;
        }
        long j11 = this.f81697b;
        long j12 = j11 + jZ;
        if ((j11 ^ j12) >= 0 || (jZ ^ j11) < 0) {
            return f81694d.b(j12, this.f81698c + iE);
        }
        return h.R(j10) ? f81696f : f81695e;
    }

    public final void n(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public final long o() {
        long j10 = this.f81697b;
        long j11 = 1000;
        if (j10 >= 0) {
            if (j10 != 1) {
                if (j10 != 0) {
                    long j12 = j10 * 1000;
                    if (j12 / 1000 != j10) {
                        return Long.MAX_VALUE;
                    }
                    j11 = j12;
                } else {
                    j11 = 0;
                }
            }
            long j13 = this.f81698c / 1000000;
            long j14 = j11 + j13;
            if ((j11 ^ j14) >= 0 || (j13 ^ j11) < 0) {
                return j14;
            }
            return Long.MAX_VALUE;
        }
        long j15 = j10 + 1;
        if (j15 != 1) {
            if (j15 != 0) {
                long j16 = j15 * 1000;
                if (j16 / 1000 != j15) {
                    return Long.MIN_VALUE;
                }
                j11 = j16;
            } else {
                j11 = 0;
            }
        }
        long j17 = (this.f81698c / 1000000) - 1000;
        long j18 = j11 + j17;
        if ((j11 ^ j18) >= 0 || (j17 ^ j11) < 0) {
            return j18;
        }
        return Long.MIN_VALUE;
    }

    public final Object q() {
        return r.b(this);
    }

    @oy.l
    public String toString() {
        return y.j(this);
    }
}

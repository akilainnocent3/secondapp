package f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@cs.h
@kotlin.jvm.internal.s1({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @cs.g
    public final long f81906a;

    public /* synthetic */ g0(long j10) {
        this.f81906a = j10;
    }

    public static final /* synthetic */ g0 a(long j10) {
        return new g0(j10);
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int c(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static long d(int i10, int i11) {
        return e((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof g0) && j10 == ((g0) obj).l();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int j(long j10) {
        return p.a(j10);
    }

    @oy.l
    public static String k(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f81906a, obj);
    }

    public int hashCode() {
        return j(this.f81906a);
    }

    public final /* synthetic */ long l() {
        return this.f81906a;
    }

    @oy.l
    public String toString() {
        return k(this.f81906a);
    }

    public static long e(long j10) {
        return j10;
    }
}

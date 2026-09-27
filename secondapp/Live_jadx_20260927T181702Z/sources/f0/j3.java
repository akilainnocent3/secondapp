package f0;

import cj.k9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1148:1\n1147#1:1149\n1147#1:1150\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1097#1:1149\n1099#1:1150\n*E\n"})
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f81972a = 2147483646;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81973b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f81974c = 2147483647L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f81975d = 4611686018427387903L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f81976e = 4611686018427387904L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f81977f = -4611686018427387904L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f81978g = -4611686016279904257L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f81979h = -2147483648L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f81980i = 4611686018427387903L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final long[] f81981j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81982k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f81983l = 9223372034707292159L;

    public static final long a(long j10) {
        return j10 & 4611686018427387903L;
    }

    public static final long b(long j10, int i10) {
        return (j10 & k9.f24054l) | ((long) i10);
    }

    public static final long c(int i10) {
        return (((long) i10) & 2147483647L) | 4611686016279904256L;
    }

    public static final long d(long j10, int i10, int i11, @oy.l int[] mapping) {
        kotlin.jvm.internal.m0.p(mapping, "mapping");
        return (((j10 & f81977f) | ((long) (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i10]))) << 31) | ((long) (i11 != Integer.MAX_VALUE ? mapping[i11] : Integer.MAX_VALUE));
    }

    public static final long e(long j10, int i10, int i11, @oy.l long[] mapping) {
        kotlin.jvm.internal.m0.p(mapping, "mapping");
        return (((j10 & f81977f) | ((long) (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i10] & 4294967295L)))) << 31) | ((long) (i11 != Integer.MAX_VALUE ? (int) (mapping[i11] & 4294967295L) : Integer.MAX_VALUE));
    }

    public static final long f(int i10, int i11) {
        return ((long) i11) | (((long) i10) << 32);
    }

    public static final long g(long j10, int i10) {
        return (j10 & 4294967295L) | (((long) i10) << 32);
    }

    public static final long h(long j10) {
        return (j10 & 4294967295L) | k9.f24054l;
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    @oy.l
    public static final long[] j() {
        return f81981j;
    }

    public static final int k(long j10) {
        return (int) (j10 & 2147483647L);
    }

    public static final int o(long j10) {
        return (int) ((j10 >> 31) & 2147483647L);
    }

    public static final int q(long j10) {
        return (int) ((j10 >> 32) & 4294967295L);
    }

    public static final int r(long j10) {
        return (int) ((j10 >> 62) & 1);
    }

    public static final long s(long j10, int i10) {
        return (j10 & f81979h) | (((long) i10) & 2147483647L);
    }

    public static final long t(long j10, int i10) {
        return (j10 & f81978g) | ((((long) i10) & 2147483647L) << 31);
    }

    @dr.f1
    public static /* synthetic */ void l(long j10) {
    }

    @dr.f1
    public static /* synthetic */ void m() {
    }

    @dr.f1
    public static /* synthetic */ void n() {
    }

    @dr.f1
    public static /* synthetic */ void p(long j10) {
    }
}

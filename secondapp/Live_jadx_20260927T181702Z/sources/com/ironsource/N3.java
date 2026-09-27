package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum N3 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f59520c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f59525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59526b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nCappingTimeUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CappingTimeUnit.kt\ncom/ironsource/services/capping/CappingTimeUnit$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,16:1\n1282#2,2:17\n*S KotlinDebug\n*F\n+ 1 CappingTimeUnit.kt\ncom/ironsource/services/capping/CappingTimeUnit$Companion\n*L\n10#1:17,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final N3 a(@oy.m String str) {
            for (N3 n10 : N3.values()) {
                if (kotlin.jvm.internal.m0.g(n10.f59525a, str)) {
                    return n10;
                }
            }
            return null;
        }

        private a() {
        }
    }

    N3(String str, long j10) {
        this.f59525a = str;
        this.f59526b = j10;
    }

    public final long a(@oy.m Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f59526b;
    }

    public static /* synthetic */ long a(N3 n10, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return n10.a(num);
    }
}

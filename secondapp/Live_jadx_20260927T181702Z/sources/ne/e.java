package ne;

import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f116457a = 10485760;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f116458b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116459c = 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f116460d = 604800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116461e = 81920;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f116462f = a().f(10485760).d(200).b(10000).c(f116460d).e(f116461e).a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        public abstract e a();

        public abstract a b(int i10);

        public abstract a c(long j10);

        public abstract a d(int i10);

        public abstract a e(int i10);

        public abstract a f(long j10);
    }

    public static a a() {
        return new ne.a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}

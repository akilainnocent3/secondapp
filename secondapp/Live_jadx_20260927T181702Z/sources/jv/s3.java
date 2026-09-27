package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final s3 f100876a = new s3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final ThreadLocal<s1> f100877b = qv.l1.a(new qv.z0("ThreadLocalEventLoop"));

    @oy.m
    public final s1 a() {
        return f100877b.get();
    }

    @oy.l
    public final s1 b() {
        ThreadLocal<s1> threadLocal = f100877b;
        s1 s1Var = threadLocal.get();
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1VarA = v1.a();
        threadLocal.set(s1VarA);
        return s1VarA;
    }

    public final void c() {
        f100877b.set(null);
    }

    public final void d(@oy.l s1 s1Var) {
        f100877b.set(s1Var);
    }
}

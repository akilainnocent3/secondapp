package qv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.f1
public final class k1 implements or.j.c<j1<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ThreadLocal<?> f122999b;

    public k1(@oy.l ThreadLocal<?> threadLocal) {
        this.f122999b = threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k1 c(k1 k1Var, ThreadLocal threadLocal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            threadLocal = k1Var.f122999b;
        }
        return k1Var.b(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.f122999b;
    }

    @oy.l
    public final k1 b(@oy.l ThreadLocal<?> threadLocal) {
        return new k1(threadLocal);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && kotlin.jvm.internal.m0.g(this.f122999b, ((k1) obj).f122999b);
    }

    public int hashCode() {
        return this.f122999b.hashCode();
    }

    @oy.l
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f122999b + ')';
    }
}

package e2;

import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        @oy.m
        T a();

        boolean b(@oy.l T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final Object[] f79859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79860b;

        public b(@k.e0(from = 1) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f79859a = new Object[i10];
        }

        @Override // e2.w.a
        @oy.m
        public T a() {
            int i10 = this.f79860b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T t10 = (T) this.f79859a[i11];
            kotlin.jvm.internal.m0.n(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.f79859a[i11] = null;
            this.f79860b--;
            return t10;
        }

        @Override // e2.w.a
        public boolean b(@oy.l T instance) {
            kotlin.jvm.internal.m0.p(instance, "instance");
            if (c(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.f79860b;
            Object[] objArr = this.f79859a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = instance;
            this.f79860b = i10 + 1;
            return true;
        }

        public final boolean c(T t10) {
            int i10 = this.f79860b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f79859a[i11] == t10) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final Object f79861c;

        public c(int i10) {
            super(i10);
            this.f79861c = new Object();
        }

        @Override // e2.w.b, e2.w.a
        @oy.m
        public T a() {
            T t10;
            synchronized (this.f79861c) {
                t10 = (T) super.a();
            }
            return t10;
        }

        @Override // e2.w.b, e2.w.a
        public boolean b(@oy.l T instance) {
            boolean zB;
            kotlin.jvm.internal.m0.p(instance, "instance");
            synchronized (this.f79861c) {
                zB = super.b(instance);
            }
            return zB;
        }
    }
}

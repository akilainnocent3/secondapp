package e2;

import android.annotation.SuppressLint;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 {
    @SuppressLint({"MissingNullability"})
    public static f0 a(final f0 f0Var, @SuppressLint({"MissingNullability"}) final f0 f0Var2) {
        Objects.requireNonNull(f0Var2);
        return new f0() { // from class: e2.c0
            @Override // e2.f0
            public /* synthetic */ f0 a(f0 f0Var3) {
                return e0.a(this, f0Var3);
            }

            @Override // e2.f0
            public /* synthetic */ f0 b(f0 f0Var3) {
                return e0.c(this, f0Var3);
            }

            @Override // e2.f0
            public /* synthetic */ f0 negate() {
                return e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return e0.d(f0Var, f0Var2, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static f0 b(final f0 f0Var) {
        return new f0() { // from class: e2.d0
            @Override // e2.f0
            public /* synthetic */ f0 a(f0 f0Var2) {
                return e0.a(this, f0Var2);
            }

            @Override // e2.f0
            public /* synthetic */ f0 b(f0 f0Var2) {
                return e0.c(this, f0Var2);
            }

            @Override // e2.f0
            public /* synthetic */ f0 negate() {
                return e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return e0.e(f0Var, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static f0 c(final f0 f0Var, @SuppressLint({"MissingNullability"}) final f0 f0Var2) {
        Objects.requireNonNull(f0Var2);
        return new f0() { // from class: e2.z
            @Override // e2.f0
            public /* synthetic */ f0 a(f0 f0Var3) {
                return e0.a(this, f0Var3);
            }

            @Override // e2.f0
            public /* synthetic */ f0 b(f0 f0Var3) {
                return e0.c(this, f0Var3);
            }

            @Override // e2.f0
            public /* synthetic */ f0 negate() {
                return e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return e0.f(f0Var, f0Var2, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(f0 f0Var, f0 f0Var2, Object obj) {
        return f0Var.test(obj) && f0Var2.test(obj);
    }

    public static /* synthetic */ boolean e(f0 f0Var, Object obj) {
        return !f0Var.test(obj);
    }

    public static /* synthetic */ boolean f(f0 f0Var, f0 f0Var2, Object obj) {
        return f0Var.test(obj) || f0Var2.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    public static <T> f0<T> g(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new f0() { // from class: e2.a0
            @Override // e2.f0
            public /* synthetic */ f0 a(f0 f0Var) {
                return e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ f0 b(f0 f0Var) {
                return e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ f0 negate() {
                return e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj2) {
                return y.a(obj2);
            }
        } : new f0() { // from class: e2.b0
            @Override // e2.f0
            public /* synthetic */ f0 a(f0 f0Var) {
                return e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ f0 b(f0 f0Var) {
                return e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ f0 negate() {
                return e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static <T> f0<T> j(@SuppressLint({"MissingNullability"}) f0<? super T> f0Var) {
        Objects.requireNonNull(f0Var);
        return f0Var.negate();
    }
}

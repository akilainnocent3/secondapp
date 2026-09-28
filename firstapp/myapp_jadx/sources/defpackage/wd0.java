package defpackage;

import androidx.compose.runtime.m;
import defpackage.mj0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class wd0<T, V extends mj0> {
    public final f0h0<T, V> a;
    public final T b;
    public final aj0<T, V> c;
    public final ytw d;
    public final ytw e;
    public T f;
    public T g;
    public final luw h;
    public final fkd0<T> i;
    public final V j;
    public final V k;
    public V l;
    public V m;

    @c0d(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ wd0<Object, mj0> a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Object, mj0> wd0Var, Object obj, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.a = wd0Var;
            this.b = obj;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wd0<Object, mj0> wd0Var = this.a;
            wd0Var.c();
            Object objB = wd0Var.b(this.b);
            ((x5a0) wd0Var.c.b).setValue(objB);
            ((x5a0) wd0Var.e).setValue(objB);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wd0(Object obj, f0h0 f0h0Var, Object obj2) {
        this.a = f0h0Var;
        this.b = obj2;
        aj0<T, V> aj0Var = new aj0<>(f0h0Var, obj, null, 60);
        this.c = aj0Var;
        this.d = m.b(Boolean.FALSE);
        this.e = m.b(obj);
        this.h = new luw();
        this.i = new fkd0<>(obj2, 3);
        V v = aj0Var.c;
        V v2 = v instanceof ij0 ? ee0.e : v instanceof jj0 ? ee0.f : v instanceof kj0 ? ee0.g : ee0.h;
        v2.getClass();
        this.j = v2;
        V v3 = aj0Var.c;
        V v4 = v3 instanceof ij0 ? ee0.a : v3 instanceof jj0 ? ee0.b : v3 instanceof kj0 ? ee0.c : ee0.d;
        v4.getClass();
        this.k = v4;
        this.l = v2;
        this.m = v4;
    }

    public static Object a(wd0 wd0Var, Object obj, xi0 xi0Var, Float f, Function1 function1, v1b v1bVar, int i) {
        if ((i & 2) != 0) {
            xi0Var = wd0Var.i;
        }
        xi0 xi0Var2 = xi0Var;
        if ((i & 4) != 0) {
            f = wd0Var.a.b().invoke(wd0Var.c.c);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object objD = wd0Var.d();
        f0h0<T, V> f0h0Var = wd0Var.a;
        return luw.a(wd0Var.h, new vd0(wd0Var, f, new g5f0(xi0Var2, f0h0Var, objD, obj, (mj0) f0h0Var.a().invoke(f)), wd0Var.c.d, function1, null), v1bVar);
    }

    public final T b(T t) {
        if (!Intrinsics.g(this.l, this.j) || !Intrinsics.g(this.m, this.k)) {
            f0h0<T, V> f0h0Var = this.a;
            V vInvoke = f0h0Var.a().invoke(t);
            int iB = vInvoke.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (vInvoke.a(i) < this.l.a(i) || vInvoke.a(i) > this.m.a(i)) {
                    vInvoke.e(i, f.d(vInvoke.a(i), this.l.a(i), this.m.a(i)));
                    z = true;
                }
            }
            if (z) {
                return f0h0Var.b().invoke(vInvoke);
            }
        }
        return t;
    }

    public final void c() {
        aj0<T, V> aj0Var = this.c;
        aj0Var.c.d();
        aj0Var.d = Long.MIN_VALUE;
        ((x5a0) this.d).setValue(Boolean.FALSE);
    }

    public final T d() {
        return (T) ((x5a0) this.c.b).getValue();
    }

    public final boolean e() {
        return ((Boolean) ((x5a0) this.d).getValue()).booleanValue();
    }

    public final Object f(v1b v1bVar, Object obj) {
        Object objA = luw.a(this.h, new a(this, obj, null), v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final Object g(tje0 tje0Var) {
        Object objA = luw.a(this.h, new xd0(this, null), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public /* synthetic */ wd0(Object obj, f0h0 f0h0Var, Object obj2, int i) {
        this(obj, f0h0Var, (i & 4) != 0 ? null : obj2);
    }
}

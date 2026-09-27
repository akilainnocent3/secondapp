package j5;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface v {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final s5.s0.b f99702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0936a> f99703c;

        /* JADX INFO: renamed from: j5.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0936a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f99704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public v f99705b;

            public C0936a(Handler handler, v vVar) {
                this.f99704a = handler;
                this.f99705b = vVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void f(a aVar, v vVar, v0 v0Var) {
            vVar.N(aVar.f99701a, aVar.f99702b);
            vVar.G(aVar.f99701a, aVar.f99702b, v0Var);
        }

        public void g(Handler handler, v vVar) {
            zi.l0.E(handler);
            zi.l0.E(vVar);
            this.f99703c.add(new C0936a(handler, vVar));
        }

        public void h(final v0 v0Var) {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.f(this.f99680b, vVar, v0Var);
                    }
                });
            }
        }

        public void i() {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a aVar = this.f99676b;
                        vVar.S(aVar.f99701a, aVar.f99702b);
                    }
                });
            }
        }

        public void j() {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a aVar = this.f99678b;
                        vVar.X(aVar.f99701a, aVar.f99702b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a aVar = this.f99683b;
                        vVar.F(aVar.f99701a, aVar.f99702b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a aVar = this.f99673b;
                        vVar.V(aVar.f99701a, aVar.f99702b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0936a c0936a : this.f99703c) {
                final v vVar = c0936a.f99705b;
                b2.a2(c0936a.f99704a, new Runnable() { // from class: j5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a aVar = this.f99695b;
                        vVar.L(aVar.f99701a, aVar.f99702b);
                    }
                });
            }
        }

        public void n(v vVar) {
            for (C0936a c0936a : this.f99703c) {
                if (c0936a.f99705b == vVar) {
                    this.f99703c.remove(c0936a);
                }
            }
        }

        @CheckResult
        public a o(int i10, @Nullable s5.s0.b bVar) {
            return new a(this.f99703c, i10, bVar);
        }

        public a(CopyOnWriteArrayList<C0936a> copyOnWriteArrayList, int i10, @Nullable s5.s0.b bVar) {
            this.f99703c = copyOnWriteArrayList;
            this.f99701a = i10;
            this.f99702b = bVar;
        }
    }

    void F(int i10, @Nullable s5.s0.b bVar, int i11);

    void G(int i10, @Nullable s5.s0.b bVar, v0 v0Var);

    void L(int i10, @Nullable s5.s0.b bVar);

    @Deprecated
    void N(int i10, @Nullable s5.s0.b bVar);

    void S(int i10, @Nullable s5.s0.b bVar);

    void V(int i10, @Nullable s5.s0.b bVar, Exception exc);

    void X(int i10, @Nullable s5.s0.b bVar);
}

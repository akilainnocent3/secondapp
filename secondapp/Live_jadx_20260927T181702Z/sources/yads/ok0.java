package yads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f153519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f153520c;

    public ok0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(Handler handler, pk0 pk0Var) {
        pk0Var.getClass();
        this.f153520c.add(new nk0(handler, pk0Var));
    }

    public final void b() {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.q74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154341b.b(pk0Var);
                }
            });
        }
    }

    public final void c() {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.r74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154808b.c(pk0Var);
                }
            });
        }
    }

    public final void d() {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.p74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153799b.d(pk0Var);
                }
            });
        }
    }

    public ok0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var) {
        this.f153520c = copyOnWriteArrayList;
        this.f153518a = i10;
        this.f153519b = ym1Var;
    }

    public final void a() {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.n74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152922b.a(pk0Var);
                }
            });
        }
    }

    public final /* synthetic */ void b(pk0 pk0Var) {
        pk0Var.d(this.f153518a, this.f153519b);
    }

    public final /* synthetic */ void c(pk0 pk0Var) {
        pk0Var.c(this.f153518a, this.f153519b);
    }

    public final /* synthetic */ void d(pk0 pk0Var) {
        pk0Var.b(this.f153518a, this.f153519b);
    }

    public final void a(final int i10) {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.s74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155296b.a(pk0Var, i10);
                }
            });
        }
    }

    public final void a(final Exception exc) {
        for (nk0 nk0Var : this.f153520c) {
            final pk0 pk0Var = nk0Var.f153064b;
            ib3.a(nk0Var.f153063a, new Runnable() { // from class: yads.o74
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153383b.a(pk0Var, exc);
                }
            });
        }
    }

    public final /* synthetic */ void a(pk0 pk0Var) {
        pk0Var.a(this.f153518a, this.f153519b);
    }

    public final /* synthetic */ void a(pk0 pk0Var, int i10) {
        pk0Var.getClass();
        pk0Var.a(this.f153518a, this.f153519b, i10);
    }

    public final /* synthetic */ void a(pk0 pk0Var, Exception exc) {
        pk0Var.a(this.f153518a, this.f153519b, exc);
    }
}

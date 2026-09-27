package x4;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f144293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f144294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f144295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f144296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f144297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f144298f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        void a(T t10, T t11);
    }

    public g(T t10, Looper looper, Looper looper2, l lVar, a<T> aVar) {
        this.f144293a = lVar.createHandler(looper, null);
        this.f144294b = lVar.createHandler(looper2, null);
        this.f144296d = t10;
        this.f144297e = t10;
        this.f144295c = aVar;
    }

    public static /* synthetic */ void a(final g gVar, zi.t tVar) {
        final T t10 = (T) tVar.apply(gVar.f144297e);
        gVar.f144297e = t10;
        gVar.f(new Runnable() { // from class: x4.f
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f144278b, t10);
            }
        });
    }

    public static /* synthetic */ void b(g gVar, Object obj) {
        if (gVar.f144298f == 0) {
            gVar.i(obj);
        }
    }

    public static /* synthetic */ void c(g gVar, Object obj) {
        int i10 = gVar.f144298f - 1;
        gVar.f144298f = i10;
        if (i10 == 0) {
            gVar.i(obj);
        }
    }

    public T d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f144294b.getLooper()) {
            return this.f144296d;
        }
        zi.l0.g0(looperMyLooper == this.f144293a.getLooper());
        return this.f144297e;
    }

    public void e(Runnable runnable) {
        if (this.f144293a.getLooper().getThread().isAlive()) {
            this.f144293a.post(runnable);
        }
    }

    public final void f(Runnable runnable) {
        if (this.f144294b.getLooper().getThread().isAlive()) {
            this.f144294b.post(runnable);
        }
    }

    public void g(final T t10) {
        this.f144297e = t10;
        f(new Runnable() { // from class: x4.e
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f144265b, t10);
            }
        });
    }

    public void h(zi.t<T, T> tVar, final zi.t<T, T> tVar2) {
        zi.l0.g0(Looper.myLooper() == this.f144294b.getLooper());
        this.f144298f++;
        e(new Runnable() { // from class: x4.d
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f144253b, tVar2);
            }
        });
        i(tVar.apply(this.f144296d));
    }

    public final void i(T t10) {
        T t11 = this.f144296d;
        this.f144296d = t10;
        if (t11.equals(t10)) {
            return;
        }
        this.f144295c.a(t11, t10);
    }
}

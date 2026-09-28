package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Transition.f {
    public final /* synthetic */ Runnable a;

    public c(Runnable runnable) {
        this.a = runnable;
    }

    @Override // androidx.transition.Transition.f
    public final void g(Transition transition) {
    }

    @Override // androidx.transition.Transition.f
    public final void j(Transition transition) {
        this.a.run();
    }

    @Override // androidx.transition.Transition.f
    public final void k(Transition transition) {
    }

    @Override // androidx.transition.Transition.f
    public final void a() {
    }

    @Override // androidx.transition.Transition.f
    public final void f() {
    }
}

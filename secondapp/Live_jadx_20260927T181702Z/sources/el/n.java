package el;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f81406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<p> f81407b;

    public n(u uVar, TaskCompletionSource<p> taskCompletionSource) {
        this.f81406a = uVar;
        this.f81407b = taskCompletionSource;
    }

    @Override // el.t
    public boolean a(Exception exc) {
        this.f81407b.trySetException(exc);
        return true;
    }

    @Override // el.t
    public boolean b(il.d dVar) {
        if (!dVar.k() || this.f81406a.f(dVar)) {
            return false;
        }
        this.f81407b.setResult(p.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}

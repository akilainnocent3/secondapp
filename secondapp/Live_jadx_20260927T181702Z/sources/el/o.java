package el;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f81408a;

    public o(TaskCompletionSource<String> taskCompletionSource) {
        this.f81408a = taskCompletionSource;
    }

    @Override // el.t
    public boolean a(Exception exc) {
        return false;
    }

    @Override // el.t
    public boolean b(il.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f81408a.trySetResult(dVar.d());
        return true;
    }
}

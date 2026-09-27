package d5;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4.y f77849b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f77849b.post(runnable);
    }
}

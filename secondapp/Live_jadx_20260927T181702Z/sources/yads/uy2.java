package yads;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uy2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f156679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy2 f156680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy2(vy2 vy2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f156680c = vy2Var;
        this.f156679b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f156680c) {
            this.f156679b.open();
            this.f156680c.b();
            this.f156680c.f157135b.getClass();
        }
    }
}

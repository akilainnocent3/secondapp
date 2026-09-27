package pv;

import java.util.concurrent.Future;
import jv.u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final Future<?> f121113f;

    public a(@oy.l Future<?> future) {
        this.f121113f = future;
    }

    @Override // jv.u2
    public boolean D() {
        return false;
    }

    @Override // jv.u2
    public void E(@oy.m Throwable th2) {
        if (th2 == null || this.f121113f.isDone()) {
            return;
        }
        this.f121113f.cancel(false);
    }
}

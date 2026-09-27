package ee;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@ge.e
public abstract class k {
    @ge.f
    @cr.f
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a() {
        return new p(Executors.newSingleThreadExecutor());
    }
}

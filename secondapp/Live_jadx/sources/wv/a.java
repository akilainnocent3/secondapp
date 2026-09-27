package wv;

import java.util.concurrent.Executor;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public static final a f143924b = new a();

    @Override // java.util.concurrent.Executor
    public void execute(@l Runnable runnable) {
        runnable.run();
    }
}

package bj;

import java.util.concurrent.Executor;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@i
public final class z {
    public static <K, V> w<K, V> c(final w<K, V> listener, final Executor executor) {
        l0.E(listener);
        l0.E(executor);
        return new w() { // from class: bj.y
            @Override // bj.w
            public final void a(a0 a0Var) {
                executor.execute(new Runnable() { // from class: bj.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        wVar.a(a0Var);
                    }
                });
            }
        };
    }
}

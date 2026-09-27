package nj;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.b
public abstract class b1<V> extends a1<V> implements t1<V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<V> extends b1<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1<V> f116902c;

        public a(t1<V> delegate) {
            this.f116902c = (t1) zi.l0.E(delegate);
        }

        @Override // nj.b1, nj.a1, cj.w5
        /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
        public final t1<V> g2() {
            return this.f116902c;
        }
    }

    @Override // nj.a1, cj.w5
    /* JADX INFO: renamed from: Y1 */
    public abstract t1<? extends V> g2();

    @Override // nj.t1
    public void addListener(Runnable listener, Executor exec) {
        g2().addListener(listener, exec);
    }
}

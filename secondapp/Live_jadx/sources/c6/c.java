package c6;

import java.util.concurrent.Executor;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f22471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f22472c;

        public a(Executor executor, q qVar) {
            this.f22471b = executor;
            this.f22472c = qVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f22471b.execute(runnable);
        }

        @Override // c6.d
        public void release() {
            this.f22472c.accept(this.f22471b);
        }
    }

    public static <T extends Executor> d a(T t10, q<T> qVar) {
        return new a(t10, qVar);
    }
}

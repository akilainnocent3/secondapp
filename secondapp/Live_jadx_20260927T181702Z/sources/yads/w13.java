package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w13 implements bg1 {
    @Override // yads.bg1
    public final void a() {
        synchronized (x13.f157625a) {
            Object obj = x13.f157626b;
            synchronized (obj) {
                if (x13.f157627c) {
                    return;
                }
                long jA = x13.a();
                synchronized (obj) {
                    x13.f157628d = jA;
                    x13.f157627c = true;
                }
            }
        }
    }

    @Override // yads.bg1
    public final void b() {
    }
}

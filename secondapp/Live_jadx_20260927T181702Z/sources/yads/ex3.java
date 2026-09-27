package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ex3 {
    public static void a(wv3 wv3Var) {
        if (!wv3Var.f157553f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (wv3Var.f157554g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}

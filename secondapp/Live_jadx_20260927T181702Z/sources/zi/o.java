package zi;

import java.lang.ref.PhantomReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@yi.d
@k
public abstract class o<T> extends PhantomReference<T> implements p {
    public o(@zq.a T referent, q queue) {
        super(referent, queue.f161798b);
        queue.h();
    }
}

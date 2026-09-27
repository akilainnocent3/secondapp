package zu;

import dr.l1;
import dr.w2;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
@or.m
public abstract class o<T> {
    @oy.m
    public abstract Object b(T t10, @oy.l or.f<? super w2> fVar);

    @oy.m
    public final Object d(@oy.l Iterable<? extends T> iterable, @oy.l or.f<? super w2> fVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return w2.f79517a;
        }
        Object objE = e(iterable.iterator(), fVar);
        return objE == qr.d.l() ? objE : w2.f79517a;
    }

    @oy.m
    public abstract Object e(@oy.l Iterator<? extends T> it, @oy.l or.f<? super w2> fVar);

    @oy.m
    public final Object f(@oy.l m<? extends T> mVar, @oy.l or.f<? super w2> fVar) {
        Object objE = e(mVar.iterator(), fVar);
        return objE == qr.d.l() ? objE : w2.f79517a;
    }
}

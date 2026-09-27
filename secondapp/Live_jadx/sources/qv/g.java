package qv;

import dr.w2;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final <T> T a(@oy.l AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void c(@oy.l AtomicReference<T> atomicReference, @oy.l ds.p<? super AtomicReference<T>, ? super T, w2> pVar) {
        while (true) {
            pVar.invoke(atomicReference, (Object) a(atomicReference));
        }
    }

    public static final <T> void d(@oy.l AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }

    public static /* synthetic */ void b(AtomicReference atomicReference) {
    }
}

package b9;

import dr.w2;
import java.util.concurrent.atomic.AtomicInteger;
import k.y0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class a {
    @l
    public static final Void a(@l AtomicInteger atomicInteger, @l ds.l<? super Integer, w2> action) {
        m0.p(atomicInteger, "<this>");
        m0.p(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}

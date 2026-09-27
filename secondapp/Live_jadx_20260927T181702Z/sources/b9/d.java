package b9;

import dr.w2;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final void a(@l c cVar, @l ds.a<w2> action) {
        m0.p(cVar, "<this>");
        m0.p(action, "action");
        if (cVar.a()) {
            try {
                action.invoke();
            } finally {
                j0.d(1);
                cVar.d();
                j0.c(1);
            }
        }
    }
}

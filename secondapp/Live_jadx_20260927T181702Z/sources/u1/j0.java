package u1;

import android.os.Trace;
import dr.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    @dr.o(message = "Use androidx.tracing.Trace instead", replaceWith = @g1(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@oy.l String str, @oy.l ds.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.j0.d(1);
            Trace.endSection();
            kotlin.jvm.internal.j0.c(1);
        }
    }
}

package xs;

import java.util.Map;
import kotlin.jvm.internal.s1;
import ou.g0;
import ws.b1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class a {
        @oy.m
        public static wt.c a(@oy.l c cVar) {
            ws.e eVarI = eu.c.i(cVar);
            if (eVarI != null) {
                if (qu.k.m(eVarI)) {
                    eVarI = null;
                }
                if (eVarI != null) {
                    return eu.c.h(eVarI);
                }
            }
            return null;
        }
    }

    @oy.l
    Map<wt.f, cu.g<?>> a();

    @oy.m
    wt.c d();

    @oy.l
    b1 g();

    @oy.l
    g0 getType();
}

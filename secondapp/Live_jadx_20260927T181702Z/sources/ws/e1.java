package ws;

import dr.w2;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface e1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f143739a = new a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ws.e1
        @oy.l
        public Collection<ou.g0> a(@oy.l ou.g1 currentTypeConstructor, @oy.l Collection<? extends ou.g0> superTypes, @oy.l ds.l<? super ou.g1, ? extends Iterable<? extends ou.g0>> neighbors, @oy.l ds.l<? super ou.g0, w2> reportLoop) {
            kotlin.jvm.internal.m0.p(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.m0.p(superTypes, "superTypes");
            kotlin.jvm.internal.m0.p(neighbors, "neighbors");
            kotlin.jvm.internal.m0.p(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @oy.l
    Collection<ou.g0> a(@oy.l ou.g1 g1Var, @oy.l Collection<? extends ou.g0> collection, @oy.l ds.l<? super ou.g1, ? extends Iterable<? extends ou.g0>> lVar, @oy.l ds.l<? super ou.g0, w2> lVar2);
}

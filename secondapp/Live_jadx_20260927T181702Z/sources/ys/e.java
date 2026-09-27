package ys;

import kotlin.jvm.internal.m0;
import ou.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final a f159853a = new a();

        @Override // ys.e
        @l
        public o0 a(@l wt.b classId, @l o0 computedType) {
            m0.p(classId, "classId");
            m0.p(computedType, "computedType");
            return computedType;
        }
    }

    @l
    o0 a(@l wt.b bVar, @l o0 o0Var);
}

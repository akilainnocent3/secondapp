package zn;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final d f162030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l d source) {
            super(null);
            m0.p(source, "source");
            this.f162030a = source;
        }

        @l
        public final d a() {
            return this.f162030a;
        }
    }

    /* JADX INFO: renamed from: zn.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1589b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final C1589b f162031a = new C1589b();

        public C1589b() {
            super(null);
        }
    }

    public /* synthetic */ b(x xVar) {
        this();
    }

    public b() {
    }
}

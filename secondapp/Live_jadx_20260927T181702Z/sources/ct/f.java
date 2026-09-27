package ct;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f implements nt.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f77088b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final wt.f f77089a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final f a(@oy.l Object value, @oy.m wt.f fVar) {
            m0.p(value, "value");
            if (d.h(value.getClass())) {
                return new q(fVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new g(fVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new j(fVar, (Object[]) value);
            }
            return value instanceof Class ? new m(fVar, (Class) value) : new s(fVar, value);
        }

        public a() {
        }
    }

    public /* synthetic */ f(wt.f fVar, kotlin.jvm.internal.x xVar) {
        this(fVar);
    }

    @Override // nt.b
    @oy.m
    public wt.f getName() {
        return this.f77089a;
    }

    public f(wt.f fVar) {
        this.f77089a = fVar;
    }
}

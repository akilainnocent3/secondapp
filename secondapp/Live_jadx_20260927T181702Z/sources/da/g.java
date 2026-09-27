package da;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f78657a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public static /* synthetic */ g b(a aVar, Object obj, String str, b bVar, f fVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                bVar = c.f78648a.a();
            }
            if ((i10 & 4) != 0) {
                fVar = da.a.f78643a;
            }
            return aVar.a(obj, str, bVar, fVar);
        }

        @l
        public final <T> g<T> a(@l T t10, @l String tag, @l b verificationMode, @l f logger) {
            m0.p(t10, "<this>");
            m0.p(tag, "tag");
            m0.p(verificationMode, "verificationMode");
            m0.p(logger, "logger");
            return new h(t10, tag, verificationMode, logger);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    @m
    public abstract T a();

    @l
    public final String b(@l Object value, @l String message) {
        m0.p(value, "value");
        m0.p(message, "message");
        return message + " value: " + value;
    }

    @l
    public abstract g<T> c(@l String str, @l ds.l<? super T, Boolean> lVar);
}

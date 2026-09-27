package sr;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final a f135503c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f135504d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final Class<E> f135505b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public e(@l E[] entries) {
        m0.p(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        m0.m(cls);
        this.f135505b = cls;
    }

    public final Object d() {
        E[] enumConstants = this.f135505b.getEnumConstants();
        m0.o(enumConstants, "getEnumConstants(...)");
        return c.c(enumConstants);
    }
}

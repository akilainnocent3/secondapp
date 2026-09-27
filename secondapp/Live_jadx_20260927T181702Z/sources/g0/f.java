package g0;

import dr.f1;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(boolean z10, @l ds.a<String> lazyMessage) {
        m0.p(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        d(lazyMessage.invoke());
    }

    public static final void b(boolean z10, @l ds.a<String> lazyMessage) {
        m0.p(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        c(lazyMessage.invoke());
    }

    public static final void c(@l String message) {
        m0.p(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void d(@l String message) {
        m0.p(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void e(@l String message) {
        m0.p(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void f(@l String message) {
        m0.p(message, "message");
        throw new NoSuchElementException(message);
    }

    @f1
    @l
    public static final Void g(@l String message) {
        m0.p(message, "message");
        throw new NoSuchElementException(message);
    }
}

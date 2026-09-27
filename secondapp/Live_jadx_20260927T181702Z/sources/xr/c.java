package xr;

import dr.f1;
import dr.l1;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.j(name = "CloseableKt")
public final class c {
    @f1
    @l1(version = "1.1")
    public static final void a(@oy.m Closeable closeable, @oy.m Throwable th2) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                dr.t.a(th2, th3);
            }
        }
    }

    @ur.f
    public static final <T extends Closeable, R> R b(T t10, ds.l<? super T, ? extends R> block) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            j0.d(1);
            a(t10, null);
            j0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                j0.d(1);
                a(t10, th2);
                j0.c(1);
                throw th3;
            }
        }
    }
}
